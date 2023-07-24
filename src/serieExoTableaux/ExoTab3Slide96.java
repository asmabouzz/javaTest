package serieExoTableaux;

import java.util.Scanner;

public class ExoTab3Slide96 {

    public static void main(String[] args) {

        int [] tab1 = new int[5];
        int max=0;
        int pos=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("saisir les chiffres du tableau");
        for (int i=0;i<=tab1.length-1;i++){
            tab1[i]=scanner.nextInt();
        }


        for (int i=0;i<=tab1.length-1;i++){
            if(tab1[i]>max){
                max=tab1[i];
                pos=i;
            }
        }
        System.out.println("la plus grande valeur du tableau est "+max+" et son indice est "+pos);


    }
}
