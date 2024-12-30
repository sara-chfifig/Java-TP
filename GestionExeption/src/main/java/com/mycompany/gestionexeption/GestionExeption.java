/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestionexeption;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ELITEBOOK 840 G5
 */
public class GestionExeption {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
              System.out.print("Entrez le premier nombre : ");
              int num1 = scanner.nextInt();
              System.out.print("Entrez le deuxième nombre : ");
              int num2 = scanner.nextInt();
              double result;
            result = num1 / num2;
              System.out.println("Résultat : " + result);
 }      catch (ArithmeticException e) {
              System.out.println("Erreur : Division par zéro !");
 }      catch (InputMismatchException e) {
              System.out.println("Erreur : Veuillez entrer un nombre valide !");
 }      finally {
              System.out.println("Fin de l'opération.");
       scanner.close();
        }}}

