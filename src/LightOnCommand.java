//ConcreteCommand

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOn();
    }

    @Override
    public void undo() {
        light.switchOff();
    }


}
