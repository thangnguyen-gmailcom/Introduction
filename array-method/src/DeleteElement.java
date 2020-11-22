import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size, i, j;
        do{
            System.out.print("Enter a size : ");
            size = scanner.nextInt();
        }while (size <= 0);

        int[] array = new int[size];
        for(i = 0; i < size; i++) {
            System.out.print("Enter element " + i + " : ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter a V : ");
        int V = scanner.nextInt();

        for(j = i = 0; i < size; i++ ) {
            if(array[i] != V) {
                array[j] = array[i];
                j++;
            }
        }
        size = j;

        System.out.println("Array after deletion " + V + " : ");
        for (i = 0 ; i < size; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
