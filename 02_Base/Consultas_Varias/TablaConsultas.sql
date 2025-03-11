-- 8. Obtener los vendedores de la provincia de Valencia o Alicante que su nombre empieza por J o por M 
-- y tienen un número de vendedor entre 1 y 100.
SELECT v.nomvend FROM vendedor v WHERE UPPER(v.provincia) IN ('VALENCIA', 'ALICANTE') AND (UPPER(v.nomvend) LIKE 'J%' OR UPPER(v.nomvend) LIKE 'M%') AND v.numvend BETWEEN 1 AND 100;

SELECT V.* FROM VENDEDOR V WHERE (UPPER(V.PROVINCIA)='VALENCIA' OR UPPER(V.PROVINCIA)='ALICANTE') AND (UPPER(V.NOMVEND) LIKE 'J%' OR UPPER(V.NOMVEND) LIKE 'M%') AND V.NUMVEND BETWEEN 1 AND 100;