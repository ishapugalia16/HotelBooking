package com.hotel.dao;

import com.hotel.entity.Role;

//DAO Pattern for Role
public interface RoleDao {

	public Role findRoleByName(String roleName);
	
}
