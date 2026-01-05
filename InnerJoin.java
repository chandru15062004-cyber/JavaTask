package org.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class InnerJoin {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection C=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","12345");
		Statement S=C.createStatement();
		//Create table before that we need to remove the table, 
		//with the name which we are going to give as table name
		S.execute("Drop  table if exists employees");
		S.execute("Drop  table if exists Department");
		//Create table columns
		S.execute("create table employees("+
				  "dept_id int primary key,"+
				  "emp_name varchar(50),"+
				  "emp_role varchar(100))");
		
		S.execute("create table Department("+
				  "dept_name varchar(50),"+
				  "dept_id int primary key)");
		//insert values into table by directly without creating prepared Statement
		//Employee's Table
		S.executeUpdate("insert into employees values (1,'chandru','Developer'),(2,'moon','Tester')");
		//Department Table
		S.executeUpdate("insert into Department values ('ece',1),('csc',2),('mech',3)");
		//Inner Join Query
//		String JJ="select d.dept_id,e.emp_name,e.emp_role"+
//					"from employees e "+
//					"inner join Department d"+
//					"on e.dept_id=d.dept_id";
		String JJ="select d.dept_id,e.emp_name,e.emp_role from employees e inner join department d on e.dept_id=d.dept_id ";
		
		ResultSet DD=S.executeQuery(JJ);
		System.out.println("dept_id|emp_name  |emp_role");
		while(DD.next()) {
			System.out.println(DD.getInt("dept_id")+"|"+
							   DD.getString("emp_name")+"|"+
							   DD.getString("emp_role"));
		}
		C.close();
		S.close();
		DD.close();
	}catch(Exception A) {
		A.printStackTrace();
	}
}
}
