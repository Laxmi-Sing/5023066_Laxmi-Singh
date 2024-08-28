package ObserverPatternExample;

public class MobileApp implements Observer{
    private String app;
    MobileApp(String app){
        this.app=app;
    }
    @Override
    public void update(double stockPrice) {
        System.out.println(app+" received stock price update :"+stockPrice);
    }
}
