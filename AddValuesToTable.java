package org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class AddValuesToTable {
public static void main(String[] args) {
	try {
		//1
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2
		Connection C=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","12345");
		//3.Create Columns which we have to insert
		String s="insert into details(Name,Salary) values(?,?)";
		//4.Create Prepared Statement
		PreparedStatement F=C.prepareStatement(s);
		//5.Insert Values
		//value-1
		F.setString(1,"cc");
		F.setBigDecimal(2,new java.math.BigDecimal("50123.000"));
		F.executeUpdate();
		//value-2
		F.setString(1,"wseew");
		F.setBigDecimal(2,new java.math.BigDecimal("13244.684"));
		F.executeUpdate();
		//value-3
		F.setString(1,"ww");
		F.setBigDecimal(2,new java.math.BigDecimal("23244.684"));
		F.executeUpdate();
		//value-4
		F.setString(1,"hged");
		F.setBigDecimal(2,new java.math.BigDecimal("440.0"));
		F.executeUpdate();
		//value-5
		F.setString(1,"sedwe");
		F.setBigDecimal(2,new java.math.BigDecimal("23434.13"));
		F.executeUpdate();
		//6.Execute
		
		System.out.println("ASF");
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
