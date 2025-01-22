--11. Obtener nombre, teléfono, y ciudad del vendedor que puede suministrarnos piezas con valor mayor de 100.
select distinct v.nomvend, v.telefono, v.ciudad from vendedor v, preciosum ps where v.numvend=ps.numvend and ps.preciounit>100
--Al colocar distinct no salen los nombres repetidos.