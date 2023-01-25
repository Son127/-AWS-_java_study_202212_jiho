/*
	DML
    c : insert / into	데이터 추가
    r : select / from	데이터 조회	
    u : updata / set	데이터 수정
    d: delete / from	데이터 삭제
*/
/*=============<<insert>>===============*/

select * from student_mst;

insert into  
	`db_study_explain`.`student_mst` # 테이블 접근 데이터베이스 . 테이블명 ( 유즈를 하고 있으면 생략 가능)
	(`student_id`, `student_name`) # id 와 name 컬럼에만 값을 넣겠다.
values ( 4, '손지호'); # values 순서는 위 () 영향을 받는다.  tables 에 null을 허용하면 값을 안넣어도 된다.

insert into student_mst values (10, '남적성',10); #컬럼이 3개가 있는데 값을 2개만 넣으며 에러
insert into student_mst(student_id, student_name) values(5, '홍길동'); #이런 식으로 생략 가능

select * from student_mst;
insert into  student_mst
	(student_id, student_name,mentor_id) 
values 
	( 1,	'이사람',	1),
	( 2,	'저사람',	1),
	( 3,	'이것',	1),
	( 4,	'저것',	1),
	( 5,	'무언가',	1);
    
    
select * from university_mst;
insert into university_mst
	(university_id, university_name)
values
	(4,		'부경대'),
	(5,		'중앙대'),
	(6,		'한양대');
    
/*=============<<update>>===============*/
select * from student_mst;

update student_mst
set
	student_name = '김재영',
	mentor_id = 15 # "where"을 안쓰면  전부 15 바꾸기 때문에 조건을 달아줘야한다
where    
   student_id = 5; # 조건은 key 값을로 한다.  student_id가 5번인 
   
/* 멘토 id가 10인 학생들의 멘토 아이디를 1로 바꿔라. */

update student_mst
set
	mentor_id = 1
where
	mentor_id = 10;
    /*=============<<delete>>===============*/
 # delete 와 from 사이에는 아무것도 적지 않는다.
 # delete는 무조건 키값을 써야한다.
delete from 
	student_mst
where 
	student_id = 4
and student_name = '손지호';
#ex)
delete from
	university_mst
where # 조건은 key 값으로
	university_id = 4
or university_id = 5;