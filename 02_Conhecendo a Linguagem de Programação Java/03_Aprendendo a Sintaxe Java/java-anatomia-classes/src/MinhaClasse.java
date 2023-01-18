public class MinhaClasse {
  
  public static void main(String[] args) {
    System.out.println("Hello, world!.");

    //Creating Variables
    String name = "Izabela";
    String lastName = "França";
    String fullName = fullName(name, lastName);
    int age = 31;
    double height = 1.69;
    boolean student = true;    

    System.out.println(fullName);

  }

  //Creating methods
  public static String fullName (String name, String lastName) {
    return name.concat(" ").concat(lastName);
  }
}
