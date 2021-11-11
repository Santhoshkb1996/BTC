package com.btc.app.service;

import java.sql.SQLException;

import com.btc.app.dao.InvalidIdException;
import com.btc.app.dao.UserDao;
import com.btc.app.dao.UserDaoImpl;
import com.btc.app.dao.UserDaoJdbcImpl;
//import com.btc.app.model.Employee;
import com.btc.app.model.User;
//import

public class UserServiceImpl implements UserService {
	private UserDao daoObj;
	
	public UserServiceImpl() throws SQLException {
		
			daoObj = new UserDaoJdbcImpl();
	}

//	public UserServiceImpl() {
//		// TODO Auto-generated constructor stub
//	}

	@Override
//	public User addUser(User user) throws SQLException {
//		@Override
		public User addUser(User user) throws Exception {
			return daoObj.addUser(user);
		}
		//return user;
	@Override
	public User readNews(int userid) throws Exception {
		return daoObj.readNews(userid);
	}
}


