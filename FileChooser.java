import javax.swing.JFileChooser;

public class FileChooser {
    public static void main(String[] args) {
        JFileChooser file = new JFileChooser();
        file.showOpenDialog(null);
    }
}
