/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestion_stock;

/**
 *
 * @author ELITEBOOK 840 G5
 */
import java.util.ArrayList;

public class Stock {
    private final ArrayList<Produit> produits;

    // Constructeur
    public Stock() {
        produits = new ArrayList<>();
    }

    // Ajouter un produit au stock
    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    // Supprimer un produit par son ID
    public void supprimerProduit(int id) {
        for (int i = 0; i < produits.size(); i++) {
            if (produits.get(i).getId() == id) {
                produits.remove(i);
                break;
            }
        }
    }

    // Afficher tous les produits
    public void afficherProduits() {
        for (Produit produit : produits) {
            produit.afficherDetails();
        }
    }

    // Rechercher un produit par son ID
    public void rechercherProduit(int id) {
        for (Produit produit : produits) {
            if (produit.getId() == id) {
                produit.afficherDetails();
                return;
            }
        }
        System.out.println("Produit non trouvé.");
    }
}
