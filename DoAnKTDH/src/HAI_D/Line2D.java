package HAI_D;


import java.awt.Color;
import java.awt.Graphics;

/**
 * This class inherits from MyShape and is responsible for drawing a line.
 */
public class Line2D {
	int x1,y1,x2,y2;
        Color color;
	public Line2D() {
		super();
	}

    public Line2D(int x1, int y1, int x2, int y2, Color color) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
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
	public void draw(Graphics g) throws InterruptedException {

		g.setColor(getColor()); // sets the color
		// g.drawLine(getX1(), getY1(), getX2(), getY2()); // draws the line
		Midpoint(g, getX1(), getY1(), getX2(), getY2());
		// putPixel(getX1()+10, getY1()+10, g);
                  
	}

	private void Midpoint(Graphics g, int x1, int y1, int x2, int y2) throws InterruptedException {
		int x, y,Dx, Dy;
		Dx = Math.abs(x2 - x1);
		Dy = Math.abs(y2 - y1);

		x = x1;
		y = y1;
	
		int x_unit = 1, y_unit = 1;

		if (x2 - x1 < 0)
			x_unit = -x_unit;
		if (y2 - y1 < 0)
			y_unit = -y_unit;

		if (x1 == x2) // duong thang dung
		{
			while (y != y2 + 1) {
				
				y += y_unit;
				putPixel(x, y, g);
                               
			}
		}

		else if (y1 == y2) // duong ngang
		{
			while (x != x2 + 1) {
			
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
       

    public String Name(){
        return "Đường thẳng";
    }    
	@Override
    public String toString() {
        return "Đường thẳng";
    }
} // end class MyLine