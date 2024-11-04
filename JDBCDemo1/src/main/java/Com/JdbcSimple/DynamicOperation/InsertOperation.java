package Com.JdbcSimple.DynamicOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertOperation {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproject1 ? user = root & password = root");
			PreparedStatement statement = connection.prepareStatement("insert into person values(?,?,?,?,?)");
			
			statement.setInt(1, 105);
			statement.setString(2, "Snathosh");
			statement.setString(4,"santhosh123@gmail.com");
			statement.setInt(3, 24);
			statement.setString(5, "Santhu14");
			statement.execute();
			
			System.out.println("Insert Successfully");
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
