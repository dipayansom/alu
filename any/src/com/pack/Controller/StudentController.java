package com.pack.Controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pack.Model.StudentModel;
import com.pack.Service.studentServiceImpl;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		studentServiceImpl sImpl=new studentServiceImpl();
		List<StudentModel> l=sImpl.listAllStudent();
		request.setAttribute("listStudent",l);
		RequestDispatcher rd=request.getRequestDispatcher("/listStudent.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String id=request.getParameter("stuID");
		String name=request.getParameter("stuName");
		String gender=request.getParameter("gender");
		String course=request.getParameter("course");
		String address=request.getParameter("address");
		StudentModel s=new StudentModel(id,name,gender,course,address);
		studentServiceImpl sImpl=new studentServiceImpl();
		int i=sImpl.insertStudent(s);
		if(i==1)
		{
			List<StudentModel> l=sImpl.listAllStudent();
			request.setAttribute("listStudent",l);
			RequestDispatcher rd=request.getRequestDispatcher("/listStudent.jsp");
			rd.forward(request, response);
		}
	}

}
