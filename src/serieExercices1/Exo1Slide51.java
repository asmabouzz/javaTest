package serieExercices1;

import java.util.Scanner;

public class Exo1Slide51 {
    public static void main(String[] args) {
      /*  1. Créer une variable nom et une variable prenom
        2. Afficher la phrase suivante "Bonjour {prenom} {NOM}."
        3. Remplacer les valeurs entre chevrons par les variables crééesprécédemment
      */

        Scanner scanner = new Scanner(System.in );

        System.out.println("saisir un prenom");
        String prenom = scanner.nextLine();
        System.out.println("saisir un nom");
        String nom = scanner.nextLine();

        System.out.printf(" Bonjour %s %s ",prenom,nom);


    }
}
