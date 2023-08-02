package com.abc.Employee.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abc.Employee.model.Employee;

import com.abc.Employee.dao.*;

public class searchemployee extends HttpServlet {

public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		PrintWriter out=res.getWriter();
		int emp_id=Integer.parseInt(req.getParameter("emp_id"));

        DaoInterface dao=new DaoImpl();

        Employee emp=dao.getEmployeebyID(emp_id);

        

        out.println("Emp id: "+emp.getEmp_id());

        out.println("Emp name: "+emp.getEmp_name());

        out.println("Emp salary: "+emp.getEmp_salary());

        out.println("Emp city: "+emp.getEmp_city());

        

        

        

        

        

    }

	
		

}

