package com.movie.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.movie.dto.Customer;
import com.movie.service.CusService;
import com.movie.service.CusService2;

public class CustomerServicetestMain2 {

	public static void main(String[] args) throws Exception {
		CusService2 cusService2 = new CusService2();
		
						
		System.out.println("아이디 찾기");
		System.out.println(cusService2.findId("한예지", "1011112222"));
		
		System.out.println("비밀번호 찾기");
		System.out.println(cusService2.findPassword("yeji", "한예지"));
		
		System.out.println("전체 회원리스트");
		System.out.println(cusService2.findAll()); 
		

	}

}
