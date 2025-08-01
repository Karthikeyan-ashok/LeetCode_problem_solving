select Department,Employee,Salary from(
    select d.name as Department,e.name as Employee,e.salary as Salary, 
    dense_rank() over(partition by e.departmentId order by e.salary desc) as ranks
    from Employee e
    join Department d
    on e.departmentId=d.id
    order by e.salary desc
) as a
where ranks<4