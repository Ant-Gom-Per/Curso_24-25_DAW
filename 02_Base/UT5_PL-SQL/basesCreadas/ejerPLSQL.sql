set SERVEROUTPUT on;

DECLARE
    v_nombre VARCHAR2(50);
    v_apellido1 VARCHAR2(50);
    v_apellido2 VARCHAR2(50);
    v_email VARCHAR2(100);
    v_anyo_nac number;
    v_telef NUMBER(9);

BEGIN
    v_nombre := 'Benito';
    v_apellido1 := 'Camelas';
    v_apellido2 := 'Bolas';
    v_anyo_nac := 1965;
    dbms_output.put_line('Nombre: ' || v_nombre || ' '|| v_apellido1 || ' ' || v_apellido2 || ' ' || v_anyo_nac);   
    dbms_output.put_line( 'Correo: ' || lower(v_apellido1) || '_' || lower(v_apellido2) || '@iespacomolla.es');   

    
END;