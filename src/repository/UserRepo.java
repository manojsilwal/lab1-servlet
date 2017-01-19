package repository;

import java.util.ArrayList;
import java.util.List;

import domain.User;

public class UserRepo {
	User user = new User();

	public User findUser() {
		user.setUser_name("admin");
		user.setPassword("test123");
		return user;
	}
}
