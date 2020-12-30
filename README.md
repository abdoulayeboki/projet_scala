Membre de l'equipe 
----------------------------------

Abdoulaye SARR Master Big DATA
Aissatou DIOP  Master  Big data
---------------------------------


------------------------------------------------------------------
prerequis pour lancer le projet 

 . installer sbt dans la machine et dans l'éditeur telque intellij ou vs code

 . installer mySQL avec cette commande
    sudo apt install mysql-server
    la version configurer de mysQSL est :
        version: 8.0.22

 . creer un utilisateur "admin" et password "admin" mySQL avec ces commande
       CREATE USER 'admin'@'localhost' IDENTIFIED WITH mysql_native_password BY 'admin';
       GRANT ALL ON *.* TO 'admin'@'localhost';


  . Installer angular avec ces commandes 
       . npm install -g @angular/cli

  importer la base de donnée projetScala.sql trouvant dans la racine du projet 

------------------------------------------------------------------------------


-----------------------------------------------------------------------------
--- lancer le projet en utilisant la ligne de commande avec :
    -- sbt run 