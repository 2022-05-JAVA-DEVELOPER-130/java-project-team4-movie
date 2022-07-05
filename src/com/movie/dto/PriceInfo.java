package com.movie.dto;


public class PriceInfo {
	int[] Price_no= {1,2,3};
	int Adult_price=10000;
	int Child_price=7000;


public <Array>int[] getPrice_no() {
	return Price_no;
}
public void setPrice_no(int[] price_no) {
	Price_no = price_no;
}
public int getAdult_price() {
	return Adult_price;
}
public void setAdult_price(int adult_price) {
	Adult_price = adult_price;
}
public int getChild_price() {
	return Child_price;
}
public void setChild_price(int child_price) {
	Child_price = child_price;
}

}

