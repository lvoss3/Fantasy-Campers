import javax.swing.*;
import java.awt.*;

public class Renderer {

    Database db;
    JFrame window;
    Container con;

    public Renderer(){
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

    public void render(Container con, int index){
        con.removeAll();
        con.setVisible(false);


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
