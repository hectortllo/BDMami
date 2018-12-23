delimiter //
DROP PROCEDURE IF EXISTS InsertarCliente //
DROP PROCEDURE IF EXISTS InsertarProveedor //
DROP PROCEDURE IF EXISTS InsertarDireccion //
DROP PROCEDURE IF EXISTS InsertarProducto //
DROP PROCEDURE IF EXISTS InsertarCompra //
DROP PROCEDURE IF EXISTS InsertarLugar //
DROP PROCEDURE IF EXISTS InsertarViajeTapachula //
DROP PROCEDURE IF EXISTS InsertarFechaViajeTapachula //
CREATE PROCEDURE InsertarCliente(vNombre VARCHAR(45), vApellido VARCHAR(45),
	vIdDireccion INT, vDescripcion VARCHAR(200), vTelefono VARCHAR(12), vDeudaInicial FLOAT)
BEGIN
	DECLARE vIdCliente INT UNSIGNED DEFAULT 0;
    
	INSERT INTO cliente(nombre, apellido, descripcion, direccion_id)
    VALUES(vNombre, vApellido, vDescripcion, vIdDireccion);
    
    SELECT MAX(id) INTO vIdCliente FROM cliente;
    INSERT INTO telefono(telefono, cliente_id) VALUES(vTelefono, vIdCliente);
    
    INSERT INTO detalle_pago_venta(cliente_id, deuda_inicial, deuda_actual, fecha_pago) 
    VALUES(vIdCliente, vDeudaInicial, vDeudaInicial, CURDATE());
END; //

CREATE PROCEDURE InsertarProveedor(vNombre VARCHAR(45), vApellido VARCHAR(45),
	vIdDireccion INT, vDescripcion VARCHAR(200), vTelefono VARCHAR(12), vDeudaInicial FLOAT)
BEGIN
	DECLARE vIdProveedor INT UNSIGNED DEFAULT 0;
    
	INSERT INTO proveedor(nombre, apellido, descripcion, direccion_id)
    VALUES(vNombre, vApellido, vDescripcion, vIdDireccion);
    
    SELECT MAX(id) INTO vIdProveedor FROM proveedor;
    INSERT INTO telefono(telefono, proveedor_id) VALUES(vTelefono, vIdProveedor);
    
    INSERT INTO detalle_pago_compra(proveedor_id, deuda_inicial, deuda_actual, fecha_pago) VALUES(vIdProveedor, vDeudaInicial, vDeudaInicial, CURDATE());
END; //

CREATE PROCEDURE InsertarDireccion(Direccion VARCHAR(60))
BEGIN
	    
	INSERT INTO direccion(direccion) VALUE(Direccion);
    
END; //

CREATE PROCEDURE InsertarCompra(vMonto FLOAT)
BEGIN
	INSERT INTO compra(monto, fecha) VALUES(vMonto, NOW());
END; //

CREATE PROCEDURE InsertarProducto(vNombre VARCHAR(45), vCantidad INT, vPrecio FLOAT, vCosto FLOAT, 
					vDescripcion VARCHAR(200), vPresentacion VARCHAR(45), vProveedorId INT, vTipoCompra BOOLEAN,
                    vFinalizado BOOLEAN)
BEGIN
	DECLARE vIdProductos INT UNSIGNED DEFAULT 0;
    DECLARE vIdCompra INT UNSIGNED DEFAULT 0;
    
	INSERT INTO productos(nombre, cantidad, precio_venta, precio_compra, descripcion, presentacion, tipo_compra, 
			finalizado) VALUES(vNombre, vCantidad, vPrecio, vCosto, vDescripcion, vPresentacion, vTipoCompra,
            vFinalizado);
    
    SELECT MAX(id) INTO vIdProductos FROM productos;
    SELECT MAX(id) INTO vIdCompra FROM compra;
    INSERT INTO detalle_compra(compra_id, productos_id, proveedor_id) 
		VALUES(vIdCompra, vIdProductos, vProveedorId);
END; //

CREATE PROCEDURE InsertarLugar(Lugar VARCHAR(45))
BEGIN
	    
	INSERT INTO lugar_tapachula(lugar) VALUE(Lugar);
    
END; //

CREATE PROCEDURE InsertarFechaViajeTapachula(vFecha DATE)
BEGIN
	INSERT INTO viajes_tapachula(fecha) VALUE(vFecha);
END; //

CREATE PROCEDURE InsertarViajeTapachula(vLugarTapachulaId INT, vDescripcion VARCHAR(300))
BEGIN
	DECLARE vIdViajeTapachula INT UNSIGNED DEFAULT 0;
    
    SELECT MAX(id) INTO vIdViajeTapachula FROM viajes_tapachula;
    
	INSERT INTO detalle_tapachula(viajes_tapachula_id, lugar_tapachula_id, descripcion) 
		VALUES(vIdViajeTapachula, vLugarTapachulaId, vDescripcion);
END; //
delimiter ;