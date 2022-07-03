package com.movie.성민;

public class CouponDaoTest {
	public static void main(String[] args) throws Exception{
		CouponDao couponDao = new CouponDao();
		Coupon coupon = couponDao.selectByNo(1);
		System.out.println(coupon);
	}
	
	
	
	
}
