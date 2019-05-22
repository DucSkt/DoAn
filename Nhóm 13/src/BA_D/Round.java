/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BA_D;

import java.awt.Color;

/**
 *
 * @author DUC SKT
 */
public class Round {
    public static int size3D = 3;
    public static Color color3D = Color.RED;
    
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
        return tdm-1;
    }
      
    public int roundToaDo(double tds)
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
}
