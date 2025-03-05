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
