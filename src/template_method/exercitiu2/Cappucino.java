package template_method.exercitiu2;

public class Cappucino extends CoffeeTemplate{
    @Override
    public void addSugar() {
        System.out.println("Make it sweet");
    }

    @Override
    public void addMilk() {
        System.out.println("Some milk as you like");
    }

    @Override
    public void addCream() {
        System.out.println("Why not some cream");
    }
}
