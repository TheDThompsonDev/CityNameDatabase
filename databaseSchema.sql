use projectdb

create table location (
id INT PRIMARY KEY,
code varchar(28),
name varchar(28),
type varchar(10)
)

select * from location

drop table location