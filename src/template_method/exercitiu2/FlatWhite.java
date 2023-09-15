package template_method.exercitiu2;

public class FlatWhite extends CoffeeTemplate{
    @Override
    public void addSugar() {
        System.out.println("Add a bit of sugar");
    }

    @Override
    public void addMilk() {
        System.out.println("Add milk");
    }

    @Override
    public void addCream() {
        System.out.println("Put some cream on top and make a nice figure");
    }
}
