package strategy;

public class FlyByTechnology implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Technology flight");
    }
}
