
CREATE TABLE IF NOT EXISTS `projetScala`.`grade` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `libelle` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
  )
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;


-- CREATE TABLE IF NOT EXISTS `projetScala`.`classe` (
--   `id` INT(11) NOT NULL AUTO_INCREMENT,
--   `libelle` VARCHAR(45) NULL DEFAULT NULL,
--   `id_niveau` INT(11),
--   PRIMARY KEY (`id`)
--   )
-- AUTO_INCREMENT = 2
-- DEFAULT CHARACTER SET = utf8;
-- ALTER TABLE `projetScala`.`classe` ADD CONSTRAINT FOREIGN KEY  (id_niveau) REFERENCES  
--    `projetScala`.`niveau`(id);

--  CREATE TABLE IF NOT EXISTS `projetScala`.`etudiant` (
--   `id` INT(11) NOT NULL AUTO_INCREMENT,
--   `nom` VARCHAR(45) NULL DEFAULT NULL,
--   `prenom` VARCHAR(45) NULL DEFAULT NULL,
--   `id_classe` INT(11),
--   PRIMARY KEY (`id`)
--   )
-- AUTO_INCREMENT = 2
-- DEFAULT CHARACTER SET = utf8;
-- ALTER TABLE `projetScala`.`etudiant` ADD CONSTRAINT FOREIGN KEY  (id_classe) REFERENCES  
--    `projetScala`.`classe`(id);

 CREATE TABLE IF NOT EXISTS `projetScala`.`professeur` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `nom` VARCHAR(45) NULL DEFAULT NULL,
  `prenom` VARCHAR(45) NULL DEFAULT NULL,
  `id_grade` INT(11),
  PRIMARY KEY (`id`)
  )
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;
ALTER TABLE `projetScala`.`professeur` ADD CONSTRAINT FOREIGN KEY  (id_grade) REFERENCES  
   `projetScala`.`grade`(id);

-- CREATE TABLE IF NOT EXISTS `projetScala`.`niveau` (
--   `id` INT(11) NOT NULL AUTO_INCREMENT,
--   `libelle` VARCHAR(45) NULL DEFAULT NULL,
--   PRIMARY KEY (`id`)
--   )
-- AUTO_INCREMENT = 2
-- DEFAULT CHARACTER SET = utf8

-- # etudiant

-- CREATE TABLE IF NOT EXISTS `projetScala`.`etudiant` (
--   `id` INT(11) NOT NULL AUTO_INCREMENT,
--   `nom` VARCHAR(45) NULL DEFAULT NULL,
--   `prenom` VARCHAR(45) NULL DEFAULT NULL,
--   PRIMARY KEY (`id`)
--   )
-- AUTO_INCREMENT = 2
-- DEFAULT CHARACTER SET = utf8