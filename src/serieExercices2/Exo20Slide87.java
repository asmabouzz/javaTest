package serieExercices2;

import java.util.Scanner;

public class Exo20Slide87 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisir un chiffre  :");
        int nbr = scanner.nextInt();



        int i,factorial,digit;
        int sum = 0;

        int tmp = nbr;

        System.out.println(nbr+"! = ");


        while(tmp != 0) {
            i = 1;
            factorial = 1;
            digit = tmp % 10;

            System.out.print(digit+"! =");

            while(i <= digit) {
                factorial = factorial * i;
                System.out.print(i+" * ");
                i++;
            }
            System.out.print(" = "+factorial);
            sum = sum + factorial;

            tmp = tmp / 10;
            System.out.println();
        }

        if(sum == nbr)
            System.out.println(nbr + " est un nombre fort");
        else
            System.out.println(nbr + " n'est pas un nombre fort");
    }



}
