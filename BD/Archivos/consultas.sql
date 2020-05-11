/*Consulta usada para ver datos de los clientes */
SELECT cliente.id AS num, cliente.nombre AS nombre, cliente.apellido AS apellido, cliente.descripcion AS descrip, 
		direccion.direccion AS direccion, detalle_pago_venta.deuda_actual AS deuda, 
        telefono.telefono AS telefono FROM cliente 
        INNER JOIN direccion ON direccion.id = cliente.direccion_id INNER JOIN detalle_pago_venta ON 
        cliente.id = detalle_pago_venta.cliente_id INNER JOIN telefono ON telefono.cliente_id = cliente.id
        WHERE direccion = "San Francisco Zapotitlán";

/*Consulta usada para insertar en la tabla detalle_pago_venta */        
INSERT INTO detalle_pago_venta(cliente_id, deuda_actual, deuda_inicial, fecha_pago, descripcion)
		VALUES(1, 300, 100, "2018/10/20", "Venta de desodorantes");
        
/*Consulta usada para ver datos de los proveedores */
SELECT proveedor.id AS num, proveedor.nombre AS nombre, proveedor.apellido AS apellido, proveedor.descripcion AS descrip,
			direccion.direccion AS direccion, detalle_pago_compra.deuda_actual AS deuda, telefono.telefono AS telefono 
			FROM proveedor INNER JOIN direccion ON direccion.id = proveedor.direccion_id INNER JOIN detalle_pago_compra
			ON detalle_pago_compra.proveedor_id = proveedor.id INNER JOIN telefono ON telefono.proveedor_id = proveedor.id;
	
SELECT * FROM viajes_tapachula;
SELECT * from detalle_pago_compra;

SELECT viajes_tapachula.id AS num, viajes_tapachula.fecha AS fecha, lugar_tapachula.lugar AS lugar, 
	detalle_tapachula.descripcion AS
	descripcion	FROM viajes_tapachula INNER JOIN detalle_tapachula
    ON viajes_tapachula.id = detalle_tapachula.viajes_tapachula_id INNER JOIN 
    lugar_tapachula ON lugar_tapachula.id = detalle_tapachula.lugar_tapachula_id WHERE YEAR(fecha) = "2018" AND
    MONTH(fecha) = "12" GROUP BY num;
    
SELECT * FROM viajes_tapachula;
SELECT * FROM detalle_tapachula;

SELECT * FROM viajes_tapachula;
DELETE FROM viajes_tapachula WHERE id=9;
SELECT YEAR(viajes_tapachula.fecha) FROM viajes_tapachula GROUP BY YEAR(viajes_tapachula.fecha);
SELECT * FROM usuario;
SELECT cliente.id AS num, cliente.nombre AS nombre, cliente.apellido AS apellido, 
	cliente.descripcion AS descp, telefono.telefono AS telefono, direccion.direccion AS direccion,
	detalle_pago_venta.deuda_actual AS deuda FROM cliente INNER JOIN telefono 
    ON telefono.cliente_id = cliente.id INNER JOIN direccion ON
    direccion.id = cliente.direccion_id INNER JOIN detalle_pago_venta 
    ON detalle_pago_venta.cliente_id = cliente.id WHERE cliente.id = 1;
    
SELECT proveedor.id AS num, proveedor.nombre AS nombre, proveedor.apellido AS apellido,
	proveedor.descripcion AS descp, telefono.telefono AS telefono, direccion.direccion AS direccion,
    detalle_pago_compra.deuda_actual AS deuda FROM proveedor INNER JOIN telefono ON
    telefono.proveedor_id = proveedor.id INNER JOIN direccion ON direccion.id = proveedor.direccion_id
    INNER JOIN detalle_pago_compra ON detalle_pago_compra.proveedor_id = proveedor.id
    WHERE proveedor.id = 2;


SELECT viajes_tapachula.id AS num, viajes_tapachula.fecha AS fecha, COUNT(detalle_tapachula.lugar_tapachula_id)
	AS lugares FROM viajes_tapachula INNER JOIN detalle_tapachula 
    ON viajes_tapachula.id = detalle_tapachula.viajes_tapachula_id WHERE YEAR(fecha) = 2018 
    AND MONTH(fecha) = 12 GROUP BY viajes_tapachula.id;

SELECT viajes_tapachula.id AS num, viajes_tapachula.fecha AS fecha, COUNT(detalle_tapachula.lugar_tapachula_id)
	AS lugares FROM viajes_tapachula INNER JOIN detalle_tapachula 
    ON viajes_tapachula.id = detalle_tapachula.viajes_tapachula_id GROUP BY viajes_tapachula.id;

SELECT viajes_tapachula.id AS num, viajes_tapachula.fecha AS fecha, 
		detalle_tapachula.descripcion AS descp, lugar_tapachula.lugar AS lugar 
        FROM viajes_tapachula INNER JOIN detalle_tapachula ON
        detalle_tapachula.viajes_tapachula_id = viajes_tapachula.id INNER JOIN lugar_tapachula ON
        detalle_tapachula.lugar_tapachula_id = lugar_tapachula.id WHERE viajes_tapachula.id = 5;
        
/* Consulta usada para ver las compras hechas */
SELECT compra.id AS num, DATE_FORMAT(compra.fecha,'%d/%m/%Y') AS fecha, compra.monto AS total, 
		compra.monto_contado AS totalCont, 
		compra.monto_credito AS totalCred, COUNT(detalle_compra.productos_id) AS productos, 
        COUNT(DISTINCT proveedor_id) AS proveedores
        FROM compra INNER JOIN detalle_compra ON 
        detalle_compra.compra_id = compra.id GROUP BY compra.id;

/* Consulta usada para ver el detalle de las compras hechas*/
SELECT productos.nombre AS nombre, productos.descripcion AS descp, productos.precio_compra AS precio, 
		productos.cantidad AS cantidad, productos.presentacion AS pres, productos.precio_venta AS costo,
        productos.tipo_compra AS tipo, productos.finalizado AS fin, proveedor.nombre AS nombre, 
        proveedor.apellido AS apellido FROM productos INNER JOIN detalle_compra ON 
        productos.id = detalle_compra.productos_id INNER JOIN proveedor 
        ON proveedor.id = detalle_compra.proveedor_id WHERE detalle_compra.compra_id = 5;
        
SELECT * FROM detalle_pago_compra;
SELECT * FROM cliente WHERE id = 1;
SELECT * FROM compra;
UPDATE compra SET monto_contado = 200 WHERE compra.id = 2;