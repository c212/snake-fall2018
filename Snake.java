import java.awt.Graphics;

public class Snake {
  private int x, y; 
  String direction = "north";
  
  public void setDirection(String newDirection) {
    this.direction = newDirection;  
  }
  
  public Snake() {
    this.x = 100; 
    this.y = 100; 
  }
  public void draw(Graphics g) {
    g.drawString( "(" + this.x + ", " + this.y + ")", this.x, this.y);  
  }
  
  public void move() {
    if (this.direction.equals("North")) {
      this.y -= 5; 
    } else  if (this.direction.equals("East")) {
      this.x += 5; 
    } else  if (this.direction.equals("South")) {
      this.y += 5; 
    } else  if (this.direction.equals("West")) {
      this.x -= 5; 
    } else { // nothing which means not moving 
      
    }
  }
}