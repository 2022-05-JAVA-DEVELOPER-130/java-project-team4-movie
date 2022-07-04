package com.movie.dao;

public class SeatSQL {

	public final static String SEAT_UPDATE=
			"update seat set seat_valid=? where seat_no=? and hall_name=?";
//	public final static String SEAT_SELECT_BY_REMAIN=
//			"select * from seat where hall_name=? and seat_valid=?";
	public final static String SEAT_SELECT_BY_NO=
			"select * from seat where seat_no=?";
	public final static String SEAT_SELECT_ALL=
			"select * from seat where hall_name=?";
	
	public final static String SEAT_PAYMENT_NO_UPDATE = "update seat set payment_no = (select max(payment_no) from payment) where hall_name = ? and seat_arrange = ?";
	

}
