package com.koreait.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// 글쓰기
@WebServlet("/BoardReg")
public class BoardReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		GET방식은 보이는 화면을 처리할때 쓴다
//		JSP파일을 열때 무조건 쓴다 -> GET방식일 경우!
		String jspPath = "/WEB-INF/JSP/boardReg.jsp";
		request.getRequestDispatcher(jspPath).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Process(업무처리) 처리 시 주로 post 쓴다
		request.setCharacterEncoding("UTF-8");
		
		int i_board = Integer.parseInt(request.getParameter("i_board"));
		String title = request.getParameter("title");
		String ctnt = request.getParameter("ctnt");
		
		System.out.printf("i_board=%s / title=%s / ctnt=%s",i_board, title, ctnt);
		
//		static은 클래스이름.메소드() !!!!!!!!!!!!!!!!!!
		BoardDAO dao = BoardDAO.getInstatance();
		BoardVO vo = new BoardVO(i_board, title, ctnt, "11-25","11-26");
		dao.insertBoard(vo);
		
//		값을 전달할 수 있는 유일한 방법!
//		단순 주소 이동이라고 생각하기!              쿼리스트링 사용가능(?i_board=1)
		response.sendRedirect("/BoardList");
//		sendRedirect -> 무조건 GET방식!!!!!
	}
}
