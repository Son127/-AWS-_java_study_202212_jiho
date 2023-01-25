SELECT * FROM db_study.customer_mst;/*조회명령
/*
   실행 단축키
    1. 하나의 명령만 실행 -> Ctrl + Enter
    2. 드래그한 영역만 실행 -> 드래그 + Ctrl + Shift + Enter
    3. 쿼리에디터 전체 실행 -> Ctrl + Shift + Enter
*/

insert into customer_mst values (1, '김민재', '부산 동구 범일동');
insert into customer_mst values (2, '손흥민', '부산 진구 전포동');
insert into customer_mst values (3, '황희찬', '부산 남구 광안동');

SELECT * FROM db_study.customer_mst;

insert into product_mst values (1, '아이폰13', 1000000);
insert into product_mst values (2, '아이폰14', 1100000);
insert into product_mst values (3, '아이폰15', 1200000);

SELECT * FROM product_mst; 

insert into order_mst values (1, 23011901, 1);
insert into order_mst values (2, 23011902, 2);
insert into order_mst values (3, 23011903, 3);
insert into order_mst values (4, 23011904, 1);

SELECT * FROM db_study.order_mst;

insert into order_dtl values (1, 1, 1);
insert into order_dtl values (2, 1, 2);
insert into order_dtl values (3, 2, 1);
insert into order_dtl values (4, 3, 3);

select * from order_dtl;

select
   *
from
   order_mst om
    left outer join order_dtl od on(od.order_id = om.order_id)
    left outer join product_mst pm on(pm.product_id = od.product_id)
    left outer join customer_mst cm on(cm.customer_id = om.customer_id);
