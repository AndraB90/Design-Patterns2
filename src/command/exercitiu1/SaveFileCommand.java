package command.exercitiu1;

public class SaveFileCommand implements Command{
    TextFile file;

    public SaveFileCommand(TextFile file) {
        this.file = file;
    }

    @Override
    public void execute() {
        file.save();
    }
}
