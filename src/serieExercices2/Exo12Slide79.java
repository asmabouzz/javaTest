package serieExercices2;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Exo12Slide79 {
    public static void main(String[] args) {
        /*
        1. Créer un programme qui permet d'afficher un nombre de chapitres et de sous-parties
        2. Le programme demandera le nombre de chapitres ainsi que le nombre de sous-parties à afficher
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre des chapitres : ");
        int chapitre = scanner.nextInt();
        System.out.print("Entrez le nombre des sous chapitres : ");
        int sousCh = scanner.nextInt();

        for(int i=1;i<=chapitre;i++){
            System.out.println("Chapitre "+i);
            for(int j=1;j<=sousCh;j++){
                System.out.println("\t Sous-partie "+i+"."+j);
            }
        }

    }
}
