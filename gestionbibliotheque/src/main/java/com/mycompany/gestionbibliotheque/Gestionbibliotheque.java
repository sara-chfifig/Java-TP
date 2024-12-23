/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestionbibliotheque;

import java.util.Scanner;

/**
 *
 * @author ELITEBOOK 840 G5
 */
public class Gestionbibliotheque {

    public static void main(String[] args) {
       Bibliotheque bibliotheque = new Bibliotheque();
 Scanner scanner = new Scanner(System.in);
 while (true) {System.out.println("\n--- Menu ---");
 System.out.println("1. Ajouter un livre");
 System.out.println("2. Supprimer un livre");
 System.out.println("3. Rechercher un livre");
 System.out.println("4. Afficher tous les livres");
 System.out.println("5. Afficher les livres disponibles");
 System.out.println("6. Quitter");
 System.out.print("Choisissez une option : ");
 int choix = scanner.nextInt();
 scanner.nextLine(); // Consommer la ligne
 switch (choix) {
 case 1:
 System.out.print("Titre : ");
 String titre = scanner.nextLine();
 System.out.print("Auteur : ");
 String auteur = scanner.nextLine();
 System.out.print("Année de publication : ");
 int annee = scanner.nextInt();
 System.out.print("Disponible (true/false) : ");
 boolean disponible = scanner.nextBoolean();
 scanner.nextLine(); // Consommer la ligne
 bibliotheque.ajouterLivre(new Livre(titre, auteur, annee, disponible));
 break;
 case 2:
 System.out.print("Titre du livre à supprimer : ");
 String titreASupprimer = scanner.nextLine();
 bibliotheque.supprimerLivre(titreASupprimer);
 break;
 case 3:
 System.out.print("Titre du livre à rechercher : ");
 String titreRecherche = scanner.nextLine();bibliotheque.rechercherLivre(titreRecherche);
 break;
 case 4:
 bibliotheque.afficherTousLesLivres();
 break;
 case 5:
 bibliotheque.afficherLivresDisponibles();
 break;
 case 6:
 System.out.println("Au revoir !");
 scanner.close();
 return;
 default:
 System.out.println("Option invalide !");
    }
}

    }}