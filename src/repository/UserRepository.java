package repository;

import domain.User;

public class UserRepository {
	User user = new User();

	public User getUserData() {
		user.setUser_name("admin");
		user.setPassword("test123");
		return user;
	}
}
