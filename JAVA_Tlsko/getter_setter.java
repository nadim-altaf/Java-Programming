/*
 Getters: Methods to get (read) the value of private variables.

Setters: Methods to set (update) the value of private variables.

They help with encapsulation (data hiding).

 */

class Human {
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public void setName(String name) { // The this keyword in Java refers to the current object of the class.Used to
                                     // avoid confusion and refer to instance variables or methods.
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

}

public class getter_setter {
  public static void main(String[] args) {
    Human obj = new Human();

    obj.setAge(23);
    obj.setName("Nadim");

    System.out.println(obj.getName() + " : " + obj.getAge());
  }
}
