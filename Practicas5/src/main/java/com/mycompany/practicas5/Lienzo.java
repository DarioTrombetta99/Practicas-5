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

public Lienzo(){
try{
images = ImageIO.read(new URL("https://www.lucelight.it/fotoprog.php/thumb/lighting_jetty_on_lake_lesina-99581.jpg"));
this.setPreferredSize(new Dimension(images.getWidth(),images.getWidth()));
}catch (MalformedURLException ex){
Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
}catch (IOException ex){
Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
}
}

@Override
public void paintComponent (Graphics g){
super.paintComponent(g);
g.drawImage(images, 0, 0, null);
}

}