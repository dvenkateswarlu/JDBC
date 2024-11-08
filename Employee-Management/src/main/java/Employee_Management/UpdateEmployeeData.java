package Employee_Management;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateEmployeeData {

	public static boolean updateEmployeeData()
	{
		boolean flag = true;
		boolean execute=true;
		while(flag)
		{
			System.out.println("List the given Operations::");
			System.out.println("\t1. Update Id \n\t2. Update Name \n\t3. Update Age \n\t4. Update Salary \n\t5. Exit");
			System.out.println("Enter which Column Data You what to Update");
			 

			int choice = EmployeeManagement.scanner.nextInt();
			
			switch(choice)
			{
				case 1:
				{	
					try {
						System.out.println("Enter the Update ID Number");
						int updateid = EmployeeManagement.scanner.nextInt();
						System.out.println("Enter the Update ID Number");
						int exstingid = EmployeeManagement.scanner.nextInt();
						
						String sql = "Update employee Set ID = ? where ID=?";
						PreparedStatement statement = EmployeeManagement.connection.prepareStatement(sql);
						statement.setInt(1, updateid);
						statement.setInt(2, exstingid);
						
						execute = statement.execute();
						System.out.println(execute);
					} catch (SQLException e) {
						e.printStackTrace();
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
		
		return execute;
	}

}
