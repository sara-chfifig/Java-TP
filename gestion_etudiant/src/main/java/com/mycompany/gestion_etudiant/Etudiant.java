/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestion_etudiant;

/**
 *
 * @author ELITEBOOK 840 G5
 */
public class Etudiant {
    private int matricule;
    private String nom;
    private String prenom;
    private double moyenne;

    // Constructeur
    public Etudiant(int matricule, String nom, String prenom, double moyenne) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.moyenne = moyenne;
    }

    // Méthode pour afficher les détails de l'étudiant
    public void afficherDetails() {
        System.out.println("Matricule: " + matricule + ", Nom: " + nom + ", Prénom: " + prenom + ", Moyenne: " + moyenne);
    }

    // Méthode pour modifier la moyenne de l'étudiant
    public void modifierMoyenne(double nouvelleMoyenne) {
        this.moyenne = nouvelleMoyenne;
    }

    // Getters et Setters
    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }
}

