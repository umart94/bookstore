package com.umartariq.service;

import com.umartariq.domain.ShippingAddress;
import com.umartariq.domain.UserShipping;

public interface ShippingAddressService {
	ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress);
}

