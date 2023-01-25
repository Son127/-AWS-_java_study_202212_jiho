#==============================<<select>>==============================

select * from student_mst;

#전체 컬럼 조회
select
	*
from
	student_mst

/*지정 컬럼 조회*/
select
	student_id,
	student_name,
    mentor_id
from
	student_mst;
    
/* 임시 컬럼 추가 */
select
	1 as num,
    '기문일' as name;

select # 컬럼 결과값이 하나인 경우에만 사용
	student_id,
    student_name,
    '김준일' as instructor_name
from
	student_mst;
    
/* 컬럼명을 임시로 바꾸는 방법 as(alias) 알리아스*/
# as 표기 생략 가능 (띄어쓰기 구분이 모호해서 컬럼에서는 생략 안함 )
select 
	student_id as studentId # JAVA 변수명이랑 매칭
from
	student_mst sm;

/* 조회조건 where */

select
	*
from
	student_mst
where #서브쿼리
	mentor_id = (select
					mentor_id
				from
					mentor_mst
				where
					mentor_name = '문자영');
# select 안에 서브쿼리를 사용할떄는  알리아스로 이름을 바꿔줘야한다.
select
	student_id,
    student_name,
    mentor_id,
    (select 
		mentor_name 
    from 
		mentor_mst 
    where #결과를 도출하기전 조건을 주는거
		mentor_id = student_mst.mentor_id) as mentor_name
from
	student_mst;

/* 그룹으로 묶어서 조회하기*/
select
	count(mentor_id),# *
    min(student_id),# *
    max(student_id),# *
    avg(student_id),
    sum(student_id),
	mentor_id
from
	student_mst
group by
	mentor_id;

/*중복제거*/
select distinct
	mentor_id
from
	student_mst;
    
 /*그룹으로 조회한 결과에 조건을 주는 방법(having)*/   
select
	count(mentor_id) as mentor_count,
    min(student_id),
    max(student_id),
    avg(student_id),
    sum(student_id),
	mentor_id
from
	student_mst
group by
	mentor_id
having #결과를 뽑아낸후 조건을 거는 것
	mentor_count = 5;
    
/*정렬 (order by)*/
select
	*
from
	student_mst
order by #기본적으로 오름차순 이고 역순으로 하고싶으면 (desc)를 붙인다.
	mentor_id,
    student_id desc;
    
/* 전체 조합 실습*/
select
	count(*) as student_count,
    mentor_id
from
	student_mst
where
	student_id > 2
group by
	mentor_id
having
	student_count = 1
order by
	mentor_id desc;