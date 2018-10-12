import java.awt.Graphics;
import java.awt.Color;
import java.util.ArrayList; 

public class Snake {
  final static int R = 8; 
  private int x, y; 
  private String direction; 

  public void setDirection(String newDirection) {
    this.direction = newDirection;  
  }
  
  ArrayList<Circle> body = new ArrayList<Circle>(); 
  Circle head;
  public Snake(int x, int y, String d) {
    this.x = x; 
    this.y = y;
    this.direction = d;
    this.head = new Circle(this.x + 0 * Snake.R, this.y + 0 * Snake.R, Snake.R, Color.BLUE, Color.YELLOW);
    // this.body.add( new Circle(this.x + 0 * Snake.R, this.y + 0 * Snake.R, Snake.R) ); 
    this.body.add( new Circle(this.x +  0 * Snake.R, this.y +  2 * Snake.R, Snake.R, Color.RED, Color.BLACK) ); // down
    this.body.add( new Circle(this.x +  0 * Snake.R, this.y +  4 * Snake.R, Snake.R, Color.RED, Color.BLACK) ); // down
    this.body.add( new Circle(this.x +  0 * Snake.R, this.y +  6 * Snake.R, Snake.R, Color.RED, Color.BLACK) ); // down 
    this.body.add( new Circle(this.x +  0 * Snake.R, this.y +  8 * Snake.R, Snake.R, Color.RED, Color.BLACK) ); // down 
    this.body.add( new Circle(this.x +  0 * Snake.R, this.y + 10 * Snake.R, Snake.R, Color.RED, Color.BLACK) ); // down
    this.body.add( new Circle(this.x +  0 * Snake.R, this.y + 12 * Snake.R, Snake.R, Color.RED, Color.BLACK) ); // down
    this.body.add( new Circle(this.x +  0 * Snake.R, this.y + 14 * Snake.R, Snake.R, Color.RED, Color.BLACK) ); // down 
    this.body.add( new Circle(this.x +  0 * Snake.R, this.y + 16 * Snake.R, Snake.R, Color.RED, Color.BLACK) ); // down
    this.body.add( new Circle(this.x +  0 * Snake.R, this.y + 18 * Snake.R, Snake.R, Color.RED, Color.BLACK) ); // down 
    this.body.add( new Circle(this.x +  2 * Snake.R, this.y + 18 * Snake.R, Snake.R, Color.RED, Color.BLACK) ); // right 
    this.body.add( new Circle(this.x +  4 * Snake.R, this.y + 18 * Snake.R, Snake.R, Color.RED, Color.BLACK) ); // right 
    this.body.add( new Circle(this.x +  6 * Snake.R, this.y + 18 * Snake.R, Snake.R, Color.RED, Color.BLACK) ); // right 
    this.body.add( new Circle(this.x +  8 * Snake.R, this.y + 18 * Snake.R, Snake.R, Color.RED, Color.BLACK) ); // right
    this.body.add( new Circle(this.x + 10 * Snake.R, this.y + 18 * Snake.R, Snake.R, Color.RED, Color.BLACK) ); // right 
    this.body.add( new Circle(this.x + 12 * Snake.R, this.y + 18 * Snake.R, Snake.R, Color.RED, Color.BLACK) ); // right
    this.body.add( new Circle(this.x + 14 * Snake.R, this.y + 18 * Snake.R, Snake.R, Color.RED, Color.BLACK) ); // right 
    this.body.add( new Circle(this.x + 16 * Snake.R, this.y + 18 * Snake.R, Snake.R, Color.RED, Color.BLACK) ); // right
    this.body.add( new Circle(this.x + 18 * Snake.R, this.y + 18 * Snake.R, Snake.R, Color.RED, Color.BLACK) ); // right
    this.body.add( new Circle(this.x + 20 * Snake.R, this.y + 18 * Snake.R, Snake.R, Color.RED, Color.BLACK) ); // right
    this.body.add( new Circle(this.x + 22 * Snake.R, this.y + 18 * Snake.R, Snake.R, Color.RED, Color.BLACK) ); // right 
    this.body.add( new Circle(this.x + 24 * Snake.R, this.y + 18 * Snake.R, Snake.R, Color.RED, Color.BLACK) ); // right
    this.body.add( new Circle(this.x + 26 * Snake.R, this.y + 18 * Snake.R, Snake.R, Color.RED, Color.BLACK) ); // right 
    this.body.add( new Circle(this.x + 28 * Snake.R, this.y + 18 * Snake.R, Snake.R, Color.RED, Color.BLACK) ); // right 
    this.body.add( new Circle(this.x + 30 * Snake.R, this.y + 18 * Snake.R, Snake.R, Color.RED, Color.BLACK) ); // right 
  }
  public void draw(Graphics g) {
    // g.drawString("I am here: ( " + this.x + ", " + this.y + ")", this.x, this.y); 
    this.head.draw(g);    
    for (Circle c : this.body)
      c.draw(g); 
  }
  public void move() {
    // System.out.println("I am moving!");  
    if ("north:south:east:west".contains(this.direction)) { 
      if (this.body.size() > 0) {
        for (int i = this.body.size() - 1; i > 0; i--) 
          this.body.get(i).moveTo(this.body.get(i-1).x(), this.body.get(i-1).y());
        this.body.get(0).moveTo(this.head.x(), this.head.y()); 
      }
      if (this.direction.equals("north")) this.y -= 2 * Snake.R; 
      else if (this.direction.equals("south")) this.y += 2 * Snake.R; 
      else if (this.direction.equals("west" )) this.x -= 2 * Snake.R; 
      else if (this.direction.equals("east" )) this.x += 2 * Snake.R;  
      this.head.moveTo(this.x, this.y); 
    }
  }
  public int x() { return this.x; }
  public int y() { return this.y; }
}