package com.crud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.Controller.Model.User;
import com.crud.Service.UserService;


@RestController

public class UserController {

	@Autowired
	private UserService userService;

	// save data
	@PostMapping
	@ResponseBody
	public String getdetails(@RequestBody User user) {
		
		this.userService.saveUser(user);
		
		return "Data successfully Registered";
	}

	@GetMapping
	@ResponseBody
	public List<User> getAllData() {

		return this.userService.getAllUser();

	}

	@GetMapping("/user/{id}")
	public User getSingledata(@PathVariable("id") long id) {

		return userService.getByid(id);
	}

	@GetMapping("/delete/{id}")
	@ResponseBody
	public String getdelete(@PathVariable("id") long id) {
		
		userService.Userdelete(id);

		return "data deleted successfullly";

	}

	@GetMapping("/update/{id}")
	@ResponseBody
	public String getUpdate(@PathVariable("id") long id, @RequestBody User user) {
		
		userService.userUpdate(id, user);

		return "data updated successfullly";

	}

}
