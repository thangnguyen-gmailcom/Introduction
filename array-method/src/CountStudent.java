import java.util.Scanner;

public class CountStudent {
    public static void main(String[] args) {
        int size;
            Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Enter a size : ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("size should not exceed");
            }
        }while (size>30);
        int[] array = new int[size];
        int i = 0;
        for (i = 0;  i < size ; i++) {
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        int count = 0;
        System.out.print("List of mark : ");
        for (int j = 0; j <size ; j++) {
            System.out.print(array[j] + ",");
            if(array[j] >= 5 && array[j] <= 10) {
                count++;
            }
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }
}
