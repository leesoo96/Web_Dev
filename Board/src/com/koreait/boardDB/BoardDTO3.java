package com.koreait.boardDB;

public class BoardDTO3 {
//	private에 값을 넣는 방법 - 생성자와 메소드(setter)
//	private에 값을 빼는 방법 - 메소드
	private int i_board;
	private String title;
	private String ctnt;
	private String r_dt;

	public BoardDTO3() {}
	public BoardDTO3(String title, String ctnt) {
		this.title = title;
		this.ctnt = ctnt;
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
}
