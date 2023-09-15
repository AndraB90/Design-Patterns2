package command.exercitiu2;

public class TestClient {
    public static void main(String[] args) {
        LightBulb lightBulb = new LightBulb();
        RemoteControl control = new RemoteControl();

        control.pressSomething(new LightOnCommand(lightBulb));
        control.pressSomething(new IncreaseLightCommand(lightBulb));
        control.pressSomething(new DecreaseLightCommand(lightBulb));
        control.pressSomething(new LightOffCommand(lightBulb));
    }
}
