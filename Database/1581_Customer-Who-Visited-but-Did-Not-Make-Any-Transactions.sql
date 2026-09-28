SELECT v.customer_id, COUNT(*) AS count_no_trans 
FROM Visits V 
LEFT JOIN Transactions T 
    ON v.visit_id = t.visit_id 
WHERE t.visit_id IS NULL 
GROUP BY customer_id;