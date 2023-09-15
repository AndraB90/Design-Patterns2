package command.exercitiu1;

public class TestClient {
    public static void main(String[] args) {
        TextFile textFile = new TextFile("MyFile.txt");
        OfficeUI officeUI = new OfficeUI();

        officeUI.sendCommand(new OpenFileCommand(textFile));
        officeUI.sendCommand(new SaveFileCommand(textFile));
    }
}
