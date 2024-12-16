/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpattributsetmethodes;

import java.util.ArrayList;
public class Entreprise {
        public String nom;
    private ArrayList<Employe> employes;

    public Entreprise(String nom) {
        this.nom = nom;
        this.employes = new ArrayList<>();
    }

    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    public void afficherEmployes() {
        System.out.println("Employés de l'entreprise " + nom + " :");
        for (Employe employe : employes) {
            System.out.println(employe.nom + " - " + employe.poste + " - " + employe.getSalaire());
        }
    }

    
}
