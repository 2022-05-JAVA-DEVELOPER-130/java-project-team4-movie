package com.movie.test;

import com.movie.dao.CardInfoDao;
import com.movie.dto.CardInfo;

public class CardTestMain {

	public static void main(String[] args)throws Exception {
		CardInfo insertCardInfo1=new CardInfo();
		insertCardInfo1.insertinto(new CardInfo("국민"));
		CardInfo insertCardInfo2=new CardInfo("신한");
		insertCardInfo2.insertinto(new CardInfo("신한"));
		CardInfo insertCardInfo3=new CardInfo("농협");
		insertCardInfo3.insertinto(new CardInfo("농협"));
		CardInfo insertCardInfo4=new CardInfo("롯데");
		insertCardInfo4.insertinto(new CardInfo("롯데"));
		CardInfo insertCardInfo5=new CardInfo("현대");
		insertCardInfo5.insertinto(new CardInfo("현대"));
		CardInfo insertCardInfo6=new CardInfo("삼성");
		insertCardInfo6.insertinto(new CardInfo("삼성"));
		CardInfo insertCardInfo7=new CardInfo("기업");
		insertCardInfo7.insertinto(new CardInfo("기업"));
		

	} 

}
