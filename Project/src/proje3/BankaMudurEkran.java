/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proje3;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author erayk
 */
public class BankaMudurEkran extends javax.swing.JFrame {
         DefaultTableModel model;
                 DefaultTableModel model2;
         Database_Connect baglan=new Database_Connect();
    /**
     * Creates new form BankaMudurEkran
     */
    public BankaMudurEkran() {
        initComponents();
         model= (DefaultTableModel) BankaMudur_Tablo.getModel();
          model2 =(DefaultTableModel) FaizTablosu.getModel();
         faizGoruntule();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BankaMudur_Tablo = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        Banka_Mudur_Ekran_Personel_AdSoyad = new javax.swing.JTextField();
        Banka_Mudur_Ekran_Personel_Email = new javax.swing.JTextField();
        Banka_Mudur_Ekran_Personel_Tel = new javax.swing.JTextField();
        Banka_Mudur_Ekran_Personel_Adres = new javax.swing.JTextField();
        Banka_Mudur_Ekran_Personel_Sifre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BankaMudurEkranVeriGuncelle_b = new javax.swing.JButton();
        BankaMudurEkranMusteriEkle_b = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        FaizTablosu = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Gecikme_Faizi = new javax.swing.JTextField();
        Faiz = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("              BANKA  MÜDÜRÜNÜN  VERİLERİ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Email :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Telefon No :");

        BankaMudur_Tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EID", "PASSWORD", "NAMESURNAME", "TCNO", "EMAIL", "TELNR", "ADRESS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BankaMudur_Tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BankaMudur_TabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BankaMudur_Tablo);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Adres :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ad-Soyad :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Şifre :");

        BankaMudurEkranVeriGuncelle_b.setBackground(new java.awt.Color(51, 0, 255));
        BankaMudurEkranVeriGuncelle_b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BankaMudurEkranVeriGuncelle_b.setText("Banka Müdürünün Verilerini Güncelle ");
        BankaMudurEkranVeriGuncelle_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankaMudurEkranVeriGuncelle_bActionPerformed(evt);
            }
        });

        BankaMudurEkranMusteriEkle_b.setBackground(new java.awt.Color(51, 0, 255));
        BankaMudurEkranMusteriEkle_b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BankaMudurEkranMusteriEkle_b.setText("Müşteri Ekle");
        BankaMudurEkranMusteriEkle_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankaMudurEkranMusteriEkle_bActionPerformed(evt);
            }
        });

        FaizTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "INTEREST", "OVERDUE INTEREST"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        FaizTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FaizTablosuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(FaizTablosu);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Faiz Oranı:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Gecikme Faizi Oranı:");

        Gecikme_Faizi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gecikme_FaiziActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Faiz Oranlarını Güncelle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(47, 47, 47)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Banka_Mudur_Ekran_Personel_Tel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                            .addComponent(Banka_Mudur_Ekran_Personel_AdSoyad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Banka_Mudur_Ekran_Personel_Sifre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Banka_Mudur_Ekran_Personel_Email, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Banka_Mudur_Ekran_Personel_Adres))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BankaMudurEkranVeriGuncelle_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BankaMudurEkranMusteriEkle_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Faiz, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Gecikme_Faizi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(Banka_Mudur_Ekran_Personel_Sifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BankaMudurEkranVeriGuncelle_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Banka_Mudur_Ekran_Personel_AdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Banka_Mudur_Ekran_Personel_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(BankaMudurEkranMusteriEkle_b, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Banka_Mudur_Ekran_Personel_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Banka_Mudur_Ekran_Personel_Adres, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Gecikme_Faizi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Faiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BankaMudur_TabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BankaMudur_TabloMouseClicked
        // TODO add your handling code here:

        Banka_Mudur_Ekran_Personel_Sifre.setText((String) model.getValueAt(BankaMudur_Tablo.getSelectedRow(),1));// 2.sütun
        Banka_Mudur_Ekran_Personel_AdSoyad.setText((String) model.getValueAt(BankaMudur_Tablo.getSelectedRow(),2));// 3.sütun
        Banka_Mudur_Ekran_Personel_Email.setText((String) model.getValueAt(BankaMudur_Tablo.getSelectedRow(),4)); //5.sütun
        Banka_Mudur_Ekran_Personel_Tel.setText((String) model.getValueAt(BankaMudur_Tablo.getSelectedRow(),5)); // 7.sütun
        Banka_Mudur_Ekran_Personel_Adres.setText((String) model.getValueAt(BankaMudur_Tablo.getSelectedRow(),6)); //9.sütun
    }//GEN-LAST:event_BankaMudur_TabloMouseClicked

    private void BankaMudurEkranVeriGuncelle_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BankaMudurEkranVeriGuncelle_bActionPerformed
        // TODO add your handling code here:
        String yedeksifre=Banka_Mudur_Ekran_Personel_Sifre.getText();
        String yedekadsoyad=Banka_Mudur_Ekran_Personel_AdSoyad.getText();
        String yedekemail=Banka_Mudur_Ekran_Personel_Email.getText();
        String yedektel=Banka_Mudur_Ekran_Personel_Tel.getText();
        String yedekadres=Banka_Mudur_Ekran_Personel_Adres.getText();
        
         if(BankaMudur_Tablo.getSelectedRow()==-1){
          
      if(model.getRowCount()!=0){ // Güncellenecek satır seçili değil
          
          JOptionPane.showMessageDialog(null,"Lütfen güncellenecek satırı seçiniz"); 
      }    
          
      }
      else{
          
       int yedekeid=(int) model.getValueAt(BankaMudur_Tablo.getSelectedRow(),0);// 0.sütundaki employeeid yi çeker
       
       baglan.Personel_Veri_Guncelle(yedekeid,yedeksifre,yedekadsoyad,yedekemail,yedektel,yedekadres);
      
         
       String x = String.valueOf(model.getValueAt(BankaMudur_Tablo.getSelectedRow(),0)); // Obje String dönüştürme
     
       Personel_Veri_Gor(x);
       
       JOptionPane.showMessageDialog(null,"Güncelleme yapıldı"); 
       
      }
        
        
    }//GEN-LAST:event_BankaMudurEkranVeriGuncelle_bActionPerformed

    private void BankaMudurEkranMusteriEkle_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BankaMudurEkranMusteriEkle_bActionPerformed
        // TODO add your handling code here:
    MusteriTemsilciMusteriEkle mtme=new MusteriTemsilciMusteriEkle();
    mtme.setVisible(true);
    
    setVisible(false);
        
           
    }//GEN-LAST:event_BankaMudurEkranMusteriEkle_bActionPerformed

    private void FaizTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FaizTablosuMouseClicked

        int selectedrow = FaizTablosu.getSelectedRow();
        Faiz.setText((String) model2.getValueAt(FaizTablosu.getSelectedRow(),0));
        Gecikme_Faizi.setText((String) model2.getValueAt(FaizTablosu.getSelectedRow(),1));

    }//GEN-LAST:event_FaizTablosuMouseClicked

    private void Gecikme_FaiziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gecikme_FaiziActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Gecikme_FaiziActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String ınterest = Faiz.getText();
        String overdue_ınterest = Gecikme_Faizi.getText();
        int selectedrow =FaizTablosu.getSelectedRow();
        if(selectedrow==-1){
            if(model.getRowCount()==0){
                JOptionPane.showMessageDialog(null,"Faiz tablosu şuanda boş");
            }
            else{
                JOptionPane.showMessageDialog(null,"Lütfen güncellenecek satırı seçiniz");
            }
        }
        else
        {
            baglan.faizguncelle(ınterest,overdue_ınterest);
        }

        faizGoruntule();

    }//GEN-LAST:event_jButton2ActionPerformed
public void Personel_Veri_Gor(String ad){
    
 model.setRowCount(0); // Banka mudurunun verilerini gosteren tablo her seferınde sıfırlanır
 
 ArrayList<Personel> personel_veri=new ArrayList<Personel>();
        
        personel_veri=baglan.Personel_Veri_Getir(ad);   
     if(personel_veri != null){
            
         for(Personel personel: personel_veri){
             
         Object[] add_data={personel.getEID(),personel.getPASSWORD(),personel.getNAMESURNAME(),personel.getTCNO(),
             
                    personel.getEMAIL(),personel.getTELNR(),
                    personel.getADRESS()};    
             
            model.addRow(add_data); // tabloya veriler eklendi
         }   
            
        }
}
public void faizGoruntule(){
    model2.setRowCount(0);
    ArrayList<Faiz> faiz=new ArrayList<Faiz>();
    
    faiz=baglan.faiziGetir();
    if(faiz!= null){
        for(Faiz fz:faiz)
        {
            Object[] eklenecek={fz.getInterest(),fz.getOverdue_ınterest()};
              model2.addRow(eklenecek);
        }
    }
    
}
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
            java.util.logging.Logger.getLogger(BankaMudurEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankaMudurEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankaMudurEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankaMudurEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankaMudurEkran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BankaMudurEkranMusteriEkle_b;
    private javax.swing.JButton BankaMudurEkranVeriGuncelle_b;
    private javax.swing.JTable BankaMudur_Tablo;
    private javax.swing.JTextField Banka_Mudur_Ekran_Personel_AdSoyad;
    private javax.swing.JTextField Banka_Mudur_Ekran_Personel_Adres;
    private javax.swing.JTextField Banka_Mudur_Ekran_Personel_Email;
    private javax.swing.JTextField Banka_Mudur_Ekran_Personel_Sifre;
    private javax.swing.JTextField Banka_Mudur_Ekran_Personel_Tel;
    private javax.swing.JTextField Faiz;
    private javax.swing.JTable FaizTablosu;
    private javax.swing.JTextField Gecikme_Faizi;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
