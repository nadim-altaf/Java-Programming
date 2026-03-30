import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Principle : ");
        float p = scan.nextFloat();
        System.out.println(p);

        System.out.print("Enter Rate os Interest : ");
        float r = scan.nextFloat();

        System.out.print("Enter Time : ");
        float t = scan.nextFloat();

        float SI = (p * r * t) / 100;

        System.out.println("Principle is : " + p);
        System.out.println("Rate is Interest is : " + r);
        System.out.println("Time is : "+t);

        System.out.println("Simple Interest is : " + SI);
        scan.close();
    }
}
