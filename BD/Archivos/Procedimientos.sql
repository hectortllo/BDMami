delimiter //
DROP PROCEDURE IF EXISTS InsertarClienteNuevo //
DROP PROCEDURE IF EXISTS InsertarCliente //
DROP PROCEDURE IF EXISTS InsertarProveedor //
DROP PROCEDURE IF EXISTS InsertarDireccion //

CREATE PROCEDURE InsertarClienteNuevo(vNombre VARCHAR(45), vApellido VARCHAR(45),
	vIdDireccion INT, vDescripcion VARCHAR(200), vTelefono VARCHAR(12))
BEGIN
	DECLARE vIdCliente INT UNSIGNED DEFAULT 0;
    
	INSERT INTO cliente(nombre, apellido, descripcion, direccion_id)
    VALUES(vNombre, vApellido, vDescripcion, vIdDireccion);
    
    SELECT MAX(id) INTO vIdCliente FROM cliente;
    INSERT INTO telefono(telefono, cliente_id) VALUES(vTelefono, vIdCliente);
END; //

CREATE PROCEDURE InsertarCliente(vNombre VARCHAR(45), vApellido VARCHAR(45),
	vIdDireccion INT, vDescripcion VARCHAR(200), vTelefono VARCHAR(12), vDeudaInicial FLOAT)
BEGIN
	DECLARE vIdCliente INT UNSIGNED DEFAULT 0;
    
	INSERT INTO cliente(nombre, apellido, descripcion, direccion_id)
    VALUES(vNombre, vApellido, vDescripcion, vIdDireccion);
    
    SELECT MAX(id) INTO vIdCliente FROM cliente;
    INSERT INTO telefono(telefono, cliente_id) VALUES(vTelefono, vIdCliente);
    
    INSERT INTO detalle_pago_venta(cliente_id, deuda_inicial, fecha_pago) VALUES(vIdCliente, vDeudaInicial, CURDATE());
END; //

CREATE PROCEDURE InsertarProveedor(vNombre VARCHAR(45), vApellido VARCHAR(45),
	vIdDireccion INT, vDescripcion VARCHAR(200), vTelefono VARCHAR(12), vDeudaInicial FLOAT)
BEGIN
	DECLARE vIdProveedor INT UNSIGNED DEFAULT 0;
    
	INSERT INTO proveedor(nombre, apellido, descripcion, direccion_id)
    VALUES(vNombre, vApellido, vDescripcion, vIdDireccion);
    
    SELECT MAX(id) INTO vIdProveedor FROM proveedor;
    INSERT INTO telefono(telefono, proveedor_id) VALUES(vTelefono, vIdProveedor);
    
    INSERT INTO detalle_pago_compra(proveedor_id, deuda_inicial, fecha_pago) VALUES(vIdProveedor, vDeudaInicial, CURDATE());
END; //

CREATE PROCEDURE InsertarDireccion(Direccion VARCHAR(60))
BEGIN
	    
	INSERT INTO direccion(direccion) VALUE(Direccion);
    
END; //
delimiter ;
