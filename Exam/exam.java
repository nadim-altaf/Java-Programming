public class exam {
  public static void main(String[] args) {

    System.out.print("hello\n"); // println -> print and gives next line
    System.out.println("hello");

    System.out.println();

    int a = 5; // laterals
    System.out.println(a);

    System.out.println();

    int b = 65;

    char c = (char) b;

    System.out.println(c);

    float f = 56.4f;

    int i = (int) f;
    System.out.println(i);

    // ternanry operator

    int n = 4;
    int r = 0;

    r = n % 2 == 0 ? 10 : 20;

    System.out.println(r);

    // switch

    int j = 7;

    switch (j) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thurday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("invalid!");
    }

    // new switch statement

    // in screenshot on phone 18 april 2025

    // Array

    int[] ages;
    ages = new int[10];
    ages[1] = 2;
    ages[2] = 3;
    ages[3] = 7;
    ages[4] = 5;
    ages[5] = 9;

    System.out.println(ages[3]);
   
    for (int k = 1; k <= ages[10]; k++) {
        System.out.println(ages[k] +" ");
    }

  }
}
