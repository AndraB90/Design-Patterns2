package command.exercitiu2;

public class IncreaseLightCommand implements Command{
    LightBulb lightBulb;

    public IncreaseLightCommand(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    @Override
    public void execute() {
        lightBulb.increaseLuminosity();
    }
}
