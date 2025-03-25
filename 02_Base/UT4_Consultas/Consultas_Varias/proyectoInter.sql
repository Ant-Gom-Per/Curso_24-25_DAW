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
    id_rol VARCHAR2(100),--clave ajena
    contarseña VARCHAR2(100)
);

CREATE TABLE telefonos(
    id_telef VARCHAR2(100),
    prefijo VARCHAR2(2),
    numero VARCHAR2(9)
);

CREATE TABLE usuario_telefono(
    id_usuario VARCHAR2(100),--(clave ajena)
    id_telefono VARCHAR2(9)--(clave ajena)
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
    id_rol VARCHAR2(100),--(clave ajena)
    id_permisos VARCHAR2(100)--(clave ajena)
);


--Definición de claves Primárias
ALTER TABLE usuario ADD CONSTRAINT pk_usuario PRIMARY KEY (uuid);
ALTER TABLE telefonos ADD CONSTRAINT pk_telefonos PRIMARY KEY (id_telef);
ALTER TABLE usuario_telefono ADD CONSTRAINT pk_usuario_telefono PRIMARY KEY (id_usuario,id_telefono);
ALTER TABLE rol ADD CONSTRAINT pk_rol PRIMARY KEY (id_rol);
ALTER TABLE permisos ADD CONSTRAINT pk_permisos PRIMARY KEY (id_permisos);
ALTER TABLE rol_permisos ADD CONSTRAINT pk_rol_permisos PRIMARY KEY (id_rol,id_permisos);

--Definición de claves alternativas
ALTER TABLE usuario ADD CONSTRAINT fk_email FOREIGN KEY (email) REFERENCES usuario(email);
ALTER TABLE usuario ADD CONSTRAINT fk_nick FOREIGN KEY (nick) REFERENCES usuario(nick);

--Definición de claves ajenas
ALTER TABLE usuario ADD CONSTRAINT uk_usuario_mail UNIQUE (email);
ALTER TABLE usuario_telefono ADD CONSTRAINT uk_usuario_telefono_id_usuario UNIQUE (id_usuario);
ALTER TABLE usuario_telefono ADD CONSTRAINT uk_usuario_telefono_id_telefono UNIQUE (id_telefono);
ALTER TABLE rol_permisos ADD CONSTRAINT uk_rol_permisos_id_rol UNIQUE (id_rol);
ALTER TABLE rol_permisos ADD CONSTRAINT uk_rol_permisos_id_permisos UNIQUE (id_permisos);


--Definición de restricciones check (no hay)


--Insercion de datos
--INSERT INTO VALUES(1,'Crear Usuario'); (modo alternativo, hay que insertar todos los campos de manera correlativa)

--Insertamos valores en la tabla rol
INSERT INTO rol (id_rol,nombre) VALUES(1,'Invitado');
INSERT INTO rol(id_rol,nombre) VALUES(2,'Usuario');
INSERT INTO rol(id_rol,nombre) VALUES(3,'Editor');
INSERT INTO rol(id_rol,nombre) VALUES(4,'Gestor');
INSERT INTO rol(id_rol,nombre) VALUES(5,'Administrador');

--Insertamos valores a la tabla permisos
INSERT INTO permisos(id_premisos, nombre) VALUES(1,'Crear usuario');
INSERT INTO permiso(id_premisos, nombre) VALUES(2,'Borrar usuario');
INSERT INTO permiso(id_premisos, nombre) VALUES(3,'Actualizar usuario');
INSERT INTO permiso(id_premisos, nombre) VALUES(4,'Leer usuario');
INSERT INTO permiso(id_premisos, nombre) VALUES(5,'Crear producto');
INSERT INTO permiso(id_premisos, nombre) VALUES(6,'Borrar producto');
INSERT INTO permiso(id_premisos, nombre) VALUES(7,'Actualizar producto');




--Asignamos permisos a los roles
INSERT INTO rol_permisos VALUES (2,1);
INSERT INTO rol_permisos VALUES (2,2);
INSERT INTO rol_permisos VALUES (2,3);
INSERT INTO rol_permisos VALUES (2,4);
INSERT INTO rol_permisos VALUES (3,1);
INSERT INTO rol_permisos VALUES (3,2);
INSERT INTO rol_permisos VALUES (3,3);
INSERT INTO rol_permisos VALUES (3,4);


