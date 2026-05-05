# Write your MySQL query statement below
select d.name as Department ,e1.name as Employee , e1.salary as Salary 
from Employee e1
left join Department d
on e1.departmentId = d.id
where (select count(DISTINCT e2.salary)
from Employee e2
where e1.departmentId = e2.departmentId
and e1.salary < e2.salary
) < 3;