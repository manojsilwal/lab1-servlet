package serviceImpl;

import domain.User;
import repository.UserRepository;
import Service.UserService;

public class UserServiceImpl implements UserService {

	UserRepository userRepository = new UserRepository();

	@Override
	public Boolean loginCheck(String username, String password) {
		User user = userRepository.getUserData();
		if (username.equals(user.getUser_name()) && password.equals(user.getPassword())) {
			return true;
		} else {
			return false;
		}

	}
}
