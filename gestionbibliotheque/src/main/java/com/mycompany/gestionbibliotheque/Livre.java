/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionbibliotheque;

/**
 *
 * @author ELITEBOOK 840 G5
 */
public class Livre {
 private final String titre;
 private final String auteur;
 private final int anneePublication;
 private boolean disponible;
 // Constructeur
 public Livre(String titre, String auteur, int anneePublication, boolean disponible) {
 this.titre = titre; this.auteur = auteur; this.anneePublication = anneePublication;
 this.disponible = disponible;
 }
 // Méthodes
 public void afficherDetails() {
 System.out.println("Titre : " + titre); System.out.println("Auteur : " + auteur);
 System.out.println("Année de publication : " + anneePublication);
 System.out.println("Disponible : " + (disponible ? "Oui" : "Non"));
 }
 public void changerDisponibilite() { disponible = !disponible; }
 public String getTitre() { return titre; }
 public boolean isDisponible() { return disponible; }}
