package com.koreait.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// 글 내용 확인
// Page만들때마다 서블릿도 추가로 만들어줘야한다!!!!!!!!!!!! 대소문자 구분 O
@WebServlet("/BoardDetail")
public class BoardDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		키 값을 정수로 줬지만 html에는 정수라는 개념이 없다. 그래서 String으로 받아야한다
//		정수형은 파싱해서 형변환해서 받으면 된다
		int i_board = Integer.parseInt(request.getParameter("i_board"));
//		System.out.println("i_board = " + i_board);
		
//		DB통신
		BoardDAO dao = BoardDAO.getInstatance();
		BoardVO data = dao.selBoard(i_board);
		
//		JSP에게 값 전달 
		request.setAttribute("data", data); // 키 설정
		
		String detailPath = "/WEB-INF/JSP/boardDetail2.jsp";
		request.getRequestDispatcher(detailPath).forward(request, response);											
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
// 만들어놓은걸 쓴다 - 라이브러리 / 내가 만든 것 중 원하는 것만 동작하도록 함, 내가 만든 것을 상대방이 호출 - 프레임워크
}
// JSP파일로 절대 열지않고 서블릿으로 연다!!!!