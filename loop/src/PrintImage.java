import java.util.Scanner;

public class PrintImage {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);

        while (choice!=0) {
            choice = sc.nextInt();
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println(" Enter choice");

            switch (choice) {
                case 1:
                    System.out.println("1. Print the rectangle");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");

                    break;
                case 2:
                    System.out.println("2. Print the square triangle");
                    for (int i = 0; i <= 5; i++) {
                        System.out.println("");
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                    }
                    break;
                case 3:
                    System.out.println("3. Print isosceles triangle");
                    for (int i = 5; i >= 0; i--) {
                        System.out.println("");
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                    }
                    break;
                case 0 :
                    System.exit(0);
                default:
                    System.out.println("no choice !");
            }
        }
    }
}
