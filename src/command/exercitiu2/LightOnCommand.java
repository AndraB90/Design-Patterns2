package command.exercitiu2;

public class LightOnCommand implements Command{

    LightBulb lightBulb;

    public LightOnCommand(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    @Override
    public void execute() {
        lightBulb.turnLightOn();
    }
}
