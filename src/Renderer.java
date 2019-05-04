/**
* This is the main class that does all the work of rendering the GUI elements as objects
* (Req. 2.0.0, 3.0.0, 4.0.0, 5.0.0, 8.0.0, 9.0.0, 10.0.0, 11.0.0)
*/

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Renderer {

    Database db;
    JFrame window;
    Container con;

    public Renderer(){ // main renderer class that does the heavy lifting
        window = new JFrame("Fantasy Campers"); // 2.0.0
        window.setSize(800, 600);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        con = window.getContentPane();
        this.db = new Database();
        render(con, 0);
        window.setVisible(true);
    }

    public void render(Container con, int index){ // container for rendered elements
        con.removeAll();
        con.setVisible(false);

		// tie in other methods to paint the entire GUI window
		
        MainPanel background = new MainPanel(this.db.a[index].filepath); 

        NavPanel nav = new NavPanel(con,this, window);

        MainTextPanel mainTextPanel = new MainTextPanel(db.a[index].text);

        OptionsPanel optionsPanel = new OptionsPanel(con, this, db.a[index].optionTexts, db.a[index].results);

        con.add(nav);
        con.add(mainTextPanel);
        con.add(optionsPanel);
        con.add(background);

        con.setVisible(true);
    }
}
