# Write your MySQL query statement below
select requester_id as id , count( accepter_id) as num
from 
(select requester_id , accepter_id
from RequestAccepted
union all
select accepter_id , requester_id 
from RequestAccepted) T
group by requester_id
order by num desc 
limit 1;
