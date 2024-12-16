/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tppoo;


public class Voiture {
    String marque;
    String modele;
    int annee;
   // Proprietaire proprietaire;
    
    
        // Constructeur
    public Voiture(String marque, String modele, int annee) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
       // this.proprietaire = proprietaire;
    }

    // Méthode pour afficher les détails
    public void afficherDetails() {
        System.out.println("Marque: " + marque + ", Modele: " + modele + ", Annee: " + annee);
       // System.out.println("Propriétaire: " + proprietaire.prenom + " " + proprietaire.nom);
    }
       public void demarrer() {
        System.out.println("La voiture " + marque + " démarre.");
    }
           public void arreter() {
        System.out.println("La voiture " + marque + " s'arrête.");
    }


}
