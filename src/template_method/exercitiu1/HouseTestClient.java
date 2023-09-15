package template_method.exercitiu1;

public class HouseTestClient {
    public static void main(String[] args) {
        HouseTemplate house  = new WoodenHouse();

        //folosim metoda template
        house.buildHouse();
        System.out.println(">>>>>>>>>>>>>><<<<<<<<<<<<");

        house = new BrickHouse();
        house.buildHouse();
    }
}
