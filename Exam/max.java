public class max {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 9, 4 };
    int max = -1;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max)
        max = arr[i];
        
    }
    System.out.println(max);

  }
}
