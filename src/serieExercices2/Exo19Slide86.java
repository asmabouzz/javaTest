package serieExercices2;

import java.util.Scanner;

public class Exo19Slide86 {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisir un chiffre  :");
        int nbr = scanner.nextInt();
        int factoriel=1;

        System.out.print(nbr+"! = ");

        for (int i=1;i<=nbr;i++){

            System.out.print(i);
            System.out.print(" * ");
            factoriel = factoriel * i;
        }


        System.out.println("= "+factoriel);


    }
}
