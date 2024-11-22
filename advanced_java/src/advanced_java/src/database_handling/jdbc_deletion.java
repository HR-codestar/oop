package database_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_deletion{
	public static void main(String[] args) {
		Statement s = null;
		Connection c = null;
		BufferedReader br = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employe","root","root");
			s = c.createStatement();
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
				System.out.println("enter the deletion name needed");
				int age = Integer.parseInt(br.readLine());
				int count = s.executeUpdate("delete from employee where eage="+age);
				
				if(count==1) {
					System.out.println("deleted "+age);
				}
				else {
					System.out.println("enter a valid input");
				}
				
				System.out.println("do you want to delete another employee ?");
				String c1 = br.readLine();
				if(c1.equalsIgnoreCase("no")) {
					break;
				}
				}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				s.close();
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


