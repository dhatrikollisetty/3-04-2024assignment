package creditecarddemo;

public class Product1 {
    public String type;
    public String price;
    public String barnd;
    public String barCode;
    public ProductSpecification productSpecification;

    @Override
    public String toString() {
        return "Product1{" +
                "type='" + type + '\'' +
                ", price='" + price + '\'' +
                ", barnd='" + barnd + '\'' +
                ", barCode='" + barCode + '\'' +
                ", productSpecification=" + productSpecification +
                '}';
    }
}
