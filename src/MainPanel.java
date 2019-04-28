import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MainPanel extends JPanel {

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