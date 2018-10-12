import java.awt.Graphics;
import javax.swing.JFrame; 
import java.awt.Font;
import java.awt.Color;
import java.awt.event.KeyEvent;

public class Game implements World {
  Snake snake;
  int times;  
  public Game() {
    this.snake = new Snake(50, 80, "east");  
  }
  public void dibuja(Graphics g) { 
    Font font = new Font("SansSerif", Font.BOLD, 20);
    g.setFont(font); 
    g.setColor(Color.WHITE);
    g.drawString(this.times++ + "", 20, 40); 

    g.drawString("(" + this.snake.x() + ", " + this.snake.y() + ")" , 140, 180); 

    this.snake.draw(g);
    
  }
  public void actualice() { 
    this.snake.move(); 
  }
  public void keh(KeyEvent e) {  
    int EAST = 39; 
    // System.out.println( e.getKeyCode() ); 
    int code = e.getKeyCode(); 
    if (code == 37) { // West 
      this.snake.setDirection("west"); 
    } else if (code == KeyEvent.VK_UP) { // North or 38 (not VK_KP_UP      
      this.snake.setDirection("north"); 
    } else if (code == EAST) { 
      this.snake.setDirection("east"); 
    } else if (code == 40) { // South 
      this.snake.setDirection("south"); 
    } else {
      this.snake.setDirection("no direction"); 
      // System.out.println( KeyEvent.VK_UP );
    }
  }
  public static void main(String[] args) {
    BigBang b = new BigBang( 50, new Game() ); 
    JFrame f = new JFrame(); 
    f.add(b); 
    f.addKeyListener(b); 
    f.setSize(400, 400); 
    f.setVisible(true); 
    b.start(); 
  }
  
}