import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Game {

    JFrame window;
    Container con;
    Database db;

    public static void main(String[] args){
    	
    	try {
    	     GraphicsEnvironment ge = 
    	         GraphicsEnvironment.getLocalGraphicsEnvironment();
    	     ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("retro_computer_personal_use.ttf")));
    	} catch (IOException|FontFormatException e) {
    	     
    	}

        new Game(); // 1.0.0

    }

    public Game() {
        Renderer renderer = new Renderer();
    }

}
