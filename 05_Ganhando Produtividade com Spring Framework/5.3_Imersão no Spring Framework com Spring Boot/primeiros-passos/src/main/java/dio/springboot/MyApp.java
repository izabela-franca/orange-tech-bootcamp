package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//Necessário para eliminar a existência do "new": implments CommandLineRunner e @Component

@Component
public class MyApp implements CommandLineRunner {

    @Autowired //Para injeção de dependências
    private Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("O resultado é: " + calculadora.somar(2, 5));
    }

}
