--7. Obtener todas las piezas que se recuenten el 15 /10/1992
SELECT p.numpieza, p.nompieza, p.preciovent 
FROM pieza p, inventario i 
WHERE p.numpieza=i.fecharecuento 
AND i.fecharecuento = TO_DATE('15/10/1992', 'DD/MM/YYYY');