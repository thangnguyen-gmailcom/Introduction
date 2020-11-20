import java.util.Arrays;
import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        double rate = 23.000;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount to convert !");
        double USD = input.nextDouble();
        double VND = USD * rate;
        System.out.print("Amount in VND ");
        System.out.printf( "%.3f",VND);
    }
}
