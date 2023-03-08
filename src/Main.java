/**
 * @author Mateus
 * @since 07/02/2023
 * @version 1
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String input1, input2;
        System.out.println(" Digite o primeiro valor");
        input1 = leitor.nextLine();
        System.out.println(" Digite o segundo valor");
        input2 = leitor.nextLine();
        int a, b;
//        Converte a string para inteiro
        a = Integer.parseInt(input1);
        b = Integer.parseInt(input2);
        int c = a + b;
        System.out.println("Resultado da soma = " + c);
    }
    /*  Outra maneira
        Scanner leitor = new Scanner(System.in);
        int a, b;
        System.out.println(" Digite o primeiro valor");
        a = Integer.parseInt(leitor.nextLine());
        System.out.println(" Digite o segundo valor");
        b = Integer.parseInt(leitor.nextLine());

        int c = a + b;
        System.out.println("Resultado da soma = " + c);*/
}