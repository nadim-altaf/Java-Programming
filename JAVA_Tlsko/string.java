public class string {
  public static void main(String[] args) {
    // String name = new String("Nadim");

    // System.out.println(name.concat(" Altaf"));
    // System.out.println(name.charAt(5));

    String name = "Nadim";
    name = name + "Altaf"; // we are not changing the upper string we are juct change address of this bcx string are immutable
    // System.out.println(name.concat(" Altaf"));
    // System.out.println("hello " + name.concat(" Altaf"));
    System.out.println(name);

  }
}

// By default Strings are immutable (unchange)
