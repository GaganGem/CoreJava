package connection;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcConnection {
	private static JdbcConnection jdbc = null;
	private ComboPooledDataSource cp = null;

	private JdbcConnection() {
		cp = new ComboPooledDataSource();
		try {
			cp.setDriverClass("com.mysql.jdbc.Driver");
			cp.setJdbcUrl("jdbc:mysql://localhost:3306/test");
			cp.setUser("root");
			cp.setPassword("root");
			cp.setInitialPoolSize(2);
			cp.setAcquireIncrement(2);
			cp.setMaxPoolSize(10);
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
	}
	public static JdbcConnection getInstance() {
		if (jdbc == null) {
			jdbc = new JdbcConnection();
		}
		return jdbc;
	}
	public static Connection getConnection() {
		try {
			return getInstance().cp.getConnection();
		} catch (SQLException e) {
			return null;
		}
	}

	public static void closeConn(Connection con, PreparedStatement ps, ResultSet rs) {
		try {
			if (rs != null)rs.close();
			if (ps != null)ps.close();
			if (con != null)con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void closeConn(Connection con, PreparedStatement ps) {
		try {
			if (ps != null)ps.close();
			if (con != null)con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void closeConn(Connection con) {
		try {
			if (con != null)con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
