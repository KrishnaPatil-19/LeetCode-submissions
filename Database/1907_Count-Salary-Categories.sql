# Write your MySQL query statement below
WITH categories AS (
    SELECT 'Low Salary' AS category
    UNION ALL
    SELECT 'Average Salary'
    UNION ALL
    SELECT 'High Salary'
)

SELECT
    c.category, COUNT(a.account_id) AS accounts_count
FROM
    categories c
LEFT JOIN
    Accounts a
ON
     c.category = 'Low Salary' AND income < 20000
     OR
     c.category = 'Average Salary' AND income >= 20000 AND income <= 50000
     OR
     c.category = 'High Salary' AND income > 50000
GROUP BY
    c.category
ORDER BY
    a.account_id DESC;