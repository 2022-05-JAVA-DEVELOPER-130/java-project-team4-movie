--reservation_info

insert into reservation_info
values(to_number(to_char(sysdate, 'yymmddHH24MI')),null,null,null,null);


--
select * from reservation_info;
select * from reservation_info order by reservation_no;

delete from reservation_info where RESERVATION_NO=?;

--
select cus_reservation_no re_no,re_info.payment_no pay_no,cus_info.cus_id cus_id
from reservation_info re_info left outer join payment paym
on  re_info.payment_no= paym.payment_no
join customer_info cus_info
on re_info.cus_id= cus_info.cus_id;


select cus_reservation_no re_no,ADULT_COUNT,CHILD_COUNT,payment_no,cus_info.cus_id cus_id
from reservation_info re_info 
join customer_info cus_info
on re_info.cus_id= cus_info.cus_id;
