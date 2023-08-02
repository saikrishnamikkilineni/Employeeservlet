package com.abc.Employee.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abc.Employee.dao.DaoImpl;
import com.abc.Employee.dao.DaoInterface;
import com.abc.Employee.model.Employee;



public class viewemployee extends HttpServlet{

public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		PrintWriter out=res.getWriter();
		 DaoInterface dao=new DaoImpl();
	List<Employee> emp=dao.viewAllEmployees();
		
	  for (Employee e : emp) {
	  
		  out.println("Employee ID : " + e.getEmp_id());
	      out.println("Employee name : "+e.getEmp_name());
	      out.println("Employee salary :"+e.getEmp_salary());
	      out.println("Employee city :"+e.getEmp_salary());
	
	      
	      
	  }      
}
}