--insert
--ticket insert
insert into ticket values(1, 11000, 14000); --일반
insert into ticket values(2, 8000, 10000); -- 조조
insert into ticket values(3, 9000, 13000); -- 심야

--movieseat insert
insert into movieseat values(1, to_date('07/24 08:00', 'mm/dd hh24:mi'), (select sum(seat_valid) from seat group by seat_valid), 1);
insert into movieseat values(2, to_date('07/24 12:00', 'mm/dd hh24:mi'), (select sum(seat_valid) from seat group by seat_valid), 2);
insert into movieseat values(3, to_date('07/24 16:00', 'mm/dd hh24:mi'), (select sum(seat_valid) from seat group by seat_valid), 2);
insert into movieseat values(4, to_date('07/24 20:00', 'mm/dd hh24:mi'), (select sum(seat_valid) from seat group by seat_valid), 2);
insert into movieseat values(5, to_date('07/24 00:00', 'mm/dd hh24:mi'), (select sum(seat_valid) from seat group by seat_valid), 3);

--movie insert
insert into movie values(1, '마녀2', '액션', 15, 4);
insert into movie values(2, '탑건-매버릭', '액션', 12, 1);
insert into movie values(3, '헤어질 결심', '로맨스', 15, 5);
insert into movie values(4, '토르-러브 앤 썬더', '액션', 12, 2);
insert into movie values(5, '범죄도시2', '액션', 15, 3);

--seat insert
insert into seat values(1, 1, 1, null);
insert into seat values(1, 2, 1, null);
insert into seat values(1, 3, 1, null);
insert into seat values(1, 4, 1, null);
insert into seat values(1, 5, 1, null);
insert into seat values(1, 6, 1, null);
insert into seat values(1, 7, 1, null);
insert into seat values(1, 8, 1, null);
insert into seat values(1, 9, 1, null);
insert into seat values(1, 10, 1, null);

insert into seat values(2, 1, 1, null);
insert into seat values(2, 2, 1, null);
insert into seat values(2, 3, 1, null);
insert into seat values(2, 4, 1, null);
insert into seat values(2, 5, 1, null);
insert into seat values(2, 6, 1, null);
insert into seat values(2, 7, 1, null);
insert into seat values(2, 8, 1, null);
insert into seat values(2, 9, 1, null);
insert into seat values(2, 10, 1, null);

insert into seat values(3, 1, 1, null);
insert into seat values(3, 2, 1, null);
insert into seat values(3, 3, 1, null);
insert into seat values(3, 4, 1, null);
insert into seat values(3, 5, 1, null);
insert into seat values(3, 6, 1, null);
insert into seat values(3, 7, 1, null);
insert into seat values(3, 8, 1, null);
insert into seat values(3, 9, 1, null);
insert into seat values(3, 10, 1, null);

insert into seat values(4, 1, 1, null);
insert into seat values(4, 2, 1, null);
insert into seat values(4, 3, 1, null);
insert into seat values(4, 4, 1, null);
insert into seat values(4, 5, 1, null);
insert into seat values(4, 6, 1, null);
insert into seat values(4, 7, 1, null);
insert into seat values(4, 8, 1, null);
insert into seat values(4, 9, 1, null);
insert into seat values(4, 10, 1, null);

insert into seat values(5, 1, 1, null);
insert into seat values(5, 2, 1, null);
insert into seat values(5, 3, 1, null);
insert into seat values(5, 4, 1, null);
insert into seat values(5, 5, 1, null);
insert into seat values(5, 6, 1, null);
insert into seat values(5, 7, 1, null);
insert into seat values(5, 8, 1, null);
insert into seat values(5, 9, 1, null);
insert into seat values(5, 10, 1, null);

--update movieseat
update movieseat set rest_seat = (select sum(seat_valid) from seat where m_seat_no = 1) where m_seat_no = 1;
update movieseat set rest_seat = (select sum(seat_valid) from seat where m_seat_no = 2) where m_seat_no = 2;
update movieseat set rest_seat = (select sum(seat_valid) from seat where m_seat_no = 3) where m_seat_no = 3;
update movieseat set rest_seat = (select sum(seat_valid) from seat where m_seat_no = 4) where m_seat_no = 4;
update movieseat set rest_seat = (select sum(seat_valid) from seat where m_seat_no = 5) where m_seat_no = 5;


--coupon insert
insert into coupon values(1,'회원가입할인',10);
insert into coupon values(2,'오픈기념할인',20);
insert into coupon values(3,'우리모두할인',30);



--cus insert
insert into cus values(cus_cus_no_seq.nextval, '사과성민', '정성민', 'seongmin', '1234', 19970902, 'M', 01012345678, 'seongmin@naver.com', 0, null);
insert into cus values(cus_cus_no_seq.nextval, '포도예지', '한예지', 'yeji', '2345', 19951211, 'F', 01011112222, 'yeji@naver.com', 0, null);
insert into cus values(cus_cus_no_seq.nextval, '감귤준영', '박준영', 'junyeung', '3456', 19910120, 'M', 01033335555, 'junyeung@naver.com', 0, null);
insert into cus values(cus_cus_no_seq.nextval, '참외우혁', '이우혁', 'woohuck', '4567', 19971120, 'M', 01066667777, 'woohuck@naver.com', 0, null);
insert into cus values(cus_cus_no_seq.nextval, '멜론정현', '이정현', 'jeonghun', '5678', 19961008, 'F', 01088889999, 'jeonghun@naver.com', 0, null);
insert into cus values(cus_cus_no_seq.nextval, '키위희진', '이희진', 'hejin', '6789', 19930204, 'F', 01099991111, 'hejin@naver.com', 0, null);
insert into cus values(cus_cus_no_seq.nextval, '자두현정', '임현정', 'hunjung', '7891', 19940504, 'F', 01022223333, 'hunjung@naver.com', 0, null);



------------------------여기까지 기본데이터 ------------------------------------











--user_reservation select
insert into user_reservation values(CUS_RESERVATION_NO_SEQ.nextval, 2, 1, 2, 1);
update movieseat set rest_seat = (select sum(seat_valid) from seat where m_seat_no = 4) where m_seat_no = 4;

/*
select cus_reservation_no , cus_name, m_name, m_time, seat_no, cus_adult_count, cus_child_count
from 
*/

select cus_reservation_no, cus_name, m_name, cus_adult_count "성인", cus_child_count "청소년", r.cus_no, m_no 
from user_reservation r
join cus c
on r.cus_no = c.cus_no;


select * from movieseat ms join ticket t on ms.ticket_no = t.ticket_no;

select * from movie m join (select * from movieseat ms join ticket t on ms.ticket_no = t.ticket_no) a on m.m_seat_no = a.m_seat_no;

select * from user_reservation ur join (select * from movie m join (select * from movieseat ms join ticket t on ms.ticket_no = t.ticket_no) a on m.m_seat_no = a.m_seat_no) b on ur.m_no = b.m_no;



--예매내역출력(1)
select cus_reservation_no "예약번호", cus_name "이름", m_name "영화제목", cus_adult_count "성인", cus_child_count "청소년", x.cus_no "회원번호", (ticket_child*cus_child_count) + (ticket_adult*cus_adult_count) "총금액"
from cus x
join (select * from user_reservation ur join (select * from movie m join (select * from movieseat ms join ticket t on ms.ticket_no = t.ticket_no) a on m.m_seat_no = a.m_seat_no) b on ur.m_no = b.m_no) d
on x.cus_no = d.cus_no;

select seat_no from seat s
join user_reservation ur
on s.cus_reservation_no = ur.cus_reservation_no;



-- 좌석번호도 같이 출력하고 싶다면 좌석의 테이블 설계를 가로로 만들어야한다.


-- 예매내역 (예매번호, 회원이름, 영화이름, 영화시간, 좌석, 성인, 청소년, 총금액, 결제금액)


--예매내역출력(2)
select ur.cus_reservation_no "예매번호", c.cus_name "회원이름",
        m.m_name "영화이름", mv.m_time "영화시간", ur.cus_adult_count "성인",
        ur.cus_child_count "청소년", (t.ticket_adult*ur.cus_adult_count) + (t.ticket_child*ur.cus_child_count) "총금액"
from user_reservation ur
join movie m
on ur.m_no = m.m_no
join movieseat mv
on mv.m_seat_no = m.m_seat_no
join ticket t
on t.ticket_no = mv.ticket_no
join cus c
on c.cus_no = ur.cus_no;

select seat_no from seat s
join user_reservation ur
on s.cus_reservation_no = ur.cus_reservation_no;





















