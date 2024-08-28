package SingletonPatternExample;

import java.util.Scanner;

public class SingletonMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        Logger logger1=Logger.getInstance(num);
        System.out.println("Enter another number");
        num=sc.nextInt();
        //we can see that instance is created only once
        Logger logger2=Logger.getInstance(num);
    }
}
