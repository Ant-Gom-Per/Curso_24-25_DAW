--Borrado de tablas
DROP TABLE pais CASCADE CONSTRAINTS;
DROP TABLE ciudad CASCADE CONSTRAINTS;
DROP TABLE zoologico CASCADE CONSTRAINTS;
DROP TABLE animal CASCADE CONSTRAINTS;
DROP TABLE especie_animal CASCADE CONSTRAINTS;
DROP TABLE familia CASCADE CONSTRAINTS;
DROP TABLE sexo CASCADE CONSTRAINTS;

--Creación de tablas
CREATE TABLE pais(
    cod_pais CHAR(2),
    nombre VARCHAR2(100),
    nombre_continente VARCHAR2(50)
);

CREATE TABLE ciudad(
    cod_ciudad NUMBER(5),
    nombre VARCHAR(100),
    cod_pais CHAR(2)
);

CREATE TABLE zoologico(
    nif VARCHAR(9),
    nombre_zoo VARCHAR2(100),
    tamaño NUMBER(100),
    presupuesto NUMBER(10,2),
    cod_ciudad NUMBER(5)
);



--Definición de claves primarias

--Definición de claves aternativas

--Definición de claves ajenas

--Definición de restricciones check