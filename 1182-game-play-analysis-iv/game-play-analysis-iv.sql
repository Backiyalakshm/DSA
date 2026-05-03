# Write your MySQL query statement below
select round(count(distinct T.player_id) / count(distinct a.player_id) , 2)
as Fraction 
from Activity a
left join
(select player_id,min(event_date) as FLD
from Activity
group by player_id) T
 on a.player_id =T.player_id
 and DATE_SUB(a.event_date,interval 1 day) = T.FLD