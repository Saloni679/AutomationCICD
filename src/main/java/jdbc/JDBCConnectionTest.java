package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class JDBCConnectionTest {

	public static void main(String[] args) {
		
		try {
			
			String host = "localhost";
			String port = "3306";
			
			//jdbc:mysql" + host + port +"/demo
			
			Connection conn = DriverManager.getConnection("url", "root", "Titanic@19");       //Establish the connection
			
			Statement s = conn.createStatement();     //Create the statement
			
			ResultSet rs = s.executeQuery("select * from Emp where Emp_name = 'Saloni'");   //Execute the query
			
			while(rs.next())
			{
			System.out.println(rs.getString("username"));
			System.out.println(rs.getString("password"));
			}
		
		
		
		
		
		
		
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
