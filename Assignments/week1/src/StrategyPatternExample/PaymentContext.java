package StrategyPatternExample;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void pay(double amt){
        paymentStrategy.pay(amt);
    }
}
