
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gizem
 */
public class Anasayfa extends javax.swing.JFrame {

    /**
     * Creates new form Anasayfa
     */
 
    public Anasayfa() {
        initComponents();
        textob.setVisible(false);
        text.setVisible(false);
        text2.setVisible(false);
        baslaButon.setVisible(false);
        text3.setVisible(false);
        // fotoata();
        bilkart1.setVisible(false);
        bilkart2.setVisible(false);
        bilkart3.setVisible(false);
        okart1.setVisible(false);
        okart2.setVisible(false);
        okart3.setVisible(false);
        bilg.setVisible(false);
        oync.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Butonbb = new javax.swing.JButton();
        Butonbo = new javax.swing.JButton();
        textob = new javax.swing.JTextField();
        baslaButon = new javax.swing.JButton();
        text3 = new javax.swing.JTextField();
        text = new javax.swing.JTextField();
        text2 = new javax.swing.JTextField();
        okart3 = new javax.swing.JButton();
        okart2 = new javax.swing.JButton();
        okart1 = new javax.swing.JButton();
        bilkart3 = new javax.swing.JButton();
        bilkart2 = new javax.swing.JButton();
        bilkart1 = new javax.swing.JButton();
        oync = new javax.swing.JTextField();
        bilg = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Butonbb.setBackground(new java.awt.Color(255, 153, 153));
        Butonbb.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        Butonbb.setForeground(java.awt.Color.red);
        Butonbb.setText("BİLGİSAYAR VS BİLGİSAYAR");
        Butonbb.setMargin(new java.awt.Insets(2, 10, 2, 10));
        Butonbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButonbbActionPerformed(evt);
            }
        });
        getContentPane().add(Butonbb);
        Butonbb.setBounds(433, 173, 330, 70);

        Butonbo.setBackground(new java.awt.Color(255, 153, 153));
        Butonbo.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        Butonbo.setForeground(java.awt.Color.red);
        Butonbo.setText("BİLGİSAYAR VS OYUNCU");
        Butonbo.setMargin(new java.awt.Insets(2, 10, 2, 10));
        Butonbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButonboActionPerformed(evt);
            }
        });
        getContentPane().add(Butonbo);
        Butonbo.setBounds(433, 80, 330, 70);

        textob.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        textob.setText("İSMİNİZ :");
        textob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textobActionPerformed(evt);
            }
        });
        getContentPane().add(textob);
        textob.setBounds(440, 90, 100, 30);

        baslaButon.setBackground(new java.awt.Color(0, 0, 0));
        baslaButon.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        baslaButon.setForeground(new java.awt.Color(204, 204, 255));
        baslaButon.setText("OYUNA BASLA");
        baslaButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baslaButonActionPerformed(evt);
            }
        });
        getContentPane().add(baslaButon);
        baslaButon.setBounds(630, 140, 130, 29);

        text3.setText("Bilgisayar");
        getContentPane().add(text3);
        text3.setBounds(570, 100, 51, 20);
        getContentPane().add(text);
        text.setBounds(550, 90, 100, 30);

        text2.setText("Bilgisayar");
        text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text2ActionPerformed(evt);
            }
        });
        getContentPane().add(text2);
        text2.setBounds(550, 190, 100, 30);

        okart3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/arka.jpg"))); // NOI18N
        getContentPane().add(okart3);
        okart3.setBounds(750, 330, 160, 210);

        okart2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/arka.jpg"))); // NOI18N
        okart2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okart2ActionPerformed(evt);
            }
        });
        getContentPane().add(okart2);
        okart2.setBounds(490, 330, 160, 210);

        okart1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/arka.jpg"))); // NOI18N
        okart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okart1ActionPerformed(evt);
            }
        });
        getContentPane().add(okart1);
        okart1.setBounds(240, 330, 160, 210);

        bilkart3.setIcon(new javax.swing.ImageIcon("C:\\Users\\gizem\\Desktop\\PROLAB2\\PokemonKartlari\\arka.jpg")); // NOI18N
        getContentPane().add(bilkart3);
        bilkart3.setBounds(750, 60, 160, 210);

        bilkart2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/arka.jpg"))); // NOI18N
        getContentPane().add(bilkart2);
        bilkart2.setBounds(490, 60, 160, 210);

        bilkart1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/arka.jpg"))); // NOI18N
        getContentPane().add(bilkart1);
        bilkart1.setBounds(240, 60, 160, 210);

        oync.setBackground(new java.awt.Color(0, 51, 153));
        oync.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        oync.setForeground(new java.awt.Color(255, 255, 255));
        oync.setText("             BİLGİSAYAR-2");
        getContentPane().add(oync);
        oync.setBounds(500, 550, 170, 40);
        oync.getAccessibleContext().setAccessibleName("");

        bilg.setBackground(new java.awt.Color(0, 51, 153));
        bilg.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        bilg.setForeground(new java.awt.Color(255, 255, 255));
        bilg.setText("                BİLGİSAYAR");
        getContentPane().add(bilg);
        bilg.setBounds(500, 10, 170, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\gizem\\Desktop\\PROLAB2\\PokemonKartlari\\arena.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1220, 600);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1200, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButonboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButonboActionPerformed
         Butonbo.setVisible(false);
         Butonbb.setVisible(false);
         textob.setVisible(true);
        
    }//GEN-LAST:event_ButonboActionPerformed

    private void textobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textobActionPerformed
       
        String kullaniciAdi = textob.getText();
        System.out.println(kullaniciAdi);
        text.setVisible(true);
        text.setText(kullaniciAdi);
        textob.setVisible(false);
        text2.setVisible(true);
        baslaButon.setVisible(true);
    }//GEN-LAST:event_textobActionPerformed

    private void text2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text2ActionPerformed

    private void baslaButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baslaButonActionPerformed
      
             
         bilkart1.setVisible(true);
         bilkart2.setVisible(true);
         bilkart3.setVisible(true);
         okart1.setVisible(true);
         okart2.setVisible(true);
         okart3.setVisible(true);
         baslaButon.setVisible(false);
         text2.setVisible(false);
         textob.setVisible(false);
         text3.setVisible(false);
         text.setVisible(false);
         
    
       
    }//GEN-LAST:event_baslaButonActionPerformed

    private void ButonbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButonbbActionPerformed
      
        Butonbb.setVisible(false);
        Butonbo.setVisible(false);
        bilkart1.setVisible(true);
        bilkart2.setVisible(true);
        bilkart3.setVisible(true);
        okart1.setVisible(true);
        okart2.setVisible(true);
        okart3.setVisible(true);
        bilg.setVisible(true);
        oync.setVisible(true);
    }//GEN-LAST:event_ButonbbActionPerformed

    private void okart2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okart2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_okart2ActionPerformed

    private void okart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okart1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_okart1ActionPerformed

   
 
 
     

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
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Anasayfa().setVisible(true);
            }
        });
    }

    
    
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Butonbb;
    private javax.swing.JButton Butonbo;
    private javax.swing.JButton baslaButon;
    private javax.swing.JTextField bilg;
    private javax.swing.JButton bilkart1;
    private javax.swing.JButton bilkart2;
    private javax.swing.JButton bilkart3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton okart1;
    private javax.swing.JButton okart2;
    private javax.swing.JButton okart3;
    private javax.swing.JTextField oync;
    private javax.swing.JTextField text;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text3;
    private javax.swing.JTextField textob;
    // End of variables declaration//GEN-END:variables
    /*
    ImageIcon [] foto = new ImageIcon[10];
    int [] sakla = new int[10];
    private void fotoata() {
      
        foto[0] = new ImageIcon("foto/pikachu.jpg");
        foto[1] = new ImageIcon("foto/bulbasaur.jpg");
        foto[2] = new ImageIcon("foto/charmander.jpg");
        foto[3] = new ImageIcon("foto/squirtle.jpg");
        foto[4] = new ImageIcon("foto/zubat.jpg");
        foto[5] = new ImageIcon("foto/psyduck.jpg");
        foto[6] = new ImageIcon("foto/snorlax.jpg");
        foto[7] = new ImageIcon("foto/butterfree.jpg");
        foto[8] = new ImageIcon("foto/jigglypuff.jpg");
        foto[9] = new ImageIcon("foto/meowth.jpg");
        
        Random yeni = new Random();
        int sayi = yeni.nextInt();
     
              okart1.setIcon(foto[sakla[0]]);
              okart2.setIcon(foto[sakla[1]]);
              okart3.setIcon(foto[sakla[2]]); 
              bilkart1.setIcon(foto[sakla[3]]);
              bilkart2.setIcon(foto[sakla[4]]);
              bilkart3.setIcon(foto[sakla[5]]);
              jButton1.setIcon(foto[sakla[6]]);
              jButton2.setIcon(foto[sakla[7]]);
              jButton3.setIcon(foto[sakla[8]]);
              jButton4.setIcon(foto[sakla[9]]);
              */        
                   
                
              
       
    
    
       }       
    
    
    

