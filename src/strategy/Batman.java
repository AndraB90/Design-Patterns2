package strategy;

public class Batman extends SuperHero{
    public Batman(FlyBehavior flyBehavior) {
        super(flyBehavior);
    }

    @Override
    public void attack() {
        System.out.println("Batman attacking");
    }
}
