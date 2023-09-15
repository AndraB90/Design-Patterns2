package proxy.exercitiu2;

public class RealWebsiteAccess implements OfficeWebsiteAccess{

    private String websiteName;

    public RealWebsiteAccess(String websiteName) {
        this.websiteName = websiteName;
    }

    @Override
    public void grandWebsiteAccess() {
        System.out.println("Website access is granted for: "+websiteName);
    }
}
