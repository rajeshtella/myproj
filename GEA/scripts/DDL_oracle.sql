create table goal_users 
(loginname varchar2(40),
firstname varchar2(40),
lastname varchar2(40),
password varchar2(20),
email varchar2(40),
confirmpassword varchar2(40));


create table goals
(project_name varchar2(40),
goal_name varchar2(40));

create table usecases 
(project_name varchar2(40),
usecase_name varchar2(40));
commit;
