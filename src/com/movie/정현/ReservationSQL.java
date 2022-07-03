package com.movie.정현;

public class ReservationSQL {
	public static final String Reservation_INSERT
	="insert into reservation_info values(to_number(to_char(sysdate, 'yymmddHH24MI')),?,?,?,?)";
	
	public static final String Reservation_SELECT_ALL
	="select * from reservation_info";
	
	public static final String Reservation_DELETE
	="delete from reservation_info where RESERVATION_NO=?";
;
}
