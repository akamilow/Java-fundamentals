CREATE TABLE producto_factura (
	profac_id INT PRIMARY KEY,
	profac_cantidad INT,
    fac_id INT,
	prod_id INT,
    CONSTRAINT producto_factura_fk0 FOREIGN KEY (fac_id) REFERENCES factura(fac_id),
    CONSTRAINT producto_factura_fk1 FOREIGN KEY (prod_id) REFERENCES producto(pro_id)
);
INSERT INTO producto_factura VALUES (1, 5, 1, 1);
INSERT INTO producto_factura VALUES (2, 10, 1, 2);
INSERT INTO producto_factura VALUES (3, 15, 1, 3);
INSERT INTO producto_factura VALUES (4, 22, 2, 1);
INSERT INTO producto_factura VALUES (5, 25, 2, 2);
INSERT INTO producto_factura VALUES (6, 31, 2, 3);
INSERT INTO producto_factura VALUES (7, 35, 3, 1);
INSERT INTO producto_factura VALUES (8, 44, 3, 2);
INSERT INTO producto_factura VALUES (9, 1, 3, 3);