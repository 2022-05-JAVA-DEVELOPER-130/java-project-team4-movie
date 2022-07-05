package com.movie.test;

import com.movie.dao.PaymentDao;
import com.movie.dto.Payment;
import com.movie.service.PaymentService;

public class PaymentTestMain {

	public static void main(String[] args) throws Exception {

		PaymentService payment = new PaymentService();


		System.out.println("1.예매내역 출력");
		System.out.println(">> " + payment.list("junyeung"));

		
		System.out.println("2.결제취소");
		System.out.println(">>" + payment.deletebyCusId("yeji"));

		System.out.println("3.결제금액 출력");
		
		System.out.println("--------------");
		System.out.println(payment.selectAll());

		System.out.println("--------------");
		System.out.println(payment.selectByCusId("jeonghun"));
	}
}
