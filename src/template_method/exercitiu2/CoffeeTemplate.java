package template_method.exercitiu2;

public abstract class CoffeeTemplate {
    public final void makeCoffee(){
        addPowder();
        addSugar();
        boilWater();
        addMilk();
        addCream();
        prepareCoffee();
        System.out.println("Cafeaua este gata");
    }

    public void addPowder(){
        System.out.println("Adaugam cafeaua");
    }

    public void boilWater(){
        System.out.println("Fierbem apa");
    }

    public void prepareCoffee(){
        System.out.println("Pregatim cafeaua");
    }

    public abstract void addSugar();
    public abstract void addMilk();

    public abstract void addCream();


}
