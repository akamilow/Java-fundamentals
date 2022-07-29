CREATE TABLE cliente (
	cli_id INT PRIMARY KEY,
	cli_nombre VARCHAR(255),
	cli_apellido VARCHAR(255),
	cli_nacionalidad VARCHAR(255),
	cli_correo VARCHAR(255)
);
INSERT INTO cliente VALUES (1, "juan", "perez", "colombiana", "jperez@micorreo.com");
INSERT INTO cliente VALUES (2, "pedro", "martinez", "colombiana", "pmartinez@micorreo.com");
INSERT INTO cliente VALUES (3, "maria", "lara", "colombiana", "mlara@micorreo.com");