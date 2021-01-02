import java.awt.*;
import java.util.LinkedList;

public class ProductManager {
    public static LinkedList<Products> products = new LinkedList<>();
    public static int id = 0;

    public static void addProduct(String name, String dateOfManufacture, String expiryDate, int price ) {
        products.add(new Products(id++, name,dateOfManufacture,expiryDate,price));
    }

    public static Products getProductById(int id){
        for (Products product : products){
            if(product.getId() == id ){
                return product;
            }
        }
        return null;
    }

    public static void removeProduct(int id){
        products.remove(id);
    }

    public static void showProduct() {
        for (Products product : products){
            System.out.println(product.toString());
        }
    }
}
