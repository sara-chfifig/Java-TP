/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nestedtrycatchexample;


import java.util.InputMismatchException;
import java.util.Scanner;
public class NestedTryCatchExample {
public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
           try {
                System.out.print("Entrez une chaîne pour la convertir en nombre : ");
                String input = scanner.next();
           try {
                int number = Integer.parseInt(input);
                System.out.println("Nombre converti : " + number);
 }          catch (NumberFormatException e) {
                System.out.println("Erreur : La chaîne n'est pas un nombre valide !");
 }
                System.out.print("Entrez le premier nombre : ");
                int num1 = scanner.nextInt();
                System.out.print("Entrez le deuxième nombre : ");
                int num2 = scanner.nextInt();
                int result = num1 / num2;
                System.out.println("Résultat : " + result);
 }         catch (ArithmeticException e) {
                System.out.println("Erreur : Division par zéro !");
 }          catch (InputMismatchException e) {
                System.out.println("Erreur : Veuillez entrer un nombre valide !");
 } finally {
                System.out.println("Fin de l'opération.");
 scanner.close();
 }}}