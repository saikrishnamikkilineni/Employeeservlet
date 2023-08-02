package com.abc.Employee.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abc.Employee.model.Employee;
import com.abc.Employee.dao.*;

public class deleteemployee extends HttpServlet {

public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		PrintWriter out=res.getWriter();
		int emp_id = Integer.parseInt(req.getParameter("emp_id"));
		DaoInterface dao=new DaoImpl();
		
		boolean b=dao.deleteEmployee( emp_id);
		
		if(b) {

            out.print("<h1>success</h1>");

        }

        else {

            out.print("<h1>Fail</h1>");

        }
		
}



}
