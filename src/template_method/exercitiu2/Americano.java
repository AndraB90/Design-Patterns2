package template_method.exercitiu2;

public class Americano extends CoffeeTemplate{
    @Override
    public void addSugar() {
        System.out.println("Add some sugar");
    }

    @Override
    public void addMilk() {
        System.out.println("Add some milk");
    }

    @Override
    public void addCream() {
        System.out.println("Add some cream");
    }
}
