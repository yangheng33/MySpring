CREATE OR REPLACE PROCEDURE amar2
is v_vv number; 
CURSOR CUR is
select * from test1 aa where aa.username in (
select bb.username from test1 bb group by bb.username having count(*)>2 );
e  CUR%ROWTYPE;
BEGIN
 if not CUR %isopen then
     open CUR;         
   end if;
   savepoint point1;
   fetch CUR into e;
  while CUR%found loop
        insert into test2(userid, username, realname, email, regtime)
        values(e.userid, e.username, e.realname, e.email, e.regtime );        
        fetch CUR into e;
  end loop;  
  close CUR;  
  exception
  when others then
  dbms_output.put_line('³ö´íÀ²¡£¡£¡£');
  rollback to savepoint point1;  
  commit;
  return ;  
END;

CREATE OR REPLACE PROCEDURE amar1(indexs in number)
is v_vv number; 
BEGIN
  v_vv := 1;
  WHILE v_vv < indexs LOOP
    insert into test1(userid, username, realname, email, regtime)
    values (test_SEQ.Nextval,'a'||v_vv,'a_'||v_vv,'a@'||v_vv||'.com',sysdate-v_vv/24/3600);
    v_vv := v_vv + 1;
  END loop;
END;

SELECT NAME, LINE||'/'||POSITION AS "LINE/COL", TEXT
FROM USER_ERRORS where name ='AMAR2'
    

create table test1
(
userid number primary key,
username varchar2(40),
realname varchar2(40),
email varchar2(40),
regtime date
);

create table test2
(
userid number primary key,
username varchar2(40),
realname varchar2(40),
email varchar2(40),
regtime date
);

create sequence test_SEQ
minvalue 1
maxvalue 999999999
start with 1
increment by 1
cache 20
order;
------------------------------
select * from test1;
select * from test2;


delete from test1;
delete from test2;
call amar1(100000);
call amar2();





