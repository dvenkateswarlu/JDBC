package Com.JdbcSimple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertOperation {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproject1 ? user = root & password = root");
			Statement statement = connection.createStatement();
			int executeUpdate = statement.executeUpdate("insert into person values (1,'Muni Kishore',21,'munikishore1@gmail.com','Muni1234@')");
			System.out.println(executeUpdate);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
