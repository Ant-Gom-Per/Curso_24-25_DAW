set SERVEROUTPUT on;

--Utilizando la base de datos de vendedores, escribe un procedimiento que permita borrar aquellos productos 
--cuyo nombre se le pase por parámetro. Existe algún problema que podamos solucionar de alguna forma.

create or replace procedure borrar_pieza(nombre_pieza varchar2) is
BEGIN
    delete from pieza