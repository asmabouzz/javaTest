package serieExercices2;

import java.util.Scanner;

public class Exo5Slide72 {
    public static void main(String[] args) {
        /*
        1. Créer une variable jour de type entier
        2. Affecter une valeur à la variable jour
        3. Afficher le jour de la semaine en lettre en fonction du nombrepassé
        4. Si le nombre est inférieur à 1 et supérieur à 7, afficher un messaged'erreur
         */


        int jour;
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisir un jour : ");
        jour = scanner.nextInt();


            switch (jour) {
                case 1:
                    System.out.println("LUNDI");
                    break;
                case 2:
                    System.out.println("MARDI");
                    break;
                case 3:
                    System.out.println("MERCREDI");
                    break;
                case 4:
                    System.out.println("JEUDI");
                    break;
                case 5:
                    System.out.println("VENDREDI");
                    break;
                case 6:
                    System.out.println("SAMEDI");
                    break;
                case 7:
                    System.out.println("DIMANCHE");
                    break;
                default:
                    System.out.println("Choix incorrect");
            }



    }
}
