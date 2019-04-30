import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class BackgroundPane extends JPanel {

    private BufferedImage img;

    @Override
    public Dimension getPreferredSize() {
        BufferedImage img = getBackgroundImage();

        Dimension size = super.getPreferredSize();
        if (img != null) {
            size.width = 800;
            size.height = 600;
        }

        return size;
    }

    public BufferedImage getBackgroundImage() {
        return img;
    }

    public void setBackgroundImage(BufferedImage value) {
        if (img != value) {
            BufferedImage old = img;
            img = value;
            firePropertyChange("background", old, img);
            revalidate();
            repaint();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        BufferedImage bg = getBackgroundImage();
        BufferedImage resized = new BufferedImage(800, 600, bg.getType());
        Graphics2D g2 = resized.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(bg, 0, 0, 800, 600, 0, 0, bg.getWidth(),
                bg.getHeight(), null);
        g2.dispose();

        if (resized != null) {
            int x = (getWidth() - resized.getWidth()) / 2;
            int y = (getHeight() - resized.getHeight()) / 2;
            g.drawImage(resized, x, y, this);
        }
    }

}