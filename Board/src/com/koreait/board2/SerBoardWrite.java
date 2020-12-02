package com.koreait.board2;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/v2/boardReg")
public class SerBoardWrite extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Utils.forward("boardWrite", request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String ctnt = request.getParameter("ctnt");
		String r_dt = request.getParameter("r_dt");
		
//		메소드와 생성자의 차이점 : 생성자는 반환형이 없고 클래스이름과 동일하다
		BoardDTO dto = new BoardDTO();
		dto.setTitle(title);
		dto.setCtnt(ctnt);
		dto.setR_dt(r_dt);
		
		BoardDAO2 dao = BoardDAO2.getInstatance();
		dao.insBoard(dto);
		
		response.sendRedirect("/v2/SerBoardList");
	}

}
