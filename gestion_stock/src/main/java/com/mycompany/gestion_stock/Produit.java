/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestion_stock;

/**
 *
 * @author ELITEBOOK 840 G5
 */
public class Produit {
    private int id;
    private String nom;
    private double prix;
    private int quantite;

    // Constructeur
    public Produit(int id, String nom, double prix, int quantite) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }

    // Méthode pour afficher les détails du produit
    public void afficherDetails() {
        System.out.println("ID: " + id + ", Nom: " + nom + ", Prix: " + prix + ", Quantité: " + quantite);
    }

    // Méthode pour modifier la quantité du produit
    public void modifierQuantite(int nouvelleQuantite) {
        this.quantite = nouvelleQuantite;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}

