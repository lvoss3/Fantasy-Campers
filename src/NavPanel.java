import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class NavPanel extends JPanel {
    public NavPanel(Container con, Renderer renderer, Window window){
        this.setBounds(680, 5, 150, 50);
        this.setOpaque(false);
        JButton replay = new JButton();
        replay.setSize(10,50);
        try{
            BufferedImage myPicture = ImageIO.read(new File("./res/restart.png"));
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
            BufferedImage myPicture = ImageIO.read(new File("./res/door.png"));
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
        this.add(replay);
        quit.addActionListener(e -> window.dispatchEvent(new WindowEvent(window, WindowEvent.WINDOW_CLOSING)));
        this.add(quit);
    }

}
