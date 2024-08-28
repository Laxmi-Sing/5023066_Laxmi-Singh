package AdapterPatternExample;

public class AmazonPayGateway {
    private int balance;
    public AmazonPayGateway(int balance){
        this.balance=balance;
    }
    public void makePayment(double amt){
        balance-=amt;
        System.out.println(amt+"Rs debited from your account. Available balance: "+balance);
    }
}
