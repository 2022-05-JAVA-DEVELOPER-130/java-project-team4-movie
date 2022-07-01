package com.movie.dto;

public class Seat {
	private int m_seat_no;
	private int seat_no;
	private int seat_valid;
	public Seat(int m_seat_no, int seat_no, int seat_valid) {
		super();
		this.m_seat_no = m_seat_no;
		this.seat_no = seat_no;
		this.seat_valid = seat_valid;
	}
	public int getM_seat_no() {
		return m_seat_no;
	}
	public void setM_seat_no(int m_seat_no) {
		this.m_seat_no = m_seat_no;
	}
	public int getSeat_no() {
		return seat_no;
	}
	public void setSeat_no(int seat_no) {
		this.seat_no = seat_no;
	}
	public int getSeat_valid() {
		return seat_valid;
	}
	public void setSeat_valid(int seat_valid) {
		this.seat_valid = seat_valid;
	}
	@Override
	public String toString() {
		return "Seat [m_seat_no=" + m_seat_no + ", seat_no=" + seat_no + ", seat_valid=" + seat_valid + "]";
	}
	
	
	
	
	
	
	
	
}