package com.movie.정현;

import com.movie.정현.CardADao;
import com.movie.정현.CardA;


public class CardAService {
	private CardADao cardAdao;
	
	public CardAService(){
		cardAdao =new CardADao();
	}
	//카드사 선택?
	public CardA selectCardName(String card_name)throws Exception{
		return cardAdao.selectCardName(card_name);
	}
}
