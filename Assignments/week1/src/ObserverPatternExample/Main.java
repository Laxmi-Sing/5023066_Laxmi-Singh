package ObserverPatternExample;

public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket=new StockMarket();

        Observer mobileApp=new MobileApp("Groww App");
        Observer webApp=new WebApp("Up stock");
        Observer webApp2=new WebApp("Angle One");
        stockMarket.register(mobileApp);
        stockMarket.register(webApp);
        stockMarket.register(webApp2);
        stockMarket.setStockPrice(500);
        stockMarket.deregister(webApp2);
        stockMarket.setStockPrice(450);


    }
}
