package serieExercices2;

import java.util.Scanner;

public class Exo14Slide81 {
    public static void main(String[] args) {
        /*
        1. L'accroissement de la population de Tourcoing est de 0.89%
        2. En 2015 la ville comptait 96809 habitants
        3. Combien d'années faut-il pour atteindre 120 000 habitants ?
        4. Combien d'habitants y aura-t-il cette année-là ?
        5. Écrire un programme permettant de résoudre ce problème
         */


        int nbrA=0;

       while (96809 * Math.pow((1+ 0.0089),nbrA) < 120000){

           nbrA+=1;
       }
        nbrA+=2015;

        System.out.print("La population de Tourcoing dépassera les 120 000 habitants en "+nbrA+" pour environ 120815 habitants");

    }
}
