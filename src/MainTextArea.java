import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class MainTextArea extends JTextArea {

    public MainTextArea(String text){
    	
		try {
			Font f = Font.createFont(Font.TRUETYPE_FONT, new File("./res/retro_computer_personal_use.ttf"));
			Font normFont = f.deriveFont(16f);
			this.setBounds(100, 500, 600, 150);
	        this.setBackground(Color.black);
	        this.setForeground(Color.white);
	        this.setEditable(false);
	        this.setFont(normFont);
	        this.setLineWrap(true);
	        this.setWrapStyleWord(true);
	        this.setText(text);
	        this.setMargin(new Insets(2,10,2,2));
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    	
        
    }
}
