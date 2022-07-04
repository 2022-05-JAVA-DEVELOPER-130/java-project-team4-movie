package com.movie.현정;

import java.text.SimpleDateFormat;
import java.util.Date;


public class CusDaoTestMain {

	public static void main(String[] args) throws Exception {
		CusJoinDao cusJoinDao = new CusJoinDao();
		
		String birth = "1994/07/19";
		Date aaa = new SimpleDateFormat("yyyy/MM/dd").parse(birth);
		
		CusDto insertCus = new CusDto(0, "알찬열매", "임알찬", "alchan2", "1234", aaa, "F", "010-0000-1234", "alchan@naver.com", 2000, 1);
		System.out.println("insertCus :" + cusJoinDao.insertCus(insertCus));

		CusDto updateCus = new CusDto(8, "포도조아", "김포도", "alchan2", "0000", aaa, "F", "010-7895-4532",
				"grape2@google.com", 3000, 1);
		System.out.println("updateCus : " + cusJoinDao.updateCus(updateCus));

		CusDto updateCus2 = new CusDto(8, "포도개조아", "김최종", "alchan2", "1234", aaa, "F", "010-7895-4532",
				"grape2@google.com", 3000, 1);
		System.out.println("updateCus2 : " + cusJoinDao.updateCus2(updateCus2));

		System.out.println("deleteCus :" + cusJoinDao.deleteById("alchan2"));
		
		CusDto findCus = cusJoinDao.selectById("alchan2");
		System.out.println("selectById : "+ findCus);
		
		String findId = cusJoinDao.selectByNamePhone("임현정", "1022223333");
		System.out.println("ID 찾기 : " + findId);
		
		
		

	}

}
