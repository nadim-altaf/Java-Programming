import java.util.Scanner;

public class HallBooking {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] names = new String[10];
    String[] designations = new String[10];
    String[] times = new String[10];
    int[] durations = new int[10];
    int count = 0;

    int oneHourMeetings = 0;
    int twoHourMeetings = 0;
    int threeHourMeetings = 0;

    while (true) {
      System.out.println("\n--- Hall Booking ---");

      System.out.print("Enter designation: ");
      String designation = sc.nextLine();

      System.out.print("Enter name: ");
      String name = sc.nextLine();

      System.out.print("Enter meeting duration (1, 2, or 3 hours): ");
      int duration = sc.nextInt();
      sc.nextLine();

      if (duration == 1 && oneHourMeetings >= 4) {
        System.out.println("No slots available for 1-hour meetings.");
        continue;
      }
      if (duration == 2 && twoHourMeetings >= 2) {
        System.out.println("No slots available for 2-hour meetings.");
        continue;
      }
      if (duration == 3 && threeHourMeetings >= 1) {
        System.out.println("No slots available for 3-hour meetings.");
        continue;
      }

      System.out.print("Enter start time (e.g., 10:00): ");
      String time = sc.nextLine();

      if (designation.equalsIgnoreCase("VC")) {
        for (int i = count; i > 0; i--) {
          names[i] = names[i - 1];
          designations[i] = designations[i - 1];
          times[i] = times[i - 1];
          durations[i] = durations[i - 1];
        }
        names[0] = name;
        designations[0] = designation;
        times[0] = time;
        durations[0] = duration;
      } else {
        names[count] = name;
        designations[count] = designation;
        times[count] = time;
        durations[count] = duration;
      }

      count++;

      if (duration == 1)
        oneHourMeetings++;
      if (duration == 2)
        twoHourMeetings++;
      if (duration == 3)
        threeHourMeetings++;

      System.out.println("\nCurrent Bookings:");
      for (int i = 0; i < count; i++) {
        System.out.println(designations[i] + " " + names[i] + " - " + times[i] + " for " + durations[i] + " hour(s)");
      }

      System.out.print("\nBook another meeting? (yes/no): ");
      String more = sc.nextLine();
      if (!more.equalsIgnoreCase("yes")) {
        break;
      }
    }

    System.out.println("\nThank you for booking!");
    sc.close();
  }
}
