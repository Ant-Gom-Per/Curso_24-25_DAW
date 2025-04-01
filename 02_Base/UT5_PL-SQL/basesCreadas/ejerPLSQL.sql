set SERVEROUTPUT on;

--A partir de una base y exponente, mediante la acumulación de productos, 
--calcula la potencia utilizando la instrucción loop

DECLARE
    v_base NUMBER;
    v_exponente NUMBER;
    v_total NUMBER;

BEGIN
    v_base :=2;
    v_exponente :=10;
    v_total :=0;
    IF(v_exponente=0) THEN
        v_total :=1;
    ELSE
        v_total := v_base;
        v_exponente := v_exponente-1;
        WHILE v_exponente<>0 LOOP
              v_total:=v_total*v_base;
              v_exponente:=v_exponente-1;
        END LOOP;
    END IF;
    dbms_output.put_line('El resultado total es: ' || v_total);
END;

