package hackerrank;

import java.util.Scanner;

public class SolveMeFirst {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int a = keyboard.nextInt();
        int b = keyboard.nextInt();

        int soma = a + b;

        System.out.println(soma);

        keyboard.close();
    }
}