package serieExoTableaux;

import java.util.Scanner;

public class ExoTab4Slide97 {
    public static void main(String[] args) {

        int[] tab1 = {5,8,9,2,6};
        int[] tab2 = {4,5,6};
        int i,j;
        boolean verif=false;


        //remplissage tableau
       Scanner scanner = new Scanner(System.in);
        System.out.println("saisir les chiffres du tableau1");
        for (i = 0; i <= tab1.length - 1; i++) {
            tab1[i] = scanner.nextInt();
        }
        System.out.println("saisir les chiffres du tableau2");
        for (j = 0; j <= tab2.length - 1; j++) {
            tab2[j] = scanner.nextInt();
        }

        //affichage tableau

        for( i=0;i<=tab1.length-1;i++){
            System.out.print(tab1[i]+" ");
        }
        System.out.println();

        for(j=0;j<=tab2.length-1;j++){
            System.out.print(tab2[j]+" ");
        }

        System.out.println();

        if (tab1.length != tab2.length){
            verif=false;
        }else {
               for (i = 0; i <= tab1.length - 1; i++) {
                   if (tab1[i]==tab2[i]){
                        verif=true;
                   }else{
                       verif=false;

                   }
               }
        }
        if(verif == true){
            System.out.println("les tableaux sont égaux");
        }else{
            System.out.println("les tableaux ne sont pas égaux");

        }
    }
}
