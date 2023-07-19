package serieExercices2;

import java.util.Scanner;

public class Exo3Slide70 {
    public static void main(String[] args) {
        /*
        1. Créer 3 variables : nombre1, nombre2, nombre3
        2. Affecter des valeurs aux variables
        3.Créer des structures conditionnelles permettant d'afficher lemaximum parmis les 3 nombres créésprécédemment
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("saisir un nombre 1 : ");
        int nombre1 = scanner.nextInt();
        System.out.println("saisir un nombre 2 : ");
        int nombre2 = scanner.nextInt();
        System.out.println("saisir un nombre 3 : ");
        int nombre3 = scanner.nextInt();

        int tmp = 0 ;

        if(nombre1 > tmp) {
            tmp = nombre1;
        }
        if(nombre2 > tmp) {
            tmp = nombre2;
        }
        if(nombre3 > tmp) {
            tmp = nombre3;
        }

        System.out.println("ma valeur maximal est : "+tmp);

    }
}
