package DecoratorPatternExample;

public class Main {
    public static void main(String[] args) {
        Notifier notifier=new EmailNotifier();
        notifier.send("A new message is there on you mail");
        System.out.println();
        notifier=new SMSNotifierDecorator(notifier);
        notifier.send("An email and a SMS arrived!!");
        System.out.println();
        notifier=new SlackNotifierDecorator(notifier);
        notifier.send("Slack message arrived along with an email!!");
    }
}
