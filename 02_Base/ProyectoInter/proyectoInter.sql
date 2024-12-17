--Borrado de tablas
DROP TABLE usuario CASCADE CONSTRAINTS;
DROP TABLE telefonos CASCADE CONSTRAINTS;
DROP TABLE rol CASCADE CONSTRAINTS;
DROP TABLE permisos CASCADE CONSTRAINTS;

--Creación de tablas
CREATE TABLE usuario(
    uuid VARCHAR2(36),
    nombre VARCHAR2(50),
    apellidos VARCHAR2(100),
    email VARCHAR2(100),--no repeteir(clave alternativa)
    nick VARCHAR2(50),-- no repetir (clave alternativa)
    fecha_creacion DATE,
    fecha_nac DATE,
    fecha_mod DATE,
    ID_rol VARCHAR2(100),--clave ajena
    contarseña VARCHAR2(100)
);

CREATE TABLE telefonos(
    id_telef VARCHAR2(100),
    prefijo VARCHAR2(2),
    numero VARCHAR2(9)
);

CREATE TABLE usuario_telefono(
    id_usuario VARCHAR2(100),--(clave alternativa)
    id_telefono VARCHAR2(9)--(clave alternativa)
);

CREATE TABLE rol (
    id_rol VARCHAR2(100),
    nombre VARCHAR2(100)
);

CREATE TABLE permisos(
    id_permisos VARCHAR2(100),
    nombre VARCHAR2(100)
);

CREATE TABLE rol_permisos(
    id_rol VARCHAR2(100),--(clave alternativa)
    id_permisos VARCHAR2(100)--(clave alternativa)
);

--Definición de claves Primárias
ALTER TABLE usuario ADD CONSTRAINT pk_usuario PRIMARY KEY (uuid);
ALTER TABLE telefonos ADD CONSTRAINT pk_telefonos PRIMARY KEY (id_telef);
ALTER TABLE usuario_telefono ADD CONSTRAINT pk_usuario_telefono PRIMARY KEY (id_usuario,id_telefono);
ALTER TABLE rol ADD CONSTRAINT pk_rol PRIMARY KEY (id_rol);
ALTER TABLE permisos ADD CONSTRAINT pk_permisos PRIMARY KEY (id_permisos);
ALTER TABLE rol_permisos ADD CONSTRAINT pk_rol_permisos PRIMARY KEY (id_rol,id_permisos);


--Definición de claves alternativas

--Definición de claves ajenas

--Definición de restriccdiones check