package creditecarddemo;

public class CardTest {
    public static void main(String[] args) {
        Address2 address=new Address2();
        address.flatNo=5-546;
        address.street="vaishali nagar";
        address.area="miyapur";
        address.pincode=500001;

        User2 user=new User2();
        user.name="dhatri";
        user.dateOfBirth="06/05/1999";
        user.mobileNumber=123654789;
        user.aadharNumber=555555;
        user.panNumber="ab2587";
        user.address2=address ;

       /*CardService cardService=new CardService();
        CreditCard cc=cardService.card(user);
        System.out.println("card Name : "+cc.cardHolderName);
        System.out.println("card Number : "+cc.cardNo);
        System.out.println("card Cvv No : "+cc.cvv);
        System.out.println("card ExpiryDtae : "+cc.cardExpiry);
        System.out.println("card Limit :"+cc.cardLimit);
*/


        Product product=new Product();
        product.type="jeans";
        product.brand="blackbeery";
        product.color="olive";
        product.size="30";
       // product.cost=1500;

        ShoppingService ss=new ShoppingService();
        ss.selectProduct(product);









    }
}
