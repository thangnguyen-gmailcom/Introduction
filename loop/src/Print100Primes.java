public class Print100Primes {
    public static void main(String[] args) {
        int num =100;
        int i = 2;
        while (i<=num){
            if(isPrime(i)){
                System.out.println("prime :" + i);
            }
            i++;
        }
    }
    public static boolean isPrime(int num) {
        if(num < 2) return false;
        int i = 2;
        while (i <= Math.sqrt(num)) {
            if(num % i++ == 0) return false;
        }
        return true;
    }
}
