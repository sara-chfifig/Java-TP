/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principespoo;


public class CompteBancaire {
    
    private String numeroCompte;
    private double solde;
    private String proprietaire;
    public CompteBancaire(String numeroCompte, String proprietaire, double soldeInitial) {
        this.numeroCompte = numeroCompte;
        this.proprietaire = proprietaire;
        this.solde = soldeInitial;
    }
    public String getNumeroCompte() {
        return numeroCompte;
    }
    public double getSolde() {
        return solde;
    }
    public String getProprietaire() {
        return proprietaire;
    }
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
        } else {
            System.out.println("Le montant doit être positif.");
        }
    }
    public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
        } else {
            System.out.println("Retrait impossible.");
        }
    }

    
}
