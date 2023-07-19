package serieExercices2;

public class Exo13Slide80 {
    public static void main(String[] args) {
        /*
        1. Créer un programme permettant d'afficher les tables de multiplications de 1 à 10
         */

        for(int i=1;i<=10;i++){
            System.out.println("la table de multiplication de "+i+" : ");
            for(int j=0;j<=10;j++){
                System.out.println(" \t "+i+" * "+j+" = "+i*j);
            }
        }
    }
}
