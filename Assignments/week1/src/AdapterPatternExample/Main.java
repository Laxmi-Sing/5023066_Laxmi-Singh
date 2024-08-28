package AdapterPatternExample;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor gPayProcessor=new GPayAdapter(new GPayGateway(2000));
        PaymentProcessor phoneProcessor=new PhonePeAdapter(new PhonePeGateway(1500));
        PaymentProcessor amazonPayProcessor=new AmazonPayAdapter(new AmazonPayGateway(5000));
        gPayProcessor.processPayment(500);
        phoneProcessor.processPayment(450);
        amazonPayProcessor.processPayment(750);
    }
}
