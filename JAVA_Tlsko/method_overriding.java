 class A {
  public void show() {
    System.out.println("in A show");
  }

  public void config() {
    System.out.println("in A config");
  }

}

class B extends A {

  public void show() {
    System.out.println("in B show"); // overridinf in class A in show method
  }
}

public class method_overriding {

  public static void main(String[] args) {

    B obj = new B();
    obj.show();
    obj.config();
    
  }
}
