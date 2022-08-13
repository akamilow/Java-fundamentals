CREATE TABLE producto (
    pro_id INT PRIMARY KEY,
    pro_nombre VARCHAR(255),
    pro_precio INT,
    pro_descripcion LONGTEXT,
    pro_fecha_vencimiento DATE
);
INSERT INTO producto VALUES (1, "galletas unaleñas", 1200, "galletas unaleñas de chocolate", "2021-10-25");
INSERT INTO producto VALUES (2, "agua unaleña", 1200, "agua manantial unaleña", "2021-11-25");
INSERT INTO producto VALUES (3, "gaseosa unaleña", 3500, "gaseosa unaleñas de manzana", "2021-08-20");