with cte as(
    select *
    from Accounts
    where income<20000
),
cte2 as(
    select *
    from Accounts
    where income between 20000 and 50000
),
cte3 as(
    select *
    from Accounts
    where income>50000
)

select 'Low Salary' as category,count(*) as accounts_count from cte
union
select 'Average Salary' as category,count(*) as accounts_count from cte2
union
select 'High Salary' as category,count(*) as accounts_count from cte3;