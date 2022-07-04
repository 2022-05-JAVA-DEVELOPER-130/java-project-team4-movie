package com.movie.test;

import com.movie.dao.SeatDao;

public class SeatDaoTestMain {

	public static void main(String[] args) throws Exception {
		
		SeatDao seatDao = new SeatDao();
		
		System.out.println("1.update좌석예매");
		int rowCount=seatDao.update(1,1,"1회차");
		System.out.println(">> "+rowCount);

		System.out.println("2.회차당 남은좌석 출력");
		System.out.println(">> "+seatDao.selectByRemain("1회차",1));

		System.out.println("3.회차당 전체좌석 출력");
		System.out.println(">> "+seatDao.selectAll("2회차"));
}
}
