# Write your MySQL query statement below
SELECT ROUND(
    SUM(
        CASE
            WHEN order_date = customer_pref_delivery_date THEN 1
            ELSE 0
        END
    ) / COUNT(*) * 100,
    2
) AS immediate_percentage
FROM (
    SELECT
        d.customer_id,
        d.order_date,
        d.customer_pref_delivery_date
    FROM Delivery d
    JOIN (
        SELECT 
            customer_id,
            MIN(order_date) AS first_date
        FROM Delivery
        GROUP BY customer_id
    ) AS e
        ON d.customer_id = e.customer_id
        AND d.order_date = e.first_date
) AS first_orders;