
--update (1회차8번좌석 예매)
update seat set seat_valid=0 where seat_no=10 and hall_name='1회차';

--select (남은좌석 유무확인)
select * from seat where hall_name='1회차' and seat_valid=1;

--select (전체좌석 확인)
select * from seat where hall_name='1회차';



