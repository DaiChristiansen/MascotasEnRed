/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Usuario
 * Created: 17/07/2018
 */

drop database mascotaenred;
create database  IF NOT EXISTS mascotaenred;


CREATE TABLE IF NOT EXISTS `mascotaenred`.`denunciante` (
  `idDenunciante` int not null,
  `dni` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `direccion` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
   `telefono` long NOT NULL,
  PRIMARY KEY (`idDenunciante`))
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
 `idDenunciante` int(11) NOT NULL,
  PRIMARY KEY (`idMascota`),
  KEY `idDenunciante_idx` (`idDenunciante`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


CREATE TABLE IF NOT EXISTS `mascotaenred`.`denuncia` (
  `nroDenuncia` INT NOT NULL DEFAULT 0,
  `tipoDenuncia` INT NOT NULL,
  `fecha` DATE NOT NULL,
  `mascota_idMascota` INT NOT NULL,
  `denunciante_idDenunciante` int(11) NOT NULL,
  PRIMARY KEY (`nroDenuncia`),
 INDEX `fk_denuncia_denunciante1_idx` (`denunciante_idDenunciante` ASC),
  INDEX `fk_denuncia_mascota1_idx` (`mascota_idMascota` ASC),
  CONSTRAINT `fk_denuncia_denunciante1`
    FOREIGN KEY (`denunciante_idDenunciante`)
    REFERENCES `mascotaenred`.`denunciante` (`idDenunciante`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_denuncia_mascota1`
    FOREIGN KEY (`mascota_idMascota`)
    REFERENCES `mascotaenred`.`mascota` (`idMascota`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
