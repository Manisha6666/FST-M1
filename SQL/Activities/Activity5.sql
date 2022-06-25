REM   Script: Activity5
REM   Update  salesman table with different values

CREATE TABLE salesman( 
salesman_id int, 
salesman_name varchar2(32), 
salesman_city varchar2(32), 
commission int 
);

DESCRIBE salesman


CREATE TABLE salesman( 
salesman_id int, 
salesman_name varchar2(32), 
salesman_city varchar2(32), 
commission int 
);

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

select * from salesman;

INSERT ALL 
 INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
 INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
 INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
 INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
  
SELECT 1 FROM DUAL  
    ;

select * from salesman;

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

ALTER table salesman 
ADD grade int;

ALTER table salesman 
ADD grade int;

ALTER table salesman 
ADD grade int;

select * from salesman;

UPDATE salesman SET grade=100;

select * from salesman;

select * from salesman;

UPDATE salesman SET grade=200 WHERE salesman_city='ROME';

select * from salesman;

UPDATE salesman SET grade=200 WHERE salesman_city='Rome';

select * from salesman;

select * from salesman;

UPDATE salesman SET grade=300 WHERE salesman_name='James Hoog';

select * from salesman;

UPDATE salesman SET grade=300 WHERE salesman_name='Pit Alex';

select * from salesman;

UPDATE salesman SET salesman_name='Jon Snow' WHERE salesman_name='McLyon';

select * from salesman;

