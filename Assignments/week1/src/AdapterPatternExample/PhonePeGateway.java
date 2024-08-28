package AdapterPatternExample;

public class PhonePeGateway {
    private int balance;
    public PhonePeGateway(int balance){
        this.balance=balance;
    }
    public void makePayment(double amt){
        balance-=amt;
        System.out.println(amt+"Rs debited from your account.");
    }
}
