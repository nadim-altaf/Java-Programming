class A extends Object{

 public A() {
 System.out.println("in A");
  }
  public A(int n){
     
    System.out.println("int n of A");
  }
}

class B extends A {
  
  public B() {
    super();
 System.out.println("in B");
  }
  
  public B(int n){
    this();
    System.out.println("int n of B");
  }
}


public class inheritance {
  public static void main(String[] args) {
    B obj = new B(7);


  }
}
