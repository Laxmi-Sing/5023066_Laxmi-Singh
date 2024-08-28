package StrategyPatternExample;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy creditCardPayment=new CreditCardPayment(123456,"Aryan Singh",456,"06/06/2028");
        PaymentStrategy payPalPayment=new PayPalPayment("prernasingh@gmail.com","jkl");
        PaymentContext paymentContext=new PaymentContext();
        paymentContext.setPaymentContext(creditCardPayment);
        paymentContext.pay(200);
        paymentContext.setPaymentContext(payPalPayment);
        paymentContext.pay(2000);
    }
}
