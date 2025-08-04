select r.contest_id,round(count(r.contest_id)/ (select count(user_id)from Users)*100,2) as percentage
from Users u
join Register r
on u.user_id=r.user_id
group by r.contest_id
order by percentage desc,r.contest_id;