# Write your MySQL query statement below
SELECT MAX(num) as num
FROM (
    SELECT * FROM MyNumbers
    GROUP BY num 
    HAVING COUNT(num) = 1
) AS MyNumbers;