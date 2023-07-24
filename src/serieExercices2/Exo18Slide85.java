package serieExercices2;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class Exo18Slide85 {

    /*

     */

    public static void main(String[] args) {

        int random = new Random().nextInt(100);
        System.out.println(random);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisir un chiffre entre 1 et 100 :");
        int nbr = scanner.nextInt();
        int cpt=1;


        while (nbr != random){

            if(nbr<1 || nbr>100){
                System.out.println("saisir un nombre entre 1 et 100");
                nbr = scanner.nextInt();
            }else if(nbr > random){
                System.out.println("le nombre est plus petit");
                nbr = scanner.nextInt();
            }else if (nbr < random) {
                System.out.println("le nombre est plus grand");
                nbr = scanner.nextInt();
            }
            cpt++;
        }

        System.out.println("vous avez reussi au bout de "+cpt+" essai");







    }

}
