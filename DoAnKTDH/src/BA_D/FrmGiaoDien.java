/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BA_D;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
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
      public static int demcube=1,demglobular=1;
      DefaultListModel listHienThi=new DefaultListModel ();
       public static int width,centerHeight;
       public static int height,centerWidth;
    
    public FrmGiaoDien() {
        initComponents();
        
        width=jKhungVe.getWidth();
        height=jKhungVe.getHeight();
        centerWidth = width/2;
        centerHeight = height/2;
        LineForm = new javax.swing.JFrame();
        g2 = (Graphics2D)jKhungVe.getGraphics();
        listCube = new ArrayList<Cube3D>();
        listGlobular = new ArrayList<Globular3D>();
    }
     
    public Graphics2D g2;
    public List<Circle2D> listCircle;
    public List<Cube3D> listCube;
    public List<Globular3D> listGlobular;
    public javax.swing.JFrame LineForm;
 Round round = new Round();
 
    private void veOxyz(){
        jKhungVe.update(g2);
       
        g2.clearRect(0, 0, jKhungVe.WIDTH, jKhungVe.HEIGHT);
        g2.setColor(Color.GRAY); 
        g2.drawLine(round.round2(jKhungVe.getWidth()/2), 0, round.round2(jKhungVe.getWidth()/2), round.round2(jKhungVe.getHeight()/2));
        g2.drawLine(round.round2((jKhungVe.getWidth()) /2), round.round2(jKhungVe.getHeight()/2), round.round2(jKhungVe.getWidth()), round.round2(jKhungVe.getHeight()/2));
        g2.drawLine( round.round2(jKhungVe.getWidth() /2),round.round2(jKhungVe.getHeight()/2),0, round.round2(jKhungVe.getHeight()));
        toaDo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        btnlapphuong = new javax.swing.JButton();
        btnhinhtru = new javax.swing.JButton();
        jKhungVe = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ỨNG DỤNG VẼ HÌNH");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnlapphuong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/icons8-orthogonal-view-50.png"))); // NOI18N
        btnlapphuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlapphuongActionPerformed(evt);
            }
        });

        btnhinhtru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/icons8-sphere-50.png"))); // NOI18N
        btnhinhtru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhinhtruActionPerformed(evt);
            }
        });

        jKhungVe.setBackground(new java.awt.Color(204, 204, 204));
        jKhungVe.setPreferredSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout jKhungVeLayout = new javax.swing.GroupLayout(jKhungVe);
        jKhungVe.setLayout(jKhungVeLayout);
        jKhungVeLayout.setHorizontalGroup(
            jKhungVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 963, Short.MAX_VALUE)
        );
        jKhungVeLayout.setVerticalGroup(
            jKhungVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/icons8-trash-can-50.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("THÔNG TIN ĐỐI TƯỢNG: ");

        jLabel3.setText("y");

        jLabel4.setText("x");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("z");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("X :");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Y :");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Z :");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("0");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("0");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("0");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/icons8-home-50.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 0));
        jLabel14.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 153));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/icons8-services-50.png"))); // NOI18N
        jLabel14.setText("3D");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("HÌNH HỌC");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnhinhtru, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnlapphuong, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jKhungVe, javax.swing.GroupLayout.PREFERRED_SIZE, 963, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(519, 519, 519))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(132, 132, 132)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel6)
                        .addGap(22, 22, 22)
                        .addComponent(btnlapphuong, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnhinhtru, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(85, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(335, 335, 335))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel9))
                                        .addGap(83, 83, 83)
                                        .addComponent(jLabel5))
                                    .addComponent(jKhungVe, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
                                .addGap(40, 40, 40))))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
         public void toaDo() {
         for (int i = 0; i <= 261; i++)
        {
	  g2.drawLine(5*i , 0, 5* i , 753);
	  g2.drawLine(  0   , 5* i, 960  , 5* i);
	  g2.setColor(Color.GRAY);
        }
    }
         
    public void refreshOxyz() {
        veOxyz();
        for (int i =0;i<listCube.size();i++) {
            listCube.get(i).draw(g2);
        }
        for (int i =0;i<listGlobular.size();i++) {
            listGlobular.get(i).draw(g2);
        }
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       veOxyz();
    }//GEN-LAST:event_formWindowOpened
  
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        int index= jList.getSelectedIndex();
        int dem = 0;
        if (index > -1){
            if(!listHienThi.isEmpty()){                      
                if(listHienThi.get(index).toString().equals("Hình lập phương")
                    && !listCube.isEmpty()){
                    for (int i = 0 ; i < index ; i++){
                        if (listHienThi.get(i).toString().equals("Hình lập phương ")){
                            dem++;
                        }
                    }
                    listCube.remove(dem);
                    listHienThi.remove(index);refreshOxyz();
                }
                else if(listHienThi.get(index).toString().equals("Hình cầu")
                    && !listGlobular.isEmpty()){
                    for (int i = 0 ; i < index ; i++){
                        if (listHienThi.get(i).toString().equals("Hình cầu")){
                            dem++;
                        }
                    }
                    listGlobular.remove(dem);
                    listHienThi.remove(index);refreshOxyz();
                }
            }    
        }
        
        index = -1;
    }//GEN-LAST:event_jButton12ActionPerformed

    
    private void btnhinhtruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhinhtruActionPerformed
        veOxyz();
        JFrame frame=  new JFrame();
        String x= JOptionPane.showInputDialog(
        frame,
        "Nhập x ",
        "Nhập toạ độ x",
        JOptionPane.INFORMATION_MESSAGE
        );
         String y= JOptionPane.showInputDialog(
        frame,
        "Nhập y ",
        "Nhập toạ độ y",
        JOptionPane.INFORMATION_MESSAGE
        );
         String z= JOptionPane.showInputDialog(
        frame,
        "Nhập z",
        "Nhập toạ độ z",
        JOptionPane.INFORMATION_MESSAGE
        );
          String r= JOptionPane.showInputDialog(
        frame,
        "Nhập R",
        "Nhập bán kính hình cầu",
        JOptionPane.INFORMATION_MESSAGE
        );
          if(x.equals("")||y.equals("")||z.equals("")||r.equals("")){
            JOptionPane.showMessageDialog(rootPane, "chưa nhập đủ dữ liệu, nhập lại!");
            return;
        }
          jLabel10.setText(((Integer.parseInt(x))/5+1+""));
          jLabel11.setText(((Integer.parseInt(y))/5+1+""));
          jLabel12.setText(((Integer.parseInt(z))/5+1+""));
          
        Globular3D Glo = new Globular3D(Integer.parseInt(x) + jKhungVe.getWidth()/2,-Integer.parseInt(y)+jKhungVe.getHeight()/2,
                                       Integer.parseInt(z), Integer.parseInt(r), Color.black);
        listGlobular.add(Glo);
        listHienThi.addElement(Glo);
        demglobular++;
        jList.setModel(listHienThi);
        refreshOxyz();   
    }//GEN-LAST:event_btnhinhtruActionPerformed

    private void btnlapphuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlapphuongActionPerformed
        veOxyz();
        JFrame frame=  new JFrame();
        String x= JOptionPane.showInputDialog(
        frame,
        "Nhập x ",
        "Nhập toạ độ x",
        JOptionPane.INFORMATION_MESSAGE
        );
         String y= JOptionPane.showInputDialog(
        frame,
        "Nhập y ",
        "Nhập toạ độ y",
        JOptionPane.INFORMATION_MESSAGE
        );
         String z= JOptionPane.showInputDialog(
        frame,
        "Nhập z",
        "Nhập toạ độ z",
        JOptionPane.INFORMATION_MESSAGE
        );
          String d= JOptionPane.showInputDialog(
        frame,
        "Nhập d",
        "Nhập độ dài cạnh",
        JOptionPane.INFORMATION_MESSAGE
        );
          if(x.equals("")||y.equals("")||z.equals("")||d.equals("")){
            JOptionPane.showMessageDialog(rootPane, "chưa nhập đủ dữ liệu, nhập lại!");
            return;
        }
          jLabel10.setText(((Integer.parseInt(x))/5+1+""));
          jLabel11.setText(((Integer.parseInt(y))/5+1+""));
          jLabel12.setText(((Integer.parseInt(z))/5+1+""));
                  
        Cube3D cube = new Cube3D(Integer.parseInt(x) + jKhungVe.getWidth()/2,-Integer.parseInt(y)+jKhungVe.getHeight()/2,
                                       Integer.parseInt(z), Integer.parseInt(d), Color.black);
        listCube.add(cube);
        listHienThi.addElement(cube);
        demcube++;
        jList.setModel(listHienThi);
        refreshOxyz();       // TODO add your handling code here:
    }//GEN-LAST:event_btnlapphuongActionPerformed

    private void jListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListMouseClicked
        // TODO add your handling code here:
        int index= jList.getSelectedIndex();
        int dem = 0;

        if (index > -1){
            if(!listHienThi.isEmpty()){
                if(listHienThi.get(index).toString().equals("Hình lập phương")
                    && !listCube.isEmpty()){
                    for (int i = 0 ; i < index ; i++){
                        if (listHienThi.get(i).toString().equals("Hình lập phương")){
                            dem++;
                        }
                    }
                    listCube.get(dem).color=Color.RED;
                    refreshOxyz();
                }
                else if(listHienThi.get(index).toString().equals("Hình cầu")
                    && !listGlobular.isEmpty()){
                    for (int i = 0 ; i < index ; i++){
                        if (listHienThi.get(i).toString().equals("Hình cầu")){
                            dem++;
                        }
                    }
                    listGlobular.get(dem).color=Color.RED;
                    refreshOxyz();
                }
            }
        }
        index = -1;
    }//GEN-LAST:event_jListMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Main.GiaoDien.main(new String[1]);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
 
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGiaoDien().setVisible(true);
            }
        });
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhinhtru;
    private javax.swing.JButton btnlapphuong;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JPanel jKhungVe;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
