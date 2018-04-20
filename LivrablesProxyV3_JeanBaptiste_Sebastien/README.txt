
*************************************************************
*															*
*				Projet ProxiBanque - V3						*
*	Auteur : Sébastien JOUMARD  & Jean-Baptiste BLANC		*
*															*
*************************************************************	

1. Description de l'application

Le projet permet la gestion de clients via une interface web et de webServices.
Pour cela, les ressources utilisées sont : 
- un navigateur web (Chrome fortement recommandé),
- un serveur TOMCAT,
- une base de données MySql.

Fonctionnalités des web services: 
- Ajout/Suppression/Modification/Lecture de client;
- Lecture de l'ensemble des clients;
- Ajout/Suppression de comptes courants/épargnes associés à un client;


Fonctionnalités de l'IHM: 
	- Authentification du conseiller bancaire;
	- Afficher la liste des clients;
	- Affichage des données personnelles d'un client;
	- Modification de clients;
	- Ajout de nouveaux clients;
	- Suppression de clients et des comptes associés;
	- Ajout et suppression de comptes bancaires : courant et/ou epargne;
	- Les différents écrans consomment les web services;

	
	
2. Livrables

Le dossier "Sebastien_JeanBaptiste_ProxibanqueV3" contient les livrables suivants:
 - un fichier texte : "README.txt" : description globale de l'application;
 - un dossier : "JAVADOC". Se positionner dans le dossier puis lancer le fichier index.html pour consulter la javadoc;
 - un dossier "JBB_SJ_ProxiBanqueV3". Ce dernier comprend l'application Eclipse/Maven
 - un dossier "UML" : 
		. Diagramme_de_classes.png
		. Diagramme_de_cas_d.utilisation.png
		. Diagramme_de_deploiement.png	
 - un dossier "Maquette" : contient :
		. MockUp_Computer.pdf
		. MockUp_Phone.pdf
 - un fichier : "Flux WebServices REST.txt" qui contient la description des flux des WebServices
 
	
3. Installation du projet 

---------------- Démarrage  serveur APACHE, MySql --------------------------
- Ouvrir l'application XAMPP control panel
- Cliquer sur Start pour les applications APACHE et MySql

Le serveur Apache est en service et la base de données est accessible.

---------------- Import du dossier Eclipse -----------------

IMPORT DU PROJET MAVEN
- Copier le dossier "JBB_SJ_ProxiBanqueV3" dans votre workspace Eclipse.
- Ouvrir Eclipse. Dans la barre de navigation, cliquer sur "File" puis "Import" puis "Existing Maven Projects"
- Cliquer sur le bouton "Browse...", et récupérer le dossier précédemment collé dans votre workspace. Cliquer sur le bouton "Finish".

AJOUT DU SERVEUR
- Dans la barre de navigation, cliquer sur "File" puis "New" et "Other..."
- Sélectionner le dossier Server, puis "Server". Cliquer sur next, puis Apache et sélectionner votre version de Tomcat;
- Cliquer sur Browse et récupérer votre serveur Tomcat présent sur votre ordinateur;
- Cliquer sur "Finish.
- Démarrer le serveur en cliquant sur le projet, puis "Run as", "Run on server".

LANCEMENT DE L'APPLICATION
- Ouvrir un navigateur web
- Indiquer l'URL : http://localhost:8080/JBB_SJ_ProxiBanqueV3/



4. Disponibilité du projet sur GitHub
Le projet est disponible en ligne sur le lien suivant : https://github.com/jbeydu03/Sebastien_JeanBaptiste_ProxibanqueV3
Lien pour cloner le dossier : https://github.com/jbeydu03/Sebastien_JeanBaptiste_ProxibanqueV3.git