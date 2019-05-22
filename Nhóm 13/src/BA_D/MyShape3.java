package BA_D;
import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics; 
public abstract class MyShape3 {
    int x, y, z;
    public Color color;
    Round round = new Round();
    
    public MyShape3(){
        x = 0;
        y= 0;
        z = 0;
        color = Color.BLACK;
    }
    
    public MyShape3(int x, int y, int z, Color color)
    {
      //  int tempx = Math.round(sin60 * z);
      //  int tempy = Math.round(cos60 * z);
        this.x=x;//-tempx;
        this.y=y;//+tempy;
        this.z=z;
        this.color=round.color3D;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
    

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    
    public void putPixel(int x, int y, Graphics g)
    {
    	//g.drawLine( x, y, x, y );
//        g.fillRect(x, y, 1, 1);
        g.fillRect(round.round(x), round.round(y), round.size3D, round.size3D);
    }
    abstract public void draw( Graphics g );
   
}