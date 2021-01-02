import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choiceNumber;
        Scanner sc = new Scanner(System.in);
        for(;;){
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm theo id");
            System.out.println("3. Xóa sản phẩm theo id");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm theo giá");

            do{
                System.out.println("Nhâp số để chọn :");
                choiceNumber = sc.nextInt();
            }while ((choiceNumber < 1) || (choiceNumber > 7));

            switch (choiceNumber){
                case 1:
                    System.out.println("thêm sản phẩm :");
                    add();
                    break;
                case 2 :
                    System.out.println("Sửa thông tin sản phẩm");
                    showProductById();
                    break;
                case 3:
                    System.out.println("Xóa sản phẩm");
                    remove();
                    break;
                case 4 :
                    System.out.println("Danh sách sản phẩm :");
                    show();
                    break;
                case 7:
                    System.out.println("Tạm biệt :");
                    System.exit(0);
                    break;
            }
        }
    }

    public static void add(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String date1 = sc.nextLine();
        String date2 = sc.nextLine();
        int price = sc.nextInt();
        sc.nextLine();
        ProductManager.addProduct(name,date1,date2,price);
    }

    public static void showProductById(){
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();
        Products product =  ProductManager.getProductById(id);
        String name = sc.nextLine();
        String date1 = sc.nextLine();
        String date2 = sc.nextLine();
        int price = sc.nextInt();
        sc.nextLine();
        product.setName(name);
        product.setDateOfManufacture(date1);
        product.setExpiryDate(date2);
        product.setPrice(price);
    }

    public static void remove(){
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();
        ProductManager.removeProduct(id);
    }

    public static void show(){
        ProductManager.showProduct();
    }
}
