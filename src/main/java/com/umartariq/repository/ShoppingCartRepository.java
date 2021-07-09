package com.umartariq.repository;

import org.springframework.data.repository.CrudRepository;

import com.umartariq.domain.ShoppingCart;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {

}
