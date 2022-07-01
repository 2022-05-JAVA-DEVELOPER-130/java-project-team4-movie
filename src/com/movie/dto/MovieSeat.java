package com.movie.dto;

import java.util.Date;

public class MovieSeat {
	private int m_seat_no;
	private Date m_time;
	private int rest_seat;
	public MovieSeat(int m_seat_no, Date m_time, int rest_seat) {
		super();
		this.m_seat_no = m_seat_no;
		this.m_time = m_time;
		this.rest_seat = rest_seat;
	}
	public int getM_seat_no() {
		return m_seat_no;
	}
	public void setM_seat_no(int m_seat_no) {
		this.m_seat_no = m_seat_no;
	}
	public Date getM_time() {
		return m_time;
	}
	public void setM_time(Date m_time) {
		this.m_time = m_time;
	}
	public int getRest_seat() {
		return rest_seat;
	}
	public void setRest_seat(int rest_seat) {
		this.rest_seat = rest_seat;
	}
	@Override
	public String toString() {
		return "MovieSeatDao [m_seat_no=" + m_seat_no + ", m_time=" + m_time + ", rest_seat=" + rest_seat + "]";
	}

	
	
}