
package Com.JdbcSimple.DynamicOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteOperation {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproject1 ? user = root & password = root");
			PreparedStatement statement = connection.prepareStatement("DELETE FROM person WHERE idPerson = ?");
			statement.setInt(1, 101);
			statement.execute();
		 
			System.out.println("Deleted Successfully");
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
