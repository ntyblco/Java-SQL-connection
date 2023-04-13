package JavaInSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect2Sql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Properties to connect to the sql data base 
		
		String url = "jdbc:sqlserver://desktop-ia0gdad\\sqlexpress;databaseName=airport;integratedSecurity=false;trustServerCertificate=true";
		String user = "sa";
		String password = "nty081200";
		
		
		// Try catch blocks for connection or error 
		
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connected");
			
			//Sql command which will affect the sql table in sql program 
			
			String sql = "EXECUTE ADD_CUSTOMER 'Melissa', 'Brown', 'Boston'";
			
			Statement statement = connection.createStatement();
			int rows = statement.executeUpdate(sql);
			
			// Message that will appear if the command is successful if the row is affected. 
			if (rows > 0 ) {
				System.out.print("Row was added. ");
			}
			
			//Close connection 
			connection.close();
			
			
			//exception to the try block 
		} catch (SQLException e) {
			System.out.println("Error");
			e.printStackTrace();
			
		}


	}

}
