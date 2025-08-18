select user_id, name, mail
from Users
where binary(right(mail,13)) = '@leetcode.com'                        
and left(mail,length(mail) - 13) regexp '^[A-Za-z]'                  
and left(mail,length(mail) - 13) regexp '^[A-Za-z0-9._-]*$';