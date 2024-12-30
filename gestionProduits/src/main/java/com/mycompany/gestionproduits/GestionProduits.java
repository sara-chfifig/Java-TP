/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestionproduits;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ELITEBOOK 840 G5
 */
public class GestionProduits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product;
        double price;
        double totalPrice = 0;
        int productCount = 0;

        try {
            // Saisie du nom du produit
            System.out.print("Entrez le nom du produit : ");
            product = scanner.nextLine();

            // Saisie et validation du prix
            System.out.print("Entrez le prix du produit : ");
            price = scanner.nextDouble();
            if (price < 0) {
                throw new IllegalArgumentException("Erreur : Le prix ne peut pas être négatif !");
            }

            // Mise à jour des totaux
            totalPrice += price;
            productCount++;

            // Calcul du prix moyen
            double averagePrice = totalPrice / productCount;
            System.out.println("Prix moyen des produits : " + averagePrice);

        } catch (InputMismatchException e) {
            System.out.println("Erreur : Veuillez entrer un prix valide !");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            // Bloc exécuté dans tous les cas
            System.out.println("Fin de l'opération.");
            scanner.close();
        }
    }
}
