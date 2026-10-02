# Write your MySQL query statement below
(SELECT
    u.name AS results
FROM Users u
JOIN MovieRating mr
    ON mr.user_id = u.user_id
GROUP BY u.user_id
ORDER BY COUNT(*) DESC, u.name ASC
LIMIT 1)

UNION ALL

(SELECT
    m.title
FROM Movies m
JOIN (
    SELECT
        movie_id,
        AVG(rating) AS average_rating
    FROM MovieRating
    WHERE created_at >= '2020-02-01'
        AND created_at < '2020-03-01'
    GROUP BY movie_id
) mr
    ON m.movie_id = mr.movie_id
ORDER BY average_rating DESC, m.title ASC
LIMIT 1);