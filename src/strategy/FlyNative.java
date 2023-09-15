package strategy;

public class FlyNative implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Native flight");
    }
}
