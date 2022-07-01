DROP TABLE seat CASCADE CONSTRAINTS;
DROP TABLE movieseat CASCADE CONSTRAINTS;
DROP TABLE ticket CASCADE CONSTRAINTS;
DROP TABLE user_reservation CASCADE CONSTRAINTS;
DROP TABLE movie CASCADE CONSTRAINTS;
DROP TABLE cus CASCADE CONSTRAINTS;
DROP TABLE coupon CASCADE CONSTRAINTS;

CREATE TABLE coupon(
		coupon_no                     		NUMBER(10)		 NULL ,
		coupon_name                   		VARCHAR2(20)		 NULL ,
		coupon_effect                 		NUMBER(3)		 NULL 
);


CREATE TABLE cus(
		cus_no                        		NUMBER(10)		 NULL ,
		cus_nickname                  		VARCHAR2(15)		 NULL ,
		cus_name                      		VARCHAR2(15)		 NULL ,
		cus_id                        		VARCHAR2(12)		 NULL ,
		cus_password                  		VARCHAR2(12)		 NULL ,
		cus_birthday                  		DATE		 NULL ,
		cus_gender                    		CHAR(1)		 NULL ,
		cus_phone                     		VARCHAR2(13)		 NULL ,
		cus_email                     		VARCHAR2(30)		 NULL ,
		cus_point                     		NUMBER(10)		 NULL ,
		coupon_no                     		NUMBER(10)		 NULL 
);

DROP SEQUENCE cus_no_SEQ;

CREATE SEQUENCE cus_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;


CREATE TABLE movie(
		m_no                          		NUMBER(10)		 NULL ,
		m_name                        		VARCHAR2(30)		 NULL ,
		m_genre                       		VARCHAR2(30)		 NULL ,
		positive_age                  		NUMBER(10)		 NULL 
);


CREATE TABLE user_reservation(
		cus_reservation_no            		NUMBER(10)		 NULL ,
		cus_adult_count               		NUMBER(1)		 NULL ,
		cus_child_count               		NUMBER(1)		 NULL ,
		m_no                          		NUMBER(10)		 NULL ,
		cus_no                        		NUMBER(10)		 NULL 
);

DROP SEQUENCE cus_reservation_no_SEQ;

CREATE SEQUENCE cus_reservation_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;


CREATE TABLE ticket(
		ticket_no                     		NUMBER(10)		 NULL ,
		ticket_child                  		NUMBER(10)		 NULL ,
		ticket_adult                  		NUMBER(10)		 NULL 
);


CREATE TABLE movieseat(
		m_seat_no                     		NUMBER(10)		 NULL ,
		m_time                        		DATE		 NULL ,
		rest_seat                     		NUMBER(10)		 NULL ,
		ticket_no                     		NUMBER(10)		 NULL ,
		m_no                          		NUMBER(10)		 NULL 
);


CREATE TABLE seat(
		m_seat_no                     		NUMBER(10)		 NULL ,
		seat_no                       		NUMBER(10)		 NULL ,
		seat_valid                    		NUMBER(10)		 NULL ,
		cus_reservation_no            		NUMBER(10)		 NULL 
);



ALTER TABLE coupon ADD CONSTRAINT IDX_coupon_PK PRIMARY KEY (coupon_no);

ALTER TABLE cus ADD CONSTRAINT IDX_cus_PK PRIMARY KEY (cus_no);
ALTER TABLE cus ADD CONSTRAINT IDX_cus_FK0 FOREIGN KEY (coupon_no) REFERENCES coupon (coupon_no);

ALTER TABLE movie ADD CONSTRAINT IDX_movie_PK PRIMARY KEY (m_no);

ALTER TABLE user_reservation ADD CONSTRAINT IDX_user_reservation_PK PRIMARY KEY (cus_reservation_no);
ALTER TABLE user_reservation ADD CONSTRAINT IDX_user_reservation_FK0 FOREIGN KEY (m_no) REFERENCES movie (m_no);
ALTER TABLE user_reservation ADD CONSTRAINT IDX_user_reservation_FK1 FOREIGN KEY (cus_no) REFERENCES cus (cus_no);

ALTER TABLE ticket ADD CONSTRAINT IDX_ticket_PK PRIMARY KEY (ticket_no);

ALTER TABLE movieseat ADD CONSTRAINT IDX_movieseat_PK PRIMARY KEY (m_seat_no);
ALTER TABLE movieseat ADD CONSTRAINT IDX_movieseat_FK0 FOREIGN KEY (ticket_no) REFERENCES ticket (ticket_no);
ALTER TABLE movieseat ADD CONSTRAINT IDX_movieseat_FK1 FOREIGN KEY (m_no) REFERENCES movie (m_no);

ALTER TABLE seat ADD CONSTRAINT IDX_seat_FK0 FOREIGN KEY (m_seat_no) REFERENCES movieseat (m_seat_no);
ALTER TABLE seat ADD CONSTRAINT IDX_seat_FK1 FOREIGN KEY (cus_reservation_no) REFERENCES user_reservation (cus_reservation_no);

