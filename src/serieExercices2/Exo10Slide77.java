package serieExercices2;

import java.util.Scanner;

public class Exo10Slide77 {
    public static void main(String[] args) {
        /*
        1. Ecrire un programme qui permet de vérifier si un profil est valable pour une candidature
        2. Le profil contient trois critères :
        age : supérieur à 30 ans
        salaire demandé : maximum 40 000€
        années d'expériences : minimum 5 ans
        3. Afficher un message pour chaque condition non respectée
         */


        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez l'age : ");
        int age = scanner.nextInt();
        System.out.print("Entrez le salaire demander : ");
        int salaire = scanner.nextInt();
        System.out.print("Entrez le nombre d'annees d'experience : ");
        int experience = scanner.nextInt();

      if(age<30){
          System.out.println("Vous êtes trop jeune");
      }
      if (salaire>40000){
          System.out.println("Vous êtes trop chere");

      }
      if (experience<5){
          System.out.println("Vous manquez d'expérience");
      }

      if (age>30 && salaire <= 40000 && experience>=5 ){
          System.out.println("votre condidature est retenue");
      }








    }
}
