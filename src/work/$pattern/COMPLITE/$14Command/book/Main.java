package work.$pattern.COMPLITE.$14Command.book;

public class Main {

    public static void main(String[] args) {

        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        GarageOpenDoorCommandAndOther garageOpenDoorCommandAndOther =
                new GarageOpenDoorCommandAndOther(new GarageDoor());
        simpleRemoteControl.setCommand(garageOpenDoorCommandAndOther);
        simpleRemoteControl.buttonPress();

        Iniciator iniciator = new Iniciator();
        iniciator.setCommands(1, lightOnCommand, lightOffCommand);
        iniciator.onButtonPush(1);
        System.out.println("!!!!");
        iniciator.offButtonPush(1);

    }
}

class Iniciator{
    private Command [] onCommands;
    private Command [] offCommands;

    public Iniciator() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command noCommands = new NoCommand();
        for(int i=0; i<7; i++){
            onCommands[i] = noCommands;
            offCommands[i] = noCommands;
        }
    }

    void setCommands (int slot, Command commandOn, Command commandOff){
        onCommands[slot] = commandOn;
        offCommands[slot] = commandOff;
    }

    void onButtonPush(int slot){
        onCommands[slot].execute();
    }
    void offButtonPush(int slot){
        offCommands[slot].execute();
    }

}

class SimpleRemoteControl{
    private Command command;

    void setCommand(Command command){
        this.command = command;
    }

    void buttonPress(){
        command.execute();
    }
}

interface Command{
    void execute();
}

class NoCommand implements Command{

    @Override
    public void execute() {

    }
}
interface Ilight{
    void lightOn();
    void lightOff();
}
class Light implements Ilight{
    @Override
    public void lightOn(){
        System.out.println("light on");
    }
    @Override
    public void lightOff(){
        System.out.println("light off");
    }
}

class LightOnCommand implements Command{
    private Light light;

    LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOn();
    }
}
class LightOffCommand implements Command{
    private Light light;

    LightOffCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.lightOff();
    }
}

class GarageDoor implements Ilight{
    void up(){
        System.out.println("garage door is open");
    };
    void down(){
        System.out.println("garage door id closed");
    };
    void stop(){};
    @Override
    public void lightOn(){
        System.out.println("light on in garage");
    };
    @Override
    public void lightOff(){
        System.out.println("light off in garage");
    };
}

class GarageOpenDoorCommandAndOther implements Command{
    private GarageDoor garageDoor;

    public GarageOpenDoorCommandAndOther(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
        garageDoor.lightOn();
        garageDoor.down();
        garageDoor.lightOff();
    }
}