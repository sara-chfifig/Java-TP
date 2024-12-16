/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tpattributsetmethodes;

public class Main2 {

 
    public static void main(String[] args) {
        Employe employe1 = new Employe("SARA", "Developpeuse", 5000);
        Employe employe2 = new Employe("IBRAHIME", "Designer", 4500);

        Entreprise entreprise = new Entreprise("TechCorp");
        entreprise.ajouterEmploye(employe1);
        entreprise.ajouterEmploye(employe2);

        entreprise.afficherEmployes();
    }
    
}
