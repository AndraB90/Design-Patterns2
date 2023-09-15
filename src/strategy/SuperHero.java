package strategy;

public abstract class SuperHero {

    FlyBehavior flyBehavior;

    public SuperHero(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public abstract void attack();

    public void performFly(){
        flyBehavior.fly();
    }
}
