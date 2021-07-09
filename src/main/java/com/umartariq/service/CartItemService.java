package com.umartariq.service;

import java.util.List;

import com.umartariq.domain.CartItem;
import com.umartariq.domain.Order;
import com.umartariq.domain.ShoppingCart;
import com.umartariq.domain.User;
import com.umartariq.domain.security.Book;

public interface CartItemService {
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
	CartItem updateCartItem(CartItem cartItem);
	
	CartItem addBookToCartItem(Book book, User user, int qty);
	
	CartItem findById(Long id);
	
	void removeCartItem(CartItem cartItem);
	
	CartItem save(CartItem cartItem);
	
	List<CartItem> findByOrder(Order order);
}
