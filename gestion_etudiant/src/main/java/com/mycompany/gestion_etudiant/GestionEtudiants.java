/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestion_etudiant;

/**
 *
 * @author ELITEBOOK 840 G5
 */
import java.util.ArrayList;

public class GestionEtudiants {
    private final ArrayList<Etudiant> etudiants;

    // Constructeur
    public GestionEtudiants() {
        etudiants = new ArrayList<>();
    }

    // Ajouter un étudiant
    public void ajouterEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
    }

    // Supprimer un étudiant par son matricule
    public void supprimerEtudiant(int matricule) {
        for (int i = 0; i < etudiants.size(); i++) {
            if (etudiants.get(i).getMatricule() == matricule) {
                etudiants.remove(i);
                break;
            }
        }
    }

    // Afficher tous les étudiants
    public void afficherTousLesEtudiants() {
        if (etudiants.isEmpty()) {
            System.out.println("Aucun étudiant dans la liste.");
            return;
        }
        for (Etudiant etudiant : etudiants) {
            etudiant.afficherDetails();
        }
    }

    // Rechercher un étudiant par son matricule
    public void rechercherEtudiant(int matricule) {
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getMatricule() == matricule) {
                etudiant.afficherDetails();
                return;
            }
        }
        System.out.println("Étudiant non trouvé.");
    }

    // Afficher les étudiants admis (moyenne >= 10)
    public void afficherEtudiantsAdmis() {
        boolean trouve = false;
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getMoyenne() >= 10) {
                etudiant.afficherDetails();
                trouve = true;
            }
        }
        if (!trouve) {
            System.out.println("Aucun étudiant admis.");
        }
    }
}

