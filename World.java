import java.awt.Graphics;
import java.awt.event.KeyEvent;

interface World {
  public void dibuja(Graphics g); // drawing
  public void actualice(); // time event handler 
  public void keh(KeyEvent e); // key event handler
} 