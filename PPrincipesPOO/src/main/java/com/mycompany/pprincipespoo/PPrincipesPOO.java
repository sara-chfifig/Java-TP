/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pprincipespoo;

import principespoo.CompteBancaire;
import principespoo.CompteEpargne;
public class PPrincipesPOO {

    public static void main(String[] args) {
CompteBancaire compte = new CompteBancaire("123456", "Alice", 1000);
        System.out.println("Propriétaire : " + compte.getProprietaire());
        System.out.println("Solde initial : " + compte.getSolde());
        compte.deposer(500);
        System.out.println("Solde après dépôt : " + compte.getSolde());
        compte.retirer(300);
        System.out.println("Solde après retrait : " + compte.getSolde());
        
        
                CompteEpargne compteEpargne = new CompteEpargne("789012", "Bob", 2000, 5);
        System.out.println("Solde initial : " + compteEpargne.getSolde());
        compteEpargne.calculerInterets();
        System.out.println("Solde après calcul des intérêts : " + compteEpargne.getSolde());

    }
}
