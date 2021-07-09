package com.umartariq.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.umartariq.domain.CartItem;
import com.umartariq.domain.Order;
import com.umartariq.domain.ShoppingCart;

@Transactional
public interface CartItemRepository extends CrudRepository<CartItem, Long>{
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
	List<CartItem> findByOrder(Order order);
}