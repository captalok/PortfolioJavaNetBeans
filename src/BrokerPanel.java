
import java.awt.Color;
import java.sql.ResultSet;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import project.ColorGenerator;
import project.Select;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author alk_6
 */
public class BrokerPanel extends javax.swing.JFrame {

    /**
     * Creates new form BrokerPanel
     */
    private Color primaryColor = ColorGenerator.generateRandomPrimaryColor();
    private Color secondaryColor = ColorGenerator.generateSecondaryColor(primaryColor);
    private Color thirdColor = ColorGenerator.generateThirdColor(secondaryColor);
    
    
    public BrokerPanel() {
        initComponents();
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);        
        setAlwaysOnTop(true);
        getPhonePe();
        getPayTM();
        getZerodha();
        getGroww();
        getUpstox();
        getDhan();
        getTotal();
        
        jPanel1.setBackground(primaryColor);
        jPanel2.setBackground(secondaryColor);
        jTextField12.setBackground(thirdColor);
        jTextField13.setBackground(thirdColor);
        jTextField14.setBackground(thirdColor);
        jTextField15.setBackground(thirdColor);
        jTextField16.setBackground(thirdColor);
        jTextField17.setBackground(thirdColor);
        jTextField18.setBackground(thirdColor);
        jTextField18.setForeground(primaryColor);
    }

    private void getPhonePe(){
        String query = ("SELECT DematAccount FROM broker_value WHERE BrokerName= 'PhonePe'");
        ResultSet rs = Select.getData(query);
        
        try {
            while (rs.next()) {
            String demat = rs.getString("DematAccount");
            double numDemat = Double.parseDouble(demat);
            NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
            String formattedCurrency = indianCurrencyFormat.format(numDemat);
            jTextField12.setText(formattedCurrency);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void getPayTM(){
        String query = ("SELECT DematAccount FROM broker_value WHERE BrokerName= 'PayTM'");
        ResultSet rs = Select.getData(query);
        
        try {
            while (rs.next()) {
            String demat = rs.getString("DematAccount");
            double numDemat = Double.parseDouble(demat);
            NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
            String formattedCurrency = indianCurrencyFormat.format(numDemat);
            jTextField13.setText(formattedCurrency);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void getZerodha(){
        String query = ("SELECT DematAccount FROM broker_value WHERE BrokerName= 'Zerodha'");
        ResultSet rs = Select.getData(query);
        
        try {
            while (rs.next()) {
            String demat = rs.getString("DematAccount");
            double numDemat = Double.parseDouble(demat);
            NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
            String formattedCurrency = indianCurrencyFormat.format(numDemat);
            jTextField14.setText(formattedCurrency);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void getGroww(){
        String query = ("SELECT DematAccount FROM broker_value WHERE BrokerName= 'Groww'");
        ResultSet rs = Select.getData(query);
        
        try {
            while (rs.next()) {
            String demat = rs.getString("DematAccount");
            double numDemat = Double.parseDouble(demat);
            NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
            String formattedCurrency = indianCurrencyFormat.format(numDemat);
            jTextField15.setText(formattedCurrency);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void getUpstox() {
    String query = "SELECT DematAccount FROM broker_value WHERE BrokerName= 'Upstox'";
    ResultSet rs = Select.getData(query);
    
    try {
        if (rs.next()) {  // If a result is fetched
            String demat = rs.getString("DematAccount");
            double numDemat = Double.parseDouble(demat);
            NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
            String formattedCurrency = indianCurrencyFormat.format(numDemat);
            jTextField16.setText(formattedCurrency);
        } else {  // If no result is fetched
            double defaultValue = 0.0;
            NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
            String formattedCurrency = indianCurrencyFormat.format(defaultValue);
            jTextField16.setText(formattedCurrency);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}

    
    private void getDhan(){
        String query = ("SELECT DematAccount FROM broker_value WHERE BrokerName= 'Dhan'");
        ResultSet rs = Select.getData(query);
        
        try {
            while (rs.next()) {
            String demat = rs.getString("DematAccount");
            double numDemat = Double.parseDouble(demat);
            NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
            String formattedCurrency = indianCurrencyFormat.format(numDemat);
            jTextField17.setText(formattedCurrency);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void getTotal(){
        String query = ("SELECT DematAccount FROM broker_value WHERE BrokerName= 'Total'");
        ResultSet rs = Select.getData(query);
        
        try {
            while (rs.next()) {
            String demat = rs.getString("DematAccount");
            double numDemat = Double.parseDouble(demat);
            NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
            String formattedCurrency = indianCurrencyFormat.format(numDemat);
            jTextField18.setText(formattedCurrency);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
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
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 200));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Staff_50px_1.png"))); // NOI18N
        jLabel12.setText("Broker Panel");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 240, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 340));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("PhonePe");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(204, 51, 0));
        jTextField12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(255, 255, 255));
        jTextField12.setFocusable(false);
        jPanel2.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 170, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Broker State");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("PayTM");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jTextField13.setEditable(false);
        jTextField13.setBackground(new java.awt.Color(204, 51, 0));
        jTextField13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(255, 255, 255));
        jTextField13.setFocusable(false);
        jPanel2.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 170, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Zerodha");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(204, 51, 0));
        jTextField14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(255, 255, 255));
        jTextField14.setFocusable(false);
        jPanel2.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 170, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Groww");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jTextField15.setEditable(false);
        jTextField15.setBackground(new java.awt.Color(204, 51, 0));
        jTextField15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField15.setForeground(new java.awt.Color(255, 255, 255));
        jTextField15.setFocusable(false);
        jPanel2.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 170, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Upstox");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jTextField16.setEditable(false);
        jTextField16.setBackground(new java.awt.Color(204, 51, 0));
        jTextField16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(255, 255, 255));
        jTextField16.setFocusable(false);
        jPanel2.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 170, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Dhan");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jTextField17.setEditable(false);
        jTextField17.setBackground(new java.awt.Color(204, 51, 0));
        jTextField17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField17.setForeground(new java.awt.Color(255, 255, 255));
        jTextField17.setFocusable(false);
        jPanel2.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 170, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Total");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jTextField18.setEditable(false);
        jTextField18.setBackground(new java.awt.Color(204, 51, 0));
        jTextField18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField18.setForeground(new java.awt.Color(0, 153, 0));
        jTextField18.setFocusable(false);
        jPanel2.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 170, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 264, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked

    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        jLabel2.setForeground(thirdColor);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        jLabel2.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel2MouseExited

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
            java.util.logging.Logger.getLogger(BrokerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BrokerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BrokerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BrokerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BrokerPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    // End of variables declaration//GEN-END:variables
}
