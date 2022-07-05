package com.movie.정현;

import com.movie.dao.CardInfoDao;
import com.movie.dto.CardInfo;

public class CardADaoTestMain {

	public static void main(String[] args)throws Exception {
		CardADao cardaDao=new CardADao();
		
		System.out.println("카드 선택");
		System.out.println(cardaDao.insertCardName("국민"));
		
		/*
		Card2Dao selectCardName1=new CardInfo();
		selectCardName1. .insertinto(new CardInfo("국민"));
		Card2Dao insertCardInfo2=new CardInfo();
		insertCardInfo2.insertinto(new CardInfo("신한"));
		Card2Dao insertCardInfo3=new CardInfo();
		insertCardInfo3.insertinto(new CardInfo("농협"));
		Card2Dao insertCardInfo4=new CardInfo();
		insertCardInfo4.insertinto(new CardInfo("롯데"));
		Card2Dao insertCardInfo5=new CardInfo();
		insertCardInfo5.insertinto(new CardInfo("현대"));
		Card2Dao insertCardInfo6=new CardInfo();
		insertCardInfo6.insertinto(new CardInfo("삼성"));
		Card2Dao insertCardInfo7=new CardInfo();
		insertCardInfo7.insertinto(new CardInfo("기업"));
		*/
		
	

	} 

}
