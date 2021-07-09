package com.umartariq.service;

import com.umartariq.domain.Payment;
import com.umartariq.domain.UserPayment;

public interface PaymentService {
	Payment setByUserPayment(UserPayment userPayment, Payment payment);
}

