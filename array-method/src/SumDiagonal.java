import java.util.Scanner;

public class SumDiagonal {
    public static void main(String[] args) {
        int r,c;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a row :");
        r = scanner.nextInt();
        System.out.print("Enter a column :");
        c = scanner.nextInt();
        int[][] array = new int[r][c];

        System.out.println("Enter element");
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                System.out.println("array["+ i +"]["+ j + "] : ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Array :");
        for (int i = 0; i < r ; i++) {
            for (int j = 0; j <c ; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Sum Diagonal : " + sumDiagonal(array, r, c));
    }

    public static int sumDiagonal(int[][] array, int r, int c ) {
        int sum = 0;
        for (int i = 0; i < r ; i++) {
            for (int j = 0; j < c ; j++) {
                if( i == j) {
                    sum+=array[i][j];
                }
            }
        }
        return sum;
    }
}
