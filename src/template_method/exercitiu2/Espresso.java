package template_method.exercitiu2;

public class Espresso extends CoffeeTemplate{
    @Override
    public void addSugar() {
        System.out.println("Add sugar if you like");
    }

    @Override
    public void addMilk() {
        System.out.println("No milk please");
    }

    @Override
    public void addCream() {
        System.out.println("No cream please");
    }
}
