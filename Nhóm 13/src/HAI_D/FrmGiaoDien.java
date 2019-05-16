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
import java.util.ArrayList;
import java.util.List;
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

        listLine=new ArrayList<Line2D>();

        
        //txtsx.setEnabled(false);
       // txtsy.setEnabled(false);
    }
     
    public Graphics2D g2;

    public Line2D line;

    public List<Line2D> listLine;

    public List<Circle2D> listCircle;
    public List<Ellipse2D> listEllipse;

    public javax.swing.JFrame LineForm;


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jKhungVe = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ỨNG DỤNG VẼ HÌNH");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jKhungVe.setBackground(new java.awt.Color(204, 204, 204));
        jKhungVe.setPreferredSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout jKhungVeLayout = new javax.swing.GroupLayout(jKhungVe);
        jKhungVe.setLayout(jKhungVeLayout);
        jKhungVeLayout.setHorizontalGroup(
            jKhungVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jKhungVeLayout.setVerticalGroup(
            jKhungVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 555, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("2D");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jKhungVe, javax.swing.GroupLayout.DEFAULT_SIZE, 1299, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(645, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(587, 587, 587))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jKhungVe, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
         
    public void toaDo() {
         for (int i = 0; i <= 261; i++)
        {
	  g2.drawLine(5*i , 0, 5* i , 550);
	  g2.drawLine(  0   , 5* i, 1295  , 5* i);
	  g2.setColor(Color.BLACK);
        }
    }
    
    public void refresh() {
     //   veOxy();
         toaDo();    
        for (int i =0;i<listLine.size();i++){ 
            listLine.get(i).draw(g2);
        }
         for (int i =0;i<listCircle.size();i++) {
            listCircle.get(i).draw(g2);
        }
      
         
         Line2D line = null;
					   Point A = null;
                                  
                                           A.x =  line.getX1();
                                           A.y = line.getY1();
                                           
					Point B = null;    
                                            B.x =  line.getX2();
                                           B.y = line.getY2();
					
					if(cout > 15 && cout < 16) {
						A.x-=3;  				
						B.x-=3;	
					}
					else if (cout > 15){
						A.x-=15;  
						A.y-=5;
						
						B.x-=15;
						B.y-=5;	
					}
					else {
						A.x-=15;  
						A.y+=5;
						
						B.x-=15;
						B.y+=5;	
					}
					// A.x + , B.x +  => qua phải 
					// A.x - , B.x -  => qua trái 
					// A.y - , B.y -  => lên 
					// A.y + , B.y +  => xuống 
					
					// nếu chỉ trừ 1 điểm A hoac B thì đầu kia sẽ đứng yên
					line.setX1(A.x);
                                        line.setY1(A.y);
                                        
					line.setX2(B.x);
                                        line.setY2(B.y);
				//	 line.setAngle(line.getAngle() + line.getSpeed());
					line.draw(g2);
                                        
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
           person ps = new person();
        ps.dau(50, 50 , 50);
        ps.than();
        ps.chan();
        ps.tay();
        
                 System.out.println((ps.thanx1 + jKhungVe.getWidth()/2) + " - " + (-(ps.thany1)+jKhungVe.getHeight()/2) + " - " + (ps.thanx2+ jKhungVe.getWidth() /2)  + " - " + (-ps.thany2+jKhungVe.getHeight()/2));   
        Line2D line= new Line2D(ps.thanx1 + jKhungVe.getWidth()/2,-(ps.thany1)+jKhungVe.getHeight()/2
                ,ps.thanx2+ jKhungVe.getWidth() /2,-ps.thany2+jKhungVe.getHeight()/2,Color.RED);
//        for(MyShape dt: list){   300 - 250 - 300 - 300
//            
//        }
        listLine.add(line);
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
        
        Circle2D circle = new Circle2D(ps.x1 + jKhungVe.getWidth()/2,-ps.y1+jKhungVe.getHeight()/2,
                                       ps.r, Color.RED);
        listCircle.add(circle);
        listLine.add(line);
        refresh();
    }//GEN-LAST:event_formWindowOpened
 
  
     
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
    private javax.swing.JPanel jKhungVe;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
