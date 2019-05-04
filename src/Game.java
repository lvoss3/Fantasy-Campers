/**
* This class instantiates a new Game object
* (Req. 1.0.0, 2.0.0)
*/

import javax.swing.*;
import java.awt.*;

public class Game {

    JFrame window;
    Container con;
    Database db;

    public static void main(String[] args){ // main method

        new Game(); // 1.0.0

    }

    public Game() {
        Renderer renderer = new Renderer(); // call renderer method to render GUI object for UI/UX, 2.0.0
    }

}
