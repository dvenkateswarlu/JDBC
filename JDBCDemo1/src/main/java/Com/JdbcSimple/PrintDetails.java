package Com.JdbcSimple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrintDetails {

	public static void main(String[] args)  {
		
		try {
		    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproject1?user=root&password=root");
		    Statement statement = connection.createStatement();
		    ResultSet executeQuery = statement.executeQuery("SELECT * FROM person");
		    int i = 1;
		    while (executeQuery.next()) {
		        int idPerson = executeQuery.getInt(1);
		        String name = executeQuery.getString(2);
		        int age = executeQuery.getInt(3);
		        String email = executeQuery.getString(4);
		        String password = executeQuery.getString(5);
		        System.out.println("ID :"+idPerson+" "+"Name :"+name+"Age :"+age+"Email :"+email+"Password :"+password);
		        i++;
		    }
		} catch (SQLException e) {
		    e.printStackTrace();
		}


	}

}
