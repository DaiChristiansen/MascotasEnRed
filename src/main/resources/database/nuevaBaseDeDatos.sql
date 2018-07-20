/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Usuario
 * Created: 17/07/2018
 */
drop database if exists mascotaenred;
create database  IF NOT EXISTS mascotaenred;

CREATE TABLE IF NOT EXISTS `mascotaenred`.`denunciante` (
  
  `dni` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `direccion` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
   `telefono` long NOT NULL,
  
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
 `denunciante_dni` int(11) NOT NULL,
  PRIMARY KEY (`idMascota`),
 INDEX `fk_mascota_denunciante1_idx` (`denunciante_dni` ASC),
  CONSTRAINT `fk_mascota_denunciante1`
    FOREIGN KEY (`denunciante_dni`)
    REFERENCES `mascotaenred`.`denunciante` (`dni`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;



CREATE TABLE IF NOT EXISTS `mascotaenred`.`denuncia` (
  `nroDenuncia` INT NOT NULL,
  `tipoDenuncia` varchar(15),
  `fecha` DATE NOT NULL,
  `mascota_idMascota` INT NOT NULL,
  `denunciante_dni` int(11) NOT NULL,
  PRIMARY KEY (`nroDenuncia`),
 INDEX `fk_denuncia_denunciante1_idx` (`denunciante_dni` ASC),
  INDEX `fk_denuncia_mascota1_idx` (`mascota_idMascota` ASC),
  CONSTRAINT `fk_denuncia_denunciante1`
    FOREIGN KEY (`denunciante_dni`)
    REFERENCES `mascotaenred`.`denunciante` (`dni`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_denuncia_mascota1`
    FOREIGN KEY (`mascota_idMascota`)
    REFERENCES `mascotaenred`.`mascota` (`idMascota`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

use mascotaenred;

insert into denunciante(dni,nombre,apellido,direccion,email,telefono) values (14567894,"maria","gomez","belgrano 370","maria@hotmail.com","2494356789");
insert into denunciante(dni,nombre,apellido,direccion,email,telefono) values (23456766,"juan","perez","saavedra 1400","juan@hotmail.com","2494660897");
insert into denunciante(dni,nombre,apellido,direccion,email,telefono) values (35422356,"laura","fernandez","roca 1567","laura@hotmail.com","2494023455");
insert into denunciante(dni,nombre,apellido,direccion,email,telefono) values (20121345,"pedro","ruiz","haiti 1554","pedro@hotmail.com","2494223244");
insert into denunciante(dni,nombre,apellido,direccion,email,telefono) values (31445289,"valeria","lopez","mitre 654","valeria@hotmail.com","2494034433");
insert into denunciante(dni,nombre,apellido,direccion,email,telefono) values (12111375,"carlos","rodriguez","las heras 1300","jorge@hotmail.com","2494299876");
insert into denunciante(dni,nombre,apellido,direccion,email,telefono) values (33136670,"martina","lorenzo","11 de septiembre 1565","martina@hotmail.com","2494678811");
insert into denunciante(dni,nombre,apellido,direccion,email,telefono) values (28666429,"manuel","rivas","colombia 678","manuel@hotmail.com","2494097128");
insert into denunciante(dni,nombre,apellido,direccion,email,telefono) values (31890777,"lucia","cortez","franklin 222","lucia@hotmail.com","2494987766");
insert into denunciante(dni,nombre,apellido,direccion,email,telefono) values (11234567,"mario","hernandez","quintana 654","mario@hotmail.com","2494712131");

insert into mascota(idMAscota,nombre,tipoMascota,raza,color,caracteristicasEspeciales,tamanio,zona,estado,denunciante_dni)values(1,"otto","perro","mestizo","negro","collar verde","pequeño","estacion","perdido",33136670);
insert into mascota(idMAscota,nombre,tipoMascota,raza,color,caracteristicasEspeciales,tamanio,zona,estado,denunciante_dni)values(2,"","perro","caniche","blanco","collar rosa","pequeño","centro","encontrado",11234567);
insert into mascota(idMAscota,nombre,tipoMascota,raza,color,caracteristicasEspeciales,tamanio,zona,estado,denunciante_dni)values(3,"tito","gato","","marron oscuro","","pequeño","centro","registrado",12111375);
insert into mascota(idMAscota,nombre,tipoMascota,raza,color,caracteristicasEspeciales,tamanio,zona,estado,denunciante_dni)values(4,"loki","gato","","negro","collar azul","grande","","perdido",31890777);
insert into mascota(idMAscota,nombre,tipoMascota,raza,color,caracteristicasEspeciales,tamanio,zona,estado,denunciante_dni)values(5,"","perro","coli","marron","collar rojo","grande","villa italia","encontrado",20121345);
insert into mascota(idMAscota,nombre,tipoMascota,raza,color,caracteristicasEspeciales,tamanio,zona,estado,denunciante_dni)values(6,"cata","gato","","blanco","pecho negro","mediano","","registrado",28666429);
insert into mascota(idMAscota,nombre,tipoMascota,raza,color,caracteristicasEspeciales,tamanio,zona,estado,denunciante_dni)values(7,"nube","conejo","","blanco","","pequeño","cerrito","perdido",31445289);
insert into mascota(idMAscota,nombre,tipoMascota,raza,color,caracteristicasEspeciales,tamanio,zona,estado,denunciante_dni)values(8,"","perro","mestizo","blanco","collar negro","mediano","dique","encontrado",35422356);
insert into mascota(idMAscota,nombre,tipoMascota,raza,color,caracteristicasEspeciales,tamanio,zona,estado,denunciante_dni)values(9,"pipi","perro","policia","negro","cola corta","grande","zona golf","perdido",14567894);
insert into mascota(idMAscota,nombre,tipoMascota,raza,color,caracteristicasEspeciales,tamanio,zona,estado,denunciante_dni)values(10,"","perro","beagle","marron claro","collar rosa","mediano","centro","encontrado",23456766);

insert into denuncia(nroDenuncia,tipoDenuncia,fecha,mascota_idMascota,denunciante_dni)values(1,"perdido","2018-03-12",1,33136670);
insert into denuncia(nroDenuncia,tipoDenuncia,fecha,mascota_idMascota,denunciante_dni)values(2,"encontrado","2018-04-06",2,11234567);
insert into denuncia(nroDenuncia,tipoDenuncia,fecha,mascota_idMascota,denunciante_dni)values(3,"perdido","2018-04-11",4,31890777);
insert into denuncia(nroDenuncia,tipoDenuncia,fecha,mascota_idMascota,denunciante_dni)values(4,"encontrado","2018-05-12",5,20121345);
insert into denuncia(nroDenuncia,tipoDenuncia,fecha,mascota_idMascota,denunciante_dni)values(5,"perdido","2018-05-22",7,31445289);
insert into denuncia(nroDenuncia,tipoDenuncia,fecha,mascota_idMascota,denunciante_dni)values(6,"encontrado","2018-06-10",8,35422356);
insert into denuncia(nroDenuncia,tipoDenuncia,fecha,mascota_idMascota,denunciante_dni)values(7,"perdido","2018-07-11",9,14567894);
insert into denuncia(nroDenuncia,tipoDenuncia,fecha,mascota_idMascota,denunciante_dni)values(8,"encontrado","2018-07-19",10,23456766);