package com.movie.service;

import com.movie.dao.SeatDao;
import com.movie.dto.Seat;

public class SeatService {
	private SeatDao seatDao;

	public SeatService() {
		seatDao = new SeatDao();
	}

	/*
	 * 좌석예매
	 * 	- 좌석이 중복된 경우에는 메세지 띄운다.
	 */

//	public boolean seatReservation(Seat newSeat) throws Exception {
//		boolean isReservation = false;
//		/*
//		 * 좌석예매여부체크
//		 * 	- 빈자리면     예매
//		 * 	- 빈자리아니면 메세지
//		 */
//		Seat findSeat = seatDao.
//
//	}
}
