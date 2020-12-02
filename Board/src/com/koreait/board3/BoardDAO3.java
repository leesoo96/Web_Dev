package com.koreait.board3;

import java.util.ArrayList;
import java.util.List;

import com.koreait.board.BoardDAO;
import com.koreait.board.BoardVO;

public class BoardDAO3 {
	
	private List<BoardDTO3> list = new ArrayList();
	
	private static BoardDAO3 dao;

	private BoardDAO3() {}
	
	public static BoardDAO3 getInstatance() {
		if(dao == null) {
			dao = new BoardDAO3();
		}
		return dao;
	} 

	public void insBoard(BoardDTO3 dto) {
		dto.setI_board(list.size() + 1);
		list.add(dto);
	}
	
	public List<BoardDTO3> selBoardList(){
		return list;
	}
	
	public BoardDTO3 selBoard(int i_board) {
		for (BoardDTO3 dto : list) {
			if(dto.getI_board() == i_board) {
				return dto;
			}
		}
		return null;
	}
	
	public void delBoard(int i_board) {
		for (BoardDTO3 dto : list) {
			if(dto.getI_board() == i_board) {
				list.remove(dto);
				return;
			}
		}
	}
	
	public void upBoard(BoardDTO3 param) {
		for (BoardDTO3 dto : list) {
			if(dto.getI_board() == param.getI_board()) {
				dto.setTitle(param.getTitle());
				dto.setCtnt(param.getCtnt());
				return;
			}
		}
	}
}
