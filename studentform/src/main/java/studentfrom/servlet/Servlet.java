package studentfrom.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.mapping.List;

import studentform.dao.StudentDaoImpl;
import studentform.entity.Student;


@WebServlet("/")
	public class Servlet extends HttpServlet{
		 protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			        throws ServletException, IOException{
			 doGet(req, resp);
			    }
		 
		 protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			        throws ServletException, IOException{
			 String action = req.getServletPath();
	try {
			 switch (action) {
	     case "/new":
	         showNewForm(req, resp);
	         break;
	     case "/insert":
	         insertStudent(req, resp);
	         break;
	     case "/delete":
	         deleteStudent(req, resp);
	         break;
	     case "/edit":
	         showEditForm(req, resp);
	         break;
	     case "/update":
	         updateStudent(req, resp);
	         break;
	    default:
	        listStudent(req, resp);
	         break;
	 }
	}catch (SQLException ex) {
	    throw new ServletException(ex);
	}
		 
		 }

		private void listStudent(HttpServletRequest req, HttpServletResponse resp) 
				throws SQLException, IOException, ServletException {
			StudentDaoImpl studentDaoImpl=new StudentDaoImpl();
			java.util.List<Student> listStudent =  studentDaoImpl.getAllStudent();

	        req.setAttribute("listStudent", listStudent);
	        RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
	        dispatcher.forward(req, resp);
			// TODO Auto-generated method stub
			
			
		}

		private void updateStudent(HttpServletRequest req, HttpServletResponse resp) 
				 throws SQLException, IOException {
	        int id = Integer.parseInt(req.getParameter("id"));
	        String name = req.getParameter("name");
	        String email = req.getParameter("email");
	   

	        Student stud = new Student(id, name, email);
	        StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
			studentDaoImpl.updateStudent(stud);
	        resp.sendRedirect("list");
	    }
			// TODO Auto-generated method stub
			
			
		
		private void showEditForm(HttpServletRequest req, HttpServletResponse resp) 
				throws SQLException, ServletException, IOException {
	        int id = Integer.parseInt(req.getParameter("id"));
	        StudentDaoImpl existingStudent = new StudentDaoImpl();
	        existingStudent.getStudentById(id);
	        RequestDispatcher dispatcher = req.getRequestDispatcher("Studentform.jsp");
	        req.setAttribute("Student", existingStudent);
	        dispatcher.forward(req, resp);

			
		}

		private void deleteStudent(HttpServletRequest req, HttpServletResponse resp) 
				 throws SQLException, IOException {
	        int id = Integer.parseInt(req.getParameter("id"));
	        StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
			studentDaoImpl.deleteStudent(id);
	        resp.sendRedirect("list");
			// TODO Auto-generated method stub
			
			
		}

		private void insertStudent(HttpServletRequest req, HttpServletResponse resp) 
			    throws SQLException, IOException {
	        String name = req.getParameter("name");
	        String email = req.getParameter("email");
	        Student addStudent = new Student(name, email);
	        StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
			studentDaoImpl.addStudent(addStudent);
	        resp.sendRedirect("list");

			
			// TODO Auto-generated method stub
			
		}

		private void showNewForm(HttpServletRequest req, HttpServletResponse resp) 
			// TODO Auto-generated method stub
			throws ServletException, IOException {
		        RequestDispatcher dispatcher = req.getRequestDispatcher("Studentform.jsp");
		        dispatcher.forward(req, resp);
			}
		

			
		}
		


