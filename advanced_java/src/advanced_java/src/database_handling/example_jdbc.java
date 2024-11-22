
package database_handling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class example_jdbc {
	
	
	   public static void main(String[] args) {
		
		   try {
			   //specifying the driver
			   Class.forName("com.mysql.cj.jdbc.Driver");
			   
			   //connection string
			   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employe_man","root","root");
			   
			   //commands or statements
			   Statement s = con.createStatement();
			   
			   s.executeUpdate("CREATE TABLE employee(eno int  , ename varchar(30) , esal int)");
			   System.out.println("byebye");
			con.close();   
		   }
		   catch(Exception e) {
			   System.out.println(e);
		    }
	  }
}

/*
package database_handling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class example_jdbc {
    public static void main(String[] args) {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            String url = "jdbc:mysql://localhost:3306/employe_man"; // Corrected URL format
            String username = "root";
            String password = "root";

            Connection con = DriverManager.getConnection(url, username, password);

            // Create statement
            Statement stmt = con.createStatement();

            // Execute update to create table
            String sql = "CREATE TABLE employe (" +
                         "eno INT, " +
                         "ename VARCHAR(30), " +
                         "esal INT)";
            stmt.executeUpdate(sql);

            System.out.println("Table 'employe' created successfully.");

            // Close connection
            con.close();
        } catch (Exception e) {
            e.printStackTrace(); // Improved error handling
        }
    }
}
*/