import javax.swing.*;
import java.awt.*;

public class TwoOptionDecision extends JPanel {

    Font normFont = new Font("Retro Computer", Font.PLAIN, 16);
    Option option_1;
    Option option_2;

    public TwoOptionDecision(Container con, Renderer renderer, String[] optionTexts, int[] results){
        this.setBounds(150, 390, 500, 150);
        this.setBackground(Color.black);
        this.setLayout(new GridLayout(2,1));
        this.option_1 = new Option(optionTexts[0]);
        this.option_2 = new Option(optionTexts[1]);
        option_1.addActionListener(e -> renderer.render(con, results[0]));
        this.add(option_1);
        option_2.addActionListener(e -> renderer.render(con, results[1]));
        this.add(option_2);
    }
}
