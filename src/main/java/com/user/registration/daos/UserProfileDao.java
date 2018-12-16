package com.user.registration.daos;

import java.util.List;

import com.user.registration.models.UserProfile;


public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
