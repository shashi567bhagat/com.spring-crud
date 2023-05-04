package com.crud.Service;

import java.util.List;

import com.crud.Controller.Model.User;

public interface UserService {

	// save data
	void saveUser(User user);

	// get all user data
	List<User> getAllUser();

	// get single data
	public User getByid(long id);
	
	
	void Userdelete(long id);
	
	void userUpdate(long id,User user);

}
