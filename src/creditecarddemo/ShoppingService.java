package creditecarddemo;

public class ShoppingService {
    public Product selectProduct(Product product){
        product.cost=1000;
        System.out.println(product);
        return product;

    }

}
