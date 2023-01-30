package operadores;

public class Operadores {
    public static void main(String[] args) throws Exception {
       
        String nome = "Izabela";
        String sobrenome = "França";
        System.out.println(nome + " " + sobrenome);

        int n1 = 5;
        int n2 = 2;
        int soma = n1 + n2;
        System.out.println(soma);

        soma++;
        System.out.println(soma);

        int a = 5;
        int b = 6;

        boolean resultado = a > b ? true : false;
        System.out.println(resultado);
    }
}
