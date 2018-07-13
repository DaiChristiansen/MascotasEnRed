drop database mascotaenred;
create database  IF NOT EXISTS mascotaenred;


CREATE TABLE IF NOT EXISTS `mascotaenred`.`denunciante` (
  `dni` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `direccion` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`dni`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;



CREATE TABLE IF NOT EXISTS `mascotaenred`.`mascota` (
  `idMascota` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `tipoMascota` VARCHAR(45) NOT NULL,
  `raza` VARCHAR(45) NOT NULL,
  `color` VARCHAR(45) NOT NULL,
  `caracteristicasEspeciales` VARCHAR(45) NOT NULL,
  `tamanio` VARCHAR(45) NOT NULL,
  `zona` VARCHAR(45) NOT NULL,
  `estado` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idMascota`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


CREATE TABLE IF NOT EXISTS `mascotaenred`.`telefono` (
  `idTelefono` INT NOT NULL,
  `area` INT NOT NULL,
  `telefono` INT NOT NULL,
  `tipo` VARCHAR(45) NOT NULL,
  `denunciante_dni` INT NOT NULL,
  PRIMARY KEY (`idTelefono`),
  INDEX `fk_telefono_denunciante_idx` (`denunciante_dni` ASC),
  CONSTRAINT `fk_telefono_denunciante`
    FOREIGN KEY (`denunciante_dni`)
    REFERENCES `mascotaenred`.`denunciante` (`dni`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `mascotaenred`.`denuncia` (
  `nroDenuncia` INT NOT NULL DEFAULT 0,
  `tipoDenuncia` INT NOT NULL,
  `fecha` DATE NOT NULL,
  `mascota_idMascota` INT NOT NULL,
  PRIMARY KEY (`nroDenuncia`),
  INDEX `fk_denuncia_mascota1_idx` (`mascota_idMascota` ASC),
  CONSTRAINT `fk_denuncia_mascota1`
    FOREIGN KEY (`mascota_idMascota`)
    REFERENCES `mascotaenred`.`mascota` (`idMascota`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `mascotaenred`.`comprobante` (
  `nroComprobante` INT NOT NULL AUTO_INCREMENT,
  `tipoComprobante` INT NOT NULL,
  `nombreComprobante` VARCHAR(45) NOT NULL,
  `denunciante_dni` INT NOT NULL,
  `denuncia_nroDenuncia` INT NOT NULL,
  PRIMARY KEY (`nroComprobante`),
  INDEX `fk_comprobante_denunciante1_idx` (`denunciante_dni` ASC),
  INDEX `fk_comprobante_denuncia1_idx` (`denuncia_nroDenuncia` ASC),
  CONSTRAINT `fk_comprobante_denunciante1`
    FOREIGN KEY (`denunciante_dni`)
    REFERENCES `mascotaenred`.`denunciante` (`dni`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_comprobante_denuncia1`
    FOREIGN KEY (`denuncia_nroDenuncia`)
    REFERENCES `mascotaenred`.`denuncia` (`nroDenuncia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


INSERT INTO `mascotaenred`.`denunciante` (`dni`, `nombre`, `apellido`, `direccion`, `email`) VALUES (4, 'Carlos', 'Gerez', 'Calle Falsa 123', 'notiene@notiene.com');

INSERT INTO `mascotaenred`.`telefono` (`idTelefono`, `area`, `telefono`, `tipo`, `denunciante_dni`) VALUES (1, 249, 312312, '2', 4);


