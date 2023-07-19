package serieExercices2;

import java.util.Scanner;

public class Exo7Slide74 {
    public static void main(String[] args) {
        /*
        1. Créer une variable annee de type entier
        2. Affecter une valeur à la variable annee
        3. Une année est bissextile si elle est divisible par 4 mais non divisiblepar 100.
        4. L'année est également bissextile si elle est divisible par 400
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une année: ");
        int year = scanner.nextInt();
        boolean b = false;
        if(year % 400 == 0)
        {
            b = true;
        } else if (year % 100 == 0)
        {
            b = false;
        } else if(year % 4 == 0)
        {
            b = true;
        } else
        {
            b = false;
        }

        if(b == true)
        {
            System.out.println( year +" est une année bissextile");
        }
        else
        {
            System.out.println( year +" n'est pas une année bissextile");
        }







    }

}
