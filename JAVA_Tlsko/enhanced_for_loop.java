/*  The enhanced for loop, also known as the for-each loop, is a simpler way to iterate through elements in arrays and collections in Java.*/

/*💡 You can use it with:

✅ Data Type	✔️ Example Type
Arrays	--->  int[], String[]
Collections ----> 	ArrayList, LinkedList, HashSet, TreeSet, etc.
Maps ---> (via entrySet)	HashMap, TreeMap
Custom Iterable Types ---> 	Any class that implements Iterable
 */

class Students {
  String name;
  int rollno;
  int marks;
}

public class enhanced_for_loop {
  public static void main(String[] args) {
    Students S1 = new Students();
    S1.name = "Aqib";
    S1.rollno = 30;
    S1.marks = 99;

    Students S2 = new Students();
    S2.name = "Nadim";
    S2.rollno = 24;
    S2.marks = 97;

    Students S3 = new Students();
    S3.name = "Amaan";
    S3.rollno = 8;
    S3.marks = 98;

    Students std[] = new Students[3];
    std[0] = S1;
    std[1] = S2;
    std[2] = S3;

    System.out.println("Name : RollNO : Marks");
    System.out.println();

    for (Students stud : std) {

      System.out.println(stud.name + " : " + stud.rollno + " : " + stud.marks);

    }

  }
}
