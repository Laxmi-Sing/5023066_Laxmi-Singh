package AdapterPatternExample;

public class AmazonPayAdapter implements PaymentProcessor{
    private AmazonPayGateway amazonPay;
    public AmazonPayAdapter(AmazonPayGateway amazonPay){
        this.amazonPay=amazonPay;
    }
    @Override
    public void processPayment(double amt) {
        amazonPay.makePayment(amt);
    }
}
