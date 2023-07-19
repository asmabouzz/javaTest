package serieExercices2;

import java.util.Scanner;

public class Exo16Slide83 {
    public static void main(String[] args) {
        /*
        1. Créer une variable stockant le nombre de notes à saisir
        2. Afficher la note la plus haute
        3. Afficher la note la plus basse
        4. Afficher la moyenne des notes
        5. /!\ la note doit être comprise entre 0 et 20
         */


        Scanner scanner = new Scanner(System.in);
        System.out.print("Combien de notes souhaitez-vous saisir :");
        int nbrN = scanner.nextInt();

        int [] notes = new int [nbrN];
        int saisie;
        for (int i=0;i<=notes.length-1;i++){
             saisie=scanner.nextInt();
           if (saisie<=20 && saisie>=0){
               notes[i]=saisie;
           }else {
               System.out.println("veuiller saisir une note entre 0 et 20");
               saisie=scanner.nextInt();
               notes[i]=saisie;
           }

        }

        int petit=21;
        int grand=notes[1];
        int moyenne=0;

        for (int i=0;i<=notes.length-1;i++){

            if (notes[i]<petit){
                petit=notes[i];
            }else if(notes[i]>grand){
                grand=notes[i];
            }
            }


        System.out.println("le plus petit est : "+petit);
        System.out.println("le plus grand est : "+grand);

    }

}
