/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestionlistenombres;

import java.util.ArrayList;

/**
 *
 * @author ELITEBOOK 840 G5
 */
public class GestionListeNombres {

    public static void main(String[] args) {
        // 1. Création de l'ArrayList
        ArrayList<Integer> nombres = new ArrayList<>();
        
        // 2. Ajout des nombres à la liste
        nombres.add(5);
        nombres.add(10);
        nombres.add(15);
        nombres.add(20);
        nombres.add(25);

        // 3. Affichez la liste
        System.out.println("Liste initiale : " + nombres);

        // 4. Ajouter un nouveau nombre à l'index 2
        nombres.add(2, 12); // On insère le nombre 12 à l'index 2
        System.out.println("Après ajout à l'index 2 : " + nombres);

        // 5. Supprimer le dernier élément de la liste
        nombres.remove(nombres.size() - 1);
        System.out.println("Après suppression du dernier élément : " + nombres);

        // 6. Multipliez chaque élément par 2 et affichez la liste mise à jour
        for (int i = 0; i < nombres.size(); i++) {
            nombres.set(i, nombres.get(i) * 2); // On met à jour chaque élément
        }
        System.out.println("Après multiplication par 2 : " + nombres);
    }
}