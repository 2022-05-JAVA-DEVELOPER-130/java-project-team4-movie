package com.movie.정현;

import com.movie.정현.CouponADao;
import com.movie.정현.CouponA;


public class CouponAService {
	private CouponADao couponAdao;
	
	public CouponAService(){
		couponAdao =new CouponADao();
	}
	//쿠폰 선택?
	public CouponA insertCouponNo(int coupon_no)throws Exception{
		return couponAdao.selectCoupon(coupon_no);
}
}
