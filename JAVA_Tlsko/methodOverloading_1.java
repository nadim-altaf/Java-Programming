// Method overloading means defining multiple methods in the same class with the same name but different parameters (different type, number, or order of parameters).
// It allows a class to have more than one method with the same name, making it easier to perform similar tasks with different kinds of input.

// Same method name.
// Different parameter list (type, number, or sequence).
// Happens at compile time (called compile-time polymorphism).

// import other.tools.calc;

class calc {

  public int add(int n1, int n2) {
    return n1 + n2;
  }

  public int add(int n1, int n2, int n3) {
    return n1 + n2 + n3;
  }

  public double add(double n1, int n2) {
    return n1 + n2;
  }
}

public class methodOverloading_1 {
  public static void main(String[] args) {
    calc obj = new calc();
    int num = obj.add(2, 5, 8);
    System.out.println(num);
  }
}
