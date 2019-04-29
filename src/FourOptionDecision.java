import javax.swing.*;
import java.awt.*;

public class FourOptionDecision extends JPanel {

    Option option_1;
    Option option_2;
    Option option_3;
    Option option_4;

    public FourOptionDecision(Container con, Renderer renderer, String[] optionTexts, int[] results){
        this.setBounds(150, 390, 500, 150);
        this.setBackground(Color.black);
        this.setLayout(new GridLayout(2,2));
        this.option_1 = new Option(optionTexts[0]);
        this.option_2 = new Option(optionTexts[1]);
        this.option_3 = new Option(optionTexts[2]);
        this.option_4 = new Option(optionTexts[3]);
        option_1.addActionListener(e -> renderer.render(con, results[0]));
        this.add(option_1);
        option_2.addActionListener(e -> renderer.render(con, results[1]));
        this.add(option_2);
        option_3.addActionListener(e -> renderer.render(con, results[2]));
        this.add(option_3);
        option_4.addActionListener(e -> renderer.render(con, results[3]));
        this.add(option_4);
    }
}
