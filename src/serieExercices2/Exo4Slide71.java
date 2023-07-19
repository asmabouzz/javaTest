package serieExercices2;

import java.util.Scanner;

public class Exo4Slide71 {
    public static void main(String[] args) {
        /*
        1. Créer une variable caractere
        2. Affecter une valeur à la variable caractere
        3. A l'aide des structures conditionnelles, déterminer si le caractèreest une consonne ou une voyelle
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("saisir un carractere : ");
        char caractere = scanner.next().charAt(0);

        char [] voyelles = {'a', 'e', 'i', 'o' , 'u' , 'y'};

        boolean verif = false ;

            for (int i = 0; i < voyelles.length; i++) {
                if (caractere == voyelles[i]) {
                    verif = true;
                }
            }

        String rep = verif == true ? "Le caractère saisi est une voyelle": "Le caractère saisi est une consonne" ;

        System.out.println(rep);
    }
}
