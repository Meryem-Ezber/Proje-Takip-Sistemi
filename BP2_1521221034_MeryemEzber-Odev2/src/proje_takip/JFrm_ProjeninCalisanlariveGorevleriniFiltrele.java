/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje_takip;

import java.awt.Toolkit;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class JFrm_ProjeninCalisanlariveGorevleriniFiltrele extends javax.swing.JFrame {

    /**
     * Creates new form JFrm_ProjeninCalisanlariniFiltrele
     */
    DefaultTableModel dtm = new DefaultTableModel();
    
    public JFrm_ProjeninCalisanlariveGorevleriniFiltrele() {
        initComponents();
        setTitle(JFrm_GirisEkrani.y_logined.getYoneticiAdi() + " " + JFrm_GirisEkrani.y_logined.getYoneticiSoyadi());
        Toolkit kit = Toolkit.getDefaultToolkit();
        int EkranY = (int) kit.getScreenSize().width; //Ekran boyutunun genişliğini alıyoruz...
        int EkranX = (int) kit.getScreenSize().height;//Ekran boyutunun yüksekliğini alıyoruz...
        this.setSize(640, 430); // Pencere boyutunu belirliyoruz...
        this.setLocation((EkranY - 640) / 2, (EkranX - 430) / 2);
        jTable1.setModel(dtm);
        dtm.setColumnIdentifiers(new String[]{"Çalışan Id", "Görev Adı"});
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BP2_1521221034_MeryemEzber_Odev1PU");
        EntityManager em = emf.createEntityManager();
        
        Query q1 = em.createQuery("SELECT p FROM Proje_1 p WHERE p.yoneticiId=:id");
        q1.setParameter("id", JFrm_GirisEkrani.y_logined.getYoneticiId());
        List<Proje_1> projeler = q1.getResultList();
        
        for (Proje_1 proje : projeler) {
            jComboBox_proje.addItem(proje);
        }
     
         jComboBox_proje.setSelectedIndex(-1);
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox_proje = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        jLabel1.setText("Proje Id :");

        jButton1.setText("Filtrele");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("Geri Dön");

        jMenuItem1.setText("Geri Dön");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox_proje, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton1)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_proje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Proje_1 secilenProje = (Proje_1) jComboBox_proje.getSelectedItem();
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BP2_1521221034_MeryemEzber_Odev1PU");
        EntityManager em = emf.createEntityManager();
        
        Query q1 = em.createQuery("SELECT g FROM Gorev_1 g WHERE g.projeId=:id");
        q1.setParameter("id", secilenProje.getProjeId());
        List<Gorev_1> gorevler = q1.getResultList();
        
        dtm.setRowCount(0);
        for (Gorev_1 gorev : gorevler) {
            dtm.addRow(new Object[]{gorev.getCalisanId(), gorev.getGorevAdi()});
        }
        
//        if (jTextField1.getText().length() != 0) {
//            boolean varmi = false;
//            for (Proje proje : Proje.projeler) {
//                for (Proje p : JFrm_GirisEkrani.y_logined.yoneticininProjeleri) {
//                    if (proje.getId().equals(jTextField1.getText()) && p.getId().equals(jTextField1.getText())) {
//                        varmi = true;
//                    }
//                }
//            }
//            if (varmi == true) {
//                int sayac = 0;
//                for (Proje proje : Proje.projeler) {
//                    if (proje.getId().equals(jTextField1.getText())) {
//                        for (Calisan calisan : proje.projeninCalisanlari) {
//                            sayac++;
//                            dtm.addRow(new String[]{calisan.getId(), calisan.adi + " " + calisan.soyadi});
//                        }
//                    }
//                }
//                if (sayac == 0) {
//                    JOptionPane.showMessageDialog(rootPane, "Projenin çalışanı yok.");
//                }
//            } else {
//                JOptionPane.showMessageDialog(rootPane, "Girdiğiniz Id'ye sahip projeniz yok.");
//                jTextField1.setText("");
//            }
//        } else {
//            JOptionPane.showMessageDialog(rootPane, "Çalışan Id giriniz.");
//        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        JFrm_YoneticiEkrani newyoneticiekrani = new JFrm_YoneticiEkrani();
        newyoneticiekrani.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrm_ProjeninCalisanlariveGorevleriniFiltrele.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrm_ProjeninCalisanlariveGorevleriniFiltrele.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrm_ProjeninCalisanlariveGorevleriniFiltrele.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrm_ProjeninCalisanlariveGorevleriniFiltrele.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrm_ProjeninCalisanlariveGorevleriniFiltrele().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Proje_1> jComboBox_proje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
