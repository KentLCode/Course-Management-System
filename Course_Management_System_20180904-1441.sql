-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema course_management_system
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `course_management_system` ;

-- -----------------------------------------------------
-- Schema course_management_system
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `course_management_system` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `course_management_system` ;

-- -----------------------------------------------------
-- Table `course_management_system`.`participants`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `course_management_system`.`participants` ;

CREATE TABLE IF NOT EXISTS `course_management_system`.`participants` (
  `Student_ID` VARCHAR(9) NOT NULL,
  `Student_first_name` VARCHAR(20) NOT NULL,
  `Student_last_name` VARCHAR(20) NOT NULL,
  `Participant_ID` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`Participant_ID`))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
