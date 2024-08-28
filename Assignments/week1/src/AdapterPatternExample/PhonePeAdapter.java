package AdapterPatternExample;

public class PhonePeAdapter implements PaymentProcessor{
    private PhonePeGateway phonePe;
    public PhonePeAdapter(PhonePeGateway phonePe){
        this.phonePe=phonePe;
    }
    @Override
    public void processPayment(double amt) {
        phonePe.makePayment(amt);
    }
}
