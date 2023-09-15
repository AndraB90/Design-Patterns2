package template_method.exercitiu2;

public class TestClient {
    public static void main(String[] args) {
        CoffeeTemplate template = new Espresso();
        template.makeCoffee();
        System.out.println(">>>>>>>>>>>>>>><<<<<<<<<<<<<<");

        template = new FlatWhite();
        template.makeCoffee();
        System.out.println(">>>>>>>>>>>>>>><<<<<<<<<<<<<<");

        template = new Cappucino();
        template.makeCoffee();
        System.out.println(">>>>>>>>>>>>>>><<<<<<<<<<<<<<");

        template = new Americano();
        template.makeCoffee();
    }
}
