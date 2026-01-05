package org.jdbc;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public class Jdbc {
public static void main(String[] args) {
	try {
		//1.Load Driver Manager
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2.Establish Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","12345");
		
		//3.Create Statement
		Statement S=con.createStatement();
		
		//4.Create DataBase
		String D=("create database Emp");
		
		//5.Execute the Statement
		S.executeUpdate(D);
		System.out.println("Executed");
		//6.Close Connection and Statement
		con.close();
		S.close();
		

	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
