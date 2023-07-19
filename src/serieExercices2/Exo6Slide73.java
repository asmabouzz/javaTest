package serieExercices2;

import java.util.Scanner;

public class Exo6Slide73 {

    public static void main(String[] args) {
        /*
       1. Créer une variable mois de type entier
       2. Affecter une valeur à la variable mois
       3. Afficher le nombre de jours du mois
       4. Si le nombre est inférieur à 1 et supérieur à 12, afficher un message d'erreur
         */


        int mois;
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisir un mois : ");
        mois = scanner.nextInt();
        String returnedValue ="";


        switch (mois) {
            case 1,3,5,7,8,10,12 -> returnedValue = "31";
                //System.out.println("31");
                //break;
            case 2 -> {
                System.out.print("Entrez une année: ");
                int year = scanner.nextInt();
                boolean b = false;
                if (year % 400 == 0) {
                    b = true;
                } else if (year % 100 == 0) {
                    b = false;
                } else if (year % 4 == 0) {
                    b = true;
                } else {
                    b = false;
                }
                if (b == true) {
                    returnedValue="29";
                } else {
                    returnedValue="28";
                }

                break;
            }
            case 4,6,9,11 -> returnedValue="30";
                //System.out.println("30");


            default -> returnedValue="Choix incorrect";
               // System.out.println("Choix incorrect");
        }

        System.out.println(returnedValue);

    }
}
