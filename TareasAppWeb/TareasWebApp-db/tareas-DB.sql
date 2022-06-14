-- Creación de la base de datos 'tareas-DB' --
CREATE SCHEMA `tareas-DB` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci;

-- Creación de la tabla 'tarea' --
CREATE TABLE `tareas-DB`.`tarea` (
  `idtarea` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(255) NULL,
  `descripcion` LONGTEXT NULL,
  `fechacreacion` DATETIME NULL,
  `fechaactualizacion` DATETIME NULL,
  `fechaeliminacion` DATETIME NULL,
  `estado` CHAR(1) NULL,
  `eliminado` CHAR(1) NULL,
  `secuencia` INT NULL,
  `subtarea` INT NULL,
  PRIMARY KEY (`idtarea`));
  
  