/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BA_D;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author ASUS
 */
public class Cube3D extends MyShape3{
    private int d;
    public Cube3D(){
        super();
        this.d = 0;
    }
    
    public Cube3D(int x, int y, int z, int d, Color color) {
		super(x, y, z, color);     
                this.d=d;
	}
    public void draw(Graphics g) {
            int dX, dY;
            dX = d/2;
            dY = d/2;
            Point A = new Point(x, y);
            Point B = new Point(x + d, y);
            Point C = new Point(x + d, y + d);
            Point D = new Point(x, y + d);
            Point A1 = new Point(x - dX, y + dY);
            Point B1 = new Point(x + d - dX, y + dY);
            Point C1 = new Point(x + d - dX, y + d + dY);
            Point D1 = new Point(x - dX, y + d + dY);
            g.setColor(getColor()); // sets the color		
            Midpoint(g, A.x, A.y, B.x -1, B.y); // AB
            Midpoint(g, B.x, B.y, C.x , C.y -1); //BC
            Midpoint2(g, A.x, A.y, D.x, D.y); //ad
            Midpoint2(g, C.x, C.y, D.x, D.y); //CD
            
            Midpoint(g, A.x, A.y, A1.x, A1.y); //AA1
            Midpoint(g, B.x, B.y, B1.x, B1.y);     //BB1
            Midpoint(g, C.x, C.y, C1.x, C1.y); // CC1
            Midpoint2(g, D.x, D.y,D1.x, D1.y);//DD1
            Midpoint(g, A1.x, A1.y, B1.x -1, B1.y);//A1B1
            Midpoint(g, A1.x, A1.y, D1.x, D1.y -1);//A1D1
            Midpoint(g, B1.x, B1.y, C1.x, C1.y -1);//B1C1
            Midpoint(g, C1.x, C1.y, D1.x, D1.y);//C1D1
	}
    
    private void Midpoint(Graphics g, int x1, int y1, int x2, int y2) {
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
			}else {   // Đường Thẳng Chéo
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
    
    private void Midpoint2(Graphics g, int x1, int y1, int x2, int y2) {
		int x, y, Dx, Dy;
                int dem = 0;
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
                                dem++;
                                if( dem%10 > 5 ){
                                     putPixel(x,y,g);
                                }
			}
		}

		else if (y1 == y2) // duong ngang
		{
			while (x != x2 + 1) {
			
				x += x_unit;
				dem++;
                                if( dem%10 > 5){
                                     putPixel(x,y,g);
                                }
			}
		} else {
                        putPixel(x,y,g);
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
					dem++;
                                        if( dem%10 > 5){
                                             putPixel(x,y,g);
                                        }

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
					dem++;
                                    if( dem%10 > 5){
                                         putPixel(x,y,g);
                                    }
				}	
			}	
		}
	}

    @Override
    public String toString() {
        return "Hình lập phương";
    }
    
}
