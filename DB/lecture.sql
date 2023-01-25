insert into student_mst values (1,' 김동민');
insert into student_mst values (2,' 김두영');
insert into student_mst values (3,' 장진원');
insert into student_mst values (4,' 김두영');

select * from student_mst;

insert into lecture_mst values (1,'java',100000);
insert into lecture_mst values (2,'python',80000);
insert into lecture_mst values (3,'c',90000);

select * from lecture_mst;

insert into instructor_mst values ( 1,'김준일');
insert into instructor_mst values ( 2,'김준이');
insert into instructor_mst values ( 3,'김준삼');

select * from instructor_mst;

insert into university_mst values(1,'서울대');
insert into university_mst values(2,'부산대');
insert into university_mst values(3,'경성대');

select * from university_mst;

select
*
from
student_mst sm

left outer join lecture_mst lm on(lm.lecture_id = sm.student_id)
left outer join instructor_mst im on(im.instructor_id = lm.lecture_id)
left outer join university_mst um on(um.university_id = lm.lecture_id)