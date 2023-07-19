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


        switch (mois) {
            case 1:
                System.out.println("31");
                break;
            case 2:
                System.out.print("Entrez une année: ");
                int year = scanner.nextInt();
                boolean b = false;
                if(year % 400 == 0)
                {
                    b = true;
                }
                else if (year % 100 == 0)
                {
                    b = false;
                }
                else if(year % 4 == 0)
                {
                    b = true;
                }
                else
                {
                    b = false;
                }
                if(b == true)
                {
                    System.out.println("29");
                }
                else
                {
                    System.out.println("28");
                }

                break;
            case 3:
                System.out.println("31");
                break;
            case 4:
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("31");
                break;
            case 11:
                System.out.println("30");
                break;
            case 12:
                System.out.println("31");
                break;

            default:
                System.out.println("Choix incorrect");
        }



    }
}
