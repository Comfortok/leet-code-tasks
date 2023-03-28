# Write your MySQL query statement below
select sp.name from SalesPerson sp
where sp.name not in (
    select sp.name from SalesPerson sp
    join Orders o on o.sales_id = sp.sales_id
    join Company c on c.com_id = o.com_id
    where c.name = 'RED'
)