
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ELITEBOOK 840 G5
 */
public class Entreprise {

    ArrayList<Employe> employes = new ArrayList<>();

    // Ajouter un employé
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    // Parcourir et afficher les informations des employés
    public void afficherEmployes() {
        for (Employe employe : employes) {
            employe.afficherInformations();
            System.out.println("--------------------");
        }
    }
    public static void main(String[] args) {
         Entreprise entreprise = new Entreprise();

        // Ajouter des employés
        entreprise.ajouterEmploye(new manager("Alice", 5000, 1000));
        entreprise.ajouterEmploye(new Technicien("Bob", 3000));
        entreprise.ajouterEmploye(new manager("Charlie", 6000, 1500));
        entreprise.ajouterEmploye(new Technicien("David", 3500));

        // Afficher les informations des employés
        System.out.println("Liste des employés :");
        entreprise.afficherEmployes();
    }}

