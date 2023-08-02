package com.abc.Employee.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abc.Employee.dao.DaoImpl;
import com.abc.Employee.dao.DaoInterface;
import com.abc.Employee.model.Employee;

public class updateemployee extends HttpServlet {

public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		PrintWriter out=res.getWriter();
		Employee emp=new Employee();
		
		emp.setEmp_name(req.getParameter("emp_name"));

        emp.setEmp_salary(Double.parseDouble(req.getParameter("emp_salary")));

        emp.setEmp_city(req.getParameter("emp_city"));
		
        DaoInterface dao=new DaoImpl();
        
        boolean b=dao.updateEmployee(emp);
        if(b) {

	        System.out.println("Employee record Updated successfully");

	    }

	    else {

	        System.out.println("fail");
	    }
	    } 
}

