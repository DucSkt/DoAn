
package HAI_D;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author LuFFy
 */
public class Ellipse2D  {
    int x,y;
    int a,b;
    Color color;
    
    public Ellipse2D() {
       
    }

    public Ellipse2D(int x, int y, int a,int b, Color color) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.b =b ;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
     public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y ;
    }
     public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
     public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public void putPixel(int x, int y, Graphics g)
    {
            g.fillRect(x, y, 1, 1);
    }
    public void Midpoint (int x1,int y1, Graphics g)
    {  
        g.setColor(getColor());
        putPixel( x1 + getX(),  y1 + getY(),g);
        putPixel( x1 + getX(), -y1 + getY(),g);
        putPixel(-x1 + getX(),  y1 + getY(),g);
        putPixel(-x1 + getX(), -y1 + getY(),g);
    };
    public void draw(Graphics g){
        int x1 ,y1;
        double d1, d2;
        Midpoint(x,y,g);
        x1=0;
        y1=b; 
        d1=Math.pow(b,2) - b*Math.pow(a, 2) + (Math.pow(a, 2))/4 ;
        Midpoint(x1, y1 ,g);
        while ((Math.pow(a,2)*(y1-1/2))> (Math.pow(b,2)*(x1+1)))
                {
                    if(d1<0)
                    {
                        d1=d1+Math.pow(b,2)*(2*x1+3);
                        x1=x1+1;
                    }
                    else
                    {
                        d1=d1+Math.pow(b, 2)*(2*x1+3)+Math.pow(a,2)*((y1 * (-2)+2));
                        x1=x1+1;
                        y1=y1-1;    
                    }
                    Midpoint(x1,y1,g);
                }
                d2=Math.pow(b,2)*Math.pow(x1+1/2,2)+Math.pow(a,2)*Math.pow(y1-1,2)-Math.pow(a,2)*Math.pow(b,2);
                while(y1>0)
                {
                    if(d2<0)
                    {
                        d2=d2+ Math.pow(b,2)*(2*x1+2)+Math.pow(a,2)*(-2*y1+3);
                        x1=x1+1;
                        y1=y1-1;
                    }
                    else
                    {
                        d2=d2+Math.pow(a,2)*(-2*y1+3);
                        y1=y1-1;
                    }
                    Midpoint(x1,y1,g);
                }
                
    };

    @Override
    public String toString() {
        return "Hình ellipse";
    }
    
};