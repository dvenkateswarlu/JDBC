package Employee_Management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeManagement {
	
	private static String url = "jdbc:mysql://localhost:3306/employeedata";
	private static String user = "root";
	private static String password = "root";
	public static Connection connection;
	public static Statement statement;
	static Scanner scanner = new Scanner(System.in);
	static
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("---WELCOME TO EMPLOYEE MANAGEMENT DATA---");
		boolean flag = true;
		
		while(flag)
		{
			System.out.println("List the given Operations::");
			System.out.println("      1. Data Inserting \n      2. Data UpDating \n      3. Data Fetching \n      4. "
					+ "Data Deletion \n      5. Exit From Application ");
			System.out.println("Enter the Numbers(1, 2, 3, 4, 5)..,which Operation, you want");
		
			int choice = scanner.nextInt();
			
			switch(choice)
			{
				case 1:
					{
						boolean employeeData = InsertEmployeeData.addEmployeeData();
						if(!employeeData)
						{
							System.out.println("Data inserted Successfully");
						}else {
							System.out.println("Data is not inserted Successfully");
						}
						break;
					}
				case 2:
				{
					boolean employeeData = UpdateEmployeeData.updateEmployeeData();
					if(!employeeData)
					{
						System.out.println("Data updated Successfully");
					}else {
						System.out.println("Data is not updated Successfully");
					}
					break;
				}
				case 5:
					{
						flag =false;
						break;
					}
			}
		}

		
	}

}
