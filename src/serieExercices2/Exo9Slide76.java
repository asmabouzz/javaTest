package serieExercices2;

import java.util.Scanner;

public class Exo9Slide76 {
    public static void main(String[] args) {

        /*
        1. Définir une variable température
        2. Affecter une valeur à la variable temperature
        3. Selon la température, affiche l'état de l'eau :
        SOLIDE : température inférieure à 0°
        CLIQUIDE : température entre 0 et 100°C
        GAZEUX : température supérieure à 100°C
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la temperature : ");
        int temperature = scanner.nextInt();

        if (temperature < 0 ){

            System.out.print(" SOLIDE ");
        }else if (0<= temperature && temperature <= 100 ){
            System.out.print(" LIQUIDE ");

        }else{
            System.out.print(" GAZEUX ");
        }
    }
}
