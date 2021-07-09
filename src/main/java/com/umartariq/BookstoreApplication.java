package com.umartariq;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.umartariq.domain.User;
import com.umartariq.domain.security.Role;
import com.umartariq.domain.security.UserRole;
import com.umartariq.service.UserService;
import com.umartariq.utility.SecurityUtility;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner{

	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*User user1 = new User();
		user1.setFirstName("Muhammad Umar");
		user1.setLastName("Tariq");
		user1.setUsername("umar");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("password"));
		user1.setEmail("EMAILID");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1= new Role();
		role1.setRoleId(1);
		role1.setName("ROLE_USER");
		userRoles.add(new UserRole(user1, role1));
		
		userService.createUser(user1, userRoles);*/
		
		
	}

}
