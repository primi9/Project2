package com.example.model;

import java.util.*;
import java.sql.*;

public class database_conn {

	public boolean addProduct(String barcode,String color,String name) throws SQLException{

		try{
			Class.forName("com.mysql.cj.jdbc.Driver");  
		}catch(Exception e){
			System.out.println("Error in class name");
			return false;
		}

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb","root","makrilos");  

		try (Statement stmt=con.createStatement()){
				
				String command = "INSERT INTO products (b_code , p_name , Colour) VALUES (  "+ "'" +  barcode +  "' ,"  +" '" + color + "' , " + "'" + name + "');";
				System.out.println(command);
				
				stmt.executeUpdate(command);
				
				return true;
			
			
		}catch(SQLException e){	
			System.out.print(e);
			System.out.println("sql error");
			return false;
		}
	}
}

