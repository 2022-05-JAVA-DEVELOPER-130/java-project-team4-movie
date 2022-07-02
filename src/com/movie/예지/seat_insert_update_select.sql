--seat
DROP SEQUENCE seat_no_seq;

CREATE SEQUENCE seat_no_seq MINVALUE 1 MAXVALUE 50 INCREMENT BY 1 START WITH 1 NOCACHE NOORDER NOCYCLE;

select seat_no_seq.NEXTval from dual;

select seat_no_seq.currval from dual;


insert into seat values(seat_no_seq.nextval,1,1,'1회차',null);
insert into seat values(seat_no_seq.nextval,2,1,'1회차',null);
insert into seat values(seat_no_seq.nextval,3,1,'1회차',null);
insert into seat values(seat_no_seq.nextval,4,1,'1회차',null);
insert into seat values(seat_no_seq.nextval,5,1,'1회차',null);
insert into seat values(seat_no_seq.nextval,6,1,'1회차',null);
insert into seat values(seat_no_seq.nextval,7,1,'1회차',null);
insert into seat values(seat_no_seq.nextval,8,1,'1회차',null);
insert into seat values(seat_no_seq.nextval,9,1,'1회차',null);
insert into seat values(seat_no_seq.nextval,10,1,'1회차',null);

insert into seat values(seat_no_seq.nextval,1,1,'2회차',null);
insert into seat values(seat_no_seq.nextval,2,1,'2회차',null);
insert into seat values(seat_no_seq.nextval,3,1,'2회차',null);
insert into seat values(seat_no_seq.nextval,4,1,'2회차',null);
insert into seat values(seat_no_seq.nextval,5,1,'2회차',null);
insert into seat values(seat_no_seq.nextval,6,1,'2회차',null);
insert into seat values(seat_no_seq.nextval,7,1,'2회차',null);
insert into seat values(seat_no_seq.nextval,8,1,'2회차',null);
insert into seat values(seat_no_seq.nextval,9,1,'2회차',null);
insert into seat values(seat_no_seq.nextval,10,1,'2회차',null);

insert into seat values(seat_seat_no_seq.nextval,1,1,'3회차',null);
insert into seat values(seat_seat_no_seq.nextval,2,1,'3회차',null);
insert into seat values(seat_seat_no_seq.nextval,3,1,'3회차',null);
insert into seat values(seat_seat_no_seq.nextval,4,1,'3회차',null);
insert into seat values(seat_seat_no_seq.nextval,5,1,'3회차',null);
insert into seat values(seat_seat_no_seq.nextval,6,1,'3회차',null);
insert into seat values(seat_seat_no_seq.nextval,7,1,'3회차',null);
insert into seat values(seat_seat_no_seq.nextval,8,1,'3회차',null);
insert into seat values(seat_seat_no_seq.nextval,9,1,'3회차',null);
insert into seat values(seat_seat_no_seq.nextval,10,1,'3회차',null);

insert into seat values(seat_no_seq.nextval,1,1,'4회차',null);
insert into seat values(seat_no_seq.nextval,2,1,'4회차',null);
insert into seat values(seat_no_seq.nextval,3,1,'4회차',null);
insert into seat values(seat_no_seq.nextval,4,1,'4회차',null);
insert into seat values(seat_no_seq.nextval,5,1,'4회차',null);
insert into seat values(seat_no_seq.nextval,6,1,'4회차',null);
insert into seat values(seat_no_seq.nextval,7,1,'4회차',null);
insert into seat values(seat_no_seq.nextval,8,1,'4회차',null);
insert into seat values(seat_no_seq.nextval,9,1,'4회차',null);
insert into seat values(seat_no_seq.nextval,10,1,'4회차',null);

insert into seat values(seat_no_seq.nextval,1,1,'5회차',null);
insert into seat values(seat_no_seq.nextval,2,1,'5회차',null);
insert into seat values(seat_no_seq.nextval,3,1,'5회차',null);
insert into seat values(seat_no_seq.nextval,4,1,'5회차',null);
insert into seat values(seat_no_seq.nextval,5,1,'5회차',null);
insert into seat values(seat_no_seq.nextval,6,1,'5회차',null);
insert into seat values(seat_no_seq.nextval,7,1,'5회차',null);
insert into seat values(seat_no_seq.nextval,8,1,'5회차',null);
insert into seat values(seat_no_seq.nextval,9,1,'5회차',null);
insert into seat values(seat_no_seq.nextval,10,1,'5회차',null);

select * from seat;

--update (1회차8번좌석 예매)
update seat set seat_valid=0 where seat_no=10 and hall_name='1회차';

--select (남은좌석 유무확인)
select * from seat where hall_name='1회차' and seat_valid=1;

--select (전체좌석 확인)
select * from seat where hall_name='1회차';



