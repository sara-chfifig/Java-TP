/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestionlistechaines;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ELITEBOOK 840 G5
 */
public class GestionListeChaines {

   public static void main(String[] args) {
        // 1. Création de l'ArrayList
        ArrayList<String> mots = new ArrayList<>();

        // 2. Ajout des mots à la liste
        mots.add("Java");
        mots.add("Python");
        mots.add("C++");
        mots.add("Ruby");
        mots.add("JavaScript");

        // 3. Affichez la liste initiale
        System.out.println("Liste initiale : " + mots);

        // 4. Recherchez si le mot "Python" existe dans la liste
        boolean contientPython = mots.contains("Python");
        System.out.println("Le mot 'Python' existe dans la liste : " + contientPython);

        // 5. Supprimez le mot "Ruby" de la liste
        mots.remove("Ruby");
        System.out.println("Après suppression de 'Ruby' : " + mots);

        // 6. Trier la liste par ordre alphabétique
        Collections.sort(mots);
        System.out.println("Liste triée par ordre alphabétique : " + mots);

        // 7. Parcourez la liste avec une boucle for-each et affichez chaque élément
        System.out.println("Éléments de la liste :");
        for (String mot : mots) {
            System.out.println(mot);
        }
    }
}
