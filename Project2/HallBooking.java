import java.util.Scanner;

public class HallBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[10];
        String[] designations = new String[10];
        String[] times = new String[10];
        int[] durations = new int[10];
        int count = 0;

        int oneHour = 0;
        int twoHour = 0;
        int threeHour = 0;

        while (true) {
            System.out.println("\n Hall Booking ");

            System.out.print("Enter designation (VC or others): ");
            String designation = sc.nextLine();

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter meeting duration (1, 2, or 3 hours): ");
            int duration = sc.nextInt();
            sc.nextLine();

            if (duration != 1 && duration != 2 && duration != 3) {
                System.out.println("Invalid duration. Please enter 1, 2, or 3 hours only.");
                continue;
            }

            if (duration == 1 && oneHour >= 4) {
                System.out.println("No slots available for 1-hour meetings.");
                continue;
            }
            if (duration == 2 && twoHour >= 2) {
                System.out.println("No slots available for 2 hour meetings.");
                continue;
            }
            if (duration == 3 && threeHour >= 1) {
                System.out.println("No slots available for 3-hour meetings.");
                continue;
            }

            System.out.print("Enter start time (e.g., 10:00): ");
            String time = sc.nextLine();

            boolean timeConflict = false;
            for (int i = 0; i < count; i++) {
                if (times[i].equals(time)) {
                    timeConflict = true;
                    break;
                }
            }

            if (timeConflict) {
                System.out.println("This time slot is already booked. Please choose a different time.");
                continue;
            }

            if (designation.equalsIgnoreCase("VC") && count == 10) {
                int indexToRemove = -1;
                for (int i = count - 1; i >= 0; i--) {
                    if (!designations[i].equalsIgnoreCase("VC")) {
                        indexToRemove = i;
                        break;
                    }
                }

                if (indexToRemove != -1) {
                    if (durations[indexToRemove] == 1) oneHour--;
                    if (durations[indexToRemove] == 2) twoHour--;
                    if (durations[indexToRemove] == 3) threeHour--;

                    for (int i = indexToRemove; i < count - 1; i++) {
                        names[i] = names[i + 1];
                        designations[i] = designations[i + 1];
                        times[i] = times[i + 1];
                        durations[i] = durations[i + 1];
                    }

                    count--;
                    System.out.println("Booking of a non-VC cancelled to accommodate VC.");
                } else {
                    System.out.println("No non-VC bookings to cancel. Cannot accommodate VC.");
                    continue;
                }
            } else if (count == 10) {
                System.out.println("Maximum booking limit reached!");
                break;
            }

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

            if (duration == 1) oneHour++;
            if (duration == 2) twoHour++;
            if (duration == 3) threeHour++;

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

        System.out.println("\nThank you fo booking");
        sc.close();
    }
}
