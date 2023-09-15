package strategy;

public class Superman extends SuperHero{
    public Superman(FlyBehavior flyBehavior) {
        super(flyBehavior);
    }

    @Override
    public void attack() {
        System.out.println("Superman attacking");
    }
}
