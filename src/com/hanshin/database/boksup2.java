package com.hanshin.database;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/my2")
public class boksup2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet ���� ��");
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset = UTF-8");
		
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>member</title></head>");
		out.print("<table border=\"1\" style=\"text-align:left;\">");
		out.print("<tr><th>���̵�</th><th>"+req.getParameter("id")+"</th>");
		out.print("<tr><th>��й�ȣ</th><th>"+req.getParameter("pwd")+"</th></tr>");
		out.print("<tr><th>�̸�</th><th>"+req.getParameter("name")+"</th></tr>");
		out.print("<tr><th>��ȭ��ȣ</th><th>"+req.getParameter("tel")+"</th></tr>");
		out.print("<tr><th>�̸���</th><th>"+req.getParameter("email")+"</th></tr>");
		out.print("<tr><th>�а�</th><th>"+req.getParameter("dept")+"</th></tr>");
		out.print("<tr><th>����</th><th>"+req.getParameter("gender")+"</th></tr>");
		out.print("<tr><th>�¾ ����</th><th>"+req.getParameter("birth")+"</th></tr>");
		out.print("<tr><th>�ڱ�Ұ�</th><th>"+req.getParameter("introduction")+"</th></tr></table>");
		out.print("</html>");
		out.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
}
