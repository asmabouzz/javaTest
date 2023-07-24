package serieExoTableaux;

import java.util.Scanner;

public class ExoTab2Slide95 {

    public static void main(String[] args) {
        int [] tab1 = new int[10];
        int [] tab2 = new int[10];
        int i,j ;
        j=0;

        //remplir tab
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisir les chiffres du tableau");
        for (i=0;i<=tab1.length-1;i++){
            tab1[i]=scanner.nextInt();
        }


        for (i=0;i<=tab1.length-1;i++){

                if(tab1[i]>0){
                    tab2[j]=tab1[i];
                j++;
                }

        }

        //affichage tab

        for( i=0;i<=tab1.length-1;i++){
            System.out.print(tab1[i]+" ");
        }
        System.out.println();

        for(j=0;j<=tab2.length-1;j++){
            System.out.print(tab2[j]+" ");
        }



    }

}
