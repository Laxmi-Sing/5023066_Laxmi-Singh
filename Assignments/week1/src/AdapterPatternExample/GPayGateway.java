package AdapterPatternExample;

public class GPayGateway {
    private int balance;
    public GPayGateway(int balance){
        this.balance=balance;
    }
    public void makePayment(double amt){
        balance-=amt;
        System.out.println(amt+"Rs debited from your account. Available balance: "+balance+". Thank you for using Google Pay");
    }
}
