public class secondLargNo {
  public static void main(String[] args) {
    int arr[] = { 40, 80, 10, 30, 20 };
    int largest = arr[0];
    int second = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > largest)
       {
        second = largest;
        largest = arr[i];
      } else if (arr[i] > second && arr[i] != largest)
       {
 
      }

    }
   System.out.println("second largest element is :" + second);
  }
}
