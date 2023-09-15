package strategy;

public class TestClient {
    public static void main(String[] args) {
        SuperHero superHero = new Batman(new FlyNative());
        superHero.performFly();
        superHero = new IronMan(new FlyByTechnology());
        superHero.performFly();
        superHero = new Superman(new FlyNative());
        superHero.performFly();
        superHero = new WonderWoman(new FlyByTechnology());
        superHero.performFly();




    }
}
