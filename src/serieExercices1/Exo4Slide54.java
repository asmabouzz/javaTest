package serieExercices1;

import java.util.Scanner;

public class Exo4Slide54 {
    public static void main(String[] args) {

        int age = 18;
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisir age :");
        int ageSaisie = scanner.nextInt();

        boolean result= ageSaisie > age;
        System.out.println(result);

    }
}
