package ObserverPatternExample;

public class WebApp implements Observer{
    private String app;
    WebApp(String app){
        this.app=app;
    }
    @Override
    public void update(double stockPrice) {
        System.out.println(app+" received stock price update :"+stockPrice);
    }
}
