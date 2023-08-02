package com.abc.Employee.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abc.Employee.model.Employee;

import com.abc.Employee.dao.*;
import java.io.IOException;

 
public class addemployee extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		PrintWriter out=res.getWriter();
		Employee emp = new Employee();
		emp.setEmp_id(Integer.parseInt(req.getParameter("emp_id")));

        emp.setEmp_name(req.getParameter("emp_name"));

        emp.setEmp_salary(Double.parseDouble(req.getParameter("emp_salary")));

        emp.setEmp_city(req.getParameter("emp_city"));

        DaoInterface dao=new DaoImpl();

        boolean b=dao.addEmployee(emp);

        if(b) {

            out.print("<h1>success</h1>");

        }

        else {

            out.print("<h1>Fail</h1>");

        }

	}

}
