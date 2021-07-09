package com.umartariq.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.umartariq.domain.BookToCartItem;
import com.umartariq.domain.CartItem;

@Transactional
public interface BookToCartItemRepository extends CrudRepository<BookToCartItem, Long> {
	void deleteByCartItem(CartItem cartItem);
}