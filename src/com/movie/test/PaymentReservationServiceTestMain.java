package com.movie.test;

import com.movie.dao.ReservationDao;
import com.movie.dto.Payment;
import com.movie.dto.Reservation;
import com.movie.service.PaymentReservationService;

public class PaymentReservationServiceTestMain {

	public static void main(String[] args) throws Exception{
		PaymentReservationService prs = new PaymentReservationService();
		ReservationDao rDao = new ReservationDao();
		Payment r=new Payment(1,"a",1,"국민",2,2);
		prs.PaymentReservation(r, "yeji");
		prs.SeatPayment("1회차", 3);
		prs.SeatPayment("1회차", 4);
		System.out.println("완료");
		
		
	}

}
