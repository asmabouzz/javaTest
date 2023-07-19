package serieExercices1;

import java.util.Scanner;

public class Exo5Slide55 {
    public static void main(String[] args) {
       // 1. Créer un programme qui permet de calculer le volume d'un cône
        // 2. La formule est la suivante : 1/3 × π × r² × h

        Scanner scanner = new Scanner(System.in);

        System.out.println("saisir un rayon :");
        double rayon = scanner.nextDouble();
        System.out.println("saisir une hauteur :");
        double hauteur = scanner.nextDouble();

        double result = 1.0/3.0 * Math.PI * Math.pow (rayon,2) * hauteur;
        System.out.printf( "le volume de cone est de %f cm3 ",result );

    }
}
