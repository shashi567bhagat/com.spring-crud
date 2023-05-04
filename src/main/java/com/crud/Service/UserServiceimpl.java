package com.crud.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.Controller.Model.User;
import com.crud.Repository.UserRepository;

@Service
public class UserServiceimpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	// save data
	@Override
	public void saveUser(User user) {

		this.userRepository.save(user);

	}

	@Override
	public List<User> getAllUser() {

		return this.userRepository.findAll();
	}

	@Override
	public User getByid(long id) {
		Optional<User> findById = userRepository.findById(id);
		User user = null;

		if (findById.isPresent()) {
			user = findById.get();
		} else {
			throw new RuntimeException("User not found");
		}
		return user;

	}

	@Override
	public void Userdelete(long id) {

		this.userRepository.deleteById(id);

	}

	@Override
	public void userUpdate(long id, User user) {
		
		this.userRepository.save(user);
		
	}

}
