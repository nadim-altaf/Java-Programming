public class array {

  public static void main(String[] args) {
    // int arr[] = new int[6];
    // arr[0] = 1;
    // arr[1] = 2;
    // arr[2] = 3;
    // arr[3] = 4;
    // arr[4] = 5;
    // arr[5] = 6;
  //   int arr[] = {1,2,3,4,5};
  //   for(int i = 0; i<arr.length;i++)
  //   {
  //     System.out.print(arr[i] + " ");
  //   }
  // }

int arr[][] = {{1,2,3},{1,2,3},{1,2,3}};

for(int i = 0; i<arr.length;i++){
    for(int j = 0; j<arr.length;j++){
 System.out.print(arr[i][j] + " ");
    }
   System.out.println();
}


  }}