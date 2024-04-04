package loandemo;

import java.util.UUID;

public class LoanService {
    public Loan approveLoan(User1 user1){
        Loan loan=new Loan();
        loan.firstName= user1.firstName;
        loan.lastName= user1.lastName;
        loan.amount=250000.00;
        loan.emiAmount="1500";
        loan.tenureTime="1 year";
        loan.loanId= UUID.randomUUID().toString();
        loan.inrest=0.7;




        return loan;
    }
}
