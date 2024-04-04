package loandemo;

public class LoanTest {
    public static void main(String[] args) {
        Address1 add1=new Address1();
        add1.faltNo="101";
        add1.area="miyapur";
        add1.country="india";
        add1.pinCode="500000";


        User1 user1=new User1();
        user1.firstName="dhatri";
        user1.lastName="kollisetty";
        user1.age=25;
        user1.AAdhar="741852963";
        user1.panNo="2222222";
        user1.address1=add1;

         LoanService ls=new LoanService();
        Loan loan=ls.approveLoan(user1);


        System.out.println("Loan Id : "+loan.loanId);
        System.out.println("Loan amount : "+loan.amount);
        System.out.println("Loan intrest : "+loan.inrest);
        System.out.println("Loan loanId : "+loan.loanId);



    }
}
