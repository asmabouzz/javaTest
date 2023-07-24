package serieExercices2;

import java.util.Scanner;

public class Exo17Slide84 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisir un chiffre positif :");
        int nbr = scanner.nextInt();
         int cpt=0;



        if (nbr<1){
            System.out.print("Saisir un chiffre positif :");
            nbr = scanner.nextInt();

        }

        for (int i=1;i<=nbr;i++){


            if(nbr%i == 0){

                cpt += 1;
            }

        }
            if(cpt==2){

            System.out.println(nbr+" est premier");
             }else{
                System.out.println(nbr+" n'est pas premier");
            }

        }
    }
