/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tpmethodes;


public class TPMethodes {

    public static void main(String[] args) {
             // Appeler la méthode
        saluer();
    }
    // Méthode pour afficher un message
    public static void saluer() {
        System.out.println("Bonjour, bienvenue dans le monde de Java !");

                // Appeler la méthode avec différents noms
        afficherNom("sara");        
    }
    // Méthode avec un paramètre
    public static void afficherNom(String nom) {
        System.out.println("Bonjour " + nom + ", ravi de vous rencontrer !");

    }
}
