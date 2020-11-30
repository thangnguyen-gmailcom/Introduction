import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        array = addInt(array, 34);

        System.out.print("New array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ,");
        }
    }

    public static int[] addInt(int[] array, int newInt) {
        int[] newArray = new int[array.length + 1];
        int pos;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("index :");
             pos = scanner.nextInt();
        }while (pos < 0 || pos >= newArray.length);
        for (int i = 0; i < pos; i++) {
            newArray[i] = array[i];
        }
        newArray[pos] = newInt;
        for (int i = pos + 1; i < newArray.length; i++) {
            newArray[i] = array[i - 1];
        }

        return newArray;
    }
}
