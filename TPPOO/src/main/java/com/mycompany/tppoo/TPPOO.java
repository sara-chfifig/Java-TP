/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tppoo;


public class TPPOO {

    public static void main(String[] args) {
// Création d'un objet Voiture
/* Voiture voiture1 = new Voiture();
        voiture1.marque = "Toyota";
        voiture1.modele = "Corolla";
        voiture1.annee = 2021;
        Voiture voiture2 = new Voiture();
        voiture2.marque = "Honda";
        voiture2.modele = "Civic";
        voiture2.annee = 2020;
        voiture1.afficherDetails();
        voiture2.afficherDetails();

        Voiture voiture1 = new Voiture("Toyota", "Corolla", 2021);
        Voiture voiture2 = new Voiture("Honda", "Civic", 2020);
        voiture1.afficherDetails();
        voiture2.afficherDetails();
*/
        //Proprietaire proprietaire1 = new Proprietaire("SARA", "IBRAHIME");
        Voiture voiture1 = new Voiture("Toyota", "Corolla", 2021);
                voiture1.demarrer();
        voiture1.afficherDetails();
        voiture1.arreter();


    }
}
