import java.util.Scanner;

class FoodItem {
  String name;
  int price;

  FoodItem(String name, int price) {
    this.name = name;
    this.price = price;
  }

  int getTotalPrice(int quantity) {
    return price * quantity;
  }
}


class Pizza extends FoodItem {
  Pizza() {
    super("Pizza", 250);
  }

  
  int getTotalPrice(int quantity) {
    return (price * quantity) - (10 * quantity); 
  }
}

class Burger extends FoodItem {
  Burger() {
    super("Burger", 120);
  }
}

class Juice extends FoodItem {
  Juice() {
    super("Juice", 80);
  }
}

public class FoodOrder {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Pizza pizza = new Pizza();
    Burger burger = new Burger();
    Juice juice = new Juice();

    System.out.println("Welcome to Simple Food Ordering!");
    System.out.println("1. " + pizza.name + " - Rs " + pizza.price);
    System.out.println("2. " + burger.name + " - Rs " + burger.price);
    System.out.println("3. " + juice.name + " - Rs " + juice.price);

    try {
      System.out.print("Enter item number (1-3): ");
      int choice = sc.nextInt();

      System.out.print("Enter quantity: ");
      int qty = sc.nextInt();

      if (qty <= 0) {
        throw new Exception("Quantity should be at least 1.");
      }

      if (qty > 5) {
        throw new Exception("Sorry! Item out of stock.");
      }

      FoodItem item;

      if (choice == 1) {
        item = pizza;
      } else if (choice == 2) {
        item = burger;
      } else if (choice == 3) {
        item = juice;
      } else {
        throw new Exception("Invalid item number.");
      }

      int total = item.getTotalPrice(qty);
      System.out.println("You ordered " + qty + " " + item.name + "(s).");
      System.out.println("Total amount: Rs " + total);

    } catch (Exception e) {
      
      System.out.println("Error: " + e.getMessage());
    }

    sc.close();

  }
}