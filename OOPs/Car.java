class Car {
   String brand;
  int speed;

  public static void main(String[] args) {
    Car myCar = new Car(); // Creating an object of the Car class
    myCar.brand = "Toyota";
    myCar.speed = 120;

    Car yoursCar = new Car();
    yoursCar.brand = "ALTO";
    yoursCar.speed = 134;

    

    System.out.println("Car Brand: " + myCar.brand);
    System.out.println("Speed: " + yoursCar.speed + " km/h");
  }
}
