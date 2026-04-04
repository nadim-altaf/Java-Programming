import java.util.Scanner;

public class inputOfArray {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the number of elements : ");
    int n = scan.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements : ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scan.nextInt();
    }
    System.out.print("Print the elements");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    scan.close();
  }
}
