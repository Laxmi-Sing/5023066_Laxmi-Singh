package DecoratorPatternExample;

public class SlackNotifierDecorator extends NotifierDecorator{
    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        this.sendSlack(msg);
    }

    private void sendSlack(String msg) {
        System.out.println("Slack message Notification: "+msg);
    }

}
