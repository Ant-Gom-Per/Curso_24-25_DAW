--Borrado de tablas
DROP TABLE Empleats CASCADE CONSTRAINTS;
DROP TABLE Oficines CASCADE CONSTRAINTS;

--Creado de tablas
CREATE TABLE Empleats(
    numemp NUMBER(20),
    nom VARCHAR2(100),
    edat NUMBER,
    oficina NUMBER(20),
    ocupacio VARCHAR2(200),
    contracte DATE
);

CREATE TABLE Oficines(
    oficina NUMBER(20),
    ciutat VARCHAR2(100),
    superficie number(20),
    vendes NUMBER(20)
);

--Inserción de claves primárias

ALTER TABLE Empleats ADD CONSTRAINT pk_Empleats PRIMARY KEY (numemp);
ALTER TABLE Oficines ADD CONSTRAINT pk_Oficines PRIMARY KEY (Oficina);

--Inserción claves ajenas
ALTER TABLE Empleats ADD CONSTRAINT fk_Empleats_Oficina FOREIGN KEY (Oficina) REFERENCES Oficines(oficina);




SELECT * FROM Empleats;
SELECT * FROM Oficines;

INSERT INTO Empleats VALUES (1,'Benito Camelas Bolas', 45,23, 'Encarcago de limpieza', to_date('04/02/2015','DD/MM/YYYY'));
INSERT INTO Empleats VALUES (2,'Elena Nito del Bosque', 33,23, 'Secretaria', to_date('04/02/2015','DD/MM/YYYY'));

INSERT INTO Oficines VALUES (23,'Lepe', 500, 1000000);
