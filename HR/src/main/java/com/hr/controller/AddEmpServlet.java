package com.hr.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hr.entity.Dept;
import com.hr.entity.Emp;
import com.hr.service.DeptService;
import com.hr.service.DeptServiceImpl;
import com.hr.service.EmpService;
import com.hr.service.EmpServiceImpl;

/**
 * Servlet implementation class PreAddEmpServlet
 */
@WebServlet(name="AddEmpServlet", urlPatterns="/add/*")
public class AddEmpServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	DeptService de=new DeptServiceImpl();
	
	EmpService empService = new EmpServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String info=request.getPathInfo();
		if("/preadd".equals(info)){
			List<Dept> l=de.alldept();
			request.setAttribute("deptlist", l);
			request.getRequestDispatcher("/WEB-INF/jsp/addemp.jsp").forward(request, response);
		}
		else if("/add".equals(info)){
			int depid=Integer.parseInt(request.getParameter("bumen"));
			int egendar=Integer.parseInt(request.getParameter("nan"));
			String ename=request.getParameter("ename");
			Emp emp=new Emp();
			emp.setDepid(depid);
			emp.setEgendar(egendar);
			emp.setEmpdate(new Date());
			emp.setEname(ename);
			empService.insert(emp);
			
			List<Emp> l=empService.findall();
			request.setAttribute("emplist", l);
			request.getRequestDispatcher("/WEB-INF/jsp/listemp.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
