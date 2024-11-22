/*
package database_handling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ex1 {
    public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("create table employee(ename String , eage int , esal double)");
	} 
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
			
   }
}
*/

package database_handling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ex1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employe","root","root");
            Statement s = c.createStatement();
            s.executeUpdate("CREATE TABLE employee (ename VARCHAR(255), eage INT, esal DOUBLE)");
            System.out.println("Table 'employee' created successfully.");
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
