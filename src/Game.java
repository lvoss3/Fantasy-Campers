import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Game {

    JFrame window;
    Container con;
    Database db;

    public static void main(String[] args){

        new Game(); // 1.0.0

    }

    public Game() {
        Renderer renderer = new Renderer();
    }

}
