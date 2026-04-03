class Human {
  private String name;
  private int age;

  public Human() {
    name = "aqib";
    age = 6;
  }

  public Human(String myname) {
    name = myname;
    age = 7;
  }

  /*
   * Constructor Overloading means creating multiple constructors in a class with
   * the same name (class name) but different parameter lists.
   * Rules of Constructor Overloading:
   * Same class name as the class.
   * 
   * Different number or type of parameters.
   * 
   * Java decides which constructor to call based on the arguments you pass.
   * 
   * Why Use Constructor Overloading?
   * To create objects in different ways
   * 
   * To provide default, partial, or full initialization
   * 
   * To improve code flexibility
   */
  public Human(String myname, int myage) {
    name = myname;
    age = myage;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

}

public class constructor {
  public static void main(String[] args) {
    Human obj = new Human();
    // Human obj = new Human("aqib");
    // Human obj = new Human("aqib",88);

    // obj.setAge(23);
    // obj.setName("Nadim");

    System.out.println(obj.getName() + " : " + obj.getAge());
  }
}
