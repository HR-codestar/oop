package database_handling;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ex2_inputtable {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employe","root","root");
			PreparedStatement ps = c.prepareStatement("insert into employee values(?,?,?)");
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    while(true) {
		    	System.out.println("enter the age and salary");
		    	String ename = br.readLine();
		    	int eage = Integer.parseInt(br.readLine());
		    	int esal = Integer.parseInt(br.readLine());
		    	
		    	ps.setString(1, ename);
		    	ps.setInt(2, eage);
		    	ps.setInt(3, esal);
		    	
		    	int count  =  ps.executeUpdate();
		    			if(count>0) {
		    			  System.out.println("Record inserted");
		    			}
		    			else {
		    				System.out.println("not added");
		    			}
		    			

		    			System.out.println("do you want another candidate");
		    			String c1 = br.readLine();
		    			if(c1.equalsIgnoreCase("no")) {
		    				break;
		    			}
;		    }
		    
		}
		    catch(Exception e) {
		    	System.out.println(e);
		    }
		
		
		
	}
}
      

