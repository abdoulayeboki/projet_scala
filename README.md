prerequis pour lancer le projet 

 . installer sbt dans la machine et dans l'éditeur telque intellij ou vs code

 . installer mySQL avec cette commande
    sudo apt install mysql-server
    la version configurer de mysQSL est :
        version: 8.0.22

 . creer un utilisateur "admin" et password "admin" mySQL avec ces commande
       CREATE USER 'admin'@'localhost' IDENTIFIED WITH mysql_native_password BY 'admin';
       GRANT ALL ON *.* TO 'admin'@'localhost';


