package command.exercitiu2;

public class LightOffCommand implements Command{
    LightBulb lightBulb;

    public LightOffCommand(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    @Override
    public void execute() {
        lightBulb.turnLightOff();
    }
}
