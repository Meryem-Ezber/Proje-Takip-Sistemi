/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje_takip;

import java.awt.Toolkit;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class JFrm_GirisEkrani extends javax.swing.JFrame {

    /**
     * Creates new form JFrm_Login
     */
    public static Yonetici_1 y_logined;
    public static Calisan_1 c_logined;

    public JFrm_GirisEkrani() {
        initComponents();
        setTitle("Giriş Ekranı");

        Toolkit kit = Toolkit.getDefaultToolkit();
        int EkranX = (int) kit.getScreenSize().width; //Ekran boyutunun genişliğini alıyoruz...
        int EkranY = (int) kit.getScreenSize().height;//Ekran boyutunun yüksekliğini alıyoruz...
        this.setSize(500, 470); // Pencere boyutunu belirliyoruz...
        this.setLocation((EkranX - 500) / 2, (EkranY - 470) / 2);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxt_kullaniciId = new javax.swing.JTextField();
        jPassword_sifre = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBtn_Giris = new javax.swing.JButton();
        jBtn_sifreDegis = new javax.swing.JButton();
        jbtn_yoneticiKayit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 45)); // NOI18N
        jLabel1.setText("Proje Takip");

        jLabel2.setText("Kullanıcı Id :");

        jLabel3.setText("Kullanıcı Parolası :");

        jBtn_Giris.setText("Giriş");
        jBtn_Giris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_GirisActionPerformed(evt);
            }
        });

        jBtn_sifreDegis.setText("Şifre Değiştir");
        jBtn_sifreDegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_sifreDegisActionPerformed(evt);
            }
        });

        jbtn_yoneticiKayit.setText("Yönetici Kayıt");
        jbtn_yoneticiKayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_yoneticiKayitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxt_kullaniciId, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                    .addComponent(jPassword_sifre)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtn_yoneticiKayit, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jBtn_Giris, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtn_sifreDegis, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxt_kullaniciId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPassword_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBtn_Giris, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtn_sifreDegis, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtn_yoneticiKayit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_GirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_GirisActionPerformed
        // TODO add your handling code here:

        String kullaniciId = jtxt_kullaniciId.getText();
        String sifre = String.copyValueOf(jPassword_sifre.getPassword());
        Yonetici_1 girisYapanYonetici = null;
        Calisan_1 girisYapanCalisan = null;

        EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("BP2_1521221034_MeryemEzber_Odev1PU");
        EntityManager em1 = emf1.createEntityManager();

        Query q1 = em1.createQuery("SELECT y FROM Yonetici_1 y WHERE y.yoneticiId=:y_kId AND y.yoneticiSifre=:y_sif ");
        q1.setParameter("y_kId", kullaniciId);
        q1.setParameter("y_sif", sifre);

        Query q2 = em1.createQuery("SELECT c FROM Calisan_1 c WHERE c.calisanId=:c_kId AND c.calisanSifre=:c_sif");
        q2.setParameter("c_kId", kullaniciId);
        q2.setParameter("c_sif", sifre);

        try {
            girisYapanYonetici = (Yonetici_1) q1.getSingleResult();
        } catch (Exception e) {
            girisYapanYonetici = null;
        }

        if (girisYapanYonetici != null) {
            y_logined = girisYapanYonetici;
            JFrm_YoneticiEkrani newyoneticiekrani = new JFrm_YoneticiEkrani();
            newyoneticiekrani.setVisible(true);
            this.dispose();
        } else {
            try {
                girisYapanCalisan = (Calisan_1) q2.getSingleResult();
            } catch (Exception e) {
                girisYapanCalisan = null;
            }
            if (girisYapanCalisan != null) {
                c_logined = girisYapanCalisan;
                JFrm_CalisanEkrani newcalisanekrani = new JFrm_CalisanEkrani();
                newcalisanekrani.setVisible(true);
                this.dispose();
            }
        }

        if (girisYapanCalisan == null && girisYapanYonetici == null) {
            JOptionPane.showMessageDialog(rootPane, "Kullanici Adi ya da Şifre Geçersiz! ");
            jtxt_kullaniciId.setText("");
            jPassword_sifre.setText("");
        }

        //nedir bu kapatmak?
//        em1.close();
//        emf1.close();
//        em2.close();
//        emf2.close();

    }//GEN-LAST:event_jBtn_GirisActionPerformed

    private void jBtn_sifreDegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_sifreDegisActionPerformed
        // TODO add your handling code here:
        JFrm_SifreDegistirmeEkrani newsifredegistirekrani = new JFrm_SifreDegistirmeEkrani();
        newsifredegistirekrani.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtn_sifreDegisActionPerformed

    private void jbtn_yoneticiKayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_yoneticiKayitActionPerformed
        // TODO add your handling code here:
        JFrm_YoneticiKayitEkrani newyoneticikayitekrani = new JFrm_YoneticiKayitEkrani();
        newyoneticikayitekrani.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtn_yoneticiKayitActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrm_GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrm_GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrm_GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrm_GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrm_GirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Giris;
    private javax.swing.JButton jBtn_sifreDegis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPassword_sifre;
    private javax.swing.JButton jbtn_yoneticiKayit;
    private javax.swing.JTextField jtxt_kullaniciId;
    // End of variables declaration//GEN-END:variables
}
