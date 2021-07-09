package com.umartariq.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.umartariq.domain.UserPayment;

public interface UserPaymentRepository extends CrudRepository<UserPayment, Long>{
	
	

}
