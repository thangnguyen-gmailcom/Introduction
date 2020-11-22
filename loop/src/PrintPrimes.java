import java.util.Scanner;

public class PrintPrimes {
    public static void main(String[] args) {
        System.out.println("so luong so nguyen to can in ra :");
        int num = getNumber();
        int count = 0;
        int n = 2;
        while ( count < num){
            if(isPrime(n)) {
                System.out.println("is prime :" + n);
                count++;
            }
            n++;
        }
    }
    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            num = scanner.nextInt();
        }while (num <= 0);
        scanner.close();
        return num;
    }
    public static boolean isPrime(int num) {
        if(num < 2) return false;
        int i = 2;
        while (i <= Math.sqrt(num)){
            if (num % i++ == 0) return false;
        }
        return true;
    }
}
