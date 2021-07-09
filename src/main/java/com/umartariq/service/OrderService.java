package com.umartariq.service;

import com.umartariq.domain.BillingAddress;
import com.umartariq.domain.Order;
import com.umartariq.domain.Payment;
import com.umartariq.domain.ShippingAddress;
import com.umartariq.domain.ShoppingCart;
import com.umartariq.domain.User;

public interface OrderService {
	Order createOrder(ShoppingCart shoppingCart,
			ShippingAddress shippingAddress,
			BillingAddress billingAddress,
			Payment payment,
			String shippingMethod,
			User user);
	
	Order findOne(Long id);
}
