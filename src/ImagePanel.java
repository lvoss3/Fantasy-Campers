/**
* This class sets the background image size and the default background
* (Req. 2.0.0, 4.0.0, 5.0.0, 10.0.0)
*/

import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel {

    public ImagePanel(){
        this.setBounds(300, 145, 200, 225); // set size and bounds
        this.setBackground(Color.black);
    }
}
