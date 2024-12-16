/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principespoo;

public class CompteEpargne extends CompteBancaire {
    private double tauxInteret;
    public CompteEpargne(String numeroCompte, String proprietaire, double soldeInitial, double tauxInteret) {
        super(numeroCompte, proprietaire, soldeInitial);
        this.tauxInteret = tauxInteret;
    }
    public void calculerInterets() {
        double interets = getSolde() * tauxInteret / 100;
        deposer(interets);
        System.out.println("Intérêts ajoutés : " + interets);
    }
}
