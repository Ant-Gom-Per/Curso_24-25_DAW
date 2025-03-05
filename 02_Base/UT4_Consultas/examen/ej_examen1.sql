--PARTE1
--Borrado de tablas
drop table farmaceutico cascade constraints;
drop table cliente cascade constraints;
drop table preescripcion cascade constraints;
drop table estado_pago cascade constraints;
drop table items_preescipcion cascade constraints;
drop table farmaco cascade constraints;

--Creacion de tablas
create table farmaceutico(
    id number(5),
    nombre varchar2(50)    
);

create table cliente(
    id number(6),
    nombre varchar2(50),
    fecha_alta date,
    num_tarjeta number(16),
    cad_tarjeta date
);

create table preescripcion(
    id number(12),
    id_cli number(6),
    id_farm number(5),
    fecha_pree date,
    id_estado_pago number(2),
    tok_estado_pago varchar2(255)
);

create table estado_pago(
    id number(2),
    token varchar2(255),
    descripcion varchar2(50)
);

create table items_preescipcion(
    id_pree number(12),
    id_farmaco number(9),
    cantidad number(2),
    instrucciones varchar(200)
);

create table farmaco(
    id number(9),
    nombre varchar2(50),
    coste number (6,2),
    fecha_lanz date,
    id_farmaco_generico number(9)    
);

--Creacion de tablas primarias
alter table farmaceutico add constraint pk_farmaceutico primary key (id);
alter table cliente add constraint pk_cliente primary key (id);
alter table preescripcion add constraint pk_preescripcion primary key (id);
alter table estado_pago add constraint pk_estado_pago primary key (id, token);
alter table items_preescipcion add constraint pk_items_preescipcion primary key (id_pree, id_farmaco);
alter table farmaco add constraint pk_farmaco primary key (id);

--Creacion de claves alternativas
alter table cliente add constraint uk_cliente unique (num_tarjeta);


--MODIFICACIONES
--1. Modifica la tabla estado_pago para eliminar la columna descripcio
alter table estado_pago drop column descripcion;

--2. Modifica la tabla farmaceutico para añadir un ampo numerico de 5 posiciones llamado num_colegiado.
alter table farmaceutico add (num_colegiado number(5));

