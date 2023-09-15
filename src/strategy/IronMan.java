package strategy;

public class IronMan extends SuperHero{
    public IronMan(FlyBehavior flyBehavior) {
        super(flyBehavior);
    }

    @Override
    public void attack() {
        System.out.println("IronMan attacking");
    }
}
