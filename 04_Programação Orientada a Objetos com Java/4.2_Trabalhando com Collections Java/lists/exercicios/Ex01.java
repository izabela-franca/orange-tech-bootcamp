package lists.exercicios;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();

        int op = 0;
        double soma = 0.0;

        //Adicionando temperaturas na lista:
        while (op < 6 ) {
            System.out.println("Digite a temperatura: ");
            double temp = scanner.nextDouble();
            temperaturas.add(temp);
            soma += temp;
            op++;
        }

        //Calculando e exibindo a média das temperaturas
        double media = soma / temperaturas.size();
        System.out.println("Temperatura média semestral: " + media);

        //Exibindo temperaturas acima da média
        System.out.println("Temperaturas acima da média: ");
        for (double temp : temperaturas) {
            if (temp > media) {
                int index = temperaturas.indexOf(temp);
                switch (index) {
                    case 0:
                        System.out.println((index + 1) + " - Janeiro: " + temp) ;
                        break;
                    case 1:
                        System.out.println((index + 1) + " - Fevereiro: " + temp) ;
                        break;
                    case 2:
                        System.out.println((index + 1) + " - Março: " + temp) ;
                        break;
                    case 3:
                        System.out.println((index + 1) + " - Abril: " + temp) ;
                        break;
                    case 4:
                        System.out.println((index + 1) + " - Maio: " + temp) ;
                        break;
                    case 5:
                        System.out.println((index + 1) + " - Junho: " + temp) ;
                        break;
                }
            }
        }
    }
}
