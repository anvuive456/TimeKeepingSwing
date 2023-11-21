package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public final class Connector {
	private Connection conn = null;
	private static Connector instance = null;

	public Connection getConnection() {
		assert (this.conn != null);

		return this.conn;
	}

	public static Connector getInstance() {
		if (instance == null) {
			instance = new Connector();
			instance.connect();
		}
		return instance;
	}

	private void connect() {
		try {
			// db parameters
			String url = "jdbc:mysql://localhost:3306/shop";
			String user = "root";
			String password = "root";

			// create a connection to the database
			conn = DriverManager.getConnection(url, user, password);
			// more processing here
			// ...
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}

}
