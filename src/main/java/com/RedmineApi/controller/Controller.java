package com.RedmineApi.controller;

import java.time.LocalDateTime;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.RedmineApi.entity.JsonResponse;
import com.RedmineApi.entity.User;
import com.RedmineApi.repository.UserRepository;
import com.RedmineApi.service.UserService;

@RestController
public class Controller {
	@Autowired
	UserService userService;

	@Autowired
	UserRepository userRepository;

	// new User handler
	@PostMapping("/createUser")
	public ResponseEntity<Object> addUser(@RequestBody Map<String, Object> payload) {
		JsonResponse response = new JsonResponse();

		User user = new User();
		String userLogin = (String) payload.get("login");
		System.out.println("userLogin==" + userLogin);
		String userfirstname = (String) payload.get("firstname");
		String userlastname = (String) payload.get("lastname");
		String userStatus = (String) payload.get("status");

		if (userLogin.equals("") || userfirstname.equals("") || userlastname.equals("") || userStatus.equals("")) {
			response.setData("Kindly set all parameter");
			return ResponseEntity.ok(response);
		}
		
		int checkUser = userRepository.userCountCheck(userLogin);
		System.out.println("checkUser===" + checkUser);
		if (checkUser > 0) {
			response.setData("User Already Exists");
			return ResponseEntity.ok(response);
		}

		user.setLogin(userLogin);
		user.setFirstname(userfirstname);
		user.setLastname(userlastname);
		user.setStatus(Integer.parseInt(userStatus));
		user.setHashed_password("");
		user.setAdmin(0);
		user.setLanguage("en");
		user.setAuth_source_id(1);
		user.setType("User");
		user.setMail_notification("only_my_events");
		user.setSalt(null);
		user.setMustChangePasswd(0);
		user.setTwofaSchema(null);
		user.setTwofaTotpKey(null);
		user.setTwofaTotpLastUsedAt(null);
		user.setTwofaRequired(0);
		user.setLast_login_on(null);
		user.setCreated_on(LocalDateTime.now());
		user.setUpdatedOn(LocalDateTime.now());

		User userData = this.userService.addUser(user);

		if (userData == null) {
			response.setData("Data inserted fail !!!");
			return ResponseEntity.ok(response);
		}
		else {
			response.setData("Data inserted successfully");
			return ResponseEntity.ok(response);
		}

	}

	// delete User handler

	@PostMapping("/updateUser")
	public ResponseEntity<Object> updateUser(@RequestBody Map<String, Object> payload) {

		JsonResponse response = new JsonResponse();
		String userLogin = (String) payload.get("login");
		System.out.println("userLogin=======" + userLogin);
		String userStatus = (String) payload.get("status");

		int checkUser = userRepository.userCountCheck(userLogin);
		System.out.println("checkUser===" + checkUser);
		if (checkUser == 0) {
			response.setData("User Not Exists");
			return ResponseEntity.ok(response);
		}

		User userDetails = userRepository.userDetails(userLogin);
		System.out.println("=userDetails1111111111111111=" + userDetails);

		
		if (userDetails != null) {

			System.out.println("=userDetails=" + userDetails);

			userDetails.setStatus( Integer.parseInt(userStatus));
			userDetails.setUpdatedOn(LocalDateTime.now());

			User users = userRepository.save(userDetails);

			if (users != null) {
				response.setData("User Updated successfully");
				return ResponseEntity.ok(response);
			}
			else {
				response.setData("User not Updated");
				return ResponseEntity.ok(response);
			}

		} else {
			response.setData("Something Went Wrong");
			return ResponseEntity.ok(response);
		}

	}
}
