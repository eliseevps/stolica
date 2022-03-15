/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stolica;


import stolica.MyDBConnection;
import java.sql.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author user
 */
public class LoginForm extends javax.swing.JFrame {


   public LoginForm() throws  Exception{ 
         mdbc=new MyDBConnection();
         mdbc.init();
         Connection conn=mdbc.getMyConnection();
         stmt= conn.createStatement();
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        EntryButton = new javax.swing.JButton();
        LoginField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Аутентификация");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        LoginLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LoginLabel.setText("Пользователь");

        PasswordLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PasswordLabel.setText("Пароль");

        EntryButton.setBackground(new java.awt.Color(102, 153, 255));
        EntryButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EntryButton.setText("Вход");
        EntryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntryButtonActionPerformed(evt);
            }
        });

        CancelButton.setBackground(new java.awt.Color(102, 153, 255));
        CancelButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CancelButton.setText("Отмена");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LoginLabel)
                            .addComponent(PasswordLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LoginField)
                            .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(EntryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginLabel)
                    .addComponent(LoginField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EntryButton)
                    .addComponent(CancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    
    private void EntryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntryButtonActionPerformed
        String QuerySelect = "SELECT Password FROM authentication WHERE Login='"+LoginField.getText()+"'";  
        boolean i=false;
        try {
            ResultSet resultSet = stmt.executeQuery(QuerySelect);
            resultSet.first();
            System.out.println(resultSet.getString("Password"));
            if(String.valueOf(PasswordField.getPassword()).equals(String.valueOf(resultSet.getString("Password")))){
                
                new Stolica().setVisible(true);
                this.setVisible(false);
                i=true;
            }
            else
                System.out.println(resultSet.getString("Password"));
        } 
         catch (Exception ex) {
         //System.out.println("PISKA");
       }
        if(!i){
            JOptionPane.showMessageDialog(rootPane, "Не верное имя пользователя или пароль, попробуйте снова", "Аутентификация", ERROR_MESSAGE);
            LoginField.setText("");
            PasswordField.setText("");
            
        }
    }//GEN-LAST:event_EntryButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        formWindowClosing(null);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
            int response = JOptionPane.showOptionDialog(null, "Вы точно хотите выйти из приложения?", "Подтверждение", JOptionPane.YES_NO_OPTION,
    JOptionPane.QUESTION_MESSAGE, null, null, null);
 
    if(response == JOptionPane.YES_OPTION)
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new LoginForm().setVisible(true);
                } catch (Exception ex) {
                   
                }
            }
        });
    }
    
     private final MyDBConnection mdbc;
     private final java.sql.Statement stmt;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton EntryButton;
    private javax.swing.JTextField LoginField;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    // End of variables declaration//GEN-END:variables

    private void formWindowClosing(Object object) {
        int response = JOptionPane.showOptionDialog(null, "Вы точно хотите выйти из приложения?", "Подтверждение", JOptionPane.YES_NO_OPTION,
    JOptionPane.QUESTION_MESSAGE, null, null, null);
 
    if(response == JOptionPane.YES_OPTION)
        System.exit(0);
    }
}
