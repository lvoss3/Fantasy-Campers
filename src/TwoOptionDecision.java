/**
* The class that creates the buttons for screens with one button choice/decision
* (Req. 2.0.0, 2.5.0, 2.1.1, 2.1.2, 2.1.3, 6.0.0)
*/
import javax.swing.*;
import java.awt.*;

public class TwoOptionDecision extends JPanel {

    Font normFont = new Font("Retro Computer", Font.PLAIN, 16);
    Option option_1; // JPanel button element
    Option option_2;

    public TwoOptionDecision(Container con, Renderer renderer, String[] optionTexts, int[] results){
        this.setBounds(150, 390, 500, 150); // button size
        this.setBackground(Color.black);
        this.setLayout(new GridLayout(2,1));
        this.option_1 = new Option(optionTexts[0]);
        this.option_2 = new Option(optionTexts[1]);
        option_1.addActionListener(e -> renderer.render(con, results[0])); // 2.1.2
        this.add(option_1);
        option_2.addActionListener(e -> renderer.render(con, results[1]));
        this.add(option_2);
    }
}
