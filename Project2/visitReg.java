import java.util.Scanner;;

class visit {

  String name;
  String entryTime;
  String departmentVisited;
  String purposeOfVisit;
  String placeToVisit;

  void VisitorReg() {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter visitor's Name : ");
    name = sc.nextLine();
    System.out.print("Enter entry Time : ");
    entryTime = sc.nextLine();
    System.out.print("Enter departement : ");
    departmentVisited = sc.nextLine();
    System.out.print("Enter purpose : ");
    purposeOfVisit = sc.nextLine();
    System.out.print("Enter place : ");
    placeToVisit = sc.nextLine();
    sc.close();
  }
}

class exit {

  String Name;
  String exit_Time;

  void vistorExit() {

    Scanner sc1 = new Scanner(System.in);

    System.out.println("Enter Vistor who Exits : ");
    Name = sc1.nextLine();

    System.out.println("Enter exit Time : ");
    exit_Time = sc1.nextLine();
    sc1.close();
  }
}

class incident {

  String incidentType;
  String location;
  String time;

  void incidentReg() {

    Scanner sc2 = new Scanner(System.in);

    System.out.println("Enter incident type : ");
    incidentType = sc2.nextLine();
    System.out.println("Enter incident location : ");
    location = sc2.nextLine();
    System.out.println("Enter incident type : ");
    time = sc2.nextLine();
    sc2.close();
  }
}

public class visitReg {
  public static void main(String[] args) {

    Scanner sc3 = new Scanner(System.in);

    visit obj1 = new visit();
    obj1.VisitorReg();

    exit obj2 = new exit();
    obj2.vistorExit();

    System.out.println("was there an incident?(Y/N)");
    String choice = sc3.nextLine();
    if (choice == "Y") {
      incident obj3 = new incident();
      obj3.incidentReg();
      sc3.close();
    }

  }

}
