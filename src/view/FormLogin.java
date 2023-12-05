/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.DaoPetugas;
import dao.Encrypt;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import parsisten.Petugas;
import servis.ServicePetugas;

/**
 *
 * @author fatiq
 */
public class FormLogin extends javax.swing.JFrame {

    /**
     * Creates new form FormLogin
     */
    int xx, xy;
    ServicePetugas servis = new DaoPetugas();

    public FormLogin() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        jLabel1.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCustom1 = new custom.JPanelCustom();
        jLabel1 = new javax.swing.JLabel();
        tf_user = new javax.swing.JTextField();
        tf_pasword = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanelCustom2 = new custom.JPanelCustom();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/iconlibralinx.png")).getImage());
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanelCustom1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCustom1.setKananAtas(40);
        jPanelCustom1.setKananBawah(40);
        jPanelCustom1.setKiriAtas(40);
        jPanelCustom1.setKiriBawah(40);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/batal.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        tf_user.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tf_user.setForeground(new java.awt.Color(68, 50, 124));
        tf_user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_user.setText("Username");
        tf_user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 50, 124)));
        tf_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_userFocusLost(evt);
            }
        });
        tf_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_userKeyTyped(evt);
            }
        });

        tf_pasword.setForeground(new java.awt.Color(68, 50, 124));
        tf_pasword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_pasword.setText("Password");
        tf_pasword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 50, 124)));
        tf_pasword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_paswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_paswordFocusLost(evt);
            }
        });
        tf_pasword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_paswordKeyTyped(evt);
            }
        });

        btn_login.setBackground(new java.awt.Color(68, 50, 124));
        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_login.setForeground(new java.awt.Color(68, 50, 124));
        btn_login.setText("Login");
        btn_login.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_loginMouseMoved(evt);
            }
        });
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_loginMouseExited(evt);
            }
        });
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login.png"))); // NOI18N

        jPanelCustom2.setBackground(new java.awt.Color(204, 204, 204));
        jPanelCustom2.setKananAtas(40);
        jPanelCustom2.setKiriAtas(40);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/libralinx.png"))); // NOI18N

        javax.swing.GroupLayout jPanelCustom2Layout = new javax.swing.GroupLayout(jPanelCustom2);
        jPanelCustom2.setLayout(jPanelCustom2Layout);
        jPanelCustom2Layout.setHorizontalGroup(
            jPanelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
            .addGroup(jPanelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelCustom2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelCustom2Layout.setVerticalGroup(
            jPanelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelCustom2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(68, 50, 124));
        jLabel4.setText("Lupa password ?");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelCustom1Layout = new javax.swing.GroupLayout(jPanelCustom1);
        jPanelCustom1.setLayout(jPanelCustom1Layout);
        jPanelCustom1Layout.setHorizontalGroup(
            jPanelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustom1Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanelCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanelCustom1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelCustom1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tf_pasword, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelCustom1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4))
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanelCustom1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelCustom1Layout.setVerticalGroup(
            jPanelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustom1Layout.createSequentialGroup()
                .addGroup(jPanelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(tf_pasword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanelCustom1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_login)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void tf_userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_userFocusGained
        if (tf_user.getText().equalsIgnoreCase("username"))
            tf_user.setText("");
    }//GEN-LAST:event_tf_userFocusGained

    private void tf_userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_userFocusLost
        if (tf_user.getText().equalsIgnoreCase("") || tf_user.getText().equalsIgnoreCase("username"))
            tf_user.setText("Username");
    }//GEN-LAST:event_tf_userFocusLost

    private void tf_paswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_paswordFocusGained
        if (tf_pasword.getText().equalsIgnoreCase("Password"))
            tf_pasword.setText("");
    }//GEN-LAST:event_tf_paswordFocusGained

    private void tf_paswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_paswordFocusLost
        if (tf_pasword.getText().equalsIgnoreCase("Password") || tf_pasword.getText().equalsIgnoreCase(""))
            tf_pasword.setText("Password");
    }//GEN-LAST:event_tf_paswordFocusLost

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        prosesLogin();
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_loginMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseMoved
        btn_login.setForeground(Color.white);
    }//GEN-LAST:event_btn_loginMouseMoved

    private void btn_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseExited
        btn_login.setForeground(new Color(68, 50, 124));
    }//GEN-LAST:event_btn_loginMouseExited

    private void tf_paswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_paswordKeyTyped
        char a = evt.getKeyChar();
        if(a == '\n'){
            prosesLogin();
        }
    }//GEN-LAST:event_tf_paswordKeyTyped

    private void tf_userKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_userKeyTyped
        char a = evt.getKeyChar();
        if(a == '\n'){
            tf_pasword.requestFocus();
        }
    }//GEN-LAST:event_tf_userKeyTyped

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new LupaPassword(null,true).setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private custom.JPanelCustom jPanelCustom1;
    private custom.JPanelCustom jPanelCustom2;
    private javax.swing.JPasswordField tf_pasword;
    private javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables

    private void prosesLogin() {
        String username = tf_user.getText();
        String pass = tf_pasword.getText();
        Petugas mod = null;
        List<Petugas> list = servis.ambilData();
        for (Petugas p : list) {
            if (p.getUsername().equals(username) && p.getPassword().equals(Encrypt.getmd5java(pass))) {
                mod = p;
            }
        } 
        if (mod != null) {
            MenuUtama menu = new MenuUtama(mod);
            menu.setVisible(true);
            menu.revalidate();
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Username atau password salah");
            tf_user.setText("Username");
            tf_pasword.setText("Password");
        }
        jLabel1.requestFocus();
    }
}
