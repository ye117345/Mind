package untils;

//import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DBUtils {
	
	static Connection conn;
	
	//�������ݿ�
	public static Connection getconn(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mind","root","117345");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn ;
	}
	
	//c3p0连接池
//	private static ComboPooledDataSource dataSource;
//	static {
//		dataSource = new ComboPooledDataSource();
//		try {
//			dataSource.setDriverClass("com.mysql.jdbc.Driver");
//			dataSource.setJdbcUrl("jdbc:mysql//localhost:3306/order");
//			dataSource.setUser("root");
//			dataSource.setPassword("123456");
//			
//			dataSource.setMaxPoolSize(20);
//			dataSource.setMinPoolSize(2);
//			dataSource.setInitialPoolSize(1);
//			dataSource.setMaxStatements(3);
//		} catch (PropertyVetoException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	public static Connection getconn(){
//		Connection conn = null;
//		try {
//			conn = dataSource.getConnection();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return conn;
//	}
	
	public static void CloseConn(Connection conn){
		
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void CloseResultSetAndPrepreStatment(ResultSet resultSet,PreparedStatement stmt){
		try {
			if (resultSet != null) {
				resultSet.close();
			}
			if (stmt != null) {
				stmt.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
