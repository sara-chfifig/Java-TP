/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpattributsetmethodes;

/**
 *
 * @author ELITEBOOK 840 G5
 */
public final class Employe {
        public String nom;
    public String poste;
    private double salaire;
    private static int totalEmployes = 0;
    
    
    
        public Employe(String nom, String poste, double salaire) {
        this.nom = nom;
        this.poste = poste;
        setSalaire(salaire);
        totalEmployes++;
    }
    public double getSalaire() {return salaire;
    }
    public static int getTotalEmployes() {
        return totalEmployes;
    }


     public void setSalaire(double salaire) {
        if (salaire > 0) {
            this.salaire = salaire;
        } else {
            System.out.println("Le salaire doit être positif.");
        }
    }
}

