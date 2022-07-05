package com.movie.test;

import com.movie.dto.CardInfo;

public class CardTestMain {

	public static void main(String[] args)throws Exception {
		CardInfo insertCardInfo1=new CardInfo("국민");
		CardInfo insertCardInfo2=new CardInfo("신한");
		CardInfo insertCardInfo3=new CardInfo("농협");
		CardInfo insertCardInfo4=new CardInfo("롯데");
		CardInfo insertCardInfo5=new CardInfo("현대");
		CardInfo insertCardInfo6=new CardInfo("삼성");
		CardInfo insertCardInfo7=new CardInfo("기업");
		
		CardInfo cardinfo=new CardInfo();
		cardinfo.in("국민");
		cardinfo.insertCardInfo(insertCardInfo2);
		cardinfo.insertCardInfo(insertCardInfo3);
		cardinfo.insertCardInfo(insertCardInfo4);
		cardinfo.insertCardInfo(insertCardInfo5);
		cardinfo.insertCardInfo(insertCardInfo6);
		cardinfo.insertCardInfo(insertCardInfo7);
System.out.println(insertCardInfo1.getCard_name());
	
	} 

}
