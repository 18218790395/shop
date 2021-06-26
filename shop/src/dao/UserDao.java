package dao;

import entity.User;

public interface UserDao {

	User login(User user);

	void register(User user);

	User checkName(User user);

}
