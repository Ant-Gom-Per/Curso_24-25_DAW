DROP TABLE usuario CASCADE CONSTRAINTS;
DROP TABLE telefono CASCADE CONSTRAINTS;
DROP TABLE usuario_telefono CASCADE CONSTRAINTS;

CREATE TABLE usuario(
    uuid VARCHAR2(60), 
    name VARCHAR2(100),
    surname VARCHAR2(200),
    password VARCHAR2(255),
    email VARCHAR2(255),
    address VARCHAR2(200),
    birthdate DATE,
    phone VARCHAR2(9),
    cod_postal VARCHAR2(6) DEFAULT '03610',
    clasificacion NUMBER(5,2)
);

CREATE TABLE telefono(
    id_telefono NUMBER,
    prefijo VARCHAR2 (5),
    numero VARCHAR2 (9)
);

CREATE table usuario_telefono(
    uuid_usurio VARCHAR2(60),
    id_telefono NUMBER
);

ALTER TABLE usuario ADD CONSTRAINT pk_usuario PRIMARY KEY (uuid);
ALTER TABLE telefono ADD CONSTRAINT pk_telefono PRIMARY KEY (id_telefono);
ALTER TABLE usuario_telefono ADD CONSTRAINT pk_usuario_telefono PRIMARY KEY (uuid_usuario,id_telefono);


ALTER TABLE usuario_telefono ADD CONSTRAINT fk_usuario_telefono_usuario FOREIGN KEY (uuid_usuario) REFERENCES usuario(uuid);
ALTER TABLE usuario_telefono ADD CONSTRAINT fk_usuario_telefono_telefono FOREIGN KEY (id_telefono) REFERENCES telefono(id_telefono);