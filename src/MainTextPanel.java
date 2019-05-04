/**
* This class creates bounds for the text boxes and sizes those bounds
* (Req. 2.0.0, 2.4.0)
*/

import javax.swing.*;
import java.awt.*;

public class MainTextPanel extends JPanel {

    public MainTextPanel(String text){
    	if(text != "") {
	        this.setBounds(100, 50, 600, 150); // size bounds
	        this.setOpaque(false);
	        MainTextArea textArea = new MainTextArea(text);
	        this.add(textArea);
    	}
    }
}
