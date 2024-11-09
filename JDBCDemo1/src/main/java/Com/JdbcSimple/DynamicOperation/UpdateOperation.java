package Com.JdbcSimple.DynamicOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateOperation {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
			String scc = sc.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproject1 ? user = root & password = root");
			PreparedStatement statement = connection.prepareStatement("Update person set scc=?, name =? where idPerson =?");
			statement.setInt(1, 103);
			statement.setString(2, "Santhosh");
			statement.setInt(3, 104);
			
			statement.execute();
			System.out.println("Updated Successfully");
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
