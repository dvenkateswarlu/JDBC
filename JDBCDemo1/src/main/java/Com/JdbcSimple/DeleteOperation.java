package Com.JdbcSimple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteOperation {
	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbcproject1";
		String user = "root";
		String password = "root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url,user,password);
			Statement statement = connection.createStatement();
			int executeUpdate = statement.executeUpdate("Delete from person where idPerson =100");
			System.out.println(executeUpdate);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
