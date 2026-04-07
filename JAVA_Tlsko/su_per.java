class A {
  A() {
    super();
    System.out.println("in A");
  }

  A(int n) {
    super();
    System.out.println("in A int");
  }
}

class B extends A {
  B() {
    super();
    System.out.println("in B");
  }

  B(int n) {
    this();
    System.out.println("in B int");
  }
}

public class su_per {
  public static void main(String[] args) {

    B obj = new B(4);

  }

}
