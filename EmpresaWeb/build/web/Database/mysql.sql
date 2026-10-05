CREATE Database Empresa;

USE Empresa;

CREATE TABLE 	Empleados (
  Id int AUTO_INCREMENT PRIMARY KEY,
  
  Nombre varchar(100) NOT NULL,
  Departamento varchar(100) NOT NULL
);

INSERT INTO Empleados(Nombre, Departamento)
VALUES ('Lucia', 'Informatica');

INSERT INTO Empleados (Nombre, Departamento)
VALUES ('Gabriela', 'Medico');

SELECT * FROM Empleados;