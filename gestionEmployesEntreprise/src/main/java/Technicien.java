/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ELITEBOOK 840 G5
 */
class Technicien extends Employe {
    public Technicien(String nom, double salaire) {
        super(nom, salaire);
    }

    @Override
    public double calculerSalaireTotal() {
        return salaire; // Les techniciens n'ont pas de prime dans cet exemple
    }

    @Override
    public void afficherInformations() {
        System.out.println("Type : Technicien");
        System.out.println("Nom : " + nom);
        System.out.println("Salaire total : " + calculerSalaireTotal());
    }
}
