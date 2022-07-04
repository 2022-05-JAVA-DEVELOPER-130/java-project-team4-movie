package com.movie.service;

import com.movie.dao.SeatDao;

public class SeatService {
	private SeatDao seatDao;
	public SeatService() {
		seatDao=new SeatDao();
	}
	
	/*
	 * 좌석예매
	 * 	- 좌석이 중복된 경우에는 메세지 띄운다.
	 */
	
//	public boolean addSeat(int seat_valid, int seat_no, String hall_name) throws Exception{
//		boolean isReservation = false;
//		/*
//		 * 좌석예매여부체크
//		 * 	- 예매되었으면 메세지
//		 * 	- 빈좌석이면 오류
//		 */
//		List<Seat> remainSeat=seatDao.selectByRemain(hall_name, 1);
//		if(remainSeat==seatDao.selectByRemain(hall_name, 0)) {
//			isReservation=false;
//		}else {
//			int rowCount=seatDao.update(seat_valid, seat_no, hall_name);
//		}
//		
//		return isReservation;
//		
		
		
	}
	
	
	

