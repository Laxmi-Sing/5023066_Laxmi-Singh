package SingletonPatternExample;

public class Logger {
    private int num;
    private static Logger instance;
    private Logger(int num){
        this.num=num;
    }
    public static Logger getInstance(int num){
        if(instance==null){
            instance=new Logger(num);
            System.out.println("Num :"+num);
        }
        return instance;
    }

}
