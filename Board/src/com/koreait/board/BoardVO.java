package com.koreait.board;

// 하나의 글 당 하나의 VO
// 데이터를 긁어와서 모은다 (Value Object) = DTO
public class BoardVO {
	private int i_board;   // pk
	private String title;  // 제목
	private String ctnt;  // 내용
	private String r_dt;  // 등록날짜
	private String m_dt;  // 수정날짜
	// 행(record) 값 ----------------
	
	public BoardVO(int i_board, String title, String ctnt, String r_dt, String m_dt) {
		this.i_board = i_board;
		this.title = title;
		this.ctnt = ctnt;
		this.r_dt = r_dt;
		this.m_dt = m_dt;
	}
	
	public int getI_board() {
		return i_board;
	}
	public void setI_board(int i_board) {
		this.i_board = i_board;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCtnt() {
		return ctnt;
	}
	public void setCtnt(String ctnt) {
		this.ctnt = ctnt;
	}
	public String getR_dt() {
		return r_dt;
	}
	public void setR_dt(String r_dt) {
		this.r_dt = r_dt;
	}
	public String getM_dt() {
		return m_dt;
	}
	public void setM_dt(String m_dt) {
		this.m_dt = m_dt;
	}
	
}
