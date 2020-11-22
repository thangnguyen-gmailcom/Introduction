import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
    int r,c;
    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter row : ");
        r = scanner.nextInt();
        System.out.print("Enter column : ");
        c = scanner.nextInt();

        int[][] array = new int[r][c];

        //them phan tu vao mang
        System.out.println("Enter element : ");
        for (int i = 0; i < r ; i++) {
            for (int j = 0; j < c ; j++) {
                System.out.print("array["+ i +"]["+ j + "] : ");
                array[i][j] = scanner.nextInt();
            }
        }

        // hien thi mang 2 chieu
        System.out.println("Array : ");
        for (int i = 0; i < r ; i++) {
            for (int j = 0; j < c ; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println(" ");
        }

        System.out.println("Sum :"  + sumColumn(array, r, c, 2));

    }
    // tinh tong cac phan tu trong mot cot
    public static int sumColumn(int[][] array, int r , int c , int x) {
        int sum = 0;
        for (int i = 0; i < r ; i++) {
            sum += array[i][x];
        }
        return sum;
    }
}
