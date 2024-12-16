/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tpattributsetmethodes;

/**
 *
 * @author ELITEBOOK 840 G5
 */
public class TPAttributsEtMethodes {

    public static void main(String[] args) {
    /* Employe employe1 = new Employe();
        employe1.nom = "SARA";
        employe1.poste = "Développeuse";
        employe1.setSalaire(5000); // Modifier le salaire
        
     Employe employe2 = new Employe();
        employe2.nom = "IBRAHIME";
        employe2.poste = "Designer";
        employe2.setSalaire(4500);

        System.out.println("Salaire : " + employe1.getSalaire()); // Accéder au salaire
        System.out.println(employe2.nom + " - " + employe2.poste + " - " + employe2.getSalaire());
    }
    */
        Employe employe1 = new Employe("SARA", "DEveloppeuSE", 5000);
        Employe employe2 = new Employe("IBRAHIME", "Designer", 4500);

        System.out.println("Nombre total d'employes : " + Employe.getTotalEmployes());

    }}
