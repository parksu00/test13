create table product(
    pid  number(10),
    pname       varchar(30),
    count    number(10),
    price       number(10)
);
--�⺻Ű
alter table product add constraint product_pid_pk primary key(pid);

--����������
drop sequence product_pid_seq;
create sequence product_pid_seq;

commit;