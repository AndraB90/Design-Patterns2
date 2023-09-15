package template_method.exercitiu1;

public class BrickHouse extends HouseTemplate{
    @Override
    public void buildWalls() {
        System.out.println("Construieste pereti din caramida");
    }

    @Override
    public void buildPillars() {
        System.out.println("Construieste stalpi cu invelis de caramida");
    }
}
