package com.movie.우혁;

public class PaymentTestMain {
	
	public static void main(String[] args) throws Exception {
		
		PaymentDao payment = new PaymentDao();
		System.out.println("1.결제번호 부여");
		System.out.println(">>"+payment.insertPayment(new Payment(1, "aa", 1, null, 2, 2)));
		
		System.out.println("2.걸제정보 출력");
		System.out.println(">> "+payment.selectByNo(1));
		
		System.out.println("3.결제 취소");
		System.out.println(">> "+payment.deleteByNo(1));
	}
}
