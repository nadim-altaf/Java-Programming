class students {
  String name;
  int rollNo;
  int marks;

}

public class arrayOfObject {

  public static void main(String[] args) {

    students s1 = new students();
    s1.name = "amaan";
    s1.rollNo = 8;
    s1.marks = 98;

    students s2 = new students();
    s2.name = "aqib";
    s2.rollNo = 30;
    s2.marks = 99;

    students s3 = new students();
    s3.name = "nadim";
    s3.rollNo = 24;
    s3.marks = 88;

    students Student[] = new students[3];

    Student[0] = s1;
    Student[1] = s2;
    Student[2] = s3;

    // for (int i = 0; i < Student.length; i++) {
    // System.out.println(Student[i].name + " : " + Student[i].marks);
    // }

    // Enhanced FOR Loop

    for (students stud : Student) {
      System.out.println(stud.name + " : " + stud.marks);
    }

  }
}
