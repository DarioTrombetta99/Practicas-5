package com.mycompany.practicas5;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.io.IOException;

/**
 *
 * @author CiaMb
 */
public class Lienzo extends JPanel {

    private BufferedImage images = null;
    
    private BufferedImage image2 = null;

    public Lienzo() {
        try {
            images = ImageIO.read(new URL("https://www.lucelight.it/fotoprog.php/thumb/lighting_jetty_on_lake_lesina-99581.jpg"));
            image2 = ImageIO.read(new URL("https://upload.wikimedia.org/wikipedia/commons/thumb/7/76/50px_x_50px_coloured_logo_on_white_background.svg/68px-50px_x_50px_coloured_logo_on_white_background.svg.png"));
            System.out.println("Logo Width: logo " + image2.getWidth() + " height: " + image2.getHeight());
            this.setPreferredSize(new Dimension(images.getWidth(), images.getHeight()));
        } catch (MalformedURLException ex) {
            Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public BufferedImage getImage() {
        return images;
    }
    
    public BufferedImage getImage2() {
        return image2;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(images, 0, 0, null);
    }

}
