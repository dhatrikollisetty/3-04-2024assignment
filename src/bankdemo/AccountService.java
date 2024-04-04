package bankdemo;

import java.util.UUID;

public class AccountService {
    public PassBook createAccount(User user){
        PassBook passBook=new PassBook();
        Address address=new Address();
        address.faltNo="305";
        address.area="nizampet";
        address.country="india";
        address.pinCode="500090";


        String name= user.firstName+user.lastName;
        passBook.accountHolderName=name;
        passBook.userAddress=user.address;
        passBook.bankAddress=address;
        passBook.accountNo= UUID.randomUUID().toString();
        passBook.ifscCode="SBI00000";


        return passBook;
    }
}
