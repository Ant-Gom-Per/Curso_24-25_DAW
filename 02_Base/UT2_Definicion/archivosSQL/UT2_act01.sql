--Borrado de tablas
DROP TABLE vehiculo CASCADE CONSTRAINTS;
DROP TABLE propietario CASCADE CONSTRAINTS;
DROP TABLE infracciones CASCADE CONSTRAINTS;
DROP TABLE vehiculo_infracciones CASCADE CONSTRAINTS;

--Creado de tablas
CREATE TABLE vehiculo(
    matricula VARCHAR2(7),
    modelo varchar2(50),
    marca varchar2(50),
    dni_propietario VARCHAR2(9)
);



--Definición de claves primarias

--Definición de claves alternativas

--Definición de claves ajenas

--Definición de restricciones check