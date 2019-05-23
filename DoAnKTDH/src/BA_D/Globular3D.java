/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BA_D;

import java.awt.Color;
import java.awt.Graphics;
/**
 *
 * @author ASUS
 */
public class Globular3D extends MyShape3 {
    private int r;
    public Globular3D(){
        super();
        this.r = 0;
    }
    
    public Globular3D(int x, int y, int z, int r, Color color) {
        super(x, y, z, color);
        this.r=r;
    }

    public int getR() {
        return r;
    }
  
    public void draw (Graphics g){
        Circle2D circle = new Circle2D(x,y,r,getColor());
        circle.draw(g);
        MidpointEllipse(g);      
    }
    
    public void putPixelEllipse (int x1,int y1, Graphics g)
    {
        putPixel(-x1 + getX(),  y1 + getY(),g);
        putPixel( x1 + getX(),  y1 + getY(),g);
        if (((x1 + getX() + y1 + getY()) % 10) > 5) 
        {
            putPixel(-x1 + getX(), -y1 + getY(),g);
            putPixel( x1 + getX(), -y1 + getY(),g);
        }
    };
    public void MidpointEllipse(Graphics g){
        int x1 ,y1;
        double d1, d2;
        int a, b;
        a = r;
        b = r/3;
        putPixelEllipse(x,y,g);
        x1=0;
        y1=b; 
        d1=Math.pow(b,2) - b*Math.pow(a, 2) + (Math.pow(a, 2))/4 ;
        putPixelEllipse(x1, y1 ,g);
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
                    putPixelEllipse(x1,y1,g);
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
                    putPixelEllipse(x1,y1,g);
                }
                
    }

    @Override
    public String toString() {
        return "Hình cầu";
    }
    
    
}
