class Students {
  String name;
  int rollno;
  int marks;
}

public class arrayobj {
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
    // for(int i = 0; i< std.length;i++)
    // {
    //   System.out.print(std[i].name + " : "+ std[i].rollno + " : " + std[i].marks );
    //    System.out.println("\n");
    // }
    for(Students n : std){ // enhanced for loop 
  System.out.println(n.name + ":" + n.rollno + ":" + n.marks);
    }
    }

  }
