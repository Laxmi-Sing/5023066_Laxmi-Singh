package StrategyPatternExample;

public class CreditCardPayment implements PaymentStrategy{
    private int cardNo;
    private String cardHolderName;
    private int cvv;
    private String expiryDate;

    public CreditCardPayment(int cardNo, String cardHolderName, int cvv, String expiryDate) {
        this.cardNo = cardNo;
        this.cardHolderName = cardHolderName;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(double amt) {
        System.out.println("Amount of Rs"+amt+" is paid using credit card");
    }
}
