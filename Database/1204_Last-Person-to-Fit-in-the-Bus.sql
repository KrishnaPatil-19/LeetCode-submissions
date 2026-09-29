# Write your MySQL query statement below
WITH cumulative_weight AS (
    SELECT
        person_name,
        weight,
        turn,
        SUM(weight) OVER (ORDER BY turn) AS total_weight
    FROM Queue
    ORDER BY turn
)
SELECT
    person_name
FROM
    cumulative_weight
WHERE
    total_weight <= 1000
ORDER BY turn DESC
LIMIT 1;