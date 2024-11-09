package Com.JdbcSimple.DynamicOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchExecution {

	public static void main(String[] args) {
		 String jdbcUrl = "jdbc:mysql://localhost:3306/jdbcproject1";
	        String username = "root";
	        String password = "root";

	        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
	            connection.setAutoCommit(false); // Turn off auto-commit for batch execution
	            
	            String sql = "INSERT INTO person (idPerson, name, age,email,password) VALUES (?, ?, ?, ?, ?)";
	            try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
	                
	                // Adding first record to batch
	                pstmt.setInt(1, 1);
	                pstmt.setString(2, "Alice");
	                pstmt.setInt(3, 20);
	                pstmt.setString(4, "alice12@gmail.com");
	                pstmt.setString(5, "Alice12@");
	                pstmt.addBatch();
	                
	                // Adding second record to batch
	                pstmt.setInt(1, 2);
	                pstmt.setString(2, "Bob");
	                pstmt.setInt(3, 23);
	                pstmt.setString(4, "bob123@gmail.com");
	                pstmt.setString(5, "Bob123");  
	                pstmt.addBatch();
	                
	                // Execute batch
	                int[] result = pstmt.executeBatch();

	                // Commit transaction
	                connection.commit();
	                
	                // Print results
	                System.out.println("Batch execution completed. Rows affected: ");
	                for (int count : result) {
	                    System.out.println(count);
	                }

	            } catch (SQLException e) {
	                connection.rollback(); // Rollback transaction on error
	                e.printStackTrace();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	}

}
