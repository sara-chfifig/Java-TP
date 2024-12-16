/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tpmethodes;

/**
 *
 * @author ELITEBOOK 840 G5
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // Appeler afficherSurface
        afficherSurface(5, 10);
    }
    // Méthode pour calculer la surface
    public static int calculerSurfaceRectangle(int longueur, int largeur) {
        return longueur * largeur;
    }
    // Méthode pour afficher la surface
    public static void afficherSurface(int longueur, int largeur) {
        int surface = calculerSurfaceRectangle(longueur, largeur);
        System.out.println("La surface du rectangle est : " + surface);

    }
    
}
