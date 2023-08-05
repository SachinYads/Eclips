package jdbcapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnectionUtil {
	static final String URL = "jdbc:mysql://localhost:3306/prodaptdb";

	public static Connection getDBConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, "root", "admin");
			// TODO Auto-generated method stub

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;

	}
}
