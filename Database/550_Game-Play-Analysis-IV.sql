# Write your MySQL query statement below
SELECT
    ROUND(
        SUM(
            CASE
                WHEN DATEDIFF(a.event_date, b.first_date) = 1 THEN 1
                ELSE 0
            END
        ) / COUNT(DISTINCT b.player_id),
        2
    ) AS fraction
FROM Activity a
JOIN (
    SELECT
        player_id,
        MIN(event_date) AS first_date
    FROM Activity
    GROUP BY player_id
) AS b
    ON a.player_id = b.player_id;