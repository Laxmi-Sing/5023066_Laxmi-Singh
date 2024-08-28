package CommandPatternExample;

public class Main {
    public static void main(String[] args) {
        Light light=new Light();
        Command on=new LightOnCommand(light);
        RemoteControl remoteControl=new RemoteControl();
        remoteControl.setCommand(on);
        remoteControl.pressButton();
        Command off=new LightOffCommand(light);
        remoteControl.setCommand(off);
        remoteControl.pressButton();
    }
}
