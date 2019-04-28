import javax.swing.*;
import java.awt.*;

public class OptionsPanel extends JPanel {
    int num;
    String[] optionTexts;
    int[] results;

    public OptionsPanel(Container con, Renderer renderer, String[] optionTexts, int[] results){
        this.setBounds(150, 390, 500, 150);
        this.num = optionTexts.length;
        this.optionTexts = optionTexts;
        this.setOpaque(false);

        if(num == 1){
            OneOptionDecision decision = new OneOptionDecision(con, renderer, optionTexts, results);
            this.add(decision);
        }
        else if(num == 2){
            TwoOptionDecision decision = new TwoOptionDecision(con, renderer, optionTexts, results);
            this.add(decision);
        }
        else if(num == 3){
            TwoOptionDecision decision = new TwoOptionDecision(con, renderer, optionTexts, results);
            this.add(decision);
        }
        else if(num == 4){
            FourOptionDecision decision = new FourOptionDecision(con, renderer, optionTexts, results);
            this.add(decision);
        }

    }
}
