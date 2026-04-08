public class Three_D_Array {
  public static void main(String[] args) {

    int[][][] arr = new int[3][4][5]; // 3 blocks, 4 rows, 5 columns

    // Filling the 3D array with random values
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        for (int k = 0; k < 5; k++) {
          arr[i][j][k] = (int) (Math.random() * 100);
        }
      }
    }

    // Printing the 3D array
    for (int i = 0; i < 3; i++) {
      System.out.println("Block " + i + ":");
      for (int j = 0; j < 4; j++) {
        for (int k = 0; k < 5; k++) {
          System.out.print(arr[i][j][k] + "\t");
        }
        System.out.println();
      }
      System.out.println(); // empty line between blocks
    }
  }
}
