package proxy.exercitiu2;

public class ProxyWebsiteAccess implements OfficeWebsiteAccess {
    private String websiteName;
    private RealWebsiteAccess realWebsiteAccess;

    public ProxyWebsiteAccess(String websiteName) {
        this.websiteName = websiteName;
    }

    public int getSecurity(String websiteName){
        return 10;
    }


    @Override
    public void grandWebsiteAccess() {
        if(getSecurity(websiteName)>=10){
            realWebsiteAccess = new RealWebsiteAccess(websiteName);
            realWebsiteAccess.grandWebsiteAccess();
        }else{
            System.out.println("No website access granted. The security level is below 10");
        }
    }
}
