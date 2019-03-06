package com.persistent.training.RestfulWebServices.users;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserController {

	@Autowired
	private UserDao userDao;public UserController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/users")                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
	public List<User> allUsers(){		// Fetch all users
		return userDao.getAllUsers();
	}
	
	@GetMapping("/users/{id}")
	public User specificUser(@PathVariable Integer id){		// Fetch perticular user
		User user = userDao.getUser(id);
		if(user == null)
			throw new UserNotFoundException("user with id - "+id+" not found");
		return user;
	}
	
	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@RequestBody User user){		// Create new user
		User savedUser = userDao.createUser(user);
		URI location = ServletUriComponentsBuilder
						.fromCurrentRequest()
						.path("/{id}")
						.buildAndExpand(savedUser.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
}
