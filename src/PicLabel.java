import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PicLabel extends JLabel {

    public JLabel finishedImage;

    public PicLabel (String filepath){
        try{
            this.finishedImage = new JLabel();
            BufferedImage myPicture = ImageIO.read(new File(filepath));
            this.finishedImage.setIcon(new ImageIcon(myPicture.getScaledInstance(200, 225, Image.SCALE_FAST)));
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
