package loops;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

import java.util.Scanner;

public class Ex3_MaiorEMedia {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int maior = 0;
        int numero = 0;
        int cont = 0;

        do {
            System.out.println("Informe um número: ");
            numero = scanner.nextInt();
            if (numero > maior) {
                maior = numero;
            }
            soma = soma + numero;
            cont++;
        } while (cont < 5);
        System.out.println("Maior número: " + maior);
        System.out.println("Média dos números: " + (soma / 5));
    }
}
