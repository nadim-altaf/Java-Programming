public class Q3 {
  public static void main(String[] args) {
    int[] arr = { 2, 4, 6, 8 };
    System.out.println("double the array");

    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] * 2;
      System.out.print(arr[i] + " ");
    }
  }
}
