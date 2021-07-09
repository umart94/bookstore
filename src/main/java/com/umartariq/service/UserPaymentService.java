package com.umartariq.service;

import com.umartariq.domain.UserPayment;

public interface UserPaymentService {
	
	UserPayment findById(Long id);
	
	void removeById(Long id);
	

}
