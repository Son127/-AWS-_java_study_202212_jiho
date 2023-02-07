insert into user_mst
values (0, 'test1', '1235','test1', 'test1@gamil.com');

delete
from
	user_mst
where
	username = 'test1';
    
call show_all_user_mst('안녕하세요');

call insert_product('아이패드 프로');

select
	*
from
	library_view; #가짜 테이블 
