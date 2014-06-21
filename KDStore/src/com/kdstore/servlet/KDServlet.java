package com.kdstore.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class KDServlet
 */
@WebServlet("/KDServlet")
public class KDServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KDServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	/*
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	public void process(HttpServletRequest request, HttpServletResponse response){
		
		 String strForwardPage = "";
		 
		
		 
		 try{
			 HttpSession currentSession = request.getSession(true);
			 String actionUtil = "";
			 String actionHandler = request.getParameter("actionHandler");
			 
			 if(actionHandler == null){
				 actionUtil = "";
			 }
			 if(actionHandler.equals("sale")){
				 actionUtil = request.getParameter("actionPerformed");
				 if(actionUtil == null){
					 actionUtil = "";
				 }
				 strForwardPage = processSaleActions(request, response,
							strForwardPage, currentSession, actionUtil);
			 }
			 
			 
		 }catch(Exception e){
			 e.printStackTrace();
		 }
		 
	}
	
	private String processSaleActions(HttpServletRequest request, HttpServletResponse response,
			 String strForwardPage, HttpSession currentSession, String actionUtil)throws Exception{
		
		 if(actionUtil.equals("")){
			 strForwardPage = "/Home.jsp";
		 }
		 else if(actionUtil.equalsIgnoreCase("processSale")){
			 processSale(request, response, currentSession);
			 strForwardPage = "/Home.jsp";
		 }
		 return strForwardPage;
	 }
	
	private void processSale(HttpServletRequest request, HttpServletResponse response, HttpSession currentSession){
		
	}

}
