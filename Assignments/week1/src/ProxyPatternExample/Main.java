package ProxyPatternExample;

public class Main {
    public static void main(String[] args) {
        Image img1=new ProxyImage("duck.jpg");
        Image img2=new ProxyImage("peacock.jpg");
        //loading images from remote server displayed after 5sec
        System.out.println("Displaying Duck image");
        img1.display();
        System.out.println("Displaying Peacock image");
        img2.display();
        //cached image
        System.out.println("Displaying Duck image again");
        img1.display();
        System.out.println("Displaying Peacock image again");
        img2.display();
    }
}
