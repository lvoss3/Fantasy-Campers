import javax.swing.*;
import java.awt.*;

public class MainTextArea extends JTextArea {

    Font normFont = new Font("Retro Computer", Font.PLAIN, 16);

    public MainTextArea(String text){
        this.setBounds(100, 500, 600, 150);
        this.setBackground(Color.black);
        this.setForeground(Color.white);
        this.setEditable(false);
        this.setFont(normFont);
        this.setLineWrap(true);
        this.setWrapStyleWord(true);
        this.setText(text);
        this.setMargin(new Insets(2,10,2,2));
    }
}
