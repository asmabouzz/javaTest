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

        int minAge = 30;
        int maxSalaire = 40000 ;
        int minExperiance=5;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez l'age : ");
        int age = scanner.nextInt();
        System.out.print("Entrez le salaire demander : ");
        int salaire = scanner.nextInt();
        System.out.print("Entrez le nombre d'annees d'experience : ");
        int experience = scanner.nextInt();

      if(age<30){
          System.out.println("Vous êtes trop jeune");
      }else if (salaire>40000){
          System.out.println("Vous êtes trop chere");

      }else if (experience<5){
          System.out.println("Vous manquez d'expérience");
      }else{
          System.out.println("votre condidature est retenue");
      }








    }
}
