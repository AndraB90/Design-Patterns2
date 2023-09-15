package strategy;

public class WonderWoman extends SuperHero{
    public WonderWoman(FlyBehavior flyBehavior) {
        super(flyBehavior);
    }

    @Override
    public void attack() {
        System.out.println("WonderWoman attacking");
    }
}
