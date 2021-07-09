package com.umartariq.service;

import com.umartariq.domain.BillingAddress;
import com.umartariq.domain.UserBilling;

public interface BillingAddressService {
	BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress);
}

