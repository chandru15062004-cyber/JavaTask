package org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultInConsole {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection d=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","12345");
		Statement s=d.createStatement();
		//select the table
		String g="Select * from details";
		//execute statement
		ResultSet j=s.executeQuery(g);
		//Print the records
		System.out.println("Id|Name |Salary");
		while(j.next()) {
			int i=j.getInt("id");
			String n=j.getString("name");
			double X=j.getDouble("salary");
			System.out.println(i+" |"+n+"   |"+X);
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
