package database_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_updation {
	public static void main(String[] args) {
		BufferedReader br = null;
		Connection c = null;
		Statement s = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employe","root","root");
			s = c.createStatement();
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("enter the age of the employee you want to update their salary");
			int age = Integer.parseInt(br.readLine());
			
			System.out.println("enter the new salary");
			int value = Integer.parseInt(br.readLine());
			
			int count = s.executeUpdate(" update employee set esal = "+value+" where eage = "+age);
			
			if(count==1) {
				System.out.println("updation successful");
			}
			else {
				System.out.println("updation failed");
			}
			
			System.out.println("do ou want to update any other employee's salary");
			String d = br.readLine();
			if(d.equalsIgnoreCase("no"));
			
			}
		
		
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		finally {
			System.out.println("thank you for selecting us.");
			try {
				s.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	
	}
}


