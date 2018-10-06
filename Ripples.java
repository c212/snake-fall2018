// Ripples.java 

import javax.swing.*;
import java.awt.event.*; 
import java.util.*; 
import java.awt.*;

public class Ripples implements World {
  
  Snake snake = new Snake(); 

  public void draw(Graphics g) { 
    this.snake.draw(g); 
  } 
  
  public void update() { 
    this.snake.move();
  } 
  
  public boolean hasEnded() { return false; }

  public void keyPressed(KeyEvent e) { 
    int EAST = 39; 
    // System.out.println( e.getKeyCode() ); 
    int code = e.getKeyCode(); 
    if (code == 37) { // West 
      this.snake.setDirection("West"); 
    } else if (code == KeyEvent.VK_UP) { // North or 38 (not VK_KP_UP      
      this.snake.setDirection("North"); 
    } else if (code == EAST) { 
      this.snake.setDirection("East"); 
    } else if (code == 40) { // South 
      this.snake.setDirection("South"); 
    } else {
      this.snake.setDirection("no direction"); 
      // System.out.println( KeyEvent.VK_UP );
    }
  }
  
  public void mousePressed(MouseEvent e) { }  // not used for now (or ever in this game)
  public static void main(String[] args) {
    BigBang game = new BigBang(100, new Ripples());  
    JFrame frame = new JFrame("Ripples"); 
    frame.getContentPane().add( game );
    
    frame.addKeyListener( game ); // by analogy with the actual ripples game but notice game replaced with frame
    
    frame.setVisible(true); 
    frame.setSize(400, 400); 
    frame.setDefaultCloseOperation( 3 ); //  JFrame.EXIT_ON_CLOSE ); 
    game.start(); 
  }
}