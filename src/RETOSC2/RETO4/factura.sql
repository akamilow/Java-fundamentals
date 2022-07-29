CREATE TABLE factura (
	fac_id INT PRIMARY KEY,
	fac_nombre_empresa VARCHAR(255),
	fac_fecha DATETIME,
	fac_ciudad VARCHAR(255),
	cli_id INT,
    CONSTRAINT factura_fk FOREIGN KEY (cli_id) REFERENCES cliente(cli_id)
);
INSERT INTO factura VALUES (1, "tienda unaleña", "2021-08-25", "bogota", 1);
INSERT INTO factura VALUES (2, "tienda unaleña", "2021-08-26", "bogota", 2);
INSERT INTO factura VALUES (3, "tienda unaleña", "2021-08-27", "bogota", 3);
