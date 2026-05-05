# Write your MySQL query statement bel
(select u.name as results
from MovieRating m
left join Users u
on m.user_id = u.user_id
group by u.name
order by count(distinct movie_id )desc , name limit 1)
union all 
(select m2.title from MovieRating m1
left join Movies m2 on m1.movie_id = m2.movie_id
where DATE_FORMAT(created_at , '%Y-%m') = '2020-02'
group by m2.title order by avg(m1.rating) desc, m2.title limit 1
);
