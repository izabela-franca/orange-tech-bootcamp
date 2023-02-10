package heranca.exercicio2;

public class App2 {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        //Upcasting
        Funcionario faxineiro = new Faxineiro();
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();

        //Downcasting - Not recommended
        // Faxineiro faxineiro2 = (Faxineiro) new Funcionario();
        //Gerente gerente2 = (Gerente) new Funcionario();
        //Vendedor vendedor2 = (Vendedor) new Funcionario();

    }
}
