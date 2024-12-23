/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionbibliotheque;

/**
 *
 * @author ELITEBOOK 840 G5
 */
import java.util.ArrayList;
public class Bibliotheque {
 private final ArrayList<Livre> livres;
 // Constructeur
 public Bibliotheque() { this.livres = new ArrayList<>(); }
 // Ajouter un livre
 public void ajouterLivre(Livre livre) {
 livres.add(livre); System.out.println("Livre ajouté avec succès !");
 }
 // Supprimer un livre
 public void supprimerLivre(String titre) {
 for (Livre livre : livres) {
 if (livre.getTitre().equalsIgnoreCase(titre)) {
 livres.remove(livre);
 System.out.println("Livre supprimé avec succès !");
 return;
 }
 }
 System.out.println("Livre introuvable !");
 }
 // Rechercher un livre
 public void rechercherLivre(String titre) {
 for (Livre livre : livres) {
 if (livre.getTitre().equalsIgnoreCase(titre)) {
 livre.afficherDetails();
 return;
 }
 }
 System.out.println("Livre introuvable !");}
 // Afficher tous les livres
 public void afficherTousLesLivres() {
 if (livres.isEmpty()) {
 System.out.println("Aucun livre dans la bibliothèque.");
 } else {
 for (Livre livre : livres) {
 livre.afficherDetails(); System.out.println("-------------------");
 }
 }
 }
 // Afficher les livres disponibles
 public void afficherLivresDisponibles() {
 boolean disponibleTrouve = false;
 for (Livre livre : livres) {
 if (livre.isDisponible()) {
 livre.afficherDetails();
 System.out.println("-------------------");
 disponibleTrouve = true;
 }
 }
 if (!disponibleTrouve) { System.out.println("Aucun livre disponible.");}}}