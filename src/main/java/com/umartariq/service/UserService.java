package com.umartariq.service;

import java.util.Set;

import com.umartariq.domain.User;
import com.umartariq.domain.UserBilling;
import com.umartariq.domain.UserPayment;
import com.umartariq.domain.UserShipping;
import com.umartariq.domain.security.PasswordResetToken;
import com.umartariq.domain.security.UserRole;

public interface UserService {
	PasswordResetToken getPasswordResetToken(final String token);
	
	void createPasswordResetTokenForUser(final User user, final String token);
	
	User findByUsername(String username);
	
	User findByEmail (String email);
	
	User findById(Long id);
	
	User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	User save(User user);
	
	void updateUserBilling(UserBilling userBilling, UserPayment userPayment, User user);
	
	void updateUserShipping(UserShipping userShipping, User user);
	
	void setUserDefaultPayment(Long userPaymentId, User user);
	
	void setUserDefaultShipping(Long userShippingId, User user);
}
