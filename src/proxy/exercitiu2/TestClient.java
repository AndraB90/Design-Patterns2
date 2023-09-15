package proxy.exercitiu2;

public class TestClient {
    public static void main(String[] args) {
        OfficeWebsiteAccess officeWebsiteAccess = new ProxyWebsiteAccess("andrabotean.com");
        officeWebsiteAccess.grandWebsiteAccess();
    }
}
