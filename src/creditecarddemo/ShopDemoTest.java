package creditecarddemo;

import java.util.ArrayList;
import java.util.List;

public class ShopDemoTest {
    public static void main(String[] args) {
        Product1 jeansProduct1=new Product1();
        ProductSpecification productSpecification=new ProductSpecification();
        productSpecification.size="30";
        productSpecification.color="blue";
        productSpecification.price="2000";
        jeansProduct1.type="jeans";
        jeansProduct1.barCode="2222222";
        jeansProduct1.price="1500";
        jeansProduct1.barnd="blackberry";
        jeansProduct1.productSpecification=productSpecification;


        Product1 shirtProduct1=new Product1();
        ProductSpecification productSpecification1=new ProductSpecification();
        productSpecification1.size="30";
        productSpecification1.color="blue";
        productSpecification1.price="2000";
        shirtProduct1.type="shirt";


        Product1 tshirtProduct1=new Product1();
        ProductSpecification productSpecification2=new ProductSpecification();
        productSpecification2.size="30";
        productSpecification2.color="blue";
        productSpecification2.price="2000";
        tshirtProduct1.type="tshirt";
        tshirtProduct1.barCode="12364";


        Shop shop=new Shop();

        List<Product1> productList1=new ArrayList<>();
        productList1.add(jeansProduct1);
        productList1.add(shirtProduct1);
        productList1.add(tshirtProduct1);


        shop.productList=productList1;

       shop.selectionProcess(jeansProduct1);

    }

}
