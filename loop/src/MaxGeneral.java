import java.util.Scanner;

public class MaxGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number one :");
        int numOne = sc.nextInt();
        System.out.print("Enter number tow :");
        int numTow = sc.nextInt();
        if( numOne == 0 || numTow == 0) {
            int result =numOne + numTow;
            System.out.println("Max General :" + result);
        }
        while (numOne != numTow) {
            if(numOne > numTow) {
                numOne = numOne - numTow;
            }else {
                numTow = numTow - numOne;
            }
        }
        System.out.println("Max General :" +numOne);
    }
}
