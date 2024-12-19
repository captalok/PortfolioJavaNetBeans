
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project.ButtonActivator;
import project.ColorGenerator;
import project.FormInterface;
import project.paramInsertUpdateDelete;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author alk_6
 */
public class PasswordInsert extends javax.swing.JFrame {

    private static int websiteID;
    private static String websiteName;
    private static String userName;
    private static String password;
    private static String linkedEmail;
    private static String linkedMobile;
    private static String note1;
    private static String note2;
    
    private FormInterface observer;    
    private static PasswordInsert instance; 
    
    private Color primaryColor = ColorGenerator.generateRandomPrimaryColor();
    private Color secondaryColor = ColorGenerator.generateSecondaryColor(primaryColor);
    private Color thirdColor = ColorGenerator.generateThirdColor(secondaryColor);
    
    /**
     * Creates new form PasswordInsert
     */
    public PasswordInsert(int websiteID, String websiteName, String userName, String password, String linkedEmail, String linkedMobile, String note1, String note2) {
        initComponents();
        jButton4.setVisible(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        this.websiteID = websiteID;
        this.websiteName = websiteName;
        this.userName = userName;
        this.password = password;
        this.linkedEmail = linkedEmail;
        this.linkedMobile = linkedMobile;
        this.note1 = note1;
        this.note2 = note2;
        
        jTextField11.setText(String.valueOf(websiteID));
        jTextField12.setText(websiteName);
        jTextField13.setText(userName);
        jTextField14.setText(password);
        jTextField15.setText(linkedEmail);
        jTextField17.setText(linkedMobile);
        jTextField18.setText(note1);
        jTextField16.setText(note2);
        
        //getRootPane().setDefaultButton(jButton4);
        setAlwaysOnTop(true);
        
        jTextField11.setEditable(false);
        jButton2.requestFocusInWindow();       
        
        ButtonActivator.makeButtonDefaultOnEnter(jButton2);
        ButtonActivator.makeButtonDefaultOnEnter(jButton3);
        ButtonActivator.makeButtonDefaultOnEnter(jButton4);
        
        jTextField12.setNextFocusableComponent(jTextField13);
        jTextField13.setNextFocusableComponent(jTextField14);
        jTextField14.setNextFocusableComponent(jTextField17);
        jTextField17.setNextFocusableComponent(jTextField15);
        jTextField15.setNextFocusableComponent(jTextField18);
        jTextField18.setNextFocusableComponent(jTextField16);        
        jTextField16.setNextFocusableComponent(jButton3);
        jButton3.setNextFocusableComponent(jButton4);
        jButton4.setNextFocusableComponent(jTextField12);
        
        jPanel1.setBackground(secondaryColor);        
        jPanel4.setBackground(thirdColor);
        jTextField11.setBackground(thirdColor);
        jTextField12.setBackground(thirdColor);
        jTextField13.setBackground(thirdColor);
        jTextField14.setBackground(thirdColor);
        jTextField16.setBackground(thirdColor);
        jTextField17.setBackground(thirdColor);        
        jTextField15.setBackground(thirdColor);
        jTextField18.setBackground(thirdColor);
        jButton2.setBackground(secondaryColor);
        jButton3.setBackground(secondaryColor);
        jButton4.setBackground(secondaryColor);   
                        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(286, 420));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(242, 16, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Viner Hand ITC", 1, 40)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("P");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("assword");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 100, -1));

        jLabel8.setFont(new java.awt.Font("Viner Hand ITC", 1, 40)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("/");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 30, 50));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("nsert");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 70, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("pdate");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 70, -1));

        jLabel25.setFont(new java.awt.Font("Viner Hand ITC", 1, 40)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("U");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 50, 50));

        jLabel26.setFont(new java.awt.Font("Viner Hand ITC", 1, 40)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("I");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 50, 50));

        jPanel4.setBackground(new java.awt.Color(204, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ID");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 21, -1, -1));

        jTextField11.setBackground(new java.awt.Color(204, 51, 0));
        jTextField11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 21, 120, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Name");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jTextField12.setBackground(new java.awt.Color(204, 51, 0));
        jTextField12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 180, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("UserName");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        jTextField13.setBackground(new java.awt.Color(204, 51, 0));
        jTextField13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(255, 255, 255));
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 140, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Password");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, -1, -1));

        jTextField14.setBackground(new java.awt.Color(204, 51, 0));
        jTextField14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(255, 255, 255));
        jTextField14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField14FocusGained(evt);
            }
        });
        jPanel4.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 210, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Mobile");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 64, -1, -1));

        jTextField15.setBackground(new java.awt.Color(204, 51, 0));
        jTextField15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField15.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 120, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("EMail");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Note 2");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jTextField16.setBackground(new java.awt.Color(204, 51, 0));
        jTextField16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 560, -1));

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 101, -1, -1));

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 101, -1, -1));

        jButton4.setBackground(new java.awt.Color(204, 0, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Insert");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(835, 101, -1, -1));

        jTextField17.setBackground(new java.awt.Color(204, 51, 0));
        jTextField17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField17.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 61, 120, -1));

        jTextField18.setBackground(new java.awt.Color(204, 51, 0));
        jTextField18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField18.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 490, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Note 1");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        dispose();
        jButton3.setVisible(true);
        jButton4.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    // Setter method for observer
    public void setObserver(FormInterface observer) {
        this.observer = observer;
    }
    
    private void notifyObserver() {
        if (observer != null) {
            observer.updatePassword();
        }
    }
    
    private void prepareNextEntry(){     
               
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
        jTextField17.setText("");
        jTextField15.setText("");
        jTextField18.setText("");
        jTextField16.setText("");
        jButton2.requestFocusInWindow();
    }
    
    
    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField14FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField14FocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField14FocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        prepareNextEntry();
        jButton3.setVisible(false);
        jButton4.setVisible(true);
        jTextField12.requestFocusInWindow();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:  
        String websiteName = jTextField12.getText();
        String userName = jTextField13.getText();
        String password = jTextField14.getText();
        String linkedEmail = jTextField15.getText();
        String linkedMobile = jTextField17.getText();
        String note1 = jTextField18.getText();
        String note2 = jTextField16.getText();
        
        int websiteID = Integer.parseInt(jTextField11.getText());
                        
        try
        { 
            //String query= "UPDATE tblWebsiteMain SET WebsiteName = '"+websiteName+"', UserName = '"+userName+"'," +
                       // " Password = '"+password+"', LinkedEMail = '"+linkedEmail+"', LinkedMobile = '"+linkedMobile+"', Note1 = '"+note1+"', Note2 = '"+note2+"' WHERE WebsiteID = '"+websiteID+"' ";
        
            String query= "UPDATE tblWebsiteMain SET WebsiteName = ?, UserName = ?," +
                        " Password = ?, LinkedEMail = ?, LinkedMobile = ?, Note1 = ?, Note2 = ? WHERE WebsiteID = ? ";
            
        paramInsertUpdateDelete.setData(query, "Data Updated Successfully", websiteName, userName, password, linkedEmail, linkedMobile, note1, note2, websiteID);   
                
        observer.updatePassword();
        jTextField12.requestFocusInWindow();            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String websiteName = jTextField12.getText(); 
        String userName = jTextField13.getText();    
        String password = jTextField14.getText(); 
        String linkedEmail = jTextField15.getText(); 
        String linkedMobile = jTextField17.getText();
        String note1 = jTextField18.getText();
        String note2 = jTextField16.getText();       
        

        String query = "INSERT INTO tblWebsiteMain (WebsiteName, UserName, Password, LinkedEMail, LinkedMobile, Note1, Note2) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
                
        paramInsertUpdateDelete.setData(query, "Data inserted successfully", websiteName, userName, password, linkedEmail, linkedMobile, note1, note2);
        observer.updatePassword();
        prepareNextEntry();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        jLabel1.setForeground(thirdColor);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        jLabel1.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel1MouseExited

    public void updateFields(int websiteID, String websiteName, String userName, String password, String linkedEmail, String linkedMobile, String note1, String note2) {
        // Update the fields with the new values
        prepareNextEntry();
        jTextField11.setText(String.valueOf(websiteID));
        jTextField12.setText(websiteName);
        jTextField13.setText(userName);
        jTextField14.setText(password);
        jTextField15.setText(linkedEmail);
        jTextField17.setText(linkedMobile);
        jTextField18.setText(note1);
        jTextField16.setText(note2);
                
    }
    
    public static PasswordInsert getInstance(int websiteID, String websiteName, String userName, String password, String linkedEmail, String linkedMobile, String note1, String note2) {
        if (instance == null) {
            instance = new PasswordInsert(websiteID, websiteName, userName, password, linkedEmail, linkedMobile, note1, note2);
        } else {            
            // If an instance already exists, update its fields with new data
            instance.updateFields(websiteID, websiteName, userName, password, linkedEmail, linkedMobile, note1, note2);
        }
        return instance;
        
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
            java.util.logging.Logger.getLogger(PasswordInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasswordInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasswordInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasswordInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (PasswordInsert.instance != null) {
                PasswordInsert.instance.dispose();
                }
                PasswordInsert.instance = PasswordInsert.getInstance(websiteID, websiteName, userName, password, linkedEmail, linkedMobile, note1, note2);
                PasswordInsert.instance.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    // End of variables declaration//GEN-END:variables
}
