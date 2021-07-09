package com.umartariq.service;

import com.umartariq.domain.UserShipping;

public interface UserShippingService {

	UserShipping findById(Long id);
	
	void removeById(Long id);
	
}
