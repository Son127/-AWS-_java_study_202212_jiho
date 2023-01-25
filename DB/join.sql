select
*
from
	library_mst;
    
select
*
from 
	author_mst;
    
select
*
from
	publisher_mst;
    
select #하나의 결과만 가지고 서브커리를 써야한다.
	순번,
    도서관명,
    구분,
    도서명,
    저작자,
    (select author_name from author_mst where author_id = 저작자) as 저작자명,
	출판사,
    (select publisher_name from publisher_mst where publisher_id = 출판사) as 출판사명,
    (select publisher_name from publisher_mst where publisher_year = 발행년도) as 설립일,
    발행년도,
    청구기호
from
	library_mst;
/*===========================*/
# 조인은 이너와 아웃터가 존재한다.
#아웃터는 왼쪽 오른쪽이 존재한다.

insert into library_mst
values ( 0, '테스트도서관','999(테스트)','테스트도서명','9999','9999','2023','999.9-테99');

select
*
from
	library_mst lm, #마스터테이블 이것을 기준으로 한다.
	author_mst am;

select
*
from
	library_mst lm
    inner join publisher_mst pm on (pm.publisher_id = lm.출판사) #inner join 은 on() <- 조건에 맞는 것들만 붙이겠다.
order by
	lm.순번 desc;
    
#left join
select
	lm.순번,
    lm.도서관명,
    lm.구분,
    lm.도서명,
    lm.출판사,
    pm.publisher_name,
    pm.publisher_year
from
	library_mst lm # <- 이 테이블을 기준으로
    left outer join publisher_mst pm on (pm.publisher_id = lm.출판사) 
#where
#	pm.publisher_id is null
order by
	lm.순번 desc;

