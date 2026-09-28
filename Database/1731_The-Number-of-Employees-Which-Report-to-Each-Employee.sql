# Write your MySQL query statement below
SELECT e.employee_id, e.name, COUNT(em.employee_id) AS reports_count, ROUND(AVG(em.age), 0) AS average_age
FROM Employees e
JOIN Employees em
    ON e.employee_id = em.reports_to
GROUP BY e.employee_id, e.name
ORDER BY e.employee_id;