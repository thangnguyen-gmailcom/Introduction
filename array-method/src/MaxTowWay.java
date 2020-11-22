import java.util.Scanner;

public class MaxTowWay {
    public static void main(String[] args) {
        int r,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a row :");
        r = scanner.nextInt();
        System.out.println("Enter a column");
        c = scanner.nextInt();

        int[][] a = new int[r][c];

        System.out.println("Enter element :");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++) {
                System.out.println("a["+ i +"]["+ j + "] : ");
                a[i][j]= scanner.nextInt();
            }
        }

        System.out.println("Array : ");
        for(int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println(" ");
        }

        int max = a[0][0];

        for(int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(max < a[i][j]){
                    max = a[i][j];
                }
            }
        }
        System.out.println("Max :" + max);
    }
}
