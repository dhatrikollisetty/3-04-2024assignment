package bankdemo;

public class CreateAccountTest {
    public static void main(String[] args) {
        User user=new User();
        Address userAddress=new Address();
        userAddress.area="miyapur";
        userAddress.faltNo="101";
        userAddress.pinCode="500012";
        userAddress.country="india";

        user.firstName="dhatri";
        user.lastName="kollisetty";
        user.mobileNo="123654789";
        user.address=userAddress;

        AccountService as=new AccountService();
        PassBook ps=as.createAccount(user);

        System.out.println(ps.accountHolderName);
        System.out.println(ps.accountNo);
        System.out.println(ps.ifscCode);
        System.out.println(ps.bankAddress.area);
        System.out.println(ps.userAddress.area);
    }
}

