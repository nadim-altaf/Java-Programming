class Bus implements Runnable {
  int available = 1, passenger;

  Bus(int passenger) {
    this.passenger = passenger;
  }

  public synchronized void run() {
    String name = Thread.currentThread().getName();
    if (available >= passenger) {
      System.out.println(name + " Reserverd seat");
      available = available - passenger;
    } else {
      System.out.println("seat not avalable");
    }
  }
}

class syncThread {
  public static void main(String[] args) {
    Bus b = new Bus(1);
    Thread t1 = new Thread(b);
    Thread t2 = new Thread(b);
    Thread t3 = new Thread(b);
    t1.setName("aleem");
    t2.setName("nadim");
    t3.setName("humayun");

    t1.start();
    t2.start();
    t3.start();

  }
}
