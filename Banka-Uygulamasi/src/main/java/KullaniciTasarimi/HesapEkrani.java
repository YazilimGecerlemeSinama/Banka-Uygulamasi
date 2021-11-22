
package KullaniciTasarimi;

import KullaniciTasarimi.ayarlar.Duzenleyici;


public final class HesapEkrani extends javax.swing.JFrame implements Duzenleyici {

    
    public HesapEkrani() {
        initComponents();
        getEdits();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HesapEkraniPanel = new javax.swing.JPanel();
        HosgeldinText = new javax.swing.JLabel();
        AdSoyadText = new javax.swing.JLabel();
        BakiyeText = new javax.swing.JLabel();
        BakiyeIcon = new javax.swing.JLabel();
        ParaCekmeIcon = new javax.swing.JLabel();
        ParaCekmeButon = new javax.swing.JButton();
        ParaYatirmaIcon = new javax.swing.JLabel();
        ParaYatirmaButon = new javax.swing.JButton();
        HavaleIcon = new javax.swing.JLabel();
        HavaleButon = new javax.swing.JButton();
        ÖdemeButon = new javax.swing.JButton();
        ÖdemeIcon = new javax.swing.JLabel();
        AyarlarIcon = new javax.swing.JLabel();
        CikisIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Orenda Bank Hesap Ekranı");

        HesapEkraniPanel.setBackground(new java.awt.Color(204, 204, 255));

        HosgeldinText.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        HosgeldinText.setForeground(new java.awt.Color(0, 0, 0));
        HosgeldinText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HosgeldinText.setText("HOŞ GELDİNİZ");

        AdSoyadText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AdSoyadText.setForeground(new java.awt.Color(0, 0, 0));
        AdSoyadText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdSoyadText.setText("[Kullancı Adı Soyadı]");

        BakiyeText.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        BakiyeText.setForeground(new java.awt.Color(0, 0, 0));
        BakiyeText.setText("[Bakiye]");

        BakiyeIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\ParaIcon.png")); // NOI18N
        BakiyeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ParaCekmeIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\ParaCekmeIcon.png")); // NOI18N
        ParaCekmeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ParaCekmeButon.setBackground(new java.awt.Color(153, 153, 255));
        ParaCekmeButon.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ParaCekmeButon.setForeground(new java.awt.Color(255, 255, 255));
        ParaCekmeButon.setText("Para Çek");
        ParaCekmeButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ParaYatirmaIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\ParaYatirmaIcon.png")); // NOI18N
        ParaYatirmaIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ParaYatirmaButon.setBackground(new java.awt.Color(153, 153, 255));
        ParaYatirmaButon.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ParaYatirmaButon.setForeground(new java.awt.Color(255, 255, 255));
        ParaYatirmaButon.setText("Para Yatır");
        ParaYatirmaButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        HavaleIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\HavaleIcon.png")); // NOI18N
        HavaleIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        HavaleButon.setBackground(new java.awt.Color(153, 153, 255));
        HavaleButon.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        HavaleButon.setForeground(new java.awt.Color(255, 255, 255));
        HavaleButon.setText("Havale");
        HavaleButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ÖdemeButon.setBackground(new java.awt.Color(153, 153, 255));
        ÖdemeButon.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ÖdemeButon.setForeground(new java.awt.Color(255, 255, 255));
        ÖdemeButon.setText("Ödeme");
        ÖdemeButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ÖdemeIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\OdemelerIcon.png")); // NOI18N
        ÖdemeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        AyarlarIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\AyarlarIcon.png")); // NOI18N
        AyarlarIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        CikisIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\CikisIcon.png")); // NOI18N
        CikisIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout HesapEkraniPanelLayout = new javax.swing.GroupLayout(HesapEkraniPanel);
        HesapEkraniPanel.setLayout(HesapEkraniPanelLayout);
        HesapEkraniPanelLayout.setHorizontalGroup(
            HesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HesapEkraniPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(AyarlarIcon)
                .addGap(53, 53, 53)
                .addComponent(HosgeldinText, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(CikisIcon))
            .addGroup(HesapEkraniPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(AdSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(HesapEkraniPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(BakiyeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(BakiyeText, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(HesapEkraniPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(ParaCekmeIcon)
                .addGap(18, 18, 18)
                .addComponent(ParaYatirmaIcon)
                .addGap(18, 18, 18)
                .addComponent(HavaleIcon)
                .addGap(18, 18, 18)
                .addComponent(ÖdemeIcon))
            .addGroup(HesapEkraniPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(ParaCekmeButon, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ParaYatirmaButon, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HavaleButon, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ÖdemeButon, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HesapEkraniPanelLayout.setVerticalGroup(
            HesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HesapEkraniPanelLayout.createSequentialGroup()
                .addGroup(HesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(AyarlarIcon))
                    .addGroup(HesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(HosgeldinText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CikisIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(AdSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(HesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BakiyeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(HesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(BakiyeText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addGroup(HesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ParaCekmeIcon)
                    .addComponent(ParaYatirmaIcon)
                    .addComponent(HavaleIcon)
                    .addComponent(ÖdemeIcon))
                .addGap(12, 12, 12)
                .addGroup(HesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ParaCekmeButon, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ParaYatirmaButon, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HavaleButon, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ÖdemeButon, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HesapEkraniPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HesapEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
     
        @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        HesapEkraniPanel.setFocusable(true);
                               
    }
   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HesapEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdSoyadText;
    private javax.swing.JLabel AyarlarIcon;
    private javax.swing.JLabel BakiyeIcon;
    private javax.swing.JLabel BakiyeText;
    private javax.swing.JLabel CikisIcon;
    private javax.swing.JButton HavaleButon;
    private javax.swing.JLabel HavaleIcon;
    private javax.swing.JPanel HesapEkraniPanel;
    private javax.swing.JLabel HosgeldinText;
    private javax.swing.JButton ParaCekmeButon;
    private javax.swing.JLabel ParaCekmeIcon;
    private javax.swing.JButton ParaYatirmaButon;
    private javax.swing.JLabel ParaYatirmaIcon;
    private javax.swing.JButton ÖdemeButon;
    private javax.swing.JLabel ÖdemeIcon;
    // End of variables declaration//GEN-END:variables

  
}
