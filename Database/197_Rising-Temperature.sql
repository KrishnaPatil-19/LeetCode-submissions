# Write your MySQL query statement below
SELECT DISTINCT w.id AS Id
FROM Weather w 
INNER JOIN Weather t ON
w.temperature > t.temperature 
    AND DATEDIFF(w.recordDate, t.recordDate) = 1
ORDER BY Id;