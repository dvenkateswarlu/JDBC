package Com.JdbcSimple.DynamicOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateOperation {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproject1 ? user = root & password = root");
			PreparedStatement statement = connection.prepareStatement("Update person set idPerson=?, name =? where idPerson =104");
			statement.setInt(1, 104);
			statement.setString(2, "Santhosh");
			
			statement.execute();
			System.out.println("Updated Successfully");
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
