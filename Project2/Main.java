class Student {

  int rollNo;
  String studentName;
}

public class Main {
  public static void main(String[] args) {
    Student obj1 = new Student();
    obj1.rollNo = 6;
    System.out.println("roll no. is : " + obj1.rollNo);
    obj1.studentName = "Aleem";
    System.out.println("Name of student is : " + obj1.studentName);

  }

}
