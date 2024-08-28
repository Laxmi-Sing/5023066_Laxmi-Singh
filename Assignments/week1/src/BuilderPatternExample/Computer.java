package BuilderPatternExample;

public class Computer {
    private String CPU;
    private String RAM;
    private String Storage;
    private Computer(ComputerBuilder builder){
        this.CPU=builder.CPU;
        this.RAM=builder.RAM;
        this.Storage=builder.Storage;
    }
    public void display(){
        System.out.println("Computer CPU: "+this.CPU+" RAM: "+this.RAM+" Storage: "+this.Storage);
    }
    public static class ComputerBuilder {
        private String CPU;
        private String RAM;
        private String Storage;

        public ComputerBuilder(String CPU) {
            this.CPU = CPU;
        }

        public ComputerBuilder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public ComputerBuilder setStorage(String Storage) {
            this.Storage = Storage;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
