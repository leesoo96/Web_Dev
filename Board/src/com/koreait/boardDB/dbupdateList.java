package com.koreait.boardDB;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dbupdate")
public class dbupdateList extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i_board = Integer.parseInt(request.getParameter("i_board"));
		BoardDTO3 dto = BoardDAO3.selBoard(i_board);
		request.setAttribute("contents", dto);
		Utils3.forward("dbUpdate", request, response);	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i_board = Integer.parseInt(request.getParameter("i_board"));
		String title = request.getParameter("title");
		String ctnt = request.getParameter("ctnt");
		String r_dt = request.getParameter("r_dt");
		
		BoardDTO3 dto = new BoardDTO3();
		dto.setI_board(i_board);
		dto.setTitle(title);
		dto.setCtnt(ctnt);
		dto.setR_dt(r_dt);
		
		int result = BoardDAO3.upBoard(dto);

		response.sendRedirect("/dbReadBoard?i_board="+i_board);
	}
}
