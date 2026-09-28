# Write your MySQL query statement below
WITH aakda AS (
    SELECT
        DISTINCT
        CASE
            WHEN num = LEAD(num, 1) OVER (ORDER BY id) AND num = LEAD(num, 2) OVER (ORDER BY id)
            THEN num
        END AS ConsecutiveNums
    FROM Logs
)
SELECT
    ConsecutiveNums
FROM
    aakda
WHERE
    ConsecutiveNums IS NOT NULL;