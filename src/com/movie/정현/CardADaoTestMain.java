package com.movie.정현;

import com.movie.정현.CardADao;

import com.movie.정현.CardA;

public class CardADaoTestMain {

	public static void main(String[] args)throws Exception {
		CardADao cardADao=new CardADao();
		
		System.out.println("카드 선택");
		
		CardA findcardName=cardADao.selectCardName("국민");
		System.out.println(findcardName);
		
	} 

}
