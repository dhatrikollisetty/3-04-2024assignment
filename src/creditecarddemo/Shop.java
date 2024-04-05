package creditecarddemo;

import java.util.List;

public class Shop {
    public List<Product1> productList;
    public void selectionProcess(Product1 product1){
        if(productList.contains(product1)){
            System.out.println("Product found"+product1);
        }else {
            System.out.println("Product Not Found");
        }
    }
}
