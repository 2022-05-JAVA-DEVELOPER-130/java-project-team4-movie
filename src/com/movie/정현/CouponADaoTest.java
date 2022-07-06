package com.movie.정현;

import com.movie.정현.CouponADao;
import com.movie.정현.CouponA;


public class CouponADaoTest {
	public static void main(String[] args) throws Exception{
		CouponADao couponADao = new CouponADao();
		
		System.out.println("쿠폰 선택");
		CouponA findCoupon=couponADao.selectCoupon(1);
			
		System.out.println(findCoupon);
		
	}
	
	
	
	
}
