package estrutura;

public class App1 {

    public static void main(String[] args) {

        Carro c1 = new Carro();
        c1.setCor("branco");
        c1.setModelo("onix");
        c1.setCapacidadeTanque(44);

        System.out.println(c1.getCor());
        System.out.println(c1.getModelo());
        System.out.println(c1.getCapacidadeTanque());
        System.out.println(c1.totalValorTanque(5.2));

        System.out.println("-------------");

        Carro c2 = new Carro("prata", "corola", 50);
        System.out.println(c2.getCor());
        System.out.println(c2.getModelo());
        System.out.println(c2.getCapacidadeTanque());
        System.out.println(c2.totalValorTanque(5.2));

    }
}
