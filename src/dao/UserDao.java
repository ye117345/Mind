package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import com.sun.org.apache.regexp.internal.recompile;


import model._User;
import untils.DBUtils;


public class UserDao {
	Connection conn;
	
	public UserDao(Connection conn) {
		super();
		this.conn = conn;
	}

	public List<_User> Login(String userName, String password) {
		List<_User> list = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		list = new ArrayList<>();
		
		try {
			String sql = "select * from _user where username = ? and password = ?";
			//？？？？
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userName);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				_User userInfo = new _User();
				userInfo.setIn_id(rs.getInt(1));
				userInfo.setName(rs.getString(2));
				userInfo.setIn_tx(rs.getInt(4));
				userInfo.setIn_pvetotal(rs.getInt(5));
				userInfo.setIn_pvecorrect(rs.getInt(6));
				userInfo.setIn_sex(rs.getString(7));
				list.add(userInfo);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.CloseResultSetAndPrepreStatment(rs, pstmt);
			DBUtils.CloseConn(conn);
		}
		
		
		return list;
	}
	
	

}
