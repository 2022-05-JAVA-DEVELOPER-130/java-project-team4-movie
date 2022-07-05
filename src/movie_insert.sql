--insert
--price_info insert
insert into price_info values(1, 14000, 11000); --일반
insert into price_info values(2, 10000, 8000); -- 조조
insert into price_info values(3, 12000, 9000); -- 심야

--movie_hall insert
insert into movie_hall values('1회차', 10, (select sum(seat_valid) from seat where seat_no = 1), '마녀2', '액션', 15, '07/10 08:00', '07/10 10:17', null, '감독 : 조셉 코신스키 / 배우 : 톰 크루즈 ,  마일즈 텔러 ,  제니퍼 코넬리',2);
insert into movie_hall values('2회차', 10, (select sum(seat_valid) from seat where seat_no = 2), '탑건-매버릭', '액션', 12, '07/10 12:00', '07/10 14:10', null, '감독 : 타이카 와이티티 / 배우 : 크리스 헴스워스 ,  나탈리 포트만 ,  테사 톰슨 ,  크리스찬 베일 ,  타이카 와이티티 ,  크리스 프랫',1);
insert into movie_hall values('3회차', 10, (select sum(seat_valid) from seat where seat_no = 3), '헤어질 결심', '로맨스', 15, '07/10 14:00', '07/10 16:18', null, '감독 : 박찬욱 / 프로듀서 : 백지선 ,  고대석 / 배우 : 탕웨이 ,  박해일 ,  이정현 ,  박용우 ,  고경표 ,  김신영',1);
insert into movie_hall values('4회차', 10, (select sum(seat_valid) from seat where seat_no = 4), '토르-러브 앤 썬더', '액션', 12, '07/10 16:00', '07/10 17:59', null, '감독 : 타이카 와이티티 / 배우 : 크리스 헴스워스 ,  나탈리 포트만 ,  테사 톰슨 ,  크리스찬 베일 ,  타이카 와이티티 ,  크리스 프랫',1);
insert into movie_hall values('5회차', 10, (select sum(seat_valid) from seat where seat_no = 5), '범죄도시2', '액션', 15, '07/10 00:00', '07/10 01:46', null, '감독 : 이상용 / 프로듀서 : 유영채 / 배우 : 마동석 ,  손석구 ,  최귀화 ,  박지환 ,  허동원 ,  하준 ,  정재광',3);


--seat insert
insert into seat values(seat_no_seq.nextval, 1, 1, '1회차', null);
insert into seat values(seat_no_seq.nextval, 2, 1, '1회차', null);
insert into seat values(seat_no_seq.nextval, 3, 1, '1회차', null);
insert into seat values(seat_no_seq.nextval, 4, 1, '1회차', null);
insert into seat values(seat_no_seq.nextval, 5, 1, '1회차', null);
insert into seat values(seat_no_seq.nextval, 6, 1, '1회차', null);
insert into seat values(seat_no_seq.nextval, 7, 1, '1회차', null);
insert into seat values(seat_no_seq.nextval, 8, 1, '1회차', null);
insert into seat values(seat_no_seq.nextval, 9, 1, '1회차', null);
insert into seat values(seat_no_seq.nextval, 10, 1, '1회차', null);

insert into seat values(seat_no_seq.nextval, 1, 1, '2회차', null);
insert into seat values(seat_no_seq.nextval, 2, 1, '2회차', null);
insert into seat values(seat_no_seq.nextval, 3, 1, '2회차', null);
insert into seat values(seat_no_seq.nextval, 4, 1, '2회차', null);
insert into seat values(seat_no_seq.nextval, 5, 1, '2회차', null);
insert into seat values(seat_no_seq.nextval, 6, 1, '2회차', null);
insert into seat values(seat_no_seq.nextval, 7, 1, '2회차', null);
insert into seat values(seat_no_seq.nextval, 8, 1, '2회차', null);
insert into seat values(seat_no_seq.nextval, 9, 1, '2회차', null);
insert into seat values(seat_no_seq.nextval, 10, 1, '2회차', null);

insert into seat values(seat_no_seq.nextval, 1, 1, '3회차', null);
insert into seat values(seat_no_seq.nextval, 2, 1, '3회차', null);
insert into seat values(seat_no_seq.nextval, 3, 1, '3회차', null);
insert into seat values(seat_no_seq.nextval, 4, 1, '3회차', null);
insert into seat values(seat_no_seq.nextval, 5, 1, '3회차', null);
insert into seat values(seat_no_seq.nextval, 6, 1, '3회차', null);
insert into seat values(seat_no_seq.nextval, 7, 1, '3회차', null);
insert into seat values(seat_no_seq.nextval, 8, 1, '3회차', null);
insert into seat values(seat_no_seq.nextval, 9, 1, '3회차', null);
insert into seat values(seat_no_seq.nextval, 10, 1, '3회차', null);

insert into seat values(seat_no_seq.nextval, 1, 1, '4회차', null);
insert into seat values(seat_no_seq.nextval, 2, 1, '4회차', null);
insert into seat values(seat_no_seq.nextval, 3, 1, '4회차', null);
insert into seat values(seat_no_seq.nextval, 4, 1, '4회차', null);
insert into seat values(seat_no_seq.nextval, 5, 1, '4회차', null);
insert into seat values(seat_no_seq.nextval, 6, 1, '4회차', null);
insert into seat values(seat_no_seq.nextval, 7, 1, '4회차', null);
insert into seat values(seat_no_seq.nextval, 8, 1, '4회차', null);
insert into seat values(seat_no_seq.nextval, 9, 1, '4회차', null);
insert into seat values(seat_no_seq.nextval, 10, 1, '4회차', null);

insert into seat values(seat_no_seq.nextval, 1, 1, '5회차', null);
insert into seat values(seat_no_seq.nextval, 2, 1, '5회차', null);
insert into seat values(seat_no_seq.nextval, 3, 1, '5회차', null);
insert into seat values(seat_no_seq.nextval, 4, 1, '5회차', null);
insert into seat values(seat_no_seq.nextval, 5, 1, '5회차', null);
insert into seat values(seat_no_seq.nextval, 6, 1, '5회차', null);
insert into seat values(seat_no_seq.nextval, 7, 1, '5회차', null);
insert into seat values(seat_no_seq.nextval, 8, 1, '5회차', null);
insert into seat values(seat_no_seq.nextval, 9, 1, '5회차', null);
insert into seat values(seat_no_seq.nextval, 10, 1, '5회차', null);





--coupon_info insert
insert into coupon_info values(1,'회원가입할인',10);
insert into coupon_info values(2,'오픈기념할인',20);
insert into coupon_info values(3,'우리모두할인',30);



--customer_info insert
insert into customer_info values('seongmin', cus_no_seq.nextval, '사과성민', '정성민', '1234', to_date('19970902', 'yyyy/mm/dd'), 'M', 01012345678, 'seongmin@naver.com', 0, null);
insert into customer_info values('yeji', cus_no_seq.nextval, '포도예지', '한예지', '2345', '19951211', 'F', 01011112222, 'yeji@naver.com', 0, null);
insert into customer_info values('junyeung', cus_no_seq.nextval, '감귤준영', '박준영', '3456', '19910120', 'M', 01033335555, 'junyeung@naver.com', 0, null);
insert into customer_info values('woohuck', cus_no_seq.nextval, '참외우혁', '이우혁', '4567', '19971120', 'M', 01066667777, 'woohuck@naver.com', 0, null);
insert into customer_info values('jeonghun', cus_no_seq.nextval, '멜론정현', '이정현', '5678', '19961008', 'F', 01088889999, 'jeonghun@naver.com', 0, null);
insert into customer_info values('hejin', cus_no_seq.nextval, '키위희진', '이희진', '6789', '19930204', 'F', 01099991111, 'hejin@naver.com', 0, null);
insert into customer_info values('hunjung', cus_no_seq.nextval, '자두현정', '임현정', '7891', '19940504', 'F', 01022223333, 'hunjung@naver.com', 0, null);

commit;


insert into credit_card values('국민');
insert into credit_card values('신한');
insert into credit_card values('농협');
insert into credit_card values('우리');
insert into credit_card values('기업');
insert into credit_card values('IBK');

------------------------여기까지 기본데이터 ------------------------------------

insert into payment values(payment_no_seq.nextval, sysdate, '신한' ,2,0, 'seongmin',1);
insert into payment values(payment_no_seq.nextval, sysdate, '신한' ,2,0, 'seongmin',3);
insert into payment values(payment_no_seq.nextval, sysdate, '국민' ,0,1, 'yeji',2);
insert into payment values(payment_no_seq.nextval, sysdate, '농협' ,1,1, 'junyeung',5);
insert into payment values(payment_no_seq.nextval, sysdate, '농협' ,1,1, 'junyeung',6);
insert into payment values(payment_no_seq.nextval, sysdate, '우리' ,2,1, 'woohuck',11);
insert into payment values(payment_no_seq.nextval, sysdate, '우리' ,2,1, 'woohuck',12);
insert into payment values(payment_no_seq.nextval, sysdate, '우리' ,2,1, 'woohuck',15);
insert into payment values(payment_no_seq.nextval, sysdate, '신한' ,1,2, 'jeonghun',35);
insert into payment values(payment_no_seq.nextval, sysdate, '신한' ,1,2, 'jeonghun',37);
insert into payment values(payment_no_seq.nextval, sysdate, '신한' ,1,2, 'jeonghun',38);

insert into reservation_info values(reservation_no_seq.nextval, 1, 'seongmin');
insert into reservation_info values(reservation_no_seq.nextval, 2, 'yeji');
insert into reservation_info values(reservation_no_seq.nextval, 3, 'junyeung');
insert into reservation_info values(reservation_no_seq.nextval, 4, 'woohuck');
insert into reservation_info values(reservation_no_seq.nextval, 5, 'jeonghun');

update seat set cus_id= 'seongmin', seat_valid =0 where hall_name = '1회차' and seat_arrange = 1;
update seat set cus_id= 'seongmin', seat_valid =0 where hall_name = '1회차' and seat_arrange = 3;

update seat set cus_id= 'yeji', seat_valid =0 where hall_name = '1회차' and seat_arrange = 2;

update seat set cus_id= 'junyeung', seat_valid =0 where hall_name = '1회차' and seat_arrange = 5;
update seat set cus_id= 'junyeung', seat_valid =0 where hall_name = '1회차' and seat_arrange = 6;

update seat set cus_id= 'woohuck', seat_valid =0 where hall_name = '2회차' and seat_arrange = 1;
update seat set cus_id= 'woohuck', seat_valid =0 where hall_name = '2회차' and seat_arrange = 2;
update seat set cus_id= 'woohuck', seat_valid =0 where hall_name = '2회차' and seat_arrange = 5;

update seat set cus_id= 'jeonghun', seat_valid =0 where hall_name = '3회차' and seat_arrange = 5;
update seat set cus_id= 'jeonghun', seat_valid =0 where hall_name = '3회차' and seat_arrange = 7;
update seat set cus_id= 'jeonghun', seat_valid =0 where hall_name = '3회차' and seat_arrange = 8;

--update movie_hall
update movie_hall set remain_seat = (select sum(seat_valid) from seat where hall_name = '1회차') where hall_name = '1회차';
update movie_hall set remain_seat = (select sum(seat_valid) from seat where hall_name = '2회차') where hall_name = '2회차';
update movie_hall set remain_seat = (select sum(seat_valid) from seat where hall_name = '3회차') where hall_name = '3회차';
update movie_hall set remain_seat = (select sum(seat_valid) from seat where hall_name = '4회차') where hall_name = '4회차';
update movie_hall set remain_seat = (select sum(seat_valid) from seat where hall_name = '5회차') where hall_name = '5회차';


commit;
