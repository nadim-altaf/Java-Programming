public class exception {
  public static void main(String[] args) {
    int i = 0;
    int j = 0;
    int arr[] = new int[5];

    try {
      j = 18 / i;
      System.out.println(arr[1]);
      System.out.println(arr[5]);
    } 

    catch (ArithmeticException e) {
      System.out.println("be your limit" + e);
    } 
    
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("something went wrong!" + e);
    }

    System.out.println(j);
  }
}
