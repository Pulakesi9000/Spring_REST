package com.persistent.training.RestfulWebServices.users;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDao {

	private static List<User> users = new ArrayList<User>();
	private static Integer userCount = 4;
	static{
		users.add(new User(1, "madhu", new Date()));
		users.add(new User(2, "gagan", new Date()));
		users.add(new User(3, "chandu", new Date()));
		users.add(new User(4, "karthik", new Date()));
	}
	
	public List<User> getAllUsers(){
		return users;
	}
	
	public User getUser(int Id){
		for(User user: users){
			if(user.getId() == Id){
				return user;
			}
		}
		return null;
	}
	
	public User createUser(User user){
		if(user.getId() == null){
			user.setId(++userCount);
		}
		users.add(user);
		return user;
	}
}
