package credittransactiondemo;

public class TransactionService {
    CreditCard creditCard=new CreditCard();
    public double cardTransaction(String cardNum,double amount){

        if(creditCard.cardNo.equals(cardNum) && amount<=creditCard.cardLimit){
            creditCard.cardLimit=creditCard.cardLimit-amount;
            System.out.println("transaction succsefull");
            System.out.println("Remaing amount :"+creditCard.cardLimit);

        }
        else {
            System.out.println("amount exceeded");
        }
        return creditCard.cardLimit;
    }

    public double cardPay(String cardNum,double amount){
        if(creditCard.cardNo.equals(cardNum)){
            creditCard.cardLimit=creditCard.cardLimit+amount;

            System.out.println("card pay successful");
        }else {
            System.out.println("wrong credentials");
        }
        System.out.println(" Balance :"+creditCard.cardLimit);
       return creditCard.cardLimit;
    }
}
