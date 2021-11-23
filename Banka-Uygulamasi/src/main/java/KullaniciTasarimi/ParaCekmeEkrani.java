
package KullaniciTasarimi;

import KullaniciTasarimi.ayarlar.Duzenleyici;

public class ParaCekmeEkrani extends javax.swing.JFrame implements Duzenleyici {

   
    public ParaCekmeEkrani() {
        initComponents();
        getEdits();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ParaCekmeEkraniPaneli = new javax.swing.JPanel();
        AdSoyadText = new javax.swing.JLabel();
        MesajText = new javax.swing.JLabel();
        ToplamBakiyeText = new javax.swing.JLabel();
        BakiyeText = new javax.swing.JLabel();
        ToplamBakiyeText1 = new javax.swing.JLabel();
        ParaCekmeText = new javax.swing.JTextField();
        ParaCekmeButon = new javax.swing.JButton();
        GeriIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Orenda Bank Para Çekme Ekranı");

        ParaCekmeEkraniPaneli.setBackground(new java.awt.Color(204, 204, 255));

        AdSoyadText.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        AdSoyadText.setForeground(new java.awt.Color(0, 102, 102));
        AdSoyadText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdSoyadText.setText("Sayın [Kullanıcı Adı Soyadı]");

        MesajText.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        MesajText.setForeground(new java.awt.Color(0, 51, 51));
        MesajText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MesajText.setText("Tek seferde 5000 TL ve altını çekebilirsiniz.");

        ToplamBakiyeText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ToplamBakiyeText.setForeground(new java.awt.Color(0, 51, 51));
        ToplamBakiyeText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ToplamBakiyeText.setText("Toplam Bakiyeniz :");

        BakiyeText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BakiyeText.setForeground(new java.awt.Color(0, 51, 51));
        BakiyeText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BakiyeText.setText("[Bakiye]");

        ToplamBakiyeText1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ToplamBakiyeText1.setForeground(new java.awt.Color(0, 51, 51));
        ToplamBakiyeText1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ToplamBakiyeText1.setText("Çekmek İstediğiniz Tutar:");

        ParaCekmeText.setBackground(new java.awt.Color(255, 255, 255));

        ParaCekmeButon.setBackground(new java.awt.Color(0, 51, 51));
        ParaCekmeButon.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ParaCekmeButon.setForeground(new java.awt.Color(255, 255, 255));
        ParaCekmeButon.setText("Para Çek");
        ParaCekmeButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        GeriIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\GeriIcon.png")); // NOI18N

        javax.swing.GroupLayout ParaCekmeEkraniPaneliLayout = new javax.swing.GroupLayout(ParaCekmeEkraniPaneli);
        ParaCekmeEkraniPaneli.setLayout(ParaCekmeEkraniPaneliLayout);
        ParaCekmeEkraniPaneliLayout.setHorizontalGroup(
            ParaCekmeEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParaCekmeEkraniPaneliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AdSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ParaCekmeEkraniPaneliLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ParaCekmeButon)
                .addGap(50, 50, 50))
            .addGroup(ParaCekmeEkraniPaneliLayout.createSequentialGroup()
                .addGroup(ParaCekmeEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ParaCekmeEkraniPaneliLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(ParaCekmeEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ParaCekmeEkraniPaneliLayout.createSequentialGroup()
                                .addGroup(ParaCekmeEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ToplamBakiyeText1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ToplamBakiyeText, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ParaCekmeText, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ParaCekmeEkraniPaneliLayout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(BakiyeText, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(MesajText, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ParaCekmeEkraniPaneliLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(GeriIcon)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ParaCekmeEkraniPaneliLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BakiyeText, ToplamBakiyeText, ToplamBakiyeText1});

        ParaCekmeEkraniPaneliLayout.setVerticalGroup(
            ParaCekmeEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParaCekmeEkraniPaneliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GeriIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AdSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MesajText)
                .addGap(60, 60, 60)
                .addGroup(ParaCekmeEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BakiyeText)
                    .addComponent(ToplamBakiyeText))
                .addGap(18, 18, 18)
                .addGroup(ParaCekmeEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ToplamBakiyeText1)
                    .addComponent(ParaCekmeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ParaCekmeButon)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        ParaCekmeEkraniPaneliLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AdSoyadText, MesajText});

        ParaCekmeEkraniPaneliLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BakiyeText, ParaCekmeText, ToplamBakiyeText, ToplamBakiyeText1});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ParaCekmeEkraniPaneli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ParaCekmeEkraniPaneli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
    }
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParaCekmeEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdSoyadText;
    private javax.swing.JLabel BakiyeText;
    private javax.swing.JLabel GeriIcon;
    private javax.swing.JLabel MesajText;
    private javax.swing.JButton ParaCekmeButon;
    private javax.swing.JPanel ParaCekmeEkraniPaneli;
    private javax.swing.JTextField ParaCekmeText;
    private javax.swing.JLabel ToplamBakiyeText;
    private javax.swing.JLabel ToplamBakiyeText1;
    // End of variables declaration//GEN-END:variables

    
}
