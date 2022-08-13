UPDATE producto SET pro_fecha_vencimiento = "2021-08-31" WHERE pro_id = 2;
UPDATE producto SET pro_descripcion = "gaseosa unaleña de naranja" WHERE pro_id = 3;
DELETE FROM producto_factura WHERE prod_id = 1; /* usar joins */