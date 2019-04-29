import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Game {

    JFrame window;
    Container con;
    Database db;

    public static void main(String[] args){
    	GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    	String []fontFamilies = ge.getAvailableFontFamilyNames();
    	for(String font: fontFamilies){
    		System.out.println(font);
    	}

        new Game(); // 1.0.0

    }

    public Game() {
        Renderer renderer = new Renderer();
    }

}
