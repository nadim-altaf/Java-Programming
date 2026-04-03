
/*  An array is a container object that holds a fixed number of values of a single type.
 The length of an array is fixed when it is created.
 Each item in an array is called an element, and each element is accessed by its index (starting from 0)
*/
public class array {
  public static void main(String[] args) {

    int num[] = new int[5];
    num[0] = 1;
    num[1] = 2;
    num[2] = 3;
    num[3] = 4;
    num[4] = 5;

    for(int i = 0; i<5;i++)
     { 
        System.out.print(num[i]);
     }

    
}
}

