package com.hr.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hr.entity.Emp;
import com.hr.service.EmpService;
import com.hr.service.EmpServiceImpl;

/**
 * Servlet implementation class DisplayEmpServlet
 */
@WebServlet(name="DisplayEmpServlet",urlPatterns="/dis/*")
public class DisplayEmpServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	EmpService empService = new EmpServiceImpl();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String info=request.getPathInfo();
		int id=Integer.parseInt(request.getParameter("id"));
		if("/display".equals(info)){
			Emp e=empService.find(id);
			request.setAttribute("emp", e);
			request.getRequestDispatcher("/WEB-INF/jsp/displayemp.jsp").forward(request, response);
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
