/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestion_etudiant;

/**
 *
 * @author ELITEBOOK 840 G5
 */
import java.util.Scanner;
public class Gestion_etudiant

 {
    public static void main(String[] args) {
        GestionEtudiants gestion = new GestionEtudiants();
        try (Scanner scanner = new Scanner(System.in)) {
            int choix;
            
            do {
                System.out.println("\nMenu :");
                System.out.println("1. Ajouter un étudiant");
                System.out.println("2. Supprimer un étudiant");
                System.out.println("3. Afficher tous les étudiants");
                System.out.println("4. Rechercher un étudiant");
                System.out.println("5. Afficher les étudiants admis");
                System.out.println("6. Quitter");
                System.out.print("Choix : ");
                choix = scanner.nextInt();
                
                switch (choix) {
                    case 1 -> {
                        System.out.print("Matricule de l'étudiant : ");
                        int matricule = scanner.nextInt();
                        scanner.nextLine();  // Consommer la nouvelle ligne
                        System.out.print("Nom de l'étudiant : ");
                        String nom = scanner.nextLine();
                        System.out.print("Prénom de l'étudiant : ");
                        String prenom = scanner.nextLine();
                        System.out.print("Moyenne de l'étudiant : ");
                        double moyenne = scanner.nextDouble();
                        Etudiant etudiant = new Etudiant(matricule, nom, prenom, moyenne);
                        gestion.ajouterEtudiant(etudiant);
                        System.out.println("Étudiant ajouté.");
                    }
                    case 2 -> {
                        System.out.print("Matricule de l'étudiant à supprimer : ");
                        int matriculeSupprimer = scanner.nextInt();
                        gestion.supprimerEtudiant(matriculeSupprimer);
                        System.out.println("Étudiant supprimé.");
                    }
                    case 3 -> gestion.afficherTousLesEtudiants();
                    case 4 -> {
                        System.out.print("Matricule de l'étudiant à rechercher : ");
                        int matriculeRechercher = scanner.nextInt();
                        gestion.rechercherEtudiant(matriculeRechercher);
                    }
                    case 5 -> gestion.afficherEtudiantsAdmis();
                    case 6 -> System.out.println("Au revoir !");
                    default -> System.out.println("Choix invalide.");
                }
            } while (choix != 6);
        }
    }
}

