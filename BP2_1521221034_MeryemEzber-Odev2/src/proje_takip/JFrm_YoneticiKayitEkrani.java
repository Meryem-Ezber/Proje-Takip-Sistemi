/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje_takip;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class JFrm_YoneticiKayitEkrani extends javax.swing.JFrame {

    /**
     * Creates new form JFrm_YöneticiKayıt
     */
    public JFrm_YoneticiKayitEkrani() {
        initComponents();
        setTitle("Yönetici Kayıt Ekranı");
        Toolkit kit = Toolkit.getDefaultToolkit();
        int EkranY = (int) kit.getScreenSize().width; //Ekran boyutunun genişliğini alıyoruz...
        int EkranX = (int) kit.getScreenSize().height;//Ekran boyutunun yüksekliğini alıyoruz...
        this.setSize(480, 500); // Pencere boyutunu belirliyoruz...
        this.setLocation((EkranY - 480) / 2, (EkranX - 500) / 2);
        jBtn_kaydol1.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jCheckBox_onay1 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtxt_soyadi1 = new javax.swing.JTextField();
        jtxt_adi1 = new javax.swing.JTextField();
        jpassword_sifre1 = new javax.swing.JPasswordField();
        jBtn_kaydol1 = new javax.swing.JButton();
        jbtn_vazgec = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 1, 30)); // NOI18N
        jLabel6.setText("Yönetici Kayıt");

        jCheckBox_onay1.setText("Yukarıdaki bilgileri onaylıyorum.");
        jCheckBox_onay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_onay1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Adı :");

        jLabel8.setText("Soyadı :");

        jLabel10.setText("Şifre :");

        jBtn_kaydol1.setText("Kaydol");
        jBtn_kaydol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_kaydol1ActionPerformed(evt);
            }
        });

        jbtn_vazgec.setText("Vazgeç");
        jbtn_vazgec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_vazgecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtn_vazgec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtxt_soyadi1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jpassword_sifre1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxt_adi1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jCheckBox_onay1))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtn_kaydol1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel6)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtxt_adi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jtxt_soyadi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jpassword_sifre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jCheckBox_onay1)
                .addGap(18, 18, 18)
                .addComponent(jBtn_kaydol1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtn_vazgec, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_kaydol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_kaydol1ActionPerformed
        try {
            Yonetici yeniyonetici = new Yonetici();
            yeniyonetici.adi = jtxt_adi1.getText();
            yeniyonetici.soyadi = jtxt_soyadi1.getText();
            yeniyonetici.password = String.valueOf(jpassword_sifre1.getPassword());

            Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/PROJE_TAKIP", "SA", "AS");
            String q1 = "SELECT MAX(ID) max_id FROM IDNUMARALARI";
            Statement statement = c.createStatement();

            ResultSet idMax = statement.executeQuery(q1);
            int id = 0;
            if (idMax.next()) {
                id = idMax.getInt("max_id");
            }
            id++;

            yeniyonetici.id = String.valueOf(id);

            String q2 = "INSERT INTO YONETICI (YONETICI_ID,YONETICI_ADI,YONETICI_SOYADI,YONETICI_SIFRE) VALUES(?,?,?,?)";
            PreparedStatement stm1 = c.prepareStatement(q2);

            stm1.setString(1, String.valueOf(yeniyonetici.id));
            stm1.setString(2, yeniyonetici.adi);
            stm1.setString(3, yeniyonetici.soyadi);
            stm1.setString(4, yeniyonetici.password);

            stm1.executeUpdate();

            String q3 = "INSERT INTO IDNUMARALARI (ID,TYPE) VALUES(?,?)";
            PreparedStatement stm2 = c.prepareStatement(q3);

            stm2.setInt(1, Integer.parseInt(yeniyonetici.id));
            stm2.setString(2, "Yönetici");

            stm2.executeUpdate();

            JOptionPane.showMessageDialog(rootPane, "Kayıt Başarılı. Kullanıcı Id'niz " + yeniyonetici.id + ". Lütfen sisteme girebilmek için Id numaranızı not ediniz.");
            JFrm_GirisEkrani newgirisEkrani = new JFrm_GirisEkrani();
            newgirisEkrani.setVisible(true);
            this.dispose();

        } catch (SQLException ex) {
            Logger.getLogger(JFrm_YoneticiKayitEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jBtn_kaydol1ActionPerformed

    private void jCheckBox_onay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_onay1ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox_onay1.isSelected()) {
            if (jtxt_adi1.getText().length() == 0 || jtxt_soyadi1.getText().length() == 0 || String.valueOf(jpassword_sifre1.getPassword()).length() == 0) {
                jBtn_kaydol1.setEnabled(false);
                JOptionPane.showMessageDialog(rootPane, "Bilgilerinizi eksiksiz doldurun!");
                jCheckBox_onay1.setSelected(false);
            } else {
                jBtn_kaydol1.setEnabled(true);
            }
        } else {
            jBtn_kaydol1.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox_onay1ActionPerformed

    private void jbtn_vazgecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_vazgecActionPerformed
        // TODO add your handling code here:
        JFrm_GirisEkrani girisEkrani = new JFrm_GirisEkrani();
        girisEkrani.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtn_vazgecActionPerformed

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
            java.util.logging.Logger.getLogger(JFrm_YoneticiKayitEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrm_YoneticiKayitEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrm_YoneticiKayitEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrm_YoneticiKayitEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrm_YoneticiKayitEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_kaydol1;
    private javax.swing.JCheckBox jCheckBox_onay1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jbtn_vazgec;
    private javax.swing.JPasswordField jpassword_sifre1;
    private javax.swing.JTextField jtxt_adi1;
    private javax.swing.JTextField jtxt_soyadi1;
    // End of variables declaration//GEN-END:variables
}
