package serieExercices1;

import java.util.Scanner;

public class Exo7Slide57 {
    public static void main(String[] args) {
    //1. Saisir la longueur du côté du carré et la stocker dans une variable
        // 2. Calculer l'aire et le périmètre du carré


        Scanner scanner = new Scanner(System.in );

        System.out.println("saisir la longeur d'un cote :");
        double longeur = scanner.nextInt();

       double perimetre = longeur*4;
       double aire = longeur*longeur;

        System.out.println("Le périmètre du carré est de :"+ perimetre+" cm ");
        System.out.println("L'aire du carré est de : " + aire +" cm carré" );

    }

}
