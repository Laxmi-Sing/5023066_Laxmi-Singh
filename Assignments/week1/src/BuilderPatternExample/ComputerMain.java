package BuilderPatternExample;

public class ComputerMain {
    public static void main(String[] args) {
        Computer computer=new Computer.ComputerBuilder("i3").
                setRAM("2GB").
                setStorage("32GB").build();
        computer.display();
    }
}
