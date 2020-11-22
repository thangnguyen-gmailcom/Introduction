import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Loan Amount : ");
        double loanAmount = sc.nextDouble();
        System.out.print("Interest Rate : ");
        double interestRate = sc.nextDouble();
        System.out.print("Month : ");
        int month = sc.nextInt();
        double interest = 0;
        for (int i = 0; i < month; i++) {
            interest += loanAmount * interestRate/12 * month;
        }
        System.out.println("interest : " + interest);
    }
}
