import java.util.Scanner;

public class taking_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter the number : ");
//        int num_1 = sc.nextInt();
//        System.out.println("The number is : " + num_1);

        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        System.out.println("The name is : " + name);
        sc.close();
    }
}
