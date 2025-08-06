select e.name as Employee
from employee e
join employee ee
on e.managerId=ee.id
where e.salary>ee.salary;