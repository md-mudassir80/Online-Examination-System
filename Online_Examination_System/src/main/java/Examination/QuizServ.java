package Examination;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class QuizServ
 */
@WebServlet("/QuizServ")
public class QuizServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int cnt = 0;
		String a="" ,b="", c="" , d="", e="", f="", g="", h="", i="", j="";
		a = request.getParameter("q1");
		b = request.getParameter("q2");
		c = request.getParameter("q3");
		d = request.getParameter("q4");
		e = request.getParameter("q5");
		f = request.getParameter("q6");
		g = request.getParameter("q7");
		h = request.getParameter("q8");
		i = request.getParameter("q9");
		j = request.getParameter("q10");
		
//		int q1b=2, q2d=2, q3c=2, q4b=2, q5c=2, q6d=2, q7d=2, q8c=2, q9b = 2, q10b = 2;
		
    	if(a.equals("q1b")) {
			out.print("Your 1st answer is correct!<br/>");
			cnt++;
		}
		else {
			out.print("Your 1st answer is wrong!<br/>");
		}
		
		if(b.equals("q2d")) {
			out.print("Your 2nd answer is correct!<br/>");
			cnt++;
		}
		else {
			out.print("Your 2nd answer is wrong!<br/>");
		}
		
		if(c.equals("q3c")) {
			out.print("Your 3rd answer is correct!<br/>");
			cnt++;
		}
		else {
			out.print("Your 3rd answer is wrong!<br/>");
		}
		
		if(d.equals("q4b")) {
			out.print("Your 4th answer is correct!<br/>");
			cnt++;
		}
		else {
			out.print("Your 4th answer is wrong!<br/>");
		}
		
		if(e.equals("q5c")) {
			out.print("Your 5th answer is correct!<br/>");
			cnt++;
		}
		else {
			out.print("Your 5th answer is wrong!<br/>");
		}
		
		if(f.equals("q6d")) {
			out.print("Your 6th answer is correct!<br/>");
			cnt++;
		}
		else {
			out.print("Your 6th answer is wrong!<br/>");
		}
		
		if(g.equals("q7d")) {
			out.print("Your 7th answer is correct!<br/>");
			cnt++;
		}
		else {
			out.print("Your 7th answer is wrong!<br/>");
		}
		
		if(h.equals("q8c")) {
			out.print("Your 8th answer is correct!<br/>");
			cnt++;
		}
		else {
			out.print("Your 8th answer is wrong!<br/>");
		}
		
		if(i.equals("q9b")) {
			out.print("Your 9th answer is correct!<br/>");
			cnt++;
		}
		else {
			out.print("Your 9th answer is wrong!<br/>");
		}
		
		if(j.equals("q10b")) {
			out.print("Your 10th answer is correct!<br/>");
			cnt++;
		}
		else {
			out.print("Your 10th answer is wrong!<br/>");
		} 
		
		if(cnt == 10) {
			out.println("<h1> Congratulations!!! Your all answer is correct </h1>");
		}
		else {
			out.println("<h1> You have scored " +cnt+ "points </h1>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
