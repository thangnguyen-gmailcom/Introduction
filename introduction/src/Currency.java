import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        double rate = 23000;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount to convert !");
        double USD = input.nextDouble();
        double VND = USD * rate;
        System.out.println("Enter in VND "+ VND);
    }
}
