package template_method.exercitiu1;

public abstract class HouseTemplate {
    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("Casa este construita.");
    }

    //implementare de baza
    private void buildWindows(){
        System.out.println("Construire ferestre");
    }

    //metode care vor fi implementate diferit de catre subclase
    public abstract void buildWalls();
    public abstract void buildPillars();

    //implementare comuna

    private void buildFoundation(){
        System.out.println("Construieste fundatie din ciment");
    }
}
