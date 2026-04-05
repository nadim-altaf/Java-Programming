public class jagged {
  public static void main(String[] args) {

    // A 2D array where rows can have different lengths.

    int arr[][] = new int[3][]; //jagged array

    arr[0] = new int[2];
    arr[1] = new int[3];
    arr[2] = new int[4];

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = (int) (Math.random() * 10); //  Math.random() -> Generates a random double between 0.0 and 1.0
      }

    }

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
