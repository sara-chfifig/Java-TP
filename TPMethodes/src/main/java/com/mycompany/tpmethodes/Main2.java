/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tpmethodes;

/**
 *
 * @author ELITEBOOK 840 G5
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tester la méthode estPair avec différents nombres
        System.out.println("4 est pair ? " + estPair(4));
        System.out.println("7 est pair ? " + estPair(7));
    }
    // Méthode qui vérifie si un nombre est pair
    public static boolean estPair(int nombre) {
        return nombre % 2 == 0;
    }
    
}
