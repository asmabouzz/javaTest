package serieExoTableaux;


public class ExoTab1Slide94 {
    public static void main(String[] args) {

    int [] tab = new int[99];
    int cpt=0;

    for(int i=0;i<=tab.length;i++){

            System.out.print(i+" ");
            cpt++;

           if(cpt ==10){

               System.out.println();
               cpt =0;
           }
    }

    }
}
