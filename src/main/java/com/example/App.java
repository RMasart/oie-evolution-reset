package com.example;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        System.out.println("Lancer le dé");
        int caseCourante = 0;
        int Lancer;
        int depassement;
        int fin;
        int numLancer = 1;
        while (caseCourante != 20) {
            Random generateur = new Random();
            Lancer = generateur.nextInt(6) + 1;
            caseCourante = caseCourante + Lancer;
            if (caseCourante > 20) {
                depassement = caseCourante - 20;
                caseCourante = 20 - depassement;
            }
            fin = 20 - caseCourante;
            if (caseCourante != 20) {
                System.out.println("Lancer " + numLancer + " :  Vous avez fais " + Lancer + " et vous êtes sur la case "
                        + caseCourante + " (encore " + fin
                        + " cases)");

                numLancer = numLancer + 1;
            }
            if (caseCourante == 20) {
                System.out.println("Lancer " + numLancer + " :  Vous avez fais " + Lancer + " et vous êtes sur la case "
                        + caseCourante + " (encore " + fin
                        + " cases)");
                System.out.println("Vous avez gagner");

            }

        }
    }
}
