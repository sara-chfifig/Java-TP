/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ELITEBOOK 840 G5
 */
public abstract class Employe {
     String nom;
    double salaire;

    public Employe(String nom, double salaire) {
        this.nom = nom;
        this.salaire = salaire;
    }

    // Méthode pour calculer le salaire total
    public abstract double calculerSalaireTotal();

    // Méthode pour afficher les informations
    public abstract void afficherInformations();
}

    

