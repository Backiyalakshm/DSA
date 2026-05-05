# Write your MySQL query statement below
select cat.category, count(T.account_id) as accounts_count
from( select 'Low Salary' as category union select 'Average Salary' union select 'High Salary') cat
left join
(select *, case when income < 20000 then 'Low Salary'
when income between 20000 and 50000 then 'average Salary'
else 'high Salary' end as category from Accounts)T
on cat.category = T.category
group by cat.category;  