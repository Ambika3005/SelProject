package learnTestNG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Learndatabaseconnection01 {

	
		// TODO Auto-generated method stub
	public static void main(String[] args) throws SQLException, ClassNotFoundException   {
		//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
        String dbUrl = "jdbc:mysql://localhost:3036/employee?useSSL=false&allowPublicKeyRetrieval=true&useUnicode=true&characterEncoding=UTF-8";					

		//Database Username		
		String username = "root";	
        
		//Database Password		
		String password = "Root@123";				

		//Query to Execute		
		String query = "select * from customers;";	
        
 	    //Load mysql jdbc driver		
   	   Class.forName("com.mysql.cj.jdbc.Driver");			
   
   		//Create Connection to DB		
    	Connection con = DriverManager.getConnection(dbUrl,username,password);
  
  		//Create Statement Object		
	   Statement stmt = con.createStatement();					

			// Execute the SQL Query. Store results in ResultSet		
 		ResultSet rs= stmt.executeQuery(query);							
 
 		// While Loop to iterate through all data and print results		
		while (rs.next()){
	        		String myId = rs.getString(1);								        
                    String first_name = rs.getString(2);					                               
                    System. out.println(myId+"  "+first_name);		
            }		
			 // closing DB Connection		
			con.close();

}
}
