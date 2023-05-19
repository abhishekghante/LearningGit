package com.RedmineApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RedmineApi.entity.User;
import com.RedmineApi.repository.UserRepository;



@Service
public class UserService 
{
	@Autowired
	UserRepository userRepository;
	
	 // adding the user
    public User addUser(User u) {
        User result=userRepository.save(u);
        return result;
    }

    // delete user
    public void deleteUser(int uid) {
    	userRepository.deleteById(uid);
    	
    }
    public User updateUser(User user, int userId) {
		System.out.println("111111111111111111111");

        user.setId(userId);
		System.out.println("222222222222222222222");

       return userRepository.save(user);
    }

}
