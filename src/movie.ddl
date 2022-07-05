DROP TABLE reservation_info CASCADE CONSTRAINTS;
DROP TABLE payment CASCADE CONSTRAINTS;
DROP TABLE seat CASCADE CONSTRAINTS;
DROP TABLE movie_hall CASCADE CONSTRAINTS;
DROP TABLE price_info CASCADE CONSTRAINTS;
DROP TABLE credit_card CASCADE CONSTRAINTS;
DROP TABLE customer_info CASCADE CONSTRAINTS;
DROP TABLE coupon_info CASCADE CONSTRAINTS;

CREATE TABLE coupon_info(
		coupon_no                     		NUMBER(10)		 NULL ,
		coupon_name                   		VARCHAR2(20)		 NULL ,
		coupon_effect                 		NUMBER(3)		 NULL 
);

COMMENT ON TABLE coupon_info is 'coupon_info';
COMMENT ON COLUMN coupon_info.coupon_no is 'coupon_no';
COMMENT ON COLUMN coupon_info.coupon_name is 'coupon_name';
COMMENT ON COLUMN coupon_info.coupon_effect is 'coupon_effect';


/**********************************/
/* Table Name: customer_info */
/**********************************/
CREATE TABLE customer_info(
		cus_id                        		VARCHAR2(12)		 NULL ,
		cus_no                        		NUMBER(5)		 NULL ,
		cus_nickname                  		VARCHAR2(15)		 NULL ,
		cus_name                      		VARCHAR2(15)		 NULL ,
		cus_password                  		VARCHAR2(12)		 NULL ,
		cus_birthday                  		DATE		 NULL ,
		cus_gender                    		CHAR(1)		 NULL ,
		cus_phone                     		VARCHAR2(13)		 NULL ,
		cus_email                     		VARCHAR2(30)		 NULL ,
		cus_point                     		NUMBER(10)		 NULL ,
		coupon_no                     		NUMBER(10)		 NULL 
);

CREATE SEQUENCE customer_info_cus_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER customer_info_cus_no_TRG
BEFORE INSERT ON customer_info
FOR EACH ROW
BEGIN
IF :NEW.cus_no IS NOT NULL THEN
  SELECT customer_info_cus_no_SEQ.NEXTVAL INTO :NEW.cus_no FROM DUAL;
END IF;
END;

COMMENT ON TABLE customer_info is 'customer_info';
COMMENT ON COLUMN customer_info.cus_id is 'cus_id';
COMMENT ON COLUMN customer_info.cus_no is 'cus_no';
COMMENT ON COLUMN customer_info.cus_nickname is 'cus_nickname';
COMMENT ON COLUMN customer_info.cus_name is 'cus_name';
COMMENT ON COLUMN customer_info.cus_password is 'cus_password';
COMMENT ON COLUMN customer_info.cus_birthday is 'cus_birthday';
COMMENT ON COLUMN customer_info.cus_gender is 'cus_gender';
COMMENT ON COLUMN customer_info.cus_phone is 'cus_phone';
COMMENT ON COLUMN customer_info.cus_email is 'cus_email';
COMMENT ON COLUMN customer_info.cus_point is 'cus_point';
COMMENT ON COLUMN customer_info.coupon_no is 'coupon_no';


<<<<<<< HEAD
/**********************************/
/* Table Name: credit_card */
/**********************************/
=======
>>>>>>> branch 'master' of https://github.com/2022-05-JAVA-DEVELOPER/java-project-team4-movie.git
CREATE TABLE credit_card(
		card_name                     		VARCHAR2(10)		 NULL 
);

COMMENT ON TABLE credit_card is 'credit_card';
COMMENT ON COLUMN credit_card.card_name is 'card_name';

<<<<<<< HEAD

/**********************************/
/* Table Name: payment */
/**********************************/
CREATE TABLE payment(
		payment_no                    		NUMBER(10)		 NULL ,
		payment_date                  		DATE		 DEFAULT sysdate		 NULL ,
		card_name                     		VARCHAR2(10)		 NULL ,
		adult_member_count            		NUMBER(5)		 NULL ,
		child_member_count            		NUMBER(5)		 NULL ,
		cus_id                        		VARCHAR2(12)		 NULL 
);

CREATE SEQUENCE payment_payment_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER payment_payment_no_TRG
BEFORE INSERT ON payment
FOR EACH ROW
BEGIN
IF :NEW.payment_no IS NOT NULL THEN
  SELECT payment_payment_no_SEQ.NEXTVAL INTO :NEW.payment_no FROM DUAL;
END IF;
END;

COMMENT ON TABLE payment is 'payment';
COMMENT ON COLUMN payment.payment_no is 'payment_no';
COMMENT ON COLUMN payment.payment_date is 'payment_date';
COMMENT ON COLUMN payment.card_name is 'card_name';
COMMENT ON COLUMN payment.adult_member_count is 'adult_member_count';
COMMENT ON COLUMN payment.child_member_count is 'child_member_count';
COMMENT ON COLUMN payment.cus_id is 'cus_id';


/**********************************/
/* Table Name: reservation_info */
/**********************************/
CREATE TABLE reservation_info(
		reservation_no                		NUMBER(12)		 NULL ,
		payment_no                    		NUMBER(10)		 NULL ,
		cus_id                        		VARCHAR2(12)		 NULL 
);

CREATE SEQUENCE reservation_info_reservation_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER reservation_info_reservation_no_TRG
BEFORE INSERT ON reservation_info
FOR EACH ROW
BEGIN
IF :NEW.reservation_no IS NOT NULL THEN
  SELECT reservation_info_reservation_no_SEQ.NEXTVAL INTO :NEW.reservation_no FROM DUAL;
END IF;
END;

COMMENT ON TABLE reservation_info is 'reservation_info';
COMMENT ON COLUMN reservation_info.reservation_no is 'reservation_no';
COMMENT ON COLUMN reservation_info.payment_no is 'payment_no';
COMMENT ON COLUMN reservation_info.cus_id is 'cus_id';


/**********************************/
/* Table Name: price_info */
/**********************************/
=======
>>>>>>> branch 'master' of https://github.com/2022-05-JAVA-DEVELOPER/java-project-team4-movie.git
CREATE TABLE price_info(
		price_no                      		NUMBER(10)		 NULL ,
		adult_price                   		NUMBER(10)		 NULL ,
		child_price                   		NUMBER(10)		 NULL 
);

COMMENT ON TABLE price_info is 'price_info';
COMMENT ON COLUMN price_info.price_no is 'price_no';
COMMENT ON COLUMN price_info.adult_price is 'adult_price';
COMMENT ON COLUMN price_info.child_price is 'child_price';


/**********************************/
/* Table Name: movie_hall */
/**********************************/
CREATE TABLE movie_hall(
		hall_name                     		VARCHAR2(10)		 NULL ,
		total_seat_count              		NUMBER(10)		 NULL ,
		remain_seat                   		NUMBER(10)		 NULL ,
		m_name                        		VARCHAR2(50)		 NULL ,
		m_genre                       		VARCHAR2(30)		 NULL ,
		m_positive_age                		NUMBER(10)		 NULL ,
		m_start_time                  		VARCHAR2(30)		 NULL ,
		m_end_time                    		VARCHAR2(30)		 NULL ,
		m_image                       		VARCHAR2(50)		 NULL ,
		m_introduce                   		VARCHAR2(2000)		 NULL ,
		price_no                      		NUMBER(10)		 NULL 
);

COMMENT ON TABLE movie_hall is 'movie_hall';
COMMENT ON COLUMN movie_hall.hall_name is 'hall_name';
COMMENT ON COLUMN movie_hall.total_seat_count is 'total_seat_count';
COMMENT ON COLUMN movie_hall.remain_seat is 'remain_seat';
COMMENT ON COLUMN movie_hall.m_name is 'm_name';
COMMENT ON COLUMN movie_hall.m_genre is 'm_genre';
COMMENT ON COLUMN movie_hall.m_positive_age is 'm_positive_age';
COMMENT ON COLUMN movie_hall.m_start_time is 'm_start_time';
COMMENT ON COLUMN movie_hall.m_end_time is 'm_end_time';
COMMENT ON COLUMN movie_hall.m_image is 'm_image';
COMMENT ON COLUMN movie_hall.m_introduce is 'm_introduce';
COMMENT ON COLUMN movie_hall.price_no is 'price_no';


/**********************************/
/* Table Name: seat */
/**********************************/
CREATE TABLE seat(
		seat_no                       		NUMBER(2)		 NULL ,
		seat_arrange                  		NUMBER(2)		 NULL ,
		seat_valid                    		NUMBER(1)		 NULL ,
		hall_name                     		VARCHAR2(10)		 NULL ,
		cus_id                        		VARCHAR2(12)		 NULL 
);

CREATE SEQUENCE seat_seat_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

<<<<<<< HEAD
CREATE TRIGGER seat_seat_no_TRG
BEFORE INSERT ON seat
FOR EACH ROW
BEGIN
IF :NEW.seat_no IS NOT NULL THEN
  SELECT seat_seat_no_SEQ.NEXTVAL INTO :NEW.seat_no FROM DUAL;
END IF;
END;
=======
CREATE SEQUENCE seat_no_SEQ MAXVALUE 50 NOCACHE NOORDER NOCYCLE;
>>>>>>> branch 'master' of https://github.com/2022-05-JAVA-DEVELOPER/java-project-team4-movie.git

COMMENT ON TABLE seat is 'seat';
COMMENT ON COLUMN seat.seat_no is 'seat_no';
COMMENT ON COLUMN seat.seat_arrange is 'seat_arrange';
COMMENT ON COLUMN seat.seat_valid is 'seat_valid';
COMMENT ON COLUMN seat.hall_name is 'hall_name';
COMMENT ON COLUMN seat.cus_id is 'cus_id';

CREATE TABLE payment(
		payment_no                    		NUMBER(10)		 NULL ,
		payment_date                  		DATE		 DEFAULT sysdate		 NULL ,
		card_name                     		VARCHAR2(10)		 NULL ,
		adult_member_count            		NUMBER(5)		 NULL ,
		child_member_count            		NUMBER(5)		 NULL ,
		cus_id                        		VARCHAR2(12)		 NULL ,
		seat_no                       		NUMBER(2)		 NULL 
);

DROP SEQUENCE payment_no_SEQ;

CREATE SEQUENCE payment_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;



CREATE TABLE reservation_info(
		reservation_no                		NUMBER(12)		 NULL ,
		payment_no                    		NUMBER(10)		 NULL ,
		cus_id                        		VARCHAR2(12)		 NULL 
);

DROP SEQUENCE reservation_no_SEQ;

CREATE SEQUENCE reservation_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;




ALTER TABLE coupon_info ADD CONSTRAINT IDX_coupon_info_PK PRIMARY KEY (coupon_no);

ALTER TABLE customer_info ADD CONSTRAINT IDX_customer_info_PK PRIMARY KEY (cus_id);
ALTER TABLE customer_info ADD CONSTRAINT IDX_customer_info_FK0 FOREIGN KEY (coupon_no) REFERENCES coupon_info (coupon_no);

ALTER TABLE credit_card ADD CONSTRAINT IDX_credit_card_PK PRIMARY KEY (card_name);

ALTER TABLE price_info ADD CONSTRAINT IDX_price_info_PK PRIMARY KEY (price_no);

ALTER TABLE movie_hall ADD CONSTRAINT IDX_movie_hall_PK PRIMARY KEY (hall_name);
ALTER TABLE movie_hall ADD CONSTRAINT IDX_movie_hall_FK0 FOREIGN KEY (price_no) REFERENCES price_info (price_no);

ALTER TABLE seat ADD CONSTRAINT IDX_seat_PK PRIMARY KEY (seat_no);
ALTER TABLE seat ADD CONSTRAINT IDX_seat_FK0 FOREIGN KEY (hall_name) REFERENCES movie_hall (hall_name);
ALTER TABLE seat ADD CONSTRAINT IDX_seat_FK1 FOREIGN KEY (cus_id) REFERENCES customer_info (cus_id);

ALTER TABLE payment ADD CONSTRAINT IDX_payment_PK PRIMARY KEY (payment_no);
ALTER TABLE payment ADD CONSTRAINT IDX_payment_FK0 FOREIGN KEY (card_name) REFERENCES credit_card (card_name);
ALTER TABLE payment ADD CONSTRAINT IDX_payment_FK1 FOREIGN KEY (cus_id) REFERENCES customer_info (cus_id);
ALTER TABLE payment ADD CONSTRAINT IDX_payment_FK2 FOREIGN KEY (seat_no) REFERENCES seat (seat_no);

ALTER TABLE reservation_info ADD CONSTRAINT IDX_reservation_info_PK PRIMARY KEY (reservation_no);
ALTER TABLE reservation_info ADD CONSTRAINT IDX_reservation_info_FK0 FOREIGN KEY (cus_id) REFERENCES customer_info (cus_id);
ALTER TABLE reservation_info ADD CONSTRAINT IDX_reservation_info_FK1 FOREIGN KEY (payment_no) REFERENCES payment (payment_no);

