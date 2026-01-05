package org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
public static void main(String[] args) {
	try{
		//Load the Driver MAnager
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Create Connection
		Connection D=DriverManager.getConnection("jdbc:mysql://localhost:3306/Emp","root","12345");
		//Create Statement
		Statement R=D.createStatement();
		//Create DataBase
//		String S="create table Details("+id INT PRIMRY KEY AUTO_INCREMENT,"
//										+"name varchar(50) not null,"
//										+"salary decimal(10,3))");
		String S = "CREATE TABLE Details (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(50) NOT NULL)";

		//Execute DataBase
		R.executeUpdate(S);
		System.out.println("asdf");
		//Close 
		D.close();
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
//, salary DECIMAL(10,3),role varchar(100) not Null 