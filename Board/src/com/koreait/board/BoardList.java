package com.koreait.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// 글목록 출력
// 실무에서는 클래스이름과 어노테이션 이름을 완전히 다르게 한다. 보안상의 이유때문!
@WebServlet("/BoardList")
public class BoardList extends HttpServlet {
	private static final long serialVersionUID = 1L;

//	주소값에 쿼리문을 보내는 GET. 정보 노출
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
//		BoardDAO에 있는 list 주소값을 request에 data라는 키 값으로 주소값 담기
		BoardDAO dao = BoardDAO.getInstatance();
		List<BoardVO> list = dao.selBoardList();
		request.setAttribute("data", list);
		
		String jspPath = "/WEB-INF/JSP/boardList3.jsp";
//		요청한 결과를 request에 담아서 전송. 전송된 결과를 response가 응답하여 클라이언트에게 보여준다.		
		request.getRequestDispatcher(jspPath).forward(request, response);
	}

//	정보 노출 X , 보내는 내용이 길 때 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		form Tag 전용 방식이라고 보면 된다
	}
}
