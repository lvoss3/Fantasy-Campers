/**
* This class creates a way to signal which option panel is rendered (one, two, three, or four decisions)
* (Req. 2.0.0, 2.5.0, 2.5.1, 2.5.2, 2.5.3, 8.1.0)
*/

import javax.swing.*;
import java.awt.*;

public class OptionsPanel extends JPanel {
    int num;
    String[] optionTexts;
    int[] results;

    public OptionsPanel(Container con, Renderer renderer, String[] optionTexts, int[] results){
        this.setBounds(0, 390, 800, 150); // set bounds
        this.num = optionTexts.length;
        this.optionTexts = optionTexts;
        this.setOpaque(false);

        if(num == 1){
            OneOptionDecision decision = new OneOptionDecision(con, renderer, optionTexts, results); // if num == 1, then call single decision button configuration
            this.add(decision);
        }
        else if(num == 2){
            TwoOptionDecision decision = new TwoOptionDecision(con, renderer, optionTexts, results); // if database num == 2, then call two decision button configuration
            this.add(decision);
        }
        else if(num == 3){
            ThreeOptionDecision decision = new ThreeOptionDecision(con, renderer, optionTexts, results); // if database num == 3, then call three decision button configuration
            this.add(decision);
        }
        else if(num == 4){
            FourOptionDecision decision = new FourOptionDecision(con, renderer, optionTexts, results); // if database num == 4, then call four decision button configuration
            this.add(decision);
        }

    }
}
