import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do{
            System.out.print("Enter a size : ");
            size = scanner.nextInt();
            if(size > 20) {
                System.out.println("Size should not exceed 20");
            }
        }while (size > 20);
        int[] numbers = new int[size];
        int i = 0;
        while (i < numbers.length){
            System.out.print("Enter a element " + (i+1) + " : ");
            numbers[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Array : ");
        for( int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + "\t");
        }

        int max = numbers[0];
        int index = 1;
        for (int j = 0; j < numbers.length; j++) {
            if(numbers[j] > max) {
                max = numbers[j];
                index = j+1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
