package command.exercitiu2;

public class DecreaseLightCommand implements Command{
    LightBulb lightBulb;

    public DecreaseLightCommand(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    @Override
    public void execute() {
        lightBulb.decreaseLuminosity();
    }
}
