# Write your MySQL query statement below
SELECT r.contest_id, ROUND(((COUNT(r.contest_id)/(
    SELECT COUNT(*) FROM Users
))*100), 2) AS percentage
FROM Register r JOIN Users u
    ON r.user_id = u.user_id
GROUP BY r.contest_id
ORDER BY
    percentage DESC,
    r.contest_id ASC;