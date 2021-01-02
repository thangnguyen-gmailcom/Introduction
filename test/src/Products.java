public class Products {
    private int id ;
    private String name;
    private String dateOfManufacture;
    private String expiryDate;
    private int price;

    public Products(int id,String name, String dateOfManufacture, String expiryDate, int price) {
        this.id = id;
        this.name = name;
        this.dateOfManufacture = dateOfManufacture;
        this.expiryDate = expiryDate;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfManufacture='" + dateOfManufacture + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", price=" + price +
                '}';
    }
}
