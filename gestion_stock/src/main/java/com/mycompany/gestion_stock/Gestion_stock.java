/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestion_stock;

/**
 *
 * @author ELITEBOOK 840 G5
 */
import java.util.Scanner;
public class Gestion_stock 

{
    public static void main(String[] args) {
        Stock stock = new Stock();
        try (Scanner scanner = new Scanner(System.in)) {
            int choix;
            
            do {
                System.out.println("\nMenu :");
                System.out.println("1. Ajouter un produit");
                System.out.println("2. Supprimer un produit");
                System.out.println("3. Afficher tous les produits");
                System.out.println("4. Rechercher un produit");
                System.out.println("5. Quitter");
                System.out.print("Choix : ");
                choix = scanner.nextInt();
                
                switch (choix) {
                    case 1 -> {
                        System.out.print("ID du produit : ");
                        int id = scanner.nextInt();
                        scanner.nextLine();  // Consume newline
                        System.out.print("Nom du produit : ");
                        String nom = scanner.nextLine();
                        System.out.print("Prix du produit : ");
                        double prix = scanner.nextDouble();
                        System.out.print("Quantité du produit : ");
                        int quantite = scanner.nextInt();
                        Produit produit = new Produit(id, nom, prix, quantite);
                        stock.ajouterProduit(produit);
                        System.out.println("Produit ajouté.");
                    }
                    case 2 -> {
                        System.out.print("ID du produit à supprimer : ");
                        int idSupprimer = scanner.nextInt();
                        stock.supprimerProduit(idSupprimer);
                        System.out.println("Produit supprimé.");
                    }
                    case 3 -> stock.afficherProduits();
                    case 4 -> {
                        System.out.print("ID du produit à rechercher : ");
                        int idRechercher = scanner.nextInt();
                        stock.rechercherProduit(idRechercher);
                    }
                    case 5 -> System.out.println("Au revoir !");
                    default -> System.out.println("Choix invalide.");
                }
            } while (choix != 5);
        }
    }
}

