package com.umartariq.repository;

import org.springframework.data.repository.CrudRepository;

import com.umartariq.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
