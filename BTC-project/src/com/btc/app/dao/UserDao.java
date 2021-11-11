package com.btc.app.dao;

import java.sql.SQLException;

import com.btc.app.model.User;

public interface UserDao {
	public User addUser(User user) throws SQLException, InvalidIdException;
	public User readNews(int userid) throws SQLException, InvalidIdException;
}
