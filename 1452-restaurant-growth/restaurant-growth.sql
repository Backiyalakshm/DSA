#Write your MySQL query statement below
with cstmr as (select visited_on, sum(amount) as amount from Customer group by visited_on)

select c1.visited_on, sum(c2.amount) as amount,
round(avg(c2.amount) , 2) as average_amount
from cstmr c1
left join cstmr c2
on c1.visited_on >= c2.visited_on
where datediff(c1.visited_on , c2.visited_on) between 0 and 6 and c1.visited_on >= (select date_add(min(visited_on ), interval 6 DAY )
from Customer)
group by c1.visited_on
order by c1.visited_on;