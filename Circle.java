import java.awt.Graphics;
import java.awt.Color;

public class Circle {
  private int x, y, radius; 
  Color in, border; 
  public int x() { return this.x; } 
  public int y() { return this.y; } 
  public Circle(int x, int y, int r, Color in, Color border) {
    this.x = x;
    this.y = y; 
    this.radius = r;
    this.in = in;
    this.border = border;
  }
  public void draw(Graphics g) {
    g.setColor(this.in); 
    g.fillOval(this.x - this.radius, this.y - this.radius, 2 * this.radius, 2 * this.radius);  
    g.setColor(this.border); 
    g.drawOval(this.x - this.radius, this.y - this.radius, 2 * this.radius, 2 * this.radius);  
  }
  public void moveTo(int x, int y) {
    this.x = x;
    this.y = y; 
  }
}