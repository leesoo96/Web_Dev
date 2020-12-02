package com.koreait.board3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/v3/bUpdate")
public class updateList extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i_board = Integer.parseInt(request.getParameter("i_board"));
		
		BoardDAO3 dao = BoardDAO3.getInstatance();
		BoardDTO3 dto = dao.selBoard(i_board);
		
		request.setAttribute("content", dto);

		Utils3.forward("bUpdate", request, response);
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
		
		BoardDAO3 dao = BoardDAO3.getInstatance();
		dao.upBoard(dto);
		
		response.sendRedirect("/v3/bDetail?i_board="+i_board);
	}

}
