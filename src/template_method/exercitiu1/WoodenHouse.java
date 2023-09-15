package template_method.exercitiu1;

public class WoodenHouse extends HouseTemplate{
    @Override
    public void buildWalls() {
        System.out.println("Construieste pereti din lemn");
    }

    @Override
    public void buildPillars() {
        System.out.println("Construieste stalpi din lemn");
    }
}
