package Com.JdbcSimple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Program1 {

	public static void main(String[] args) throws Exception
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("load is DOne..!");
		
		Connection driver = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproject1", "root", "root");
		System.out.println("Connection is Completed");
		Connection driver1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproject1 ? user =root& password=root");
		System.out.println("Connection is Completed");
		
		Statement st = driver.createStatement();
		System.out.println("Statement is created ");

	}

}
