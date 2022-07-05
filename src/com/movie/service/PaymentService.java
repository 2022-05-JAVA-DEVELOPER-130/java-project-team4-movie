package com.movie.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.movie.common.DataSource;
import com.movie.dao.MovieDao;
import com.movie.dao.PaymentDao;
import com.movie.dao.PaymentSQL;
import com.movie.dao.ReservationSQL;
import com.movie.dao.SeatDao;
import com.movie.dao.SeatSQL;
import com.movie.dto.Movie;
import com.movie.dto.Payment;
import com.movie.dto.Seat;

public class PaymentService {
	
	private PaymentDao paymentDao;
	private MovieDao movieDao;
	private SeatDao seatDao;
	
	public PaymentService() {
		paymentDao = new PaymentDao();
		movieDao = new MovieDao();
		seatDao = new SeatDao();
	}
	
	/*
	 * 예약전체삭제
	 */
	public int deletebyCusId(String cus_id) throws Exception {
		return paymentDao.deleteByCusId(cus_id);
	}
	/*
	 * 예약 1건삭제
	 */
	public int deleteByPaymentNo(int payment_no) throws Exception {
		return paymentDao.deleteByPaymentNo(payment_no);
		
	}
	/*
	 * 예약목록 - 성민작업
	 */
//	public ArrayList<Payment> reservationList(String cus_id){
//		return;
//	}
	
	/*
	 * 선택영화 주문목록
	 */
	public ArrayList<Seat> list(String cus_id) throws Exception{
		return paymentDao.list(cus_id);
	}
	/*
	 * 선택내용 정보출력
	 */
	public List<Payment> selectByCusId(String cus_id) throws Exception {
		return paymentDao.selectAllByCusId(cus_id);
	}
	/*
	 * 모든 예약자 정보출력
	 */
	public List<Payment> selectAll() throws Exception{
		return paymentDao.selectAllList();
	}
		
	
	/*
	 * 영화예약
	 */
//	public int create(String cus_id, String movie_hall, int adult_member_count, int child_member_count) throws Exception {
//		Movie movie = movieDao.selectByHallName(movie_hall);
//		Seat seat = new Seat(0, adult_member_count, child_member_count, null, null, null);
//		ArrayList<Seat> seatList = new ArrayList<Seat>();
//		seatList.add(seat);
//		Payment newPayment =
//				new Payment(0,
//							null,
//							seatList.get(0).getMovie().getPrice_no(),
//							seatList.get(0).get);
//		
//		return 0;
		
	
	
		
		
		
		
		
		
		
		
	
}
