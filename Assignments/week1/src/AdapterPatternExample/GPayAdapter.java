package AdapterPatternExample;

public class GPayAdapter implements PaymentProcessor{
    private GPayGateway gPay;
    public GPayAdapter(GPayGateway gPay){
        this.gPay=gPay;
    }

    @Override
    public void processPayment(double amt) {
        gPay.makePayment(amt);
    }
}
