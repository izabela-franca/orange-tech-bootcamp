package loops;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class Ex4_ParEImpar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cont = 0;
        int pares = 0;
        int impares = 0;
        int n;
        int numero;

        System.out.println("Insira a quantidade de números desejada: ");
        n = scanner.nextInt();

        while (cont < n) {
            System.out.println("Informe um número: ");
            numero = scanner.nextInt();
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            cont++;
        }
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}
