/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HAI_D;

import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Math.round;

/**
 *
 * @author LuFFy
 */
public class Square2D  {
    int x,y;
    int canh;
    Color color;
    
    public Square2D() {
       
    }

    public Square2D(int x, int y, int canh, Color color) {
        this.x = x;
        this.y = y;
        this.canh = canh;
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

    public int getCanh() {
        return canh;
    }

    public void setCanh(int canh) {
        this.canh = canh;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public int round(double tds)
    {
        int tdm;
        double sodu = tds % 5;
        if (sodu != 0)
        {
            if (sodu >= 3) tdm = (int)(tds + 5 - sodu);
            else tdm = (int)(tds - sodu);
        }
        else tdm = (int)tds;
        if (tdm > 1000) tdm = 1000;
        return tdm;
    }
    
    public void putPixel(int x, int y, Graphics g)
    {
    	  //g.drawLine( x, y, x, y );
          g.fillRect(round(x), round(y), 5, 5);
    }
        public void draw(Graphics g) {

            g.setColor(getColor()); // sets the color		
            Midpoint(g, getX(), getY(), getX()+canh-5, getY());
            Midpoint(g, getX()+canh, getY(), getX()+canh, getY()-canh-5);
            Midpoint(g, getX()+canh, getY()-canh, getX()-5, getY()-canh);
            Midpoint(g, getX(), getY()-canh, getX(), getY()-5);           
	}
        private void Midpoint(Graphics g, int x1, int y1, int x2, int y2) {
		int x, y,Dx, Dy;
		Dx = Math.abs(x2 - x1);
		Dy = Math.abs(y2 - y1);

		x = x1;
		y = y1;
	
		int x_unit = 5, y_unit = 5;

		if (x2 - x1 < 0)
			x_unit = -x_unit;
		if (y2 - y1 < 0)
			y_unit = -y_unit;

		if (x1 == x2) // duong thang dung
		{
			while (y != y2 + 5) {
				
				y += y_unit;
				putPixel(x, y, g);
			}
		}

		else if (y1 == y2) // duong ngang
		{
			while (x != x2 + 5) {
			
				x += x_unit;
				putPixel(x, y, g);
			}
		} else {
			putPixel(x, y, g);
			if (Math.abs(Dx)>Math.abs(Dy)) {
				int p=Dy-Dx/2;
			
				while (x != x2) {
				
					if (p < 0)
						p += Dy;
					else {
						p += Dy - Dx;
						y += y_unit;
					}
					x += x_unit;
					putPixel(x, y, g);

				}
			}else {
				int p=Dx-Dy/2;
				
				while (y != y2) {
				
					if (p < 0)
						p += Dx;
					else {
						p += Dx - Dy;
						x += x_unit;
					}
					y += y_unit;
					putPixel(x, y, g);

				}
				
			}
			
		}
	}
        
        public String toString(){
        return "Hình vuông";
    }
}
