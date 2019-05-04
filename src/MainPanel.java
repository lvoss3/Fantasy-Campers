/**
* This class reads the background image path from the database and file location in the images folder
* (Req. 2.0.0, 4.0.0, 5.0.0, 10.0.0)
*/

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MainPanel extends JPanel { // create borders and bounds for JPanel

    BackgroundPane bgPane;
    public MainPanel(String pathname) {
        setLayout(new BorderLayout());
        this.bgPane = new BackgroundPane();
        this.add(bgPane);
        try {
            BufferedImage bg = ImageIO.read(new File(pathname));
            this.bgPane.setBackgroundImage(bg);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}