/*Encapsulation is one of the four main pillars of Object-Oriented Programming (OOP).
It means binding (hiding) the data and code together into one unit and restricting access to some parts of the object.

Encapsulation means hiding the data (variables) of a class from outside access and only allowing it through methods (getters/setters).
 
Encapsulation = Data hiding + Getter/Setter
 */

class Human {
  private String name;
  private int age = 12;

  public String getName() { // we call it Gettter, -> we can change the name of getName like abc
    return name;
  }

  public void setName(String n) { // we call it Settter, -> we can change the name of setName like xyz
    name = n;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int a) {
    age = a;
  }

}

public class encapsulation {
  public static void main(String[] args) {
    Human obj = new Human();

    obj.setAge(33);
    obj.setName("Nadim");

    System.out.println(obj.getName() + " : " + obj.getAge());
  }
}
