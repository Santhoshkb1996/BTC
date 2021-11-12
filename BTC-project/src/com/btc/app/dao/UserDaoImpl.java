package com.btc.app.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

//import com.btc.app.model.Employee;
import com.btc.app.model.User;

public class UserDaoImpl implements UserDao {

	private static Map<Integer, User> users=new HashMap<>();
	
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		users.put(user.getUserid(), user);
		
		return user;
	}

	@Override
	public User readNews(int userid) {
		// TODO Auto-generated method stub
		return null;
	}

}
