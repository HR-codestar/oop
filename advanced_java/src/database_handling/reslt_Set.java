package database_handling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class reslt_Set {
	

	public static void main(String[] args) {
		
		Connection c = null;
		Statement s = null;
		ResultSet rs = null;
 		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employe","root","root");
			s = c.createStatement();
			rs = s.executeQuery("Select * from employee");
			
			while(rs.next()) {
				String ename = rs.getString(1);
				int eage = rs.getInt(2);
				int esal = rs.getInt(3);
				
				
				System.out.println("Name of the employee : "+ename);
				System.out.println("Age of th employee : "+eage);
				System.out.println("Salary of the employee : "+esal);
				System.out.println();
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			if(c!=null) {
				try {
					c.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(s!=null) {
				try {
					s.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

/*        						Transaction
 
Transaction is a set of SQL statements and if any one  of the statements is not 
executed the complete block of code will stop 
*/
