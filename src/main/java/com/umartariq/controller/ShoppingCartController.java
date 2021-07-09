package com.umartariq.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.umartariq.domain.security.Book;
import com.umartariq.domain.CartItem;
import com.umartariq.domain.ShoppingCart;
import com.umartariq.domain.User;
import com.umartariq.service.BookService;
import com.umartariq.service.CartItemService;
import com.umartariq.service.ShoppingCartService;
import com.umartariq.service.UserService;

@Controller
@RequestMapping("/shoppingCart")
public class ShoppingCartController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CartItemService cartItemService;
	
	@Autowired
	private BookService bookService;
	
	@Autowired
	private ShoppingCartService shoppingCartService;
	
	@RequestMapping("/cart")
	public String shoppingCart(Model model, Principal principal) {
		User user = userService.findByUsername(principal.getName());
		ShoppingCart shoppingCart = user.getShoppingCart();
		
		List<CartItem> cartItemList = cartItemService.findByShoppingCart(shoppingCart);
		
		shoppingCartService.updateShoppingCart(shoppingCart);
		
		model.addAttribute("cartItemList", cartItemList);
		model.addAttribute("shoppingCart", shoppingCart);
		
		return "shoppingCart";
	}

	@RequestMapping("/addItem")
	public String addItem(
			@ModelAttribute("book") Book book,
			@ModelAttribute("qty") String qty,
			Model model, Principal principal
			) {
		User user = userService.findByUsername(principal.getName());
		book = bookService.findOne(book.getId());
		
		if (Integer.parseInt(qty) > book.getInStockNumber()) {
			model.addAttribute("notEnoughStock", true);
			return "forward:/bookDetail?id="+book.getId();
		}
		
		CartItem cartItem = cartItemService.addBookToCartItem(book, user, Integer.parseInt(qty));
		model.addAttribute("addBookSuccess", true);
		
		return "forward:/bookDetail?id="+book.getId();
	}
	
	@RequestMapping("/updateCartItem")
	public String updateShoppingCart(
			@ModelAttribute("id") Long cartItemId,
			@ModelAttribute("qty") int qty
			) {
		CartItem cartItem = cartItemService.findById(cartItemId);
		cartItem.setQty(qty);
		cartItemService.updateCartItem(cartItem);
		
		return "forward:/shoppingCart/cart";
	}
	
	@RequestMapping("/removeItem")
	public String removeItem(@RequestParam("id") Long id) {
		cartItemService.removeCartItem(cartItemService.findById(id));
		
		return "forward:/shoppingCart/cart";
	}
}
