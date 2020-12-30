
CREATE TABLE IF NOT EXISTS `projetScala`.`grade` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `libelle` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
  )
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;



CREATE TABLE IF NOT EXISTS `projetScala`.`salle` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `libelle` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
  )
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;


CREATE TABLE IF NOT EXISTS `projetScala`.`matiere` (
  `codeMatiere` VARCHAR(45) NOT NULL ,
  `libelle` VARCHAR(45) NULL DEFAULT NULL,
  `coefficient` INT(15) NOT NULL ,
  PRIMARY KEY (`codeMatiere`)
  )
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;


CREATE TABLE IF NOT EXISTS `projetScala`.`classe` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `libelle` VARCHAR(45) NULL DEFAULT NULL,
  `id_niveau` INT(11),
  PRIMARY KEY (`id`)
  )
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;
ALTER TABLE `projetScala`.`classe` ADD CONSTRAINT FOREIGN KEY  (id_niveau) REFERENCES  
   `projetScala`.`niveau`(id);

 CREATE TABLE IF NOT EXISTS `projetScala`.`etudiant` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `nom` VARCHAR(45) NULL DEFAULT NULL,
  `prenom` VARCHAR(45) NULL DEFAULT NULL,
  `id_classe` INT(11),
  PRIMARY KEY (`id`)
  )
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;
ALTER TABLE `projetScala`.`etudiant` ADD CONSTRAINT FOREIGN KEY  (id_classe) REFERENCES  
   `projetScala`.`classe`(id);

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

CREATE TABLE IF NOT EXISTS `projetScala`.`niveau` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `libelle` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
  )
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8



 CREATE TABLE IF NOT EXISTS `projetScala`.`cours` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `date_debut` Datetime NULL DEFAULT NULL,
  `date_fin` Datetime NULL DEFAULT NULL,
  `id_professeur` INT(11),
  `id_classe` INT(11),
  `id_salle` INT(11),
  PRIMARY KEY (`id`)
  )
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;
ALTER TABLE `projetScala`.`cours` ADD CONSTRAINT FOREIGN KEY  (id_professeur) REFERENCES  
   `projetScala`.`professeur`(id);
ALTER TABLE `projetScala`.`cours` ADD CONSTRAINT FOREIGN KEY  (id_classe) REFERENCES  
   `projetScala`.`classe`(id);
ALTER TABLE `projetScala`.`cours` ADD CONSTRAINT FOREIGN KEY  (id_salle) REFERENCES  
   `projetScala`.`salle`(id);

-- # etudiant

-- CREATE TABLE IF NOT EXISTS `projetScala`.`etudiant` (
--   `id` INT(11) NOT NULL AUTO_INCREMENT,
--   `nom` VARCHAR(45) NULL DEFAULT NULL,
--   `prenom` VARCHAR(45) NULL DEFAULT NULL,
--   PRIMARY KEY (`id`)
--   )
-- AUTO_INCREMENT = 2
-- DEFAULT CHARACTER SET = utf8