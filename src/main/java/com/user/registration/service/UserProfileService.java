package com.user.registration.service;

import java.util.List;

import com.user.registration.models.UserProfile;


public interface UserProfileService {

	UserProfile findById(int id);

	UserProfile findByType(String type);
	
	List<UserProfile> findAll();
	
}
