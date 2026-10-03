# Write your MySQL query statement below
WITH list AS (
    SELECT requester_id AS id
    FROM RequestAccepted

    UNION ALL

    SELECT accepter_id AS id
    FROM RequestAccepted
),
sub AS (
    SELECT
        id,
        COUNT(*) AS num
    FROM list
    GROUP BY id
)

SELECT
    id,
    MAX(num) AS num
FROM
    sub
WHERE
    num = (
        SELECT
            MAX(num) 
        FROM sub
    );
