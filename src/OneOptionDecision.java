import javax.swing.*;
import java.awt.*;

public class OneOptionDecision extends JPanel {

    Font normFont = new Font("Retro Computer", Font.PLAIN, 16);
    Option option_1;

    public OneOptionDecision(Container con, Renderer renderer, String[] optionTexts, int[] results){
        this.setBounds(150, 390, 500, 150);
        this.setBackground(Color.black);
        this.setLayout(new GridLayout(1,1));
        this.option_1 = new Option(optionTexts[0]);
        option_1.addActionListener(e -> renderer.render(con, results[0]));
        this.add(option_1);
    }
}
