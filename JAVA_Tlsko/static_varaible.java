// STATIC VARIABLE AND STATIC METHOD

class Mobile {
  String brand;
  int price;
  static String name;

  public void show() {
    System.out.println(brand + " : " + price + " : " + name);
  }

  public static void show1(Mobile obj){

    System.out.println(obj.brand + " : " + obj.price + " : " + name);

  }
}

public class static_varaible {

  public static void main(String[] args) {

    Mobile obj1 = new Mobile();
    obj1.brand = "Apple";
    obj1.price = 45000;
    // Mobile.name = "I_Phone";

    Mobile obj2 = new Mobile();
    obj2.brand = "Redmi";
    obj2.price = 9865;
    // Mobile.name = "Samsung";

    Mobile.name = "SmartPhone"; // use class name instead of object name

    obj1.show();
    obj2.show();

    Mobile.show1(obj1);

  }
}