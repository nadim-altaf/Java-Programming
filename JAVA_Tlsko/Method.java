class Algebra {
  int num = 5;

  int add(int n1, int n2) {
    int ans = n1 + n2;
    return ans;
  }
}

public class Method {
  public static void main(String[] args) {
    Algebra obj = new Algebra();
    Algebra obj1 = new Algebra();
    int ans = obj.add(2, 3);
    System.out.println(ans);
    obj.num = 15;
    System.out.println(obj.num);
    System.out.println(obj1.num);
  }
}
