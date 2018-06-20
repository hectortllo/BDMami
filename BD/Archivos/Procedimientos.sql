delimiter //
DROP PROCEDURE IF EXISTS InsertarCliente //

CREATE PROCEDURE InsertarCliente(vNombre VARCHAR(45), vApellido VARCHAR(45),
	vIdDireccion INT, vDescripcion VARCHAR(200), vTelefono VARCHAR(12))
BEGIN
	DECLARE vIdCliente INT UNSIGNED DEFAULT 0;
    
	INSERT INTO cliente(nombre, apellido, descripcion, direccion_id)
    VALUES(vNombre, vApellido, vDescripcion, vIdDireccion);
    
    SELECT MAX(id) INTO vIdCliente FROM cliente;
    INSERT INTO telefono(telefono, cliente_id) VALUES(vTelefono, vIdCliente);
END; //
delimiter ;
