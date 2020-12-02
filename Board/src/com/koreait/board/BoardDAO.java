package com.koreait.board;

import java.util.ArrayList;
import java.util.List;

//  DB와 통신(Data Access)
	public class BoardDAO {
	
//	BoardVO 필드만 담을 수 있다
	private List<BoardVO> list;
	
	private static BoardDAO dao;
	
//	무조건 객체 하나만 생성 - 싱글톤 패턴. 외부에서 객체화안되도록 해야함. private으로 접근제한자를 붙여주면 된다
	private BoardDAO() {
		list = new ArrayList();
		
		list.add(new BoardVO(1, "안녕1", "JSP..", "11-23", "11-23"));
		list.add(new BoardVO(2, "안녕2", "JSP~~", "11-24", "11-24"));
		list.add(new BoardVO(3, "안녕3", "JSP!!", "11-25", "11-25"));
	}
	
//	서버가 실행되면 딱 한번만 실행된다.
	public static BoardDAO getInstatance() {
		if(dao == null) {
			dao = new BoardDAO();
		}
		return dao;
	} // Singleton BoardDAO의 주소값을 얻기위한 메소드
	
//	주소값 하나만 읽어옴 - 리스트의 객체들 접근
	public List<BoardVO> selBoardList(){ 
		return list;
	}
	
//	add된 값 전부 읽어옴
	public BoardVO selBoard(int i_board) {
		for(BoardVO vo : list) {
			if(vo.getI_board() == i_board) {
				return vo;	
			}
		}
		return null;
	}
	
//	글 등록
	public void insertBoard(BoardVO vo) {
		list.add(vo);
	}
	
//	글 삭제
	public void delBoard(int i_board) {
		for (BoardVO vo : list) {
			if(vo.getI_board() == i_board) {
				list.remove(vo);
				return;
			}
		}
/*		for(int i=0; i<list.size(); i++) {
			BoardVO vo = list.get(i);
			if(vo.getI_board() == i_board) {
				list.remove(i);
				return;
			}
		}   --> 인덱스 번호로 삭제하기
*/	}
	
//	글 수정
	public void upBoard(BoardVO vo) {
		delBoard(vo.getI_board());
		insertBoard(vo);
	}
}
