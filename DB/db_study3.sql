SELECT * FROM db_study3.library_mst;
select
	*
from
	library_mst
where
	도서명 like '%나를%';
/* 
LIKE %는 문자열에서 앞뒤로 뭐든 들어와도 상관이 없다. 
%나를 이면 "나를"로 끝나는것
나를% 이면 "나를"로 시작하는거
like 와 in을 같이 쓰려면 or를 걸어준다.
*/
select
	*
from
	library_mst
where
	저작자 in ('채사장 지음', '최인철  지음'); # in 은 ()안에 문자열 또는 숫자를 포함하는것
    
    
/*=================<<select insert>>=====================*/ 
insert into author_mst
	(author_name)
select distinct
	저작자
from
	library_mst
order by
	저작자;
    
select * from author_mst;

insert into publisher_mst
	(publisher_name)
select distinct
	출판사
from
	library_mst
order by
	출판사;
    
 select * from  publisher_mst;
 delete from publisher_mst;
 
/*=================<<select update>>=====================*/ 
/*
update library_mst lm
set lm.저작자 = (select 
					author_id
				from 
					author_mst am
				where
					am.author_name = lm.저작자);				
update library_mst lm
set lm.출판사 = (select 
					publisher_id
				from 
					publisher_mst pm
				where
					pm.publisher_name = lm.출판사);
*/            
  
update library_mst, author_mst
set
	저작자 = author_id
where
	저작자 = author_name;
    
update library_mst, publisher_mst
set
	출판사 = publisher_id
where
	출판사 = publisher_name;
                    
select
   *
from
   library_mst lm
   left outer join author_mst am on(am.author_id = lm.저작자)
   left outer join publisher_mst pm on(pm.publisher_id = lm.출판사)
    order by
      am.author_id;
/*================================================================ */
select * from author_mst;

set profiling = 1;
set profiling_history_size = 30; #최근 실행커리를 30개까지 보겟다.


select
	도서관명,
    도서명
from
	library_mst
where
	저작자 in (select author_id from author_mst where author_name like '%김주%' );
    
# union all #중복상관없이 합치겠다ㅣ.
