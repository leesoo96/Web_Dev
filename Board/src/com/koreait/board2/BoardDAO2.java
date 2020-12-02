package com.koreait.board2;

import java.util.ArrayList;
import java.util.List;

import com.koreait.board.BoardDAO;
import com.koreait.board.BoardVO;

public class BoardDAO2 {
	
//	BoardVO 필드만 담을 수 있다
	private List<BoardDTO> list;
	
	private static BoardDAO2 dao;
	

	private BoardDAO2() {
		list = new ArrayList<BoardDTO>();
		BoardDTO dto = new BoardDTO();
		dto.setI_board(1);
		dto.setTitle("제목");
		dto.setCtnt("내용");
		dto.setR_dt("11-25");
		
		list.add(dto);
	}
	
//	서버가 실행되면 딱 한번만 실행된다.
	public static BoardDAO2 getInstatance() {
		if(dao == null) {
			dao = new BoardDAO2();
		}
		return dao;
	} // Singleton BoardDAO의 주소값을 얻기위한 메소드

	public void insBoard(BoardDTO dto) {
		dto.setI_board(list.size() + 1);
		list.add(dto);
	}
	
	public List<BoardDTO> selBoardList(){
		return list;
	}
	
	public BoardDTO selBoard(int i_board) {
		for (BoardDTO dto : list) {
			if(dto.getI_board() == i_board) {
				return dto;
			}
		}
		return null;
	}
	
	public void delBoard(int i_board) {
		for (BoardDTO dto : list) {
			if(dto.getI_board() == i_board) {
				list.remove(dto);
				return;
			}
		}
	}
	
	public void upBoard(BoardDTO param) {
		for (BoardDTO dto : list) {
			if(dto.getI_board() == param.getI_board()) {
				dto.setTitle(param.getTitle());
				dto.setCtnt(param.getCtnt());
				return;
			}
		}
	}
}
