public class Usuario {

  public static void main(String[] args) {
    
    SmartTv smartTv = new SmartTv();

    smartTv.ligar();
    System.out.println("Tv ligada? " + smartTv.ligada);
    smartTv.desligar();
    System.out.println("Tv ligada? " + smartTv.ligada);

    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    System.out.println("Volume: " + smartTv.volume);
    smartTv.diminuirVolume();
    System.out.println("Volume: " + smartTv.volume);

    smartTv.aumentarCanal();
    System.out.println("Canal: " + smartTv.canal);
    smartTv.diminuirCanal();
    System.out.println("Canal: " + smartTv.canal);
    smartTv.mudarCanal(12);
    System.out.println("Canal: " + smartTv.canal);

  }  
}
