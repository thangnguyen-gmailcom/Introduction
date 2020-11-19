import java.util.Scanner;

public class ReadNumberIntoWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number : ");
        int num = scanner.nextInt();
        int unit = (num % 100)%10;
        int dozens = (num %100)/10;
        int hundreds = num /100;
        boolean readUnit = true;

        switch (hundreds) {
            case 1:
                System.out.print("one hundred and ");
                break;
            case 2:
                System.out.print("tow hundred and ");
                break;
            case 3:
                System.out.print("three hundred and ");
                break;
            case 4:
                System.out.print("four hundred and ");
                break;
            case 5:
                System.out.print("five hundred and ");
                break;
            case 6:
                System.out.print("six hundred and ");
                break;
            case 7:
                System.out.print("seven hundred and ");
                break;
            case 8:
                System.out.print("eight hundred and ");
                break;
            case 9:
                System.out.print("nine hundred and ");
                break;
        }
        switch (dozens) {
            case 1:
                readUnit = false;
                switch (unit) {
                    case 0:
                        System.out.print("ten");
                        break;
                    case 1:
                        System.out.print("eleven");
                        break;
                    case 2:
                        System.out.print("twelve");
                        break;
                    case 3:
                        System.out.print("thirteen");
                        break;
                    case 4:
                        System.out.print("fourteen");
                        break;
                    case 5:
                        System.out.print("fifteen");
                        break;
                    case 6:
                        System.out.print("sixteen");
                        break;
                    case 7:
                        System.out.print("seventeen");
                        break;
                    case 8:
                        System.out.print("eighteen");
                        break;
                    case 9:
                        System.out.print("nineteen");
                        break;
                }
                break;
            case 2:
                System.out.print("twenty ");
                break;
            case 3:
                System.out.print("thirty ");
                break;
            case 4:
                System.out.print("forty ");
                break;
            case 5:
                System.out.print("fifty ");
                break;
            case 6:
                System.out.print("sixty ");
                break;
            case 7:
                System.out.print("seventy ");
                break;
            case 8:
                System.out.print("eighty ");
                break;
            case 9:
                System.out.print("ninety ");
                break;
        }
        if(readUnit == true){
            switch (unit) {
                case 0:
                    System.out.print("zero");
                    break;
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("tow");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nice");
                    break;
            }

        }


    }


}
