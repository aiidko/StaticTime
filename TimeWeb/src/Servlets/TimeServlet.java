package Servlets;


import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Timer.ITimer;


@WebServlet(urlPatterns = {"/", "/current"})
public class TimeServlet extends HttpServlet {

	@EJB
	private ITimer timer;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
			getCurrentTime(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
			getCurrentTime(request, response);
    }

	private void getCurrentTime(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("result", timer.getCurrentTime());
		request.getRequestDispatcher("StaticTime.jsp").forward(request,response);
	}

}
