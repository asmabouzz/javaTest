package serieExercices2;

import java.util.Scanner;

public class Exo8Slide75 {
    public static void main(String[] args) {
        /*
        1. Créer une variable caractere
        2. Affecter une valeur à la variable caractere
        3. Afficher un message en fonction du type du caractère (lettre,nombre, ou caractère spécial)
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("saisir un carractere : ");
        char caractere = scanner.next().charAt(0);



                if (Character.isLetter(caractere) == true ){
                    System.out.println("c'est une lettre de l'alphabet");
                }else if (Character.isDigit (caractere) == true ) {
                    System.out.println("c'est un chiffre");
                }else{
                    System.out.println("c'est un carractere special");
                }
    }
}
