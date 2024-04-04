package creditecarddemo;

import java.util.Date;
import java.util.UUID;

public class CardService {
    public CreditCard card(User2 user2){
        CreditCard creditCard=new CreditCard();
        creditCard.cardHolderName= user2.name;
        creditCard.bankName="State Bank Of India";
        creditCard.cardNo= UUID.randomUUID().toString();
        creditCard.cvv=UUID.randomUUID().toString();
        creditCard.cardExpiry=new Date();
        return creditCard;
    }
}
