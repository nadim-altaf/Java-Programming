public class othermethodOfSwitch {

  public static void main(String[] args) {
    String day = "Wed";
    String result = "";
    result = switch(day)
    {
      case "Mon","Tues" -> "7pm";
      case "Wed" -> "8am";
      default -> "6am";
    };
    System.out.println(result);
  }
}
