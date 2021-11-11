package com.btc.app.service;
import java.sql.SQLException;

import com.btc.app.dao.InvalidIdException;
import com.btc.app.model.User;

public interface UserService {
	public User addUser(User user) throws SQLException, Exception;
	public User readNews(int userid) throws SQLException, InvalidIdException, Exception;

}
