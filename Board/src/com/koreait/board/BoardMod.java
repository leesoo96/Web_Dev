package com.koreait.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// 글 수정
@WebServlet("/BoardMod")
public class BoardMod extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDAO dao = BoardDAO.getInstatance();
	
		int i_board = Integer.parseInt(request.getParameter("i_board"));
		
//		글 내용 전부 읽어옴
		BoardVO vo = dao.selBoard(i_board);
		
		request.setAttribute("data", vo);
		
		String modPath = "/WEB-INF/JSP/boardMod.jsp";
		request.getRequestDispatcher(modPath).forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		int i_board = Integer.parseInt(request.getParameter("i_board"));
		String title = request.getParameter("title");
		String ctnt = request.getParameter("ctnt");
		String r_dt = request.getParameter("r_dt");
		
		BoardVO vo = new BoardVO(i_board, title, ctnt, r_dt, "11-26");
	
		BoardDAO dao = BoardDAO.getInstatance();
		dao.upBoard(vo);
		
		response.sendRedirect("/BoardDetail?i_board=" + i_board);
	}

}
