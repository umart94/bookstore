package com.umartariq.repository;

import org.springframework.data.repository.CrudRepository;

import com.umartariq.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role,Long>{

	Role findByName(String name);
}
