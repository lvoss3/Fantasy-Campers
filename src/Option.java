/**
* This class places the text within the button confines
* (Req. 2.5.0, 2.5.1, 2.5.2, 2.5.3)
*/

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Option extends JButton {

    String optionText;

    public Option(String optionText){
    	
		try {
			Font f;
			f = Font.createFont(Font.TRUETYPE_FONT, new File("./res/retro_computer_personal_use.ttf")); // read in the Retro Computer font
			Font normFont = f.deriveFont(12f); //font size
	        this.optionText = optionText;
	        this.setBackground(Color.black);
	        this.setForeground(Color.white); // font color
	        this.setFont(normFont);
	        this.setFocusPainted(false);
	        this.setText(optionText);
		} catch (FontFormatException e) {
			// catch block
			e.printStackTrace();
		} catch (IOException e) {
			// catch block
			e.printStackTrace();
		}
		
    }
}