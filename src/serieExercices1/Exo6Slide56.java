package serieExercices1;

import java.util.Scanner;

public class Exo6Slide56 {
    public static void main(String[] args) {
      /*  1. Saisir une chaine et la stocker dans une variable2. Effectuer les traitements suivants :
              1. Afficher la chaîne en minuscule
        2. Afficher la chaîne en majuscule3.
                Bonus
        1. Convertir la chaîne en tableau puis afficher les caractères séparer d'une virgule2. Afficher la première lettre de chaque mot en majuscule
    */

        Scanner scanner = new Scanner(System.in);

        System.out.println("saisir une chaine :");
        String chaine = scanner.nextLine();
        System.out.printf("en miniscule : %s ", chaine.toLowerCase());
        System.out.println();
        System.out.printf("en MAJISCULE : %s ", chaine.toUpperCase());
        System.out.println();


        String[] tab = chaine.split("");
        System.out.println("En tableau : " +String.join(",",tab));



        String[] lettre = chaine.split(" ");
        String result = "";
        for (String mot : lettre) {
            result += Character.toUpperCase(mot.charAt(0)) + mot.substring(1).toLowerCase()+ " ";
        }
        System.out.println("Première lettre de chaque mot en majuscule : " + result.trim());


    }

}
