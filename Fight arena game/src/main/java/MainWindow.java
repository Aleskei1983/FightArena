import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow(){
        setTitle("Fight arena");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 800);
        setLocation(400,100);
        add(new ArenaFrame());
        setVisible(true);
    }
    public static void main(String[] args) {
        MainWindow game = new MainWindow();

    }
}
