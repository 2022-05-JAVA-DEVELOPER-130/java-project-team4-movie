package com.movie.정현;
import java.util.List;


public class ReservationDaoTest {

	public static void main(String[] args) throws Exception {
		ReservationDao reservationDao=new ReservationDao();
		
			System.out.println("1.예매번호 부여");
			//int rowcount=reservationDao.insertReservationNo();
			//System.out.println(">> "+rowcount);
			
			
			System.out.println("2.예매내역 확인");
			System.out.println(">>"+reservationDao.selectAll());
			
			System.out.println("3.예매내역 취소");
			System.out.println(">>"+reservationDao.deleteReservation(0));
		
		
			
		}
	

	}

