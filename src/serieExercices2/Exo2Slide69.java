package serieExercices2;

import java.util.Scanner;

public class Exo2Slide69 {
    public static void main(String[] args) {
        /*
        1. Créer une variable nombre de type entier
        2. Affecter une valeur à la variable nombre
        3. Créer une condition qui permet d'afficher si le nombre est pair ou impair
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("saisir un nombre : ");
        int nombre = scanner.nextInt();

       if( nombre % 2 == 0){
           System.out.println("Le nombre saisi est pair");
        }else{
           System.out.println("Le nombre saisi est impair");

       }


    }
}
