set SERVEROUTPUT on;

--Crea un programa que procesa una transacción bancaria. Antes de permitir retirar 500€ 
--de la cuenta 3, se asegura de que la cuenta tenga fondos suficientes para cubrir la retirada. 
--Si los fondos están disponibles, el programa debita la cuenta. De lo contrario, 
--el programa inserta un registro en una tabla de auditoría.

DECLARE
    v_cuenta_1 NUMBER;
    v_cuenta_2 NUMBER;
    v_cuenta_3 NUMBER;       

BEGIN
    v_cuenta_1 := 200;
    v_cuenta_2 := 900;
    v_cuenta_3 := 600;
    
    IF (v_cuenta_3 - 500) < 0 THEN          
        dbms_output.put_line('Error, no hay saldo suficiente.');
    ELSE
        v_cuenta_3 := v_cuenta_3 - 500;
        dbms_output.put_line('Su saldo actual es: '|| v_cuenta_3 || ' €');
    END IF;
        
END;

