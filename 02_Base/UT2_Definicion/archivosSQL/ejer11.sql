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
    nombre_continente VARCHAR2(50) --En el ejemplo es eliminado de la tabla y convertido en un check
);

CREATE TABLE ciudad(
    cod_ciudad NUMBER(5),
    nombre VARCHAR2(100),
    cod_pais CHAR(2)
);

CREATE TABLE zoologico(
    nif_zoo VARCHAR(9),
    nombre_zoo VARCHAR2(100),
    tamaño NUMBER(9),
    presupuesto NUMBER(10,2),
    cod_ciudad NUMBER(5)
);

CREATE TABLE animal(
    id_animal VARCHAR2(6),
    fech_nac DATE,
    nif_zoo VARCHAR2(9),
    cod_pais_orig VARCHAR2(2),
    nom_cientif VARCHAR2(100),
    cod_sexo VARCHAR2(2)
);

CREATE TABLE especie_animal(
    nom_cientif VARCHAR2(100),
    nom_vulgar VARCHAR2(100),
    peligro_exticion CHAR(1), --Añadir clausula check S/N
    cod_familia VARCHAR2(10)
);

CREATE TABLE familia(
    cod_familia VARCHAR(10),
    cod_sexo VARCHAR2(2)
);

CREATE TABLE sexo(
    cod_sexo VARCHAR2(2),
    descipcion VARCHAR2(255)
);


--Definición de claves primarias

ALTER TABLE pais ADD CONSTRAINT pk_pais PRIMARY KEY (cod_pais);
ALTER TABLE ciudad ADD CONSTRAINT pk_ciudad PRIMARY KEY (cod_ciudad);
ALTER TABLE zoologico ADD CONSTRAINT pk_zoologico PRIMARY KEY (nif_zoo);
ALTER TABLE animal ADD CONSTRAINT id_animal PRIMARY KEY (id_animal);
ALTER TABLE especie_animal ADD CONSTRAINT nom_cientif PRIMARY KEY (nom_cientif);
ALTER TABLE familia ADD CONSTRAINT cod_familia PRIMARY KEY (cod_familia);
ALTER TABLE sexo ADD CONSTRAINT cod_sexo PRIMARY KEY (cod_sexo);


--Definición de claves aternativas

ALTER TABLE ciudad ADD CONSTRAINT fk_ciudad_pais FOREIGN KEY (cod_pais) REFERENCES pais(cod_pais);
ALTER TABLE zoologico ADD CONSTRAINT fk_zoologico_ciudad FOREIGN KEY (cod_ciudad) REFERENCES ciudad(cod_ciudad); 
ALTER TABLE animal ADD CONSTRAINT fk_animal_zoologico FOREIGN KEY (nif_zoo) REFERENCES zoologico(nif_zoo);


--Definición de claves ajenas

--Definición de restricciones check
