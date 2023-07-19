package serieExercices1;

import java.util.Scanner;

public class Exo3Slide53 {

    public static void main(String[] args) {

        //Écrire un programme qui permet de permuter les valeurs entredeux variables




        Scanner scanner = new Scanner(System.in );

        System.out.println("saisir a :");
        double a = scanner.nextInt();
        System.out.println("saisir b :");
       double b = scanner.nextInt();

        double somme = Math.pow (a,2)+Math.pow (b,2);

        System.out.printf("la somme des carre de a et b est "+somme);

    }
}
