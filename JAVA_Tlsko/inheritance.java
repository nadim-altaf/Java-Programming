class A {
  String work;
  int batch;
  String branch;

  A() {
    work = "studying";
    batch = 23;
    branch = "CSE";
  }

  void printDetails(String name) {
    System.out.println("Student Name: " + name);
    System.out.println("Work: " + work);
    System.out.println("Batch: " + batch);
    System.out.println("Branch: " + branch);
    System.out.println("---------------------");
  }
}

class B extends A {
  String std_name;

  B() {
    std_name = "Amaan";
  }

  void display() {
    printDetails(std_name);
  }
}

class C extends A {
  String std_name;

  C() {
    std_name = "Aqib";
  }

  void display() {
    printDetails(std_name);
  }
}

public class inheritance {
  public static void main(String[] args) {
    B objB = new B();
    objB.display();

    C objC = new C();
    objC.display();
  }
}
