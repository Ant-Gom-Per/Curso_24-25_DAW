--PARTE 1
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


--Modificaciones
--1. Modifica la tabla estado_pago para eliminar la columna descripcio
alter table estado_pago drop column descripcion;

--2. Modifica la tabla farmaceutico para añadir un ampo numerico de 5 posiciones llamado num_colegiado.
alter table farmaceutico add (num_colegiado number(5));


--PARTE2
--1. Insercion de datos

insert into cliente values (1,'Jesica Sanchez', to_date('27/11/1985', 'DD/MM/YYYY'), 0001000200030004, to_date('25/10/2023', 'DD/MM/YYYY'));
insert into cliente values (2,'Miguel Sanchez', to_date('20/03/1978', 'DD/MM/YYYY'), 1110222033304440, to_date('29/11/2023', 'DD/MM/YYYY'));
insert into cliente values (3,'Inma Climent', to_date('09/09/1985', 'DD/MM/YYYY'),  2542028350210245, to_date('11/12/2023', 'DD/MM/YYYY'));
insert into cliente values (4,'Laura Perez', to_date('10/09/1986', 'DD/MM/YYYY'),  3458215011125024, to_date('15/10/2023', 'DD/MM/YYYY'));

insert into farmaceutico (id, nombre) values (1,'Carlos Milla');
insert into farmaceutico (id, nombre) values (2,'Carlos Coves');
insert into farmaceutico (id, nombre) values (3,'Laura Poveda');
insert into farmaceutico (id, nombre) values (4,'Adela Candel');

insert into preescripcion (id, id_cli, id_farm, fecha_pree) values (1, 1, 2, to_date('07/03/2023', 'DD/MM/YYYY'));
insert into preescripcion (id, id_cli, id_farm, fecha_pree) values (2, 1, 2, to_date('08/03/2023', 'DD/MM/YYYY'));
insert into preescripcion (id, id_cli, id_farm) values (3, 2, 1);
insert into preescripcion (id, id_cli, id_farm, fecha_pree) values (4, 3, 3, to_date('15/04/2023', 'DD/MM/YYYY'));
insert into preescripcion (id, id_cli, id_farm, fecha_pree) values (5, 3, 1, to_date('12/03/2023', 'DD/MM/YYYY'));
insert into preescripcion (id, id_cli, id_farm) values (6, 2, 2);

--2. Borra las preescripciones del dia 09/03/2023
delete from preescripcion where fecha_pree=to_date('09/03/2023', 'DD/MM/YYYY');

--3. Modifica el cliente 2 para que su nombre completo sea 'Miguel Sanchez Molina'
update cliente set nombre='Miguel Sanchez Molina' where id=2 and nombre='Miguel Sanchez';












