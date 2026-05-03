import java.util.Scanner;

public class inputArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of array : ");
    int n = sc.nextInt();

    int arr[] = new int[n];
    System.out.println("Enter " + n + " Elements");

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("print array");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");

    }
    System.out.println();
    sc.close(); // optional but good practice
  }

}
