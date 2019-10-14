package service;

import java.sql.Connection;
import java.util.List;

import dao.UserDao;
import model._User;
import untils.DBUtils;


public class UserService {

	public List<_User> Login(String userName, String password) {
		List<_User> list = null;
		Connection conn = DBUtils.getconn();
		UserDao userDao = new UserDao(conn);
		list = userDao.Login(userName,password);
		
		return list;
	}
	

}
