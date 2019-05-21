/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HAI_D;

import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Math.ceil;
import static java.lang.Math.sqrt;

/**
 *
 * @author Ken
 */
public class Cung {
     int x ,y;
    int R;
    Color color;

    public Cung(){}
    
        public Cung(int x ,int y, int R, Color color ) {
        this.x = x;
        this.y = y;
        this.R = R;
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
        this.y = y;
    }
    public int getR() {
        return R;
    }

    public void setR(int R) {
        this.R = R;
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
      
    public void Midpoint(int x1, int y1, Graphics g)
{
    g.setColor(getColor());
    putPixel( x1 + getX(),  y1 + getY(),g);
    //putPixel(-x1 + getX(),  y1 + getY(),g);
    putPixel( x1 + getX(), -y1 + getY(),g);
    //putPixel(-x1 + getX(), -y1 + getY(),g);
    putPixel( y1 + getX(),  x1 + getY(),g);
    //putPixel(-y1 + getX(),  x1 + getY(),g);
    putPixel( y1 + getX(), -x1 + getY(),g);
    //putPixel(-y1 + getX(), -x1 + getY(),g);
}
public void draw(Graphics g)
{
    int x = 0; int y = R;
    int f = 1 - R;
    Midpoint(x, y,g);
    while (x < y)
    {
        if (f < 0) f += (x << 1) + 3;
        else
        {
            y--;
            f += ((x - y) << 1) + 5;
        }
        x++;
        Midpoint(x, y, g);
    }
}
  @Override
    public String toString() {
        return "Hình tròn";
    }

};








