package com.movie.dao;

public class SeatSQL {

	public final static String SEAT_UPDATE=
			"update seat set cus_id=?,seat_valid=0 where hall_name=? and seat_arrange=?";
	public final static String SEAT_UPDATE2=
			"update movie_hall set remain_seat = (select sum(seat_valid) from seat where hall_name = ?) where hall_name = ?";
	public final static String SEAT_SELECT_BY_HALL=
			"select * from seat where hall_name=?";
	public final static String SEAT_SELECT_BY_ID=
			"select * from seat where cus_id=?";
	public final static String SEAT_SELECT_ALL=
			"select * from seat where ";
	
	public final static String SEAT_PAYMENT_NO_UPDATE = "update seat set payment_no = (select max(payment_no) from payment) where hall_name = ? and seat_arrange = ?";
	

}
