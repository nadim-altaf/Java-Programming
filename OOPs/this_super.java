class A {
  public A() {

    super();
    System.out.println("in A");
  }

  public A(int i) {

    super();
    System.out.println("in A int");
  }
}

class B extends A {
  public B() { // Constructors

    super();
    System.out.println("in B");
  }

  public B(int n) {

    this();
    System.out.println(("in B int"));
  }
}

public class this_super {

  public static void main(String[] args) {

    // B obj = new B(6);
    // obj = A();

  }

}
