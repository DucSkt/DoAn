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
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ỨNG DỤNG VẼ HÌNH");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnlapphuong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/Hinhlapphuong.jpg"))); // NOI18N
        btnlapphuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlapphuongActionPerformed(evt);
            }
        });

        btnhinhtru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/31062635-hình-cầu-3d,-tím-bóng..jpg"))); // NOI18N
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

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/delete.png"))); // NOI18N
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

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 204));
        jLabel6.setText("3D");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("HÌNH HỌC");

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

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setText("Trang Chủ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnlapphuong, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnhinhtru, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(47, 47, 47)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jKhungVe, javax.swing.GroupLayout.PREFERRED_SIZE, 963, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(466, 466, 466))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(497, 497, 497))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(307, 307, 307))))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jKhungVe, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton12)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnlapphuong, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnhinhtru, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel9))
                        .addContainerGap(165, Short.MAX_VALUE))))
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
          jLabel10.setText((Integer.parseInt(x) + jKhungVe.getWidth()/2)+"");
          jLabel11.setText((-Integer.parseInt(y)+jKhungVe.getHeight()/2)+"");
          jLabel12.setText((Integer.parseInt(z))+"");
          
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
          jLabel10.setText((Integer.parseInt(x) + jKhungVe.getWidth()/2)+"");
          jLabel11.setText((-Integer.parseInt(y)+jKhungVe.getHeight()/2)+"");
          jLabel12.setText((Integer.parseInt(z))+"");
                  
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
