/**
* This class creates the exit and restart buttons in the upper-right corner of the screen
* (Req. 2.0.0, 2.2.0, 2.3.0)
*/

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class NavPanel extends JPanel { // set bounds and size the clickable area of the buttons
    public NavPanel(Container con, Renderer renderer, Window window){
        this.setBounds(680, 5, 150, 50);
        this.setOpaque(false);
        JButton replay = new JButton();
        replay.setSize(10,50);
        try{
            BufferedImage myPicture = ImageIO.read(new File("./res/restart.png")); // read in the circular restart image from the images folder
            replay.setIcon(new ImageIcon(myPicture.getScaledInstance(25, 25, Image.SCALE_FAST)));
            replay.setOpaque(false);
            replay.setContentAreaFilled(false);
            replay.setBorderPainted(false);
            replay.setBorder(BorderFactory.createEmptyBorder());
        }
        catch(IOException e){
            e.printStackTrace();
        }


        JButton quit = new JButton();

        quit.setSize(10,50);
        try{
            BufferedImage myPicture = ImageIO.read(new File("./res/door.png")); // read in the exit door image from the images folder
            quit.setIcon(new ImageIcon(myPicture.getScaledInstance(25, 25, Image.SCALE_FAST)));
            quit.setOpaque(false);
            quit.setContentAreaFilled(false);
            quit.setBorderPainted(false);
            quit.setBorder(BorderFactory.createEmptyBorder());
        }
        catch(IOException e){
            e.printStackTrace();
        }
        replay.addActionListener(e -> renderer.render(con, 0));
        this.add(replay); // action to start
        quit.addActionListener(e -> window.dispatchEvent(new WindowEvent(window, WindowEvent.WINDOW_CLOSING)));
        this.add(quit); // action to quit
    }

}
