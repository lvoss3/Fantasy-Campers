import javax.swing.*;
import java.awt.*;

public class Option extends JButton {

    String optionText;
    Font normFont = new Font("Retro Computer", Font.PLAIN, 16);

    public Option(String optionText){
        this.optionText = optionText;
        this.setBackground(Color.black);
        this.setForeground(Color.white);
        this.setFont(normFont);
        this.setFocusPainted(false);
        this.setText(optionText);
    }
}