import java.util.Scanner;

public class sumOFNum {
    public static void main(String[] args) {
        Scanner scan; // reference
        scan = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int num_1 = scan.nextInt();
        System.out.print("Enter 2nd Number : ");
        int num_2 = scan.nextInt();

        int sum = num_1 + num_2;
        System.out.println("Sum of given two numbers is : " + sum);
        scan.close();
    }
}
