--계정생성
CREATE USER c##test13 IDENTIFIED BY test13
    DEFAULT TABLESPACE users 
    TEMPORARY TABLESPACE temp 
    PROFILE DEFAULT;
--권한부여    
GRANT CONNECT, RESOURCE TO c##test13; 
GRANT CREATE VIEW, CREATE SYNONYM TO c##test13; 
GRANT UNLIMITED TABLESPACE TO c##test13; 
--락 풀기
ALTER USER c##test13 ACCOUNT UNLOCK;