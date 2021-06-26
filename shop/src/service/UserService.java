package service;

import entity.User;

public interface UserService {

	User login(User user);

	void register(User user);

	User checkName(User user);

}
