-- 1. Obtener el nombre de las piezas que puedan ser suministradas por aquellos proveedores cuyo nombre empiece por S.
SELECT p.nompieza FROM pieza p JOIN preciosum ps ON p.numpieza=ps.numpieza JOIN vendedor v ON v.numvend=ps.numvend 
WHERE UPPER(v.nomvend) LIKE 'S%';