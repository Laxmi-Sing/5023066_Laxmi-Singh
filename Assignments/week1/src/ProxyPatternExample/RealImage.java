package ProxyPatternExample;

public class RealImage implements Image{
    String image;
    public  RealImage(String image){
        this.image=image;
        this.loadImage();
    }
    private void loadImage(){
        System.out.println("Loading image "+image+" from remote server");
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Image loaded "+image);
    }
    @Override
    public void display() {
        System.out.println("Image: "+this.image);
    }
}
