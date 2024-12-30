/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ELITEBOOK 840 G5
 */
class manager extends Employe {
    double prime;

    public manager(String nom, double salaire, double prime) {
        super(nom, salaire);
        this.prime = prime;
    }

    @Override
    public double calculerSalaireTotal() {
        return salaire + prime;
    }

    @Override
    public void afficherInformations() {
        System.out.println("Type : Manager");
        System.out.println("Nom : " + nom);
        System.out.println("Salaire total : " + calculerSalaireTotal());
        System.out.println("Prime : " + prime);
    }
}