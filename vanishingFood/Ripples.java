// Ripples.java 

import javax.swing.*;
import java.awt.event.*; 
import java.util.*; 
import java.awt.*;

public class Ripples implements World {
  private String message = ""; 
  public void sayGoodBye() {
    this.message = "Game Over";  
  }
  ArrayList<Circle> food = new ArrayList<Circle>(); 
  public Ripples() {
    this.food = new ArrayList<Circle>();  
    this.food.add(new Circle(100, 200, 30, Color.YELLOW)); 
    this.food.add(new Circle(200, 250, 20, Color.RED)); 
    this.food.add(new Circle(240, 150,  5, Color.BLUE)); 
    this.food.add(new Circle(180,  50, 15, Color.GREEN)); 
    this.food.add(new Circle( 50,  75, 25, new Color(125, 180, 210))); 
    this.food.add(new Circle(150, 300, 35, new Color(200, 130, 190))); 
    this.message = this.food.size() + " food items left... "; 
  }
  public void update() {
    this.food.remove(0); 
    this.message = this.food.size() + " food items left... "; 
  }
  public void draw(Graphics g) {
    g.drawString(this.message, 200, 200); 
    for (Circle c : this.food) 
      c.draw(g);
  }
  public void mousePressed(MouseEvent e) { 

  } 
  public void keyPressed(KeyEvent e) { 
  
  }
  public static void main(String[] args) {
    BigBang game = new BigBang(2000, new Ripples());  
    JFrame frame = new JFrame("Ripples"); 
    frame.getContentPane().add( game ); 
    game.addMouseListener( game ); 
    frame.setVisible(true); 
    frame.setSize(400, 400); 
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
    game.start(); 
  }
  public boolean hasEnded() {
    return (this.food.size() == 0); 
  }
}