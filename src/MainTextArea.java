/**
* This class creates the main text boxes where the user will see story information
* (Req. 2.0.0, 2.4.0)
*/

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class MainTextArea extends JTextArea { // create text area

    public MainTextArea(String text){
    	
		try {
			Font f = Font.createFont(Font.TRUETYPE_FONT, new File("./res/retro_computer_personal_use.ttf")); // call Retro Computer font
			Font normFont = f.deriveFont(14f);
			this.setBounds(100, 500, 600, 150);
	        this.setBackground(Color.black); // default background black
	        this.setForeground(Color.white); // text color white
	        this.setEditable(false);
	        this.setFont(normFont);
	        this.setLineWrap(true);
	        this.setWrapStyleWord(true);
	        this.setText(text);
	        this.setMargin(new Insets(2,10,2,2));
		} catch (FontFormatException e) {
			// catch block
			e.printStackTrace();
		} catch (IOException e) {
			// catch block
			e.printStackTrace();
		}

    	
        
    }
}
