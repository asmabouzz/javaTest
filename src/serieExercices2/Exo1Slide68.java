package serieExercices2;

import java.util.Scanner;

public class Exo1Slide68 {
    public static void main(String[] args) {

        /*
        * 1. Créer une variable age
        * 2. Affecter une valeur à la variable age
        * 3. Créer une condition qui permet d'afficher si la personne estmajeure ou mineure
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("saisir un age : ");
        int age = scanner.nextInt();

        String rep = age >= 18 ? "Vous êtes majeur, vous pouvez rentrer dans le club." : "Vous êtes mineur, vous avez pas le drois de rentrer dans le club." ;

        System.out.println(rep);
    }


}
