package creditecarddemo;

public class Product {
    public String type;
    public String size;
    public String color;
    public String brand;
    public double cost;

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", cost=" + cost +
                '}';
    }
}
