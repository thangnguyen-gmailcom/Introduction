import java.util.Scanner;

public class IsPrimes {
    public static void main(String[] args) {
        System.out.println("Check number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<2) {
            System.out.println("is not a prime number");
        }else {
            int i = 2 ;
            boolean check = true;
            while (i <= Math.sqrt(num)) {
                if(num % i == 0) {
                    check = false;
                }
                i++;
            }if(check) {
            System.out.println("is the prime number");
            }else  {
            System.out.println("is not a prime number");
            }
        }
    }
}
