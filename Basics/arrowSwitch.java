import java.util.Scanner;

public class arrowSwitch {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter Day : ");
    String day = scan.nextLine();

    // String str;

    switch (day) {
      case "Saturday", "Sunday" -> System.out.println("7am");

      case "Monday" -> System.out.println("8am");

      case "Tuesday" -> System.out.println("7am");

      default -> System.out.println("10am");

    }
    scan.close();
  }
}

