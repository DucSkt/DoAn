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

       public static int width,centerHeight;
       public static int height,centerWidth;
       int daux= -180;
       int dauy= -80;
       int daur= 30;
       boolean exit= false;
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
        listlao=new ArrayList<Line2D>();
        listnguoi=new ArrayList<Line2D>();
        listxoamanhinh=new ArrayList<Line2D>();
        listdau=new ArrayList<Circle2D>();

        //txtsx.setEnabled(false);
       // txtsy.setEnabled(false);
    }
     
    public Graphics2D g2;

    //public Line2D line;
    public List<Line2D> listxoamanhinh;

    public List<Line2D> listLine;
    
    public List<Circle2D> listdau;
    
    public List<Line2D> listnguoi;
    
    public List<Line2D> listlao;
    
    public List<Circle2D> listbanh;

    public List<Circle2D> listCircle;
    public List<Ellipse2D> listEllipse;

    public javax.swing.JFrame LineForm;
//    public void putPixel(int x, int y, Graphics g)
//    {
//    	//g.drawLine( x, y, x, y );
//        g.fillRect(round(x), round(y), 5, 5);
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jKhungVe = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        SutBong = new javax.swing.JButton();
        DoiXungOx = new javax.swing.JButton();
        DoiXungOy = new javax.swing.JButton();
        DoiXungTruc = new javax.swing.JButton();
        XoaManHinh = new javax.swing.JButton();
        PhongLao = new javax.swing.JButton();
        Vat1 = new javax.swing.JButton();
        ThuPhong = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Vat2 = new javax.swing.JButton();
        Quay = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ỨNG DỤNG VẼ HÌNH");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jKhungVe.setBackground(new java.awt.Color(255, 255, 255));
        jKhungVe.setPreferredSize(new java.awt.Dimension(500, 500));

        jLabel10.setFont(new java.awt.Font("UTM Nokia", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel11.setFont(new java.awt.Font("UTM Nokia", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 0));
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel12.setFont(new java.awt.Font("UTM Nokia", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 0));
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel13.setFont(new java.awt.Font("UTM Nokia", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 0));
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jKhungVeLayout = new javax.swing.GroupLayout(jKhungVe);
        jKhungVe.setLayout(jKhungVeLayout);
        jKhungVeLayout.setHorizontalGroup(
            jKhungVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jKhungVeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jKhungVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addGap(479, 479, 479))
            .addGroup(jKhungVeLayout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 374, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(311, 311, 311))
        );
        jKhungVeLayout.setVerticalGroup(
            jKhungVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jKhungVeLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                .addGroup(jKhungVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(139, 139, 139)
                .addComponent(jLabel11)
                .addGap(56, 56, 56))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("2D");

        SutBong.setText("Sút Bóng");
        SutBong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SutBongActionPerformed(evt);
            }
        });

        DoiXungOx.setText("Đối Xứng Ox");
        DoiXungOx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoiXungOxActionPerformed(evt);
            }
        });

        DoiXungOy.setText("Đối Xứng Oy");
        DoiXungOy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoiXungOyActionPerformed(evt);
            }
        });

        DoiXungTruc.setText("Đối Xứng Trục");
        DoiXungTruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoiXungTrucActionPerformed(evt);
            }
        });

        XoaManHinh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        XoaManHinh.setText("XÓA MÀN HÌNH");
        XoaManHinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaManHinhActionPerformed(evt);
            }
        });

        PhongLao.setText("Phóng Lao");
        PhongLao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhongLaoActionPerformed(evt);
            }
        });

        Vat1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Vat1.setText("PEOPLE");
        Vat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vat1ActionPerformed(evt);
            }
        });

        ThuPhong.setText("Thu Phóng");
        ThuPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThuPhongActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("X");

        jLabel3.setForeground(new java.awt.Color(0, 153, 51));
        jLabel3.setText("X");

        jLabel4.setText("Tọa độ bóng Y:");

        jLabel5.setText("Tọa độ lao X1:");

        jLabel6.setText("Tọa độ bóng Y:");

        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Y");

        jLabel8.setText("Tọa độ lao Y1:");

        jLabel9.setForeground(new java.awt.Color(0, 153, 51));
        jLabel9.setText("Y");

        Vat2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Vat2.setText("CLOCK");
        Vat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vat2ActionPerformed(evt);
            }
        });

        Quay.setText("Quay");
        Quay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuayActionPerformed(evt);
            }
        });

        jLabel16.setText("X");

        jLabel17.setText("Tọa độ kim X2:");

        jLabel18.setText("Tọa độ kim Y2:");

        jLabel19.setText("Y");

        jLabel15.setText("Second(s) :");

        jLabel20.setText("Minute(m) :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel20))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel21)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel22)
                                        .addGap(38, 38, 38)))))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(XoaManHinh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jKhungVe, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(Vat1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SutBong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PhongLao, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DoiXungOx)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DoiXungTruc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DoiXungOy)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ThuPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(107, 107, 107)
                        .addComponent(Vat2)
                        .addGap(18, 18, 18)
                        .addComponent(Quay, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SutBong, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DoiXungOx, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DoiXungTruc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(PhongLao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DoiXungOy, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ThuPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Vat1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Vat2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Quay, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jKhungVe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(XoaManHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel22)))
                            .addComponent(jLabel21))))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
         
    public void toaDo() {
            for (int i = 0; i <= jKhungVe.getWidth(); i=i+5)
           {
             g2.drawLine( 0   , i, jKhungVe.getWidth()  , i);
             g2.setColor(Color.GRAY);
             if(jKhungVe.getWidth()/2==i)
             {
                 g2.drawLine(0   , i, jKhungVe.getWidth()  , i);
                 g2.setColor(Color.YELLOW);
             }
             g2.drawLine(i , 0, i , jKhungVe.getHeight());
             g2.setColor(Color.GRAY);
             if(jKhungVe.getHeight()/2==i)
             {
                 g2.drawLine(i , 0, i , jKhungVe.getHeight());
                 g2.setColor(Color.YELLOW);
             }

           }
        }
    public void xoamanhinh(){
            for(int i=0; i<= jKhungVe.getWidth(); i=i+5)
           {
               Line2D xoamanhinh= new Line2D(i, 0, i, jKhungVe.getHeight(), Color.WHITE);
               listxoamanhinh.add(xoamanhinh);
           }
           for (int i =0;i<listxoamanhinh.size();i++) {
               try {
                   listxoamanhinh.get(i).draw(g2);
                   toaDo();
               } catch (InterruptedException ex) {
                   Logger.getLogger(FrmGiaoDien.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
              listxoamanhinh.clear();
    }
    public void venguoi(){
        person ps = new person();
       // ps.dau(Integer.parseInt(x1),Integer.parseInt(y1) , 30);
        ps.dau(daux,dauy , daur);
        ps.than();
        ps.chan();
        ps.tay();
        
                 //System.out.println(ps.chanx2 + " - " + ps.chany2 + " - " + listLine.size()  + " - " + (-ps.thany2+jKhungVe.getHeight()/2));   
        Line2D than= new Line2D(ps.thanx1 + jKhungVe.getWidth()/2,-(ps.thany1)+jKhungVe.getHeight()/2
                ,ps.thanx2+ jKhungVe.getWidth() /2,-ps.thany2+jKhungVe.getHeight()/2,Color.RED);
//        for(MyShape dt: list){   300 - 250 - 300 - 300
//            
//        }
        listnguoi.add(than);
      //  listHienThi.addElement(line);
           
       Line2D chan = new Line2D(ps.chanx1 + jKhungVe.getWidth()/2,-ps.chany1+jKhungVe.getHeight()/2
                ,ps.chanx2+ jKhungVe.getWidth() /2,-ps.chany2+jKhungVe.getHeight()/2,Color.RED);
        listnguoi.add(chan);
        
        
        
        Line2D chan2 = new Line2D(ps.chan2x1 + jKhungVe.getWidth()/2,-ps.chan2y1+jKhungVe.getHeight()/2
                ,ps.chan2x2+ jKhungVe.getWidth() /2,-ps.chan2y2+jKhungVe.getHeight()/2,Color.RED);
        listnguoi.add(chan2);
         
        
        Line2D tay = new Line2D(ps.tay1x1 + jKhungVe.getWidth()/2,-ps.tay1y1+jKhungVe.getHeight()/2
                ,ps.tay1x2+ jKhungVe.getWidth() /2,-ps.tay1y2+jKhungVe.getHeight()/2,Color.RED);
        
        listnguoi.add(tay);
        
        
        
        Line2D tay2 = new Line2D(ps.tay2x1 + jKhungVe.getWidth()/2,-(ps.tay2y1)+jKhungVe.getHeight()/2
                ,ps.tay2x2+ jKhungVe.getWidth() /2,-(ps.tay2y2)+jKhungVe.getHeight()/2,Color.RED);
        
        listnguoi.add(tay2); 
        Line2D tay3 = new Line2D(ps.tay3x1 + jKhungVe.getWidth()/2,-(ps.tay3y1)+jKhungVe.getHeight()/2
                ,ps.tay3x2+ jKhungVe.getWidth() /2,-(ps.tay3y2)+jKhungVe.getHeight()/2,Color.RED);
        
        listnguoi.add(tay3);
        
        Line2D lao = new Line2D(ps.laox1 + jKhungVe.getWidth()/2,-(ps.laoy1)+jKhungVe.getHeight()/2
                ,ps.laox1+70 + jKhungVe.getWidth() /2,-(ps.laoy1)+jKhungVe.getHeight()/2,Color.BLACK);
        
        listnguoi.add(lao); 
            Circle2D banh = new Circle2D(ps.chanx2+25 + jKhungVe.getWidth()/2,-ps.chany2-15+jKhungVe.getHeight()/2,
                                       15, Color.BLACK);
            listdau.add(banh);
        
        Circle2D circle = new Circle2D(ps.x1 + jKhungVe.getWidth()/2,-ps.y1+jKhungVe.getHeight()/2,
                                       ps.r, Color.RED);
        listdau.add(circle);
        
        //g3.drawLine(, 0, 410, 390);
        //System.out.println(listLine.size());
        for (int i =0;i<listnguoi.size();i++) {
            try {
                listnguoi.get(i).draw(g2);
                toaDo();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(FrmGiaoDien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          for (int i =0;i<listdau.size();i++) {
            try {
                listdau.get(i).draw(g2);
                toaDo();
            
            } catch (InterruptedException ex) {
                Logger.getLogger(FrmGiaoDien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public int rotatex (int x,int y, int alp){
        double pi = 3.14;
        double radian = alp*pi/180;
        double sin=Math.sin(radian); 
        double cos=Math.cos(radian);
        x = x - centerWidth;
        y = y - centerHeight;
        double x1 = x;
        double y1 = y; 
       // System.out.println(x1 + " " + sin + " " + cos);
        x1 = (x1*cos-y1*sin);
       // System.out.println(x1);
        return (int)Math.round(x1);
    }
    public int rotatey (int x,int y, int alp){
        double pi = 3.14;
        double radian = alp*pi/180;
        double sin=Math.sin(radian); 
        double cos=Math.cos(radian);
        x = x- centerWidth;
        y = y-centerHeight;
        double x1 = x;
        double y1 = y; 
        
        y1 = x1*sin+y1*cos;
       
        return (int)Math.round(y1);
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
        SutBong.setEnabled(false);
        PhongLao.setEnabled(false);
        DoiXungOx.setEnabled(false);
        DoiXungOy.setEnabled(false);
        DoiXungTruc.setEnabled(false);
        ThuPhong.setEnabled(false);
        Quay.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void SutBongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SutBongActionPerformed
        // TODO add your handling code here:
        
        listbanh.clear();
        person ps = new person();
        ps.dau(daux,dauy , daur);
        ps.than();
        ps.chan();
        ps.tay();
        
          for (int i =0;i<listdau.size();i++) {
            try {
                listdau.get(i).draw(g2);              
                
            } catch (InterruptedException ex) {
                Logger.getLogger(FrmGiaoDien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          for (int i =0;i<listnguoi.size();i++) {
            try {
                listnguoi.get(i).draw(g2);
               
            } catch (InterruptedException ex) {
                Logger.getLogger(FrmGiaoDien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for(int i=ps.chanx2+25; i<150; i=i+5)
        {
            Circle2D banh = new Circle2D(i + jKhungVe.getWidth()/2,-ps.chany2-15+jKhungVe.getHeight()/2,
                                       15, Color.BLACK);
            listbanh.add(banh);
        
            Circle2D xoabanh = new Circle2D(i + jKhungVe.getWidth()/2,-ps.chany2-15+jKhungVe.getHeight()/2,
                                       15, Color.WHITE);
            
            listbanh.add(xoabanh);
        }
        jLabel7.setText(ps.chany2-15+"");
        
         Thread gx = new Thread(()->{
          for (int i =0;i<listbanh.size();i++) {
            try {
                //System.out.println(listbanh.get(i).x);
                listbanh.get(i).draw(g2);
                toaDo();
                jLabel2.setText(listbanh.get(i).x-jKhungVe.getWidth()/2+"");
                Thread.sleep(15);
            } catch (InterruptedException ex) {
                Logger.getLogger(FrmGiaoDien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          
          for (int i =0;i<listdau.size();i++) {
            try {
               // System.out.println(i);
                listdau.get(i).draw(g2);
                toaDo();
                jLabel2.setText(listbanh.get(0).x-jKhungVe.getWidth()/2+"");
                
            } catch (InterruptedException ex) {
                Logger.getLogger(FrmGiaoDien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         });
                 
          gx.start();
     
    }//GEN-LAST:event_SutBongActionPerformed

    private void DoiXungOxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoiXungOxActionPerformed
        // TODO add your handling code here:
        
        person ps = new person();
       // ps.dau(Integer.parseInt(x1),Integer.parseInt(y1) , 50);
        ps.dau(daux,dauy ,daur);
        ps.than();
        ps.chan();
        ps.tay();
        Line2D than1= new Line2D(-ps.thanx1 + jKhungVe.getWidth()/2,-(ps.thany1)+jKhungVe.getHeight()/2
                ,-ps.thanx2+ jKhungVe.getWidth() /2,-ps.thany2+jKhungVe.getHeight()/2,Color.WHITE);
//        for(MyShape dt: list){   300 - 250 - 300 - 300
//            
//        }
        listLine.add(than1);
      //  listHienThi.addElement(line);
           
       Line2D chan1 = new Line2D(-ps.chanx1 + jKhungVe.getWidth()/2,-ps.chany1+jKhungVe.getHeight()/2
                ,-ps.chanx2+ jKhungVe.getWidth() /2,-ps.chany2+jKhungVe.getHeight()/2,Color.WHITE);
        listLine.add(chan1);
        
        
        
        Line2D chan21 = new Line2D(-ps.chan2x1 + jKhungVe.getWidth()/2,-ps.chan2y1+jKhungVe.getHeight()/2
                ,-ps.chan2x2+ jKhungVe.getWidth() /2,-ps.chan2y2+jKhungVe.getHeight()/2,Color.WHITE);
        listLine.add(chan21);
         
        
        Line2D tay1 = new Line2D(-ps.tay1x1 + jKhungVe.getWidth()/2,-ps.tay1y1+jKhungVe.getHeight()/2
                ,-ps.tay1x2+ jKhungVe.getWidth() /2,-ps.tay1y2+jKhungVe.getHeight()/2,Color.WHITE);
        
        listLine.add(tay1);
        
        
        
        Line2D tay21 = new Line2D(-ps.tay2x1 + jKhungVe.getWidth()/2,-(ps.tay2y1)+jKhungVe.getHeight()/2
                ,-ps.tay2x2+ jKhungVe.getWidth() /2,-(ps.tay2y2)+jKhungVe.getHeight()/2,Color.WHITE);
        
        listLine.add(tay21); 
        Line2D tay31 = new Line2D(-ps.tay3x1 + jKhungVe.getWidth()/2,-(ps.tay3y1)+jKhungVe.getHeight()/2
                ,-ps.tay3x2+ jKhungVe.getWidth() /2,-(ps.tay3y2)+jKhungVe.getHeight()/2,Color.WHITE);
        
        listLine.add(tay31);
        
//        Line2D lao = new Line2D(ps.laox1 + jKhungVe.getWidth()/2,-(ps.laoy1)+jKhungVe.getHeight()/2
//                ,ps.x1+ ps.r + jKhungVe.getWidth() /2,-(ps.laoy1)+jKhungVe.getHeight()/2,Color.RED);
//        
//        listLine.add(lao);
        
        Circle2D circle1 = new Circle2D(-ps.x1 + jKhungVe.getWidth()/2,-ps.y1+jKhungVe.getHeight()/2,
                                       ps.r, Color.WHITE);
        listCircle.add(circle1);
        
        //g3.drawLine(, 0, 410, 390);
        //System.out.println(listLine.size());
          try {
              refresh();
          } catch (InterruptedException ex) {
              Logger.getLogger(FrmGiaoDien.class.getName()).log(Level.SEVERE, null, ex);
          }
         listCircle.clear();
        listLine.clear();
        Line2D than2= new Line2D(-ps.thanx1 + jKhungVe.getWidth()/2,(ps.thany1)+jKhungVe.getHeight()/2
                ,-ps.thanx2+ jKhungVe.getWidth() /2,ps.thany2+jKhungVe.getHeight()/2,Color.WHITE);
//        for(MyShape dt: list){   300 - 250 - 300 - 300
//            
//        }
        listLine.add(than2);
      //  listHienThi.addElement(line);
           
       Line2D chan22 = new Line2D(-ps.chanx1 + jKhungVe.getWidth()/2,ps.chany1+jKhungVe.getHeight()/2
                ,-ps.chanx2+ jKhungVe.getWidth() /2,ps.chany2+jKhungVe.getHeight()/2,Color.WHITE);
        listLine.add(chan22);
        
        
        
        Line2D chan222 = new Line2D(-ps.chan2x1 + jKhungVe.getWidth()/2,ps.chan2y1+jKhungVe.getHeight()/2
                ,-ps.chan2x2+ jKhungVe.getWidth() /2,ps.chan2y2+jKhungVe.getHeight()/2,Color.WHITE);
        listLine.add(chan222);
         
        
        Line2D tay22 = new Line2D(-ps.tay1x1 + jKhungVe.getWidth()/2,ps.tay1y1+jKhungVe.getHeight()/2
                ,-ps.tay1x2+ jKhungVe.getWidth() /2,ps.tay1y2+jKhungVe.getHeight()/2,Color.WHITE);
        
        listLine.add(tay22);
        
        
        
        Line2D tay222 = new Line2D(-ps.tay2x1 + jKhungVe.getWidth()/2,(ps.tay2y1)+jKhungVe.getHeight()/2
                ,-ps.tay2x2+ jKhungVe.getWidth() /2,(ps.tay2y2)+jKhungVe.getHeight()/2,Color.WHITE);
        
        listLine.add(tay222); 
        Line2D tay32 = new Line2D(-ps.tay3x1 + jKhungVe.getWidth()/2,(ps.tay3y1)+jKhungVe.getHeight()/2
                ,-ps.tay3x2+ jKhungVe.getWidth() /2,(ps.tay3y2)+jKhungVe.getHeight()/2,Color.WHITE);
        
        listLine.add(tay32);
        
//        Line2D lao = new Line2D(ps.laox1 + jKhungVe.getWidth()/2,-(ps.laoy1)+jKhungVe.getHeight()/2
//                ,ps.x1+ ps.r + jKhungVe.getWidth() /2,-(ps.laoy1)+jKhungVe.getHeight()/2,Color.RED);
//        
//        listLine.add(lao);
        
        Circle2D circle2 = new Circle2D(-ps.x1 + jKhungVe.getWidth()/2,ps.y1+jKhungVe.getHeight()/2,
                                       ps.r, Color.WHITE);
        listCircle.add(circle2);
        
        //g3.drawLine(, 0, 410, 390);
        //System.out.println(listLine.size());
          try {
              refresh();
          } catch (InterruptedException ex) {
              Logger.getLogger(FrmGiaoDien.class.getName()).log(Level.SEVERE, null, ex);
          }
            listCircle.clear();
        listLine.clear();     
        
        toaDo();
        //===================================================================================
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
        listCircle.clear();
        listLine.clear();
    }//GEN-LAST:event_DoiXungOxActionPerformed

    private void DoiXungOyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoiXungOyActionPerformed
        // TODO add your handling code here:
         person ps = new person();
       // ps.dau(Integer.parseInt(x1),Integer.parseInt(y1) , 50);
        ps.dau(daux,dauy , daur);
        ps.than();
        ps.chan();
        ps.tay();
        //System.out.println(ps.chanx2 + " - " + ps.chany2 + " - " + listLine.size()  + " - " + (-ps.thany2+jKhungVe.getHeight()/2));
         Line2D than= new Line2D(ps.thanx1 + jKhungVe.getWidth()/2,(ps.thany1)+jKhungVe.getHeight()/2
                ,ps.thanx2+ jKhungVe.getWidth() /2,ps.thany2+jKhungVe.getHeight()/2,Color.WHITE);
//        for(MyShape dt: list){   300 - 250 - 300 - 300
//            
//        }
        listLine.add(than);
      //  listHienThi.addElement(line);
           
       Line2D chan = new Line2D(ps.chanx1 + jKhungVe.getWidth()/2,ps.chany1+jKhungVe.getHeight()/2
                ,ps.chanx2+ jKhungVe.getWidth() /2,ps.chany2+jKhungVe.getHeight()/2,Color.WHITE);
        listLine.add(chan);
        
        
        
        Line2D chan2 = new Line2D(ps.chan2x1 + jKhungVe.getWidth()/2,ps.chan2y1+jKhungVe.getHeight()/2
                ,ps.chan2x2+ jKhungVe.getWidth() /2,ps.chan2y2+jKhungVe.getHeight()/2,Color.WHITE);
        listLine.add(chan2);
         
        
        Line2D tay = new Line2D(ps.tay1x1 + jKhungVe.getWidth()/2,ps.tay1y1+jKhungVe.getHeight()/2
                ,ps.tay1x2+ jKhungVe.getWidth() /2,ps.tay1y2+jKhungVe.getHeight()/2,Color.WHITE);
        
        listLine.add(tay);
        
        
        
        Line2D tay2 = new Line2D(ps.tay2x1 + jKhungVe.getWidth()/2,(ps.tay2y1)+jKhungVe.getHeight()/2
                ,ps.tay2x2+ jKhungVe.getWidth() /2,(ps.tay2y2)+jKhungVe.getHeight()/2,Color.WHITE);
        
        listLine.add(tay2); 
        Line2D tay3 = new Line2D(ps.tay3x1 + jKhungVe.getWidth()/2,(ps.tay3y1)+jKhungVe.getHeight()/2
                ,ps.tay3x2+ jKhungVe.getWidth() /2,(ps.tay3y2)+jKhungVe.getHeight()/2,Color.WHITE);
        
        listLine.add(tay3);
        
//        Line2D lao = new Line2D(ps.laox1 + jKhungVe.getWidth()/2,-(ps.laoy1)+jKhungVe.getHeight()/2
//                ,ps.x1+ ps.r + jKhungVe.getWidth() /2,-(ps.laoy1)+jKhungVe.getHeight()/2,Color.RED);
//        
//        listLine.add(lao);
        
        Circle2D circle = new Circle2D(ps.x1 + jKhungVe.getWidth()/2,ps.y1+jKhungVe.getHeight()/2,
                                       ps.r, Color.WHITE);
        listCircle.add(circle);
        
        //g3.drawLine(, 0, 410, 390);
        //System.out.println(listLine.size());
          try {
              refresh();
          } catch (InterruptedException ex) {
              Logger.getLogger(FrmGiaoDien.class.getName()).log(Level.SEVERE, null, ex);
          }
        listCircle.clear();
        listLine.clear();
        
        Line2D than2= new Line2D(-ps.thanx1 + jKhungVe.getWidth()/2,(ps.thany1)+jKhungVe.getHeight()/2
                ,-ps.thanx2+ jKhungVe.getWidth() /2,ps.thany2+jKhungVe.getHeight()/2,Color.WHITE);
//        for(MyShape dt: list){   300 - 250 - 300 - 300
//            
//        }
        listLine.add(than2);
      //  listHienThi.addElement(line);
           
       Line2D chan22 = new Line2D(-ps.chanx1 + jKhungVe.getWidth()/2,ps.chany1+jKhungVe.getHeight()/2
                ,-ps.chanx2+ jKhungVe.getWidth() /2,ps.chany2+jKhungVe.getHeight()/2,Color.WHITE);
        listLine.add(chan22);
        
        
        
        Line2D chan222 = new Line2D(-ps.chan2x1 + jKhungVe.getWidth()/2,ps.chan2y1+jKhungVe.getHeight()/2
                ,-ps.chan2x2+ jKhungVe.getWidth() /2,ps.chan2y2+jKhungVe.getHeight()/2,Color.WHITE);
        listLine.add(chan222);
         
        
        Line2D tay22 = new Line2D(-ps.tay1x1 + jKhungVe.getWidth()/2,ps.tay1y1+jKhungVe.getHeight()/2
                ,-ps.tay1x2+ jKhungVe.getWidth() /2,ps.tay1y2+jKhungVe.getHeight()/2,Color.WHITE);
        
        listLine.add(tay22);
        
        
        
        Line2D tay222 = new Line2D(-ps.tay2x1 + jKhungVe.getWidth()/2,(ps.tay2y1)+jKhungVe.getHeight()/2
                ,-ps.tay2x2+ jKhungVe.getWidth() /2,(ps.tay2y2)+jKhungVe.getHeight()/2,Color.WHITE);
        
        listLine.add(tay222); 
        Line2D tay32 = new Line2D(-ps.tay3x1 + jKhungVe.getWidth()/2,(ps.tay3y1)+jKhungVe.getHeight()/2
                ,-ps.tay3x2+ jKhungVe.getWidth() /2,(ps.tay3y2)+jKhungVe.getHeight()/2,Color.WHITE);
        
        listLine.add(tay32);
        
//        Line2D lao = new Line2D(ps.laox1 + jKhungVe.getWidth()/2,-(ps.laoy1)+jKhungVe.getHeight()/2
//                ,ps.x1+ ps.r + jKhungVe.getWidth() /2,-(ps.laoy1)+jKhungVe.getHeight()/2,Color.RED);
//        
//        listLine.add(lao);
        
        Circle2D circle2 = new Circle2D(-ps.x1 + jKhungVe.getWidth()/2,ps.y1+jKhungVe.getHeight()/2,
                                       ps.r, Color.WHITE);
        listCircle.add(circle2);
        
        //g3.drawLine(, 0, 410, 390);
        //System.out.println(listLine.size());
          try {
              refresh();
          } catch (InterruptedException ex) {
              Logger.getLogger(FrmGiaoDien.class.getName()).log(Level.SEVERE, null, ex);
          }
            listCircle.clear();
        listLine.clear();     
        
        toaDo();
//==================================================================================================        
        
                 //System.out.println(ps.chanx2 + " - " + ps.chany2 + " - " + listLine.size()  + " - " + (-ps.thany2+jKhungVe.getHeight()/2));   
        Line2D than1= new Line2D(-ps.thanx1 + jKhungVe.getWidth()/2,-(ps.thany1)+jKhungVe.getHeight()/2
                ,-ps.thanx2+ jKhungVe.getWidth() /2,-ps.thany2+jKhungVe.getHeight()/2,Color.RED);
//        for(MyShape dt: list){   300 - 250 - 300 - 300
//            
//        }
        listLine.add(than1);
      //  listHienThi.addElement(line);
           
       Line2D chan1 = new Line2D(-ps.chanx1 + jKhungVe.getWidth()/2,-ps.chany1+jKhungVe.getHeight()/2
                ,-ps.chanx2+ jKhungVe.getWidth() /2,-ps.chany2+jKhungVe.getHeight()/2,Color.RED);
        listLine.add(chan1);
        
        
        
        Line2D chan21 = new Line2D(-ps.chan2x1 + jKhungVe.getWidth()/2,-ps.chan2y1+jKhungVe.getHeight()/2
                ,-ps.chan2x2+ jKhungVe.getWidth() /2,-ps.chan2y2+jKhungVe.getHeight()/2,Color.RED);
        listLine.add(chan21);
         
        
        Line2D tay1 = new Line2D(-ps.tay1x1 + jKhungVe.getWidth()/2,-ps.tay1y1+jKhungVe.getHeight()/2
                ,-ps.tay1x2+ jKhungVe.getWidth() /2,-ps.tay1y2+jKhungVe.getHeight()/2,Color.RED);
        
        listLine.add(tay1);
        
        
        
        Line2D tay21 = new Line2D(-ps.tay2x1 + jKhungVe.getWidth()/2,-(ps.tay2y1)+jKhungVe.getHeight()/2
                ,-ps.tay2x2+ jKhungVe.getWidth() /2,-(ps.tay2y2)+jKhungVe.getHeight()/2,Color.RED);
        
        listLine.add(tay21); 
        Line2D tay31 = new Line2D(-ps.tay3x1 + jKhungVe.getWidth()/2,-(ps.tay3y1)+jKhungVe.getHeight()/2
                ,-ps.tay3x2+ jKhungVe.getWidth() /2,-(ps.tay3y2)+jKhungVe.getHeight()/2,Color.RED);
        
        listLine.add(tay31);
        
//        Line2D lao = new Line2D(ps.laox1 + jKhungVe.getWidth()/2,-(ps.laoy1)+jKhungVe.getHeight()/2
//                ,ps.x1+ ps.r + jKhungVe.getWidth() /2,-(ps.laoy1)+jKhungVe.getHeight()/2,Color.RED);
//        
//        listLine.add(lao);
        
        Circle2D circle1 = new Circle2D(-ps.x1 + jKhungVe.getWidth()/2,-ps.y1+jKhungVe.getHeight()/2,
                                       ps.r, Color.RED);
        listCircle.add(circle1);
        
        //g3.drawLine(, 0, 410, 390);
        //System.out.println(listLine.size());
          try {
              refresh();
          } catch (InterruptedException ex) {
              Logger.getLogger(FrmGiaoDien.class.getName()).log(Level.SEVERE, null, ex);
          }
         listCircle.clear();
        listLine.clear();                                      
    }//GEN-LAST:event_DoiXungOyActionPerformed

    private void DoiXungTrucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoiXungTrucActionPerformed
        // TODO add your handling code here:
         person ps = new person();
       // ps.dau(Integer.parseInt(x1),Integer.parseInt(y1) , 50);
        ps.dau(daux,dauy , daur);
        ps.than();
        ps.chan();
        ps.tay();
  
        Line2D than1= new Line2D(-ps.thanx1 + jKhungVe.getWidth()/2,-(ps.thany1)+jKhungVe.getHeight()/2
                ,-ps.thanx2+ jKhungVe.getWidth() /2,-ps.thany2+jKhungVe.getHeight()/2,Color.WHITE);
//        for(MyShape dt: list){   300 - 250 - 300 - 300
//            
//        }
        listLine.add(than1);
      //  listHienThi.addElement(line);
           
       Line2D chan1 = new Line2D(-ps.chanx1 + jKhungVe.getWidth()/2,-ps.chany1+jKhungVe.getHeight()/2
                ,-ps.chanx2+ jKhungVe.getWidth() /2,-ps.chany2+jKhungVe.getHeight()/2,Color.WHITE);
        listLine.add(chan1);
        
        
        
        Line2D chan21 = new Line2D(-ps.chan2x1 + jKhungVe.getWidth()/2,-ps.chan2y1+jKhungVe.getHeight()/2
                ,-ps.chan2x2+ jKhungVe.getWidth() /2,-ps.chan2y2+jKhungVe.getHeight()/2,Color.WHITE);
        listLine.add(chan21);
         
        
        Line2D tay1 = new Line2D(-ps.tay1x1 + jKhungVe.getWidth()/2,-ps.tay1y1+jKhungVe.getHeight()/2
                ,-ps.tay1x2+ jKhungVe.getWidth() /2,-ps.tay1y2+jKhungVe.getHeight()/2,Color.WHITE);
        
        listLine.add(tay1);
        
        
        
        Line2D tay21 = new Line2D(-ps.tay2x1 + jKhungVe.getWidth()/2,-(ps.tay2y1)+jKhungVe.getHeight()/2
                ,-ps.tay2x2+ jKhungVe.getWidth() /2,-(ps.tay2y2)+jKhungVe.getHeight()/2,Color.WHITE);
        
        listLine.add(tay21); 
        Line2D tay31 = new Line2D(-ps.tay3x1 + jKhungVe.getWidth()/2,-(ps.tay3y1)+jKhungVe.getHeight()/2
                ,-ps.tay3x2+ jKhungVe.getWidth() /2,-(ps.tay3y2)+jKhungVe.getHeight()/2,Color.WHITE);
        
        listLine.add(tay31);
        
//        Line2D lao = new Line2D(ps.laox1 + jKhungVe.getWidth()/2,-(ps.laoy1)+jKhungVe.getHeight()/2
//                ,ps.x1+ ps.r + jKhungVe.getWidth() /2,-(ps.laoy1)+jKhungVe.getHeight()/2,Color.RED);
//        
//        listLine.add(lao);
        
        Circle2D circle1 = new Circle2D(-ps.x1 + jKhungVe.getWidth()/2,-ps.y1+jKhungVe.getHeight()/2,
                                       ps.r, Color.WHITE);
        listCircle.add(circle1);
        
        //g3.drawLine(, 0, 410, 390);
        //System.out.println(listLine.size());
          try {
              refresh();
          } catch (InterruptedException ex) {
              Logger.getLogger(FrmGiaoDien.class.getName()).log(Level.SEVERE, null, ex);
          }
         listCircle.clear();
        listLine.clear();
        Line2D than= new Line2D(ps.thanx1 + jKhungVe.getWidth()/2,(ps.thany1)+jKhungVe.getHeight()/2
                ,ps.thanx2+ jKhungVe.getWidth() /2,ps.thany2+jKhungVe.getHeight()/2,Color.WHITE);
//        for(MyShape dt: list){   300 - 250 - 300 - 300
//            
//        }
        listLine.add(than);
      //  listHienThi.addElement(line);
           
       Line2D chan = new Line2D(ps.chanx1 + jKhungVe.getWidth()/2,ps.chany1+jKhungVe.getHeight()/2
                ,ps.chanx2+ jKhungVe.getWidth() /2,ps.chany2+jKhungVe.getHeight()/2,Color.WHITE);
        listLine.add(chan);
        
        
        
        Line2D chan2 = new Line2D(ps.chan2x1 + jKhungVe.getWidth()/2,ps.chan2y1+jKhungVe.getHeight()/2
                ,ps.chan2x2+ jKhungVe.getWidth() /2,ps.chan2y2+jKhungVe.getHeight()/2,Color.WHITE);
        listLine.add(chan2);
         
        
        Line2D tay = new Line2D(ps.tay1x1 + jKhungVe.getWidth()/2,ps.tay1y1+jKhungVe.getHeight()/2
                ,ps.tay1x2+ jKhungVe.getWidth() /2,ps.tay1y2+jKhungVe.getHeight()/2,Color.WHITE);
        
        listLine.add(tay);
        
        
        
        Line2D tay2 = new Line2D(ps.tay2x1 + jKhungVe.getWidth()/2,(ps.tay2y1)+jKhungVe.getHeight()/2
                ,ps.tay2x2+ jKhungVe.getWidth() /2,(ps.tay2y2)+jKhungVe.getHeight()/2,Color.WHITE);
        
        listLine.add(tay2); 
        Line2D tay3 = new Line2D(ps.tay3x1 + jKhungVe.getWidth()/2,(ps.tay3y1)+jKhungVe.getHeight()/2
                ,ps.tay3x2+ jKhungVe.getWidth() /2,(ps.tay3y2)+jKhungVe.getHeight()/2,Color.WHITE);
        
        listLine.add(tay3);
        
//        Line2D lao = new Line2D(ps.laox1 + jKhungVe.getWidth()/2,-(ps.laoy1)+jKhungVe.getHeight()/2
//                ,ps.x1+ ps.r + jKhungVe.getWidth() /2,-(ps.laoy1)+jKhungVe.getHeight()/2,Color.RED);
//        
//        listLine.add(lao);
        
        Circle2D circle = new Circle2D(ps.x1 + jKhungVe.getWidth()/2,ps.y1+jKhungVe.getHeight()/2,
                                       ps.r, Color.WHITE);
        listCircle.add(circle);
        
        //g3.drawLine(, 0, 410, 390);
        //System.out.println(listLine.size());
          try {
              refresh();
          } catch (InterruptedException ex) {
              Logger.getLogger(FrmGiaoDien.class.getName()).log(Level.SEVERE, null, ex);
          }
        listCircle.clear();
        listLine.clear();
        toaDo();
        //==================================================================================
                 //System.out.println(ps.chanx2 + " - " + ps.chany2 + " - " + listLine.size()  + " - " + (-ps.thany2+jKhungVe.getHeight()/2));   
        Line2D than3= new Line2D(-ps.thanx1 + jKhungVe.getWidth()/2,(ps.thany1)+jKhungVe.getHeight()/2
                ,-ps.thanx2+ jKhungVe.getWidth() /2,ps.thany2+jKhungVe.getHeight()/2,Color.RED);
//        for(MyShape dt: list){   300 - 250 - 300 - 300
//            
//        }
        listLine.add(than3);
      //  listHienThi.addElement(line);
           
       Line2D chan3 = new Line2D(-ps.chanx1 + jKhungVe.getWidth()/2,ps.chany1+jKhungVe.getHeight()/2
                ,-ps.chanx2+ jKhungVe.getWidth() /2,ps.chany2+jKhungVe.getHeight()/2,Color.RED);
        listLine.add(chan3);
        
        
        
        Line2D chan23 = new Line2D(-ps.chan2x1 + jKhungVe.getWidth()/2,ps.chan2y1+jKhungVe.getHeight()/2
                ,-ps.chan2x2+ jKhungVe.getWidth() /2,ps.chan2y2+jKhungVe.getHeight()/2,Color.RED);
        listLine.add(chan23);
         
        
        Line2D tay33 = new Line2D(-ps.tay1x1 + jKhungVe.getWidth()/2,ps.tay1y1+jKhungVe.getHeight()/2
                ,-ps.tay1x2+ jKhungVe.getWidth() /2,ps.tay1y2+jKhungVe.getHeight()/2,Color.RED);
        
        listLine.add(tay33);
        
        
        
        Line2D tay23 = new Line2D(-ps.tay2x1 + jKhungVe.getWidth()/2,(ps.tay2y1)+jKhungVe.getHeight()/2
                ,-ps.tay2x2+ jKhungVe.getWidth() /2,(ps.tay2y2)+jKhungVe.getHeight()/2,Color.RED);
        
        listLine.add(tay23); 
        Line2D tay333 = new Line2D(-ps.tay3x1 + jKhungVe.getWidth()/2,(ps.tay3y1)+jKhungVe.getHeight()/2
                ,-ps.tay3x2+ jKhungVe.getWidth() /2,(ps.tay3y2)+jKhungVe.getHeight()/2,Color.RED);
        
        listLine.add(tay333);
        
//        Line2D lao = new Line2D(ps.laox1 + jKhungVe.getWidth()/2,-(ps.laoy1)+jKhungVe.getHeight()/2
//                ,ps.x1+ ps.r + jKhungVe.getWidth() /2,-(ps.laoy1)+jKhungVe.getHeight()/2,Color.RED);
//        
//        listLine.add(lao);
        
        Circle2D circle3 = new Circle2D(-ps.x1 + jKhungVe.getWidth()/2,ps.y1+jKhungVe.getHeight()/2,
                                       ps.r, Color.RED);
        listCircle.add(circle3);
        
        //g3.drawLine(, 0, 410, 390);
        //System.out.println(listLine.size());
          try {
              refresh();
          } catch (InterruptedException ex) {
              Logger.getLogger(FrmGiaoDien.class.getName()).log(Level.SEVERE, null, ex);
          }
            listCircle.clear();
        listLine.clear();      
    }//GEN-LAST:event_DoiXungTrucActionPerformed

    private void PhongLaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhongLaoActionPerformed
        // TODO add your handling code here:
        listlao.clear();
        
        person ps = new person();
        ps.dau(daux,dauy , daur);
        ps.than();
        ps.chan();
        ps.tay();

        for (int i =0;i<listdau.size();i++) {
            try {
                listdau.get(i).draw(g2);
                toaDo();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(FrmGiaoDien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for (int i =0;i<listnguoi.size();i++) {
            try {
                listnguoi.get(i).draw(g2);
                toaDo();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(FrmGiaoDien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for(int i=ps.laox1; i<200; i=i+5)
        {
            Line2D lao = new Line2D(i + jKhungVe.getWidth()/2,-(ps.laoy1)+jKhungVe.getHeight()/2
                ,i+70 + jKhungVe.getWidth() /2,-(ps.laoy1)+jKhungVe.getHeight()/2,Color.BLACK);
        
            listlao.add(lao);
            
            Line2D xoalao = new Line2D(i + jKhungVe.getWidth()/2,-(ps.laoy1)+jKhungVe.getHeight()/2
                ,i+70 + jKhungVe.getWidth() /2,-(ps.laoy1)+jKhungVe.getHeight()/2,Color.WHITE);
        
            listlao.add(xoalao);

        }
        jLabel9.setText(ps.laoy1+"");
        
        Thread gx = new Thread(()->{
          for (int i =0;i<listlao.size();i++) {
            try {
                //System.out.println(listbanh.get(i).x);
                listlao.get(i).draw(g2);
                toaDo();
                Thread.sleep(10);
                
                jLabel3.setText(listlao.get(i).x1-jKhungVe.getWidth()/2+"");               
            } catch (InterruptedException ex) {
                Logger.getLogger(FrmGiaoDien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          for (int i =0;i<listnguoi.size();i++) {
            try {
                listnguoi.get(i).draw(g2);
                toaDo();
                jLabel3.setText(listlao.get(0).x1-jKhungVe.getWidth()/2+"");
            } catch (InterruptedException ex) {
                Logger.getLogger(FrmGiaoDien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
         });
                 
          gx.start();
        
    }//GEN-LAST:event_PhongLaoActionPerformed

    private void XoaManHinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaManHinhActionPerformed
        // TODO add your handling code here:
        xoamanhinh();
    }//GEN-LAST:event_XoaManHinhActionPerformed

    private void Vat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vat1ActionPerformed
        // TODO add your handling code here:
        SutBong.setEnabled(true);
        PhongLao.setEnabled(true);
        DoiXungOx.setEnabled(true);
        DoiXungOy.setEnabled(true);
        DoiXungTruc.setEnabled(true);
        ThuPhong.setEnabled(true);
        Quay.setEnabled(false);   
        if(exit) {
                 gg.stop();   
        }
        xoamanhinh();
        venguoi();
         exit = false;
    }//GEN-LAST:event_Vat1ActionPerformed

    private void ThuPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThuPhongActionPerformed
        // TODO add your handling code here:
        person ps = new person();
       // ps.dau(Integer.parseInt(x1),Integer.parseInt(y1) , 30);
        ps.dau(0,50 , daur*2);
        ps.than();
        ps.chan();
        ps.tay();
        
                 //System.out.println(ps.chanx2 + " - " + ps.chany2 + " - " + listLine.size()  + " - " + (-ps.thany2+jKhungVe.getHeight()/2));   
        Line2D than= new Line2D(ps.thanx1 + jKhungVe.getWidth()/2,-(ps.thany1)+jKhungVe.getHeight()/2
                ,(ps.thanx2+ jKhungVe.getWidth() /2),-ps.thany2+jKhungVe.getHeight()/2+50,Color.RED);
//        for(MyShape dt: list){   300 - 250 - 300 - 300
//            
//        }
        listnguoi.add(than);
      //  listHienThi.addElement(line);
           
       Line2D chan = new Line2D((ps.thanx2+ jKhungVe.getWidth() /2),-ps.thany2+jKhungVe.getHeight()/2+50
                ,ps.chanx2+ jKhungVe.getWidth() /2+30,-ps.chany2+jKhungVe.getHeight()/2+100,Color.RED);
        listnguoi.add(chan);
        
        
        
        Line2D chan2 = new Line2D((ps.thanx2+ jKhungVe.getWidth() /2),-ps.thany2+jKhungVe.getHeight()/2+50
                ,ps.chanx2+ jKhungVe.getWidth() /2-90,-ps.chany2+jKhungVe.getHeight()/2+100,Color.RED);
        listnguoi.add(chan2);
         
        
        Line2D tay = new Line2D(ps.tay1x1 + jKhungVe.getWidth()/2,-ps.tay1y1+jKhungVe.getHeight()/2+15
                ,ps.tay1x2+ jKhungVe.getWidth() /2+30,-ps.tay1y2+jKhungVe.getHeight()/2+40,Color.RED);
        
        listnguoi.add(tay);
        
        
        
        Line2D tay2 = new Line2D(ps.tay2x1 + jKhungVe.getWidth()/2,-(ps.tay2y1)+jKhungVe.getHeight()/2+15
                ,ps.tay2x2+ jKhungVe.getWidth() /2-15,-(ps.tay2y2)+jKhungVe.getHeight()/2+30,Color.RED);
        
        listnguoi.add(tay2); 
        Line2D tay3 = new Line2D(ps.tay2x2+ jKhungVe.getWidth() /2-15,-(ps.tay2y2)+jKhungVe.getHeight()/2+30
                ,ps.tay3x2+ jKhungVe.getWidth() /2-30,-(ps.tay3y2)+jKhungVe.getHeight()/2+5,Color.RED);
        
        listnguoi.add(tay3);

        Circle2D circle = new Circle2D(ps.x1 + jKhungVe.getWidth()/2,-ps.y1+jKhungVe.getHeight()/2,
                                       ps.r, Color.RED);
        listdau.add(circle);
        
        //g3.drawLine(, 0, 410, 390);
        //System.out.println(listLine.size());
        for (int i =0;i<listnguoi.size();i++) {
            try {
                listnguoi.get(i).draw(g2);
                toaDo();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(FrmGiaoDien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          for (int i =0;i<listdau.size();i++) {
            try {
                listdau.get(i).draw(g2);
                toaDo();
            
            } catch (InterruptedException ex) {
                Logger.getLogger(FrmGiaoDien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          listnguoi.clear();
          listdau.clear();
    }//GEN-LAST:event_ThuPhongActionPerformed

    private void Vat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vat2ActionPerformed
        // TODO add your handling code here:
        Quay.setEnabled(true);
        SutBong.setEnabled(false);
        PhongLao.setEnabled(false);
        DoiXungOx.setEnabled(false);
        DoiXungOy.setEnabled(false);
        DoiXungTruc.setEnabled(false);
        ThuPhong.setEnabled(false);
        xoamanhinh();
        jLabel10.setText("");      
        jLabel10.setText("12");
        jLabel11.setText("");      
        jLabel11.setText("6");
        jLabel12.setText("");      
        jLabel12.setText("9");
        jLabel13.setText("");      
        jLabel13.setText("3");
        Square2D dongho= new Square2D(-200+centerWidth,200+ centerHeight, 400, Color.YELLOW);
        dongho.draw(g2);
        Square2D dongho1= new Square2D(-205+centerWidth,205+ centerHeight, 410, Color.YELLOW);
        dongho1.draw(g2);
        Line2D kim= new Line2D(centerWidth,centerHeight,centerWidth,-150+centerHeight, Color.BLUE);
           try {
               kim.draw(g2);
           } catch (InterruptedException ex) {
               Logger.getLogger(FrmGiaoDien.class.getName()).log(Level.SEVERE, null, ex);
           }
    }//GEN-LAST:event_Vat2ActionPerformed
Thread gg;
    private void QuayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuayActionPerformed
        // TODO add your handling code here:
        
        gg = new Thread(()->{
            exit = true;
        int mi=0;
        int dem=0;
        jLabel22.setText(mi+"");
        jLabel21.setText(dem+"");
        for(int k=0;k<3;k++){
       
        
        listLine.clear();
       
       
        for(int z=0;z<360;z=z+6){
            
           dem=dem+1;
           if(dem>59){
               dem=0;
               mi=mi+1;
               jLabel22.setText(mi+"");
           }
            jLabel21.setText(dem+"");
            
            Line2D kim= new Line2D(rotatex(centerWidth,centerHeight,z)+centerWidth,rotatey(centerWidth,centerHeight,z)+centerHeight
                    ,rotatex(centerWidth,-150+centerHeight,z)+centerWidth,rotatey(centerWidth,-150+centerHeight,z)+centerHeight, Color.BLUE);
            listLine.add(kim);
            
            jLabel16.setText(listLine.get(0).x2-centerWidth+"");
            jLabel19.setText(listLine.get(0).y2*-1+centerHeight+"");
          //  System.out.println(listLine.get(0).y2-centerHeight);
            
            Line2D xoakim= new Line2D(rotatex(centerWidth,centerHeight,z)+centerWidth,rotatey(centerWidth,centerHeight,z)+centerHeight
                    ,rotatex(centerWidth,-150+centerHeight,z)+centerWidth,rotatey(centerWidth,-150+centerHeight,z)+centerHeight, Color.WHITE);
            listLine.add(xoakim);
            Line2D kimmoi= new Line2D(rotatex(centerWidth,centerHeight,z+6)+centerWidth,rotatey(centerWidth,centerHeight,z+6)+centerHeight
                    ,rotatex(centerWidth,-150+centerHeight,z+6)+centerWidth,rotatey(centerWidth,-150+centerHeight,z+6)+centerHeight, Color.BLUE);
            listLine.add(kimmoi);

               try {
                   listLine.get(0).draw(g2);
                   Thread.sleep(1000);
                   listLine.get(1).draw(g2);
                   listLine.get(2).draw(g2);
                   toaDo();
                   //System.out.println(listLine.size());
               } catch (InterruptedException ex) {
                   Logger.getLogger(FrmGiaoDien.class.getName()).log(Level.SEVERE, null, ex);
               }
            
            listLine.clear();
         }
        }
        }
        );
        gg.start();

    }//GEN-LAST:event_QuayActionPerformed

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
    private javax.swing.JButton DoiXungOx;
    private javax.swing.JButton DoiXungOy;
    private javax.swing.JButton DoiXungTruc;
    private javax.swing.JButton PhongLao;
    private javax.swing.JButton Quay;
    private javax.swing.JButton SutBong;
    private javax.swing.JButton ThuPhong;
    private javax.swing.JButton Vat1;
    private javax.swing.JButton Vat2;
    private javax.swing.JButton XoaManHinh;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel jKhungVe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
