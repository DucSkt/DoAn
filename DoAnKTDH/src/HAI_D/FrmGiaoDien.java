/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HAI_D;

import com.sun.prism.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import static java.lang.Math.round;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author LuFFy
 */

public class FrmGiaoDien extends javax.swing.JFrame {

    /**
     * Creates new form FrmGiaoDien
     */
      public static int demdt=1, demtg=1,demhcn=1,demhv=1,demhbh=1,demht=1,demelip=1,demcube=1,demglobular=1;
      DefaultListModel listHienThi=new DefaultListModel ();
      DefaultComboBoxModel listPhepBienDoi= new DefaultComboBoxModel();
       public static int width,centerHeight;
       public static int height,centerWidth;
 int cout = 0;
 
    public FrmGiaoDien() {
        initComponents();
        
        width=jKhungVe.getWidth();
        height=jKhungVe.getHeight();
        centerWidth = width/2;
        centerHeight = height/2;
        LineForm = new javax.swing.JFrame();
        g2 = (Graphics2D)jKhungVe.getGraphics();
        listCircle= new ArrayList<Circle2D>();
        listEllipse =new ArrayList<Ellipse2D>();
        listbanh= new ArrayList<Circle2D>();
        listLine=new ArrayList<Line2D>();

        
        //txtsx.setEnabled(false);
       // txtsy.setEnabled(false);
    }
     
    public Graphics2D g2;

    public Line2D line;

    public List<Line2D> listLine;
    
    public List<Circle2D> listbanh;

    public List<Circle2D> listCircle;
    public List<Ellipse2D> listEllipse;

    public javax.swing.JFrame LineForm;
public void putPixel(int x, int y, Graphics g)
    {
    	//g.drawLine( x, y, x, y );
        g.fillRect(round(x), round(y), 5, 5);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jKhungVe = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ỨNG DỤNG VẼ HÌNH");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jKhungVe.setBackground(new java.awt.Color(255, 255, 255));
        jKhungVe.setPreferredSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout jKhungVeLayout = new javax.swing.GroupLayout(jKhungVe);
        jKhungVe.setLayout(jKhungVeLayout);
        jKhungVeLayout.setHorizontalGroup(
            jKhungVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jKhungVeLayout.setVerticalGroup(
            jKhungVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("2D");

        jButton1.setText("Sút Bóng");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Đối Xứng Ox");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Đối Xứng Oy");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Đối Xứng Trục");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jKhungVe, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jKhungVe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
         
    public void toaDo() {
            for (int i = 0; i <= jKhungVe.getWidth(); i=i+5)
           {
             g2.drawLine( 0   , i, jKhungVe.getWidth()  , i);
             g2.setColor(Color.BLACK);
             if(jKhungVe.getWidth()/2==i)
             {
                 g2.drawLine(0   , i, jKhungVe.getWidth()  , i);
                 g2.setColor(Color.BLUE);
             }
             g2.drawLine(i , 0, i , jKhungVe.getHeight());
             g2.setColor(Color.BLACK);
             if(jKhungVe.getHeight()/2==i)
             {
                 g2.drawLine(i , 0, i , jKhungVe.getHeight());
                 g2.setColor(Color.BLUE);
             }

           }
        }
    
    
            
          
    public void refresh() throws InterruptedException {
        
        for (int i =0;i<listLine.size();i++){ 
            listLine.get(i).draw(g2);
        }
         for (int i =0;i<listCircle.size();i++) {
            listCircle.get(i).draw(g2);
        }
        
         
//         Line2D line = null;
//					   Point A = null;
//                                  
//                                           A.x =  line.getX1();
//                                           A.y = line.getY1();
//                                           
//					Point B = null;    
//                                            B.x =  line.getX2();
//                                           B.y = line.getY2();
//					
//					if(cout > 15 && cout < 16) {
//						A.x-=3;  				
//						B.x-=3;	
//					}
//					else if (cout > 15){
//						A.x-=15;  
//						A.y-=5;
//						
//						B.x-=15;
//						B.y-=5;	
//					}
//					else {
//						A.x-=15;  
//						A.y+=5;
//						
//						B.x-=15;
//						B.y+=5;	
//					}
					// A.x + , B.x +  => qua phải 
					// A.x - , B.x -  => qua trái 
					// A.y - , B.y -  => lên 
					// A.y + , B.y +  => xuống 
					
					// nếu chỉ trừ 1 điểm A hoac B thì đầu kia sẽ đứng yên
//					line.setX1(A.x);
//                                        line.setY1(A.y);
//                                        
//					line.setX2(B.x);
//                                        line.setY2(B.y);
//				//	 line.setAngle(line.getAngle() + line.getSpeed());
//					line.draw(g2);
                                        
    }
     public void refreshColor() {
        for (int i =0;i<listLine.size();i++){ 
            listLine.get(i).color=Color.BLACK;
        }
         for (int i =0;i<listCircle.size();i++) {
            listCircle.get(i).color=Color.BLACK;
        }
    }
     
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        toaDo(); 
        
        //JOptionPane.showMessageDialog(rootPane, "test");
//        JFrame frame=  new JFrame();
//        String x1= JOptionPane.showInputDialog(
//        frame,
//        "Nhập x",
//        "Nhập vị trí người",
//        JOptionPane.INFORMATION_MESSAGE
//        );
//         String y1= JOptionPane.showInputDialog(
//        frame,
//        "Nhập y",
//        "Nhập vị trí người",
//        JOptionPane.INFORMATION_MESSAGE
//        );
//       
//         if(x1.equals("")|| y1.equals("")){
//            JOptionPane.showMessageDialog(rootPane, "chưa nhập đủ dữ liệu, nhập lại!");
//            return;
//        }
        
        person ps = new person();
       // ps.dau(Integer.parseInt(x1),Integer.parseInt(y1) , 50);
        ps.dau(-180,-80 , 30);
        ps.than();
        ps.chan();
        ps.tay();
        
                 //System.out.println(ps.chanx2 + " - " + ps.chany2 + " - " + listLine.size()  + " - " + (-ps.thany2+jKhungVe.getHeight()/2));   
        Line2D than= new Line2D(ps.thanx1 + jKhungVe.getWidth()/2,-(ps.thany1)+jKhungVe.getHeight()/2
                ,ps.thanx2+ jKhungVe.getWidth() /2,-ps.thany2+jKhungVe.getHeight()/2,Color.RED);
//        for(MyShape dt: list){   300 - 250 - 300 - 300
//            
//        }
        listLine.add(than);
      //  listHienThi.addElement(line);
           
       Line2D chan = new Line2D(ps.chanx1 + jKhungVe.getWidth()/2,-ps.chany1+jKhungVe.getHeight()/2
                ,ps.chanx2+ jKhungVe.getWidth() /2,-ps.chany2+jKhungVe.getHeight()/2,Color.RED);
        listLine.add(chan);
        
        
        
        Line2D chan2 = new Line2D(ps.chan2x1 + jKhungVe.getWidth()/2,-ps.chan2y1+jKhungVe.getHeight()/2
                ,ps.chan2x2+ jKhungVe.getWidth() /2,-ps.chan2y2+jKhungVe.getHeight()/2,Color.RED);
        listLine.add(chan2);
         
        
        Line2D tay = new Line2D(ps.tay1x1 + jKhungVe.getWidth()/2,-ps.tay1y1+jKhungVe.getHeight()/2
                ,ps.tay1x2+ jKhungVe.getWidth() /2,-ps.tay1y2+jKhungVe.getHeight()/2,Color.RED);
        
        listLine.add(tay);
        
        
        
        Line2D tay2 = new Line2D(ps.tay2x1 + jKhungVe.getWidth()/2,-(ps.tay2y1)+jKhungVe.getHeight()/2
                ,ps.tay2x2+ jKhungVe.getWidth() /2,-(ps.tay2y2)+jKhungVe.getHeight()/2,Color.RED);
        
        listLine.add(tay2); 
        Line2D tay3 = new Line2D(ps.tay3x1 + jKhungVe.getWidth()/2,-(ps.tay3y1)+jKhungVe.getHeight()/2
                ,ps.tay3x2+ jKhungVe.getWidth() /2,-(ps.tay3y2)+jKhungVe.getHeight()/2,Color.RED);
        
        listLine.add(tay3);
        
        Line2D lao = new Line2D(ps.laox1 + jKhungVe.getWidth()/2,-(ps.laoy1)+jKhungVe.getHeight()/2
                ,ps.x1+ ps.r + jKhungVe.getWidth() /2,-(ps.laoy1)+jKhungVe.getHeight()/2,Color.RED);
        
        listLine.add(lao); 
            Circle2D banh = new Circle2D(ps.chanx2+25 + jKhungVe.getWidth()/2,-ps.chany2-15+jKhungVe.getHeight()/2,
                                       15, Color.RED);
            listCircle.add(banh);
        
        Circle2D circle = new Circle2D(ps.x1 + jKhungVe.getWidth()/2,-ps.y1+jKhungVe.getHeight()/2,
                                       ps.r, Color.RED);
        listCircle.add(circle);
        
        //g3.drawLine(, 0, 410, 390);
        //System.out.println(listLine.size());
          try {
              refresh();
          } catch (InterruptedException ex) {
              Logger.getLogger(FrmGiaoDien.class.getName()).log(Level.SEVERE, null, ex);
          }
          
     
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        person ps = new person();
        ps.dau(-180,-80 , 30);
        ps.than();
        ps.chan();
        ps.tay();
        
        for(int i=ps.chanx2+25; i<300; i=i+5)
        {
            Circle2D banh = new Circle2D(i + jKhungVe.getWidth()/2,-ps.chany2-15+jKhungVe.getHeight()/2,
                                       15, Color.RED);
            listbanh.add(banh);
        
            Circle2D xoabanh = new Circle2D(i + jKhungVe.getWidth()/2,-ps.chany2-15+jKhungVe.getHeight()/2,
                                       15, Color.WHITE);
            listbanh.add(xoabanh);
            
        }
         for (int i =0;i<listbanh.size();i++) {
            try {
                listbanh.get(i).draw(g2);
                toaDo();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(FrmGiaoDien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         listbanh.clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        person ps = new person();
       // ps.dau(Integer.parseInt(x1),Integer.parseInt(y1) , 50);
        ps.dau(-180,-80 , 30);
        ps.than();
        ps.chan();
        ps.tay();
        System.out.println(ps.x1);
                 //System.out.println(ps.chanx2 + " - " + ps.chany2 + " - " + listLine.size()  + " - " + (-ps.thany2+jKhungVe.getHeight()/2));   
        Line2D than= new Line2D(ps.thanx1 + jKhungVe.getWidth()/2,(ps.thany1)+jKhungVe.getHeight()/2
                ,ps.thanx2+ jKhungVe.getWidth() /2,ps.thany2+jKhungVe.getHeight()/2,Color.RED);
//        for(MyShape dt: list){   300 - 250 - 300 - 300
//            
//        }
        listLine.add(than);
      //  listHienThi.addElement(line);
           
       Line2D chan = new Line2D(ps.chanx1 + jKhungVe.getWidth()/2,ps.chany1+jKhungVe.getHeight()/2
                ,ps.chanx2+ jKhungVe.getWidth() /2,ps.chany2+jKhungVe.getHeight()/2,Color.RED);
        listLine.add(chan);
        
        
        
        Line2D chan2 = new Line2D(ps.chan2x1 + jKhungVe.getWidth()/2,ps.chan2y1+jKhungVe.getHeight()/2
                ,ps.chan2x2+ jKhungVe.getWidth() /2,ps.chan2y2+jKhungVe.getHeight()/2,Color.RED);
        listLine.add(chan2);
         
        
        Line2D tay = new Line2D(ps.tay1x1 + jKhungVe.getWidth()/2,ps.tay1y1+jKhungVe.getHeight()/2
                ,ps.tay1x2+ jKhungVe.getWidth() /2,ps.tay1y2+jKhungVe.getHeight()/2,Color.RED);
        
        listLine.add(tay);
        
        
        
        Line2D tay2 = new Line2D(ps.tay2x1 + jKhungVe.getWidth()/2,(ps.tay2y1)+jKhungVe.getHeight()/2
                ,ps.tay2x2+ jKhungVe.getWidth() /2,(ps.tay2y2)+jKhungVe.getHeight()/2,Color.RED);
        
        listLine.add(tay2); 
        Line2D tay3 = new Line2D(ps.tay3x1 + jKhungVe.getWidth()/2,(ps.tay3y1)+jKhungVe.getHeight()/2
                ,ps.tay3x2+ jKhungVe.getWidth() /2,(ps.tay3y2)+jKhungVe.getHeight()/2,Color.RED);
        
        listLine.add(tay3);
        
//        Line2D lao = new Line2D(ps.laox1 + jKhungVe.getWidth()/2,-(ps.laoy1)+jKhungVe.getHeight()/2
//                ,ps.x1+ ps.r + jKhungVe.getWidth() /2,-(ps.laoy1)+jKhungVe.getHeight()/2,Color.RED);
//        
//        listLine.add(lao);
        
        Circle2D circle = new Circle2D(ps.x1 + jKhungVe.getWidth()/2,ps.y1+jKhungVe.getHeight()/2,
                                       ps.r, Color.RED);
        listCircle.add(circle);
        
        //g3.drawLine(, 0, 410, 390);
        //System.out.println(listLine.size());
          try {
              refresh();
          } catch (InterruptedException ex) {
              Logger.getLogger(FrmGiaoDien.class.getName()).log(Level.SEVERE, null, ex);
          }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         person ps = new person();
       // ps.dau(Integer.parseInt(x1),Integer.parseInt(y1) , 50);
        ps.dau(-180,-80 , 30);
        ps.than();
        ps.chan();
        ps.tay();
        System.out.println(ps.x1);
                 //System.out.println(ps.chanx2 + " - " + ps.chany2 + " - " + listLine.size()  + " - " + (-ps.thany2+jKhungVe.getHeight()/2));   
        Line2D than= new Line2D(-ps.thanx1 + jKhungVe.getWidth()/2,-(ps.thany1)+jKhungVe.getHeight()/2
                ,-ps.thanx2+ jKhungVe.getWidth() /2,-ps.thany2+jKhungVe.getHeight()/2,Color.RED);
//        for(MyShape dt: list){   300 - 250 - 300 - 300
//            
//        }
        listLine.add(than);
      //  listHienThi.addElement(line);
           
       Line2D chan = new Line2D(-ps.chanx1 + jKhungVe.getWidth()/2,-ps.chany1+jKhungVe.getHeight()/2
                ,-ps.chanx2+ jKhungVe.getWidth() /2,-ps.chany2+jKhungVe.getHeight()/2,Color.RED);
        listLine.add(chan);
        
        
        
        Line2D chan2 = new Line2D(-ps.chan2x1 + jKhungVe.getWidth()/2,-ps.chan2y1+jKhungVe.getHeight()/2
                ,-ps.chan2x2+ jKhungVe.getWidth() /2,-ps.chan2y2+jKhungVe.getHeight()/2,Color.RED);
        listLine.add(chan2);
         
        
        Line2D tay = new Line2D(-ps.tay1x1 + jKhungVe.getWidth()/2,-ps.tay1y1+jKhungVe.getHeight()/2
                ,-ps.tay1x2+ jKhungVe.getWidth() /2,-ps.tay1y2+jKhungVe.getHeight()/2,Color.RED);
        
        listLine.add(tay);
        
        
        
        Line2D tay2 = new Line2D(-ps.tay2x1 + jKhungVe.getWidth()/2,-(ps.tay2y1)+jKhungVe.getHeight()/2
                ,-ps.tay2x2+ jKhungVe.getWidth() /2,-(ps.tay2y2)+jKhungVe.getHeight()/2,Color.RED);
        
        listLine.add(tay2); 
        Line2D tay3 = new Line2D(-ps.tay3x1 + jKhungVe.getWidth()/2,-(ps.tay3y1)+jKhungVe.getHeight()/2
                ,-ps.tay3x2+ jKhungVe.getWidth() /2,-(ps.tay3y2)+jKhungVe.getHeight()/2,Color.RED);
        
        listLine.add(tay3);
        
//        Line2D lao = new Line2D(ps.laox1 + jKhungVe.getWidth()/2,-(ps.laoy1)+jKhungVe.getHeight()/2
//                ,ps.x1+ ps.r + jKhungVe.getWidth() /2,-(ps.laoy1)+jKhungVe.getHeight()/2,Color.RED);
//        
//        listLine.add(lao);
        
        Circle2D circle = new Circle2D(-ps.x1 + jKhungVe.getWidth()/2,-ps.y1+jKhungVe.getHeight()/2,
                                       ps.r, Color.RED);
        listCircle.add(circle);
        
        //g3.drawLine(, 0, 410, 390);
        //System.out.println(listLine.size());
          try {
              refresh();
          } catch (InterruptedException ex) {
              Logger.getLogger(FrmGiaoDien.class.getName()).log(Level.SEVERE, null, ex);
          }
                                               
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         person ps = new person();
       // ps.dau(Integer.parseInt(x1),Integer.parseInt(y1) , 50);
        ps.dau(-180,-80 , 30);
        ps.than();
        ps.chan();
        ps.tay();
        System.out.println(ps.x1);
                 //System.out.println(ps.chanx2 + " - " + ps.chany2 + " - " + listLine.size()  + " - " + (-ps.thany2+jKhungVe.getHeight()/2));   
        Line2D than= new Line2D(-ps.thanx1 + jKhungVe.getWidth()/2,(ps.thany1)+jKhungVe.getHeight()/2
                ,-ps.thanx2+ jKhungVe.getWidth() /2,ps.thany2+jKhungVe.getHeight()/2,Color.RED);
//        for(MyShape dt: list){   300 - 250 - 300 - 300
//            
//        }
        listLine.add(than);
      //  listHienThi.addElement(line);
           
       Line2D chan = new Line2D(-ps.chanx1 + jKhungVe.getWidth()/2,ps.chany1+jKhungVe.getHeight()/2
                ,-ps.chanx2+ jKhungVe.getWidth() /2,ps.chany2+jKhungVe.getHeight()/2,Color.RED);
        listLine.add(chan);
        
        
        
        Line2D chan2 = new Line2D(-ps.chan2x1 + jKhungVe.getWidth()/2,ps.chan2y1+jKhungVe.getHeight()/2
                ,-ps.chan2x2+ jKhungVe.getWidth() /2,ps.chan2y2+jKhungVe.getHeight()/2,Color.RED);
        listLine.add(chan2);
         
        
        Line2D tay = new Line2D(-ps.tay1x1 + jKhungVe.getWidth()/2,ps.tay1y1+jKhungVe.getHeight()/2
                ,-ps.tay1x2+ jKhungVe.getWidth() /2,ps.tay1y2+jKhungVe.getHeight()/2,Color.RED);
        
        listLine.add(tay);
        
        
        
        Line2D tay2 = new Line2D(-ps.tay2x1 + jKhungVe.getWidth()/2,(ps.tay2y1)+jKhungVe.getHeight()/2
                ,-ps.tay2x2+ jKhungVe.getWidth() /2,(ps.tay2y2)+jKhungVe.getHeight()/2,Color.RED);
        
        listLine.add(tay2); 
        Line2D tay3 = new Line2D(-ps.tay3x1 + jKhungVe.getWidth()/2,(ps.tay3y1)+jKhungVe.getHeight()/2
                ,-ps.tay3x2+ jKhungVe.getWidth() /2,(ps.tay3y2)+jKhungVe.getHeight()/2,Color.RED);
        
        listLine.add(tay3);
        
//        Line2D lao = new Line2D(ps.laox1 + jKhungVe.getWidth()/2,-(ps.laoy1)+jKhungVe.getHeight()/2
//                ,ps.x1+ ps.r + jKhungVe.getWidth() /2,-(ps.laoy1)+jKhungVe.getHeight()/2,Color.RED);
//        
//        listLine.add(lao);
        
        Circle2D circle = new Circle2D(-ps.x1 + jKhungVe.getWidth()/2,ps.y1+jKhungVe.getHeight()/2,
                                       ps.r, Color.RED);
        listCircle.add(circle);
        
        //g3.drawLine(, 0, 410, 390);
        //System.out.println(listLine.size());
          try {
              refresh();
          } catch (InterruptedException ex) {
              Logger.getLogger(FrmGiaoDien.class.getName()).log(Level.SEVERE, null, ex);
          }
                  
    }//GEN-LAST:event_jButton4ActionPerformed
        
            

     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmGiaoDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGiaoDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGiaoDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGiaoDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGiaoDien().setVisible(true);
            }
        });
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jKhungVe;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
