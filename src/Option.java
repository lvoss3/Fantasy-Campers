import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Option extends JButton {

    String optionText;

    public Option(String optionText){
    	
		try {
			Font f;
			f = Font.createFont(Font.TRUETYPE_FONT, new File("./res/retro_computer_personal_use.ttf"));
			Font normFont = f.deriveFont(16f);
	        this.optionText = optionText;
	        Border emptyBorder = BorderFactory.createEmptyBorder();
	        this.setBackground(Color.black);
	        this.setForeground(Color.white);
	        this.setBorderPainted(false);
	        this.setOpaque(false);
	        this.setFont(normFont);
	        this.setBorder(emptyBorder);
	        this.setFocusPainted(false);
	        this.setText(optionText);
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
}