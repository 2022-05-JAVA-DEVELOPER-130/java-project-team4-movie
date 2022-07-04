package com.movie.test;

import com.movie.dao.PaymentDao;

public class PaymentTestMain {
	
	public static void main(String[] args) {
		
		PaymentDao payment = new PaymentDao();
		System.out.println("1.결제번호 부여");
		//System.out.println(">>"+paymentDao.insertPayment);
		
		System.out.println("2.걸제정보 출력");
		//System.out.println(">> "+payment.selectAll());
	}
}
