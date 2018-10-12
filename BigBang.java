import javax.swing.Timer; 
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent; 
import javax.swing.JComponent; 
import java.awt.Graphics; 
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

public class BigBang extends JComponent implements ActionListener, KeyListener, MouseListener {

  public void mouseEntered(MouseEvent e) { } 
  public void mouseExited(MouseEvent e) { } 
  public void mousePressed(MouseEvent e) { } 
  public void mouseReleased(MouseEvent e) { } 
  public void mouseClicked(MouseEvent e) { } 

  public void keyPressed(KeyEvent e) { 
    this.world.keh(e);
  } 
  public void keyReleased(KeyEvent e) { } 
  public void keyTyped(KeyEvent e) { } 
  
  public void paintComponent(Graphics g) {
    this.world.dibuja(g); 
  }
  private int counter;
  public void actionPerformed(ActionEvent e) {
    // System.out.println( counter++ ); 
    this.world.actualice(); 
    this.repaint(); 
  }
  private World world;
  private Timer timer; 
  public BigBang(World world) {
    this.world = world;
    this.timer = new Timer(300, this); 
  }
  public BigBang(int rate, World world) {
    this.world = world;
    this.timer = new Timer(rate, this); 
  }
  public void start() {
     this.timer.start(); 
  }
}