import java.util.Scanner;

public class input_of_array {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the size of array : ");
    int n = scan.nextInt();

    System.out.println("Enter the " + n + " elements");

    int arr[] = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scan.nextInt();
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    scan.close();
  }
}
