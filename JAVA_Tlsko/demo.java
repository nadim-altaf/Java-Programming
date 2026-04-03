class cal {
  int a;

  public int add(int n1, int n2) {
    int r = n1 + n2;
    return r;
  }

  public String getPen(int cost) {
    if (cost > 10)
      return "pen";

    else
      return "nothing";

  }

  public class demo {
    public static void main(String[] args) {
      cal c = new cal();
      int sum = c.add(4, 6);
      System.out.println(sum);

      String str = c.getPen(11);
      System.out.println(str);
    }
  }
}
