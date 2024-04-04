package credittransactiondemo;

public class TransactionTest {

    public static void main(String[] args) {
        TransactionService transactionService=new TransactionService();
        transactionService.cardTransaction("123 654",1500);

        TransactionService transactionService1=new TransactionService();
        transactionService.cardTransaction("123 654",1500);

        TransactionService transactionService2=new TransactionService();
        transactionService.cardTransaction("123 654",1500);

        TransactionService transactionService3=new TransactionService();
        transactionService.cardTransaction("123 654",1500);


        TransactionService ts=new TransactionService();
        ts.cardPay("123 654",1500);
        TransactionService ts1=new TransactionService();
        ts.cardPay("123 654",1500);
        TransactionService ts2=new TransactionService();
        ts.cardPay("123 654",1500);
    }
}
