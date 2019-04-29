import javax.swing.*;
import java.awt.*;

public class MainTextPanel extends JPanel {

    public MainTextPanel(String text){
        this.setBounds(100, 50, 600, 150);
        this.setOpaque(false);
        MainTextArea textArea = new MainTextArea(text);
        this.add(textArea);
    }
}
