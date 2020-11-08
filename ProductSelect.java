package com.example.web;

import com.example.model.*;
import javax.servlet.*; 
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class ProductSelect extends HttpServlet {

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{

		String barcode = req.getParameter("barcode");
		String color = req.getParameter("color");
		String name = req.getParameter("name");
		
		database_conn db = new database_conn();
		boolean success;

		try {
			success = db.addProduct(barcode,color,name);
		}catch(Exception e){
			return ;
		}

		if(success){
		
			RequestDispatcher view = req.getRequestDispatcher("add_view.jsp");
			view.forward(req,res);
		}else{

			RequestDispatcher view = req.getRequestDispatcher("error_view.jsp");
			view.forward(req,res);
		}
	}
}
