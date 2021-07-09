package com.umartariq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umartariq.domain.UserPayment;
import com.umartariq.repository.UserPaymentRepository;
import com.umartariq.service.UserPaymentService;

@Service
public class UserPaymentServiceImpl implements UserPaymentService{

	@Autowired
	private UserPaymentRepository userPaymentRepository;
	
	
	
	public UserPayment findById(Long id) {
		return userPaymentRepository.findById(id).orElse(null);
		
	}
	/*
	 *     Old name       ║       New name        ║
╠═════════════════════╬═══════════════════════╣
║ findOne(…)          ║ findById(…)           ║
╠═════════════════════╬═══════════════════════╣
║ save(Iterable)      ║ saveAll(Iterable)     ║
╠═════════════════════╬═══════════════════════╣
║ findAll(Iterable)   ║ findAllById(…)        ║
╠═════════════════════╬═══════════════════════╣
║ delete(ID)          ║ deleteById(ID)        ║
╠═════════════════════╬═══════════════════════╣
║ delete(Iterable)    ║ deleteAll(Iterable)   ║
╠═════════════════════╬═══════════════════════╣
║ exists()            ║ existsById(…)         ║
╚═════════════════════╩═══════════════════════╝
	 */
	public void removeById(Long id) {
		userPaymentRepository.deleteById(id);
		
	}
	
	
}
