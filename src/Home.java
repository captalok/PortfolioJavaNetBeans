
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import project.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author alk_6
 */
public class Home extends javax.swing.JFrame implements FormInterface{
    private CardLayout cardLayout;
    private final MyObserver observer = new MyObserver(); // Keep a reference to the observer instance
    private TradeInsert tradeInsertInstance;
    private DoubleEntryInsert doubleEntryInsertInstance;
    private CalendarInsert calendarInsertInstance;
    private PasswordInsert passwordInsertInstance;
    private DocumentInsert documentInsertInstance;
    private TaskInsert taskInsertInstance;
    
    private Color primaryColor = ColorGenerator.generateRandomPrimaryColor();
    private Color secondaryColor = ColorGenerator.generateSecondaryColor(primaryColor);
    private Color thirdColor = ColorGenerator.generateThirdColor(secondaryColor);
    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        Container c = this.getContentPane();
        Color clr=new Color(255,255,255);
        c.setBackground(clr);        
        //showTradeInTable();
        jTabbedPane1.setSelectedIndex(7);
        openDocumentPath();
        
        jTextField1.setVisible(false);
        jTextField7.setVisible(false);
        jTextField8.setVisible(false);
        jTextField9.setVisible(false);
        jTextField10.setVisible(false);
        jButton2.requestFocusInWindow();
        
        ButtonActivator.makeButtonDefaultOnEnter(jButton1);
        ButtonActivator.makeButtonDefaultOnEnter(jButton2);
        ButtonActivator.makeButtonDefaultOnEnter(jButton3);
        ButtonActivator.makeButtonDefaultOnEnter(jButton4);
        ButtonActivator.makeButtonDefaultOnEnter(jButton5);
        ButtonActivator.makeButtonDefaultOnEnter(jButton6);
        ButtonActivator.makeButtonDefaultOnEnter(jButton7);
        ButtonActivator.makeButtonDefaultOnEnter(jButton8);
        ButtonActivator.makeButtonDefaultOnEnter(jButton9);
        ButtonActivator.makeButtonDefaultOnEnter(jButton10);
        ButtonActivator.makeButtonDefaultOnEnter(jButton11);
        ButtonActivator.makeButtonDefaultOnEnter(jButton12);
        
        jButton2.setNextFocusableComponent(jButton3);
        jButton3.setNextFocusableComponent(jButton4);
        jButton4.setNextFocusableComponent(jButton5);
        jButton5.setNextFocusableComponent(jButton6);
        jButton6.setNextFocusableComponent(jButton7);
        jButton7.setNextFocusableComponent(jButton8);
        jButton8.setNextFocusableComponent(jButton1);
        jButton1.setNextFocusableComponent(jButton2);
        
        jTabbedPane1.setBackground(thirdColor);
        jPanel3.setBackground(primaryColor);
        jPanel25.setBackground(secondaryColor);
        jPanel1.setBackground(thirdColor);
        jPanel7.setBackground(thirdColor);
        jPanel9.setBackground(thirdColor);
        jPanel61.setBackground(thirdColor);
        jPanel11.setBackground(thirdColor);
        jPanel13.setBackground(thirdColor);
        jPanel15.setBackground(thirdColor);
        jPanel17.setBackground(thirdColor);
        jPanel5.setBackground(thirdColor);
        jPanel33.setBackground(thirdColor);
        jPanel19.setBackground(thirdColor);
        jPanel20.setBackground(thirdColor);
        jPanel22.setBackground(thirdColor);
        jPanel31.setBackground(thirdColor);
        jPanel37.setBackground(thirdColor);
        jPanel43.setBackground(thirdColor);
        jPanel44.setBackground(thirdColor);
        jPanel45.setBackground(thirdColor);
        jPanel24.setBackground(thirdColor);
        jPanel21.setBackground(secondaryColor);
        
        
        jPanel26.setBackground(secondaryColor);
        jPanel32.setBackground(secondaryColor);
        jPanel38.setBackground(secondaryColor);
        jPanel46.setBackground(secondaryColor);
        jPanel51.setBackground(secondaryColor);
        jPanel56.setBackground(secondaryColor);        
        jTextField2.setBackground(thirdColor);
        jTextField3.setBackground(thirdColor);
        jTextField4.setBackground(thirdColor);
        jTextField5.setBackground(thirdColor);
        jTextField6.setBackground(thirdColor);
        jPanel54.setBackground(thirdColor);
        
        jTable1.setShowGrid(true);
        jTable1.setGridColor(primaryColor);
        jTable1.setForeground(thirdColor);        
        jTable2.setShowGrid(true);
        jTable2.setGridColor(primaryColor);
        jTable2.setForeground(thirdColor);        
        jTable3.setShowGrid(true);
        jTable3.setGridColor(primaryColor);
        jTable3.setForeground(thirdColor);        
        jTable4.setShowGrid(true);
        jTable4.setGridColor(primaryColor);
        jTable4.setForeground(thirdColor);        
        jTable5.setShowGrid(true);
        jTable5.setGridColor(primaryColor);
        jTable5.setForeground(thirdColor);        
        jTable6.setShowGrid(true);
        jTable6.setGridColor(primaryColor);
        jTable6.setForeground(thirdColor);        
        jTable7.setShowGrid(true);
        jTable7.setGridColor(primaryColor);
        jTable7.setForeground(thirdColor);        
        jButton1.setBackground(thirdColor);
        jButton1.setForeground(Color.WHITE);        
        jButton2.setBackground(thirdColor);
        jButton2.setForeground(Color.WHITE);        
        jButton3.setBackground(thirdColor);
        jButton3.setForeground(Color.WHITE);        
        jButton4.setBackground(thirdColor);
        jButton4.setForeground(Color.WHITE);        
        jButton5.setBackground(thirdColor);
        jButton5.setForeground(Color.WHITE);        
        jButton6.setBackground(thirdColor);
        jButton6.setForeground(Color.WHITE);        
        jButton7.setBackground(thirdColor);
        jButton7.setForeground(Color.WHITE);        
        jButton8.setBackground(thirdColor);
        jButton8.setForeground(Color.WHITE);
        jButton9.setBackground(thirdColor);
        jButton9.setForeground(Color.WHITE);
        jButton10.setBackground(thirdColor);
        jButton10.setForeground(Color.WHITE);
        jButton11.setBackground(thirdColor);
        jButton11.setForeground(Color.WHITE);
        jButton12.setBackground(thirdColor);
        jButton12.setForeground(Color.WHITE);
        jButton13.setBackground(thirdColor);
        jButton13.setForeground(Color.WHITE);
        jButton14.setBackground(thirdColor);
        jButton14.setForeground(Color.WHITE);
        jButton15.setBackground(thirdColor);
        jButton15.setForeground(Color.WHITE);
        jButton16.setBackground(thirdColor);
        jButton16.setForeground(Color.WHITE);
        jButton17.setBackground(thirdColor);
        jButton17.setForeground(Color.WHITE);
        jButton18.setBackground(thirdColor);
        jButton18.setForeground(Color.WHITE);
        jButton19.setBackground(thirdColor);
        jButton19.setForeground(Color.WHITE);
        jButton20.setBackground(thirdColor);
        jButton20.setForeground(Color.WHITE);
        jButton21.setBackground(thirdColor);
        jButton21.setForeground(Color.WHITE);
        jButton22.setBackground(thirdColor);
        jButton22.setForeground(Color.WHITE);
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
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel25 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jButton22 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jPanel61 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jPanel62 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel43 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanel44 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jPanel55 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jPanel45 = new javax.swing.JPanel();
        jPanel56 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jPanel21 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(242, 16, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Viner Hand ITC", 1, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("H");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ome");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 80, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 95, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 53, 95, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 90, 3));

        jPanel5.setBackground(new java.awt.Color(242, 16, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home_24px.png"))); // NOI18N
        jLabel8.setText("       Home");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 6, 170, 40));

        jPanel6.setBackground(new java.awt.Color(242, 16, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bell_26px.png"))); // NOI18N
        jLabel9.setText("    Trading");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 6, 190, 40));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 210, 50));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 210, 50));

        jPanel7.setBackground(new java.awt.Color(242, 16, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Money_Bag_50px.png"))); // NOI18N
        jLabel10.setText("    Trade Form");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 6, 190, 40));

        jPanel8.setBackground(new java.awt.Color(242, 16, 0));
        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bell_26px.png"))); // NOI18N
        jLabel11.setText("    Trading");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 6, 190, 40));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 210, 50));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 210, 50));

        jPanel9.setBackground(new java.awt.Color(242, 16, 0));
        jPanel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Staff_50px_1.png"))); // NOI18N
        jLabel12.setText("    Double Entry");
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
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 6, 180, 40));

        jPanel10.setBackground(new java.awt.Color(242, 16, 0));
        jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bell_26px.png"))); // NOI18N
        jLabel13.setText("    Trading");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });
        jPanel10.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 6, 190, 40));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 210, 50));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 210, 50));

        jPanel11.setBackground(new java.awt.Color(242, 16, 0));
        jPanel11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bell_26px.png"))); // NOI18N
        jLabel14.setText("    Calendar");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });
        jPanel11.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 6, 190, 40));

        jPanel12.setBackground(new java.awt.Color(242, 16, 0));
        jPanel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bell_26px.png"))); // NOI18N
        jLabel15.setText("    Trading");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
        });
        jPanel12.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 6, 190, 40));

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 210, 50));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 210, 50));

        jPanel13.setBackground(new java.awt.Color(242, 16, 0));
        jPanel13.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/male_user_50px.png"))); // NOI18N
        jLabel16.setText("    Password");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
        });
        jPanel13.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 6, 180, 40));

        jPanel14.setBackground(new java.awt.Color(242, 16, 0));
        jPanel14.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bell_26px.png"))); // NOI18N
        jLabel17.setText("    Trading");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel17MouseExited(evt);
            }
        });
        jPanel14.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 6, 190, 40));

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 210, 50));

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 210, 50));

        jPanel15.setBackground(new java.awt.Color(242, 16, 0));
        jPanel15.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Course_52px.png"))); // NOI18N
        jLabel18.setText("    Document");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel18MouseExited(evt);
            }
        });
        jPanel15.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 6, 190, 40));

        jPanel16.setBackground(new java.awt.Color(242, 16, 0));
        jPanel16.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bell_26px.png"))); // NOI18N
        jLabel19.setText("    Trading");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel19MouseExited(evt);
            }
        });
        jPanel16.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 6, 190, 40));

        jPanel15.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 210, 50));

        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 210, 50));

        jPanel17.setBackground(new java.awt.Color(242, 16, 0));
        jPanel17.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_menu_48px_1.png"))); // NOI18N
        jLabel20.setText("    Tasks");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel20MouseExited(evt);
            }
        });
        jPanel17.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 6, 150, 40));

        jPanel18.setBackground(new java.awt.Color(242, 16, 0));
        jPanel18.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bell_26px.png"))); // NOI18N
        jLabel21.setText("    Trading");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel21MouseExited(evt);
            }
        });
        jPanel18.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 6, 190, 40));

        jPanel17.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 210, 50));

        jPanel1.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 210, 50));

        jPanel22.setBackground(new java.awt.Color(242, 16, 0));
        jPanel22.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_User_50px.png"))); // NOI18N
        jLabel22.setText("    Reports");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel22MouseExited(evt);
            }
        });
        jPanel22.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 6, 170, 40));

        jPanel23.setBackground(new java.awt.Color(242, 16, 0));
        jPanel23.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bell_26px.png"))); // NOI18N
        jLabel23.setText("    Trading");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel23MouseExited(evt);
            }
        });
        jPanel23.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 6, 190, 40));

        jPanel22.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 210, 50));

        jPanel1.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 210, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 560));

        jPanel3.setBackground(new java.awt.Color(235, 64, 52));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("y");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 30, -1));

        jLabel3.setFont(new java.awt.Font("Viner Hand ITC", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("M");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ortfolio");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 80, -1));

        jLabel7.setFont(new java.awt.Font("Viner Hand ITC", 1, 40)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("P");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 50, 50));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("_");
        jLabel25.setToolTipText("");
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel25MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel25MouseExited(evt);
            }
        });
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 20, -1));

        jTextField8.setText("D:\\AccessDocs\\276_MyBudgetPlanning Excel.xlsm");
        jTextField8.setEnabled(false);
        jTextField8.setFocusable(false);
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jTextField9.setText("D:\\AccessDocs\\256_Accounting Fin Ledger Excel.xlsm");
        jTextField9.setEnabled(false);
        jTextField9.setFocusable(false);
        jPanel3.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        jTextField10.setText("D:\\AccessDocs\\_PickAndDropMoneyManager.xlsm");
        jTextField10.setEnabled(false);
        jTextField10.setFocusable(false);
        jPanel3.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 930, 60));

        jTabbedPane1.setBackground(new java.awt.Color(242, 16, 0));
        jTabbedPane1.setEnabled(false);
        jTabbedPane1.setFocusable(false);

        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setSelectionBackground(new java.awt.Color(0, 204, 51));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel19.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 65, 914, 430));

        jPanel25.setBackground(new java.awt.Color(204, 0, 0));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel57.setFont(new java.awt.Font("Viner Hand ITC", 1, 40)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("T");
        jPanel25.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        jLabel58.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("rading");
        jPanel25.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 80, -1));

        jPanel33.setBackground(new java.awt.Color(242, 16, 0));
        jPanel33.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/account_24px.png"))); // NOI18N
        jLabel32.setText("Calculator");
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel32MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel32MouseExited(evt);
            }
        });
        jPanel33.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 20));

        jPanel34.setBackground(new java.awt.Color(242, 16, 0));
        jPanel34.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add_user_group_woman_man_24px.png"))); // NOI18N
        jLabel33.setText("    Insert");
        jPanel34.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 20));

        jPanel33.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 130, 40));

        jPanel25.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 130, 40));

        jButton9.setText("Open Access");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jPanel25.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jButton10.setText("Open Excel");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        jPanel25.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jTextField7.setText("D:\\PortfolioMySQL\\PortfolioMySQL.accdb");
        jTextField7.setEnabled(false);
        jTextField7.setFocusable(false);
        jPanel25.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        jTextField1.setText("D:\\AccessDocs\\1_ExcelPortfolio.xlsm");
        jTextField1.setEnabled(false);
        jTextField1.setFocusable(false);
        jPanel25.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        jButton22.setText("Adjust");
        jButton22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton22MouseClicked(evt);
            }
        });
        jPanel25.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        jPanel19.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 60));

        jTabbedPane1.addTab("tab1", jPanel19);

        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel26.setBackground(new java.awt.Color(204, 0, 0));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setBackground(new java.awt.Color(255, 51, 51));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        jPanel26.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 170, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_26px.png"))); // NOI18N
        jPanel26.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        jLabel59.setFont(new java.awt.Font("Viner Hand ITC", 1, 40)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("D");
        jPanel26.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        jLabel60.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("ouble");
        jPanel26.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 80, -1));

        jLabel71.setFont(new java.awt.Font("Viner Hand ITC", 1, 40)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("E");
        jPanel26.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 50, 50));

        jLabel72.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("ntry");
        jPanel26.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 80, -1));

        jPanel61.setBackground(new java.awt.Color(242, 16, 0));
        jPanel61.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel61.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add_user_group_woman_man_24px.png"))); // NOI18N
        jLabel56.setText("Excel");
        jLabel56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel56MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel56MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel56MouseExited(evt);
            }
        });
        jPanel61.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jPanel62.setBackground(new java.awt.Color(242, 16, 0));
        jPanel62.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel62.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel73.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add_user_group_woman_man_24px.png"))); // NOI18N
        jLabel73.setText("    Insert");
        jPanel62.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 20));

        jPanel61.add(jPanel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 130, 40));

        jPanel26.add(jPanel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 90, 40));

        jButton11.setText("Ledger");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jPanel26.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jButton12.setText("Budget");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });
        jPanel26.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jButton14.setText("Clear");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });
        jPanel26.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 60, -1));

        jButton20.setText("MoneyMgr");
        jButton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton20MouseClicked(evt);
            }
        });
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel26.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 90, -1));

        jPanel20.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 60));

        jTable2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable2.setSelectionBackground(new java.awt.Color(0, 204, 51));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel20.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 65, 914, 430));

        jTabbedPane1.addTab("tab2", jPanel20);

        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel32.setBackground(new java.awt.Color(204, 0, 0));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField3.setBackground(new java.awt.Color(255, 51, 51));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });
        jPanel32.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 170, -1));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_26px.png"))); // NOI18N
        jPanel32.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        jLabel61.setFont(new java.awt.Font("Viner Hand ITC", 1, 40)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("C");
        jPanel32.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        jLabel62.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("alendar");
        jPanel32.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 80, -1));

        jButton15.setText("Clear");
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });
        jPanel32.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 60, -1));

        jPanel31.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 60));

        jTable3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable3.setForeground(new java.awt.Color(255, 255, 255));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable3.setSelectionBackground(new java.awt.Color(0, 204, 51));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jPanel31.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 65, 914, 430));

        jTabbedPane1.addTab("tab3", jPanel31);

        jPanel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel38.setBackground(new java.awt.Color(204, 0, 0));
        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField4.setBackground(new java.awt.Color(255, 51, 51));
        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });
        jPanel38.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 170, -1));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_26px.png"))); // NOI18N
        jPanel38.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        jLabel63.setFont(new java.awt.Font("Viner Hand ITC", 1, 40)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("P");
        jPanel38.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        jLabel64.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("assword");
        jPanel38.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 120, -1));

        jButton16.setText("Clear");
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton16MouseClicked(evt);
            }
        });
        jPanel38.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 60, -1));

        jPanel37.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 60));

        jTable4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable4.setForeground(new java.awt.Color(255, 255, 255));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable4.setSelectionBackground(new java.awt.Color(0, 204, 51));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jPanel37.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 65, 914, 430));

        jTabbedPane1.addTab("tab4", jPanel37);

        jPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel46.setBackground(new java.awt.Color(204, 0, 0));
        jPanel46.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField5.setBackground(new java.awt.Color(255, 51, 51));
        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });
        jPanel46.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 170, -1));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_26px.png"))); // NOI18N
        jPanel46.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        jLabel65.setFont(new java.awt.Font("Viner Hand ITC", 1, 40)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("D");
        jPanel46.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        jLabel66.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("ocument");
        jPanel46.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, -1));

        jButton17.setText("Clear");
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton17MouseClicked(evt);
            }
        });
        jPanel46.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 60, -1));

        jPanel43.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 60));

        jTable5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable5.setForeground(new java.awt.Color(255, 255, 255));
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable5.setSelectionBackground(new java.awt.Color(0, 204, 51));
        jTable5.setShowVerticalLines(true);
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable5);

        jPanel43.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 65, 914, 430));

        jTabbedPane1.addTab("tab5", jPanel43);

        jPanel44.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel51.setBackground(new java.awt.Color(204, 0, 0));
        jPanel51.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel54.setBackground(new java.awt.Color(242, 16, 0));
        jPanel54.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel54MouseClicked(evt);
            }
        });
        jPanel54.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home_24px.png"))); // NOI18N
        jLabel49.setText("Active Task");
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel49MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel49MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel49MouseExited(evt);
            }
        });
        jPanel54.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 20));

        jPanel55.setBackground(new java.awt.Color(242, 16, 0));
        jPanel55.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel55.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add_user_group_woman_man_24px.png"))); // NOI18N
        jLabel50.setText("    Insert");
        jPanel55.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 20));

        jPanel54.add(jPanel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 130, 40));

        jPanel51.add(jPanel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 130, 40));

        jTextField6.setBackground(new java.awt.Color(255, 51, 51));
        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
        });
        jPanel51.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 170, -1));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_26px.png"))); // NOI18N
        jPanel51.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        jLabel67.setFont(new java.awt.Font("Viner Hand ITC", 1, 40)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("T");
        jPanel51.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        jLabel68.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("asks");
        jPanel51.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 80, -1));

        jButton18.setText("Clear");
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton18MouseClicked(evt);
            }
        });
        jPanel51.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 60, -1));

        jPanel44.add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 60));

        jTable6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable6.setForeground(new java.awt.Color(255, 255, 255));
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable6.setSelectionBackground(new java.awt.Color(0, 204, 51));
        jTable6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable6MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable6);

        jPanel44.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 65, 914, 430));

        jTabbedPane1.addTab("tab6", jPanel44);

        jPanel45.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel56.setBackground(new java.awt.Color(204, 0, 0));
        jPanel56.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel69.setFont(new java.awt.Font("Viner Hand ITC", 1, 40)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("R");
        jPanel56.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        jLabel70.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("eports");
        jPanel56.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 80, -1));

        jButton1.setText("Liability");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel56.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, -1, -1));

        jButton2.setText("Daily");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel56.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 60, -1));

        jButton3.setText("Monthly");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel56.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jButton4.setText("Demat");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel56.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 70, -1));

        jButton5.setText("Expense");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel56.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        jButton6.setText("Bank");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel56.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));

        jButton7.setText("Cash");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel56.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, -1));

        jButton8.setText("Bank_Cash");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel56.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, -1));

        jButton21.setText("Yearly");
        jButton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton21MouseClicked(evt);
            }
        });
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel56.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jPanel45.add(jPanel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 60));

        jTable7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable7.setForeground(new java.awt.Color(255, 255, 255));
        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable7.setSelectionBackground(new java.awt.Color(0, 204, 51));
        jScrollPane7.setViewportView(jTable7);

        jPanel45.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 65, 914, 430));

        jTabbedPane1.addTab("tab7", jPanel45);

        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view book gif1.gif"))); // NOI18N
        jPanel24.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, 300));

        jButton13.setText("Calendar App");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });
        jPanel24.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jButton19.setText("Broker Panel");
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton19MouseClicked(evt);
            }
        });
        jPanel24.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, 924, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab8", jPanel21);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 930, 540));

        setSize(new java.awt.Dimension(1143, 563));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void updateTrade() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clear existing rows
        showTradeInTable(); // Load updated data in table
        //setColumnWidth();
        //prepareNextEntry();
    }    
    
    @Override
    public void updateDoubleEntry() {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0); // Clear existing rows
        showDoubleEntryInTable(); // Load updated data in table
        setColumnWidthDoubleEntry();
        //prepareNextEntry();
    } 
    
    @Override
    public void updateCalendar() {
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        model.setRowCount(0); // Clear existing rows
        showCalendarInTable(); // Load updated data in table
        setColumnWidthCalendar();
        //prepareNextEntry();
    } 
    
    @Override
    public void updatePassword() {
        DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
        model.setRowCount(0); // Clear existing rows
        showPasswordInTable(); // Load updated data in table
        setColumnWidthPassword();
        //prepareNextEntry();
    } 
    
    @Override
    public void updateDocument() {
        DefaultTableModel model = (DefaultTableModel) jTable5.getModel();
        model.setRowCount(0); // Clear existing rows
        showDocumentInTable(); // Load updated data in table
        setColumnWidthDocument();
        //prepareNextEntry();
    } 
    
    @Override
    public void updateTask() {
        DefaultTableModel model = (DefaultTableModel) jTable6.getModel();
        model.setRowCount(0); // Clear existing rows
        showTaskInTable(); // Load updated data in table
        setColumnWidthTask();
        //prepareNextEntry();
    } 
    
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    // Method to dispose of all other frames except for the current one
    private void disposeAllOtherFrames() {
        for (java.awt.Window window : java.awt.Window.getWindows()) {
            if (window instanceof JFrame && window != this) {
                window.dispose();
            }
        }
    }

    private void openDocumentPath(){
        // Add action listener to btnOpen
        jButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the file path from jTextField1
                String filePath = jTextField1.getText();
                
                // Check if the file path is not empty
                if (!filePath.isEmpty()) {
                    try {
                        // Open the file using the default associated application
                        Desktop.getDesktop().open(new File(filePath));
                    } catch (IOException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "File path is empty", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        // Add action listener to btnOpen
        jButton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the file path from jTextField1
                String filePath = jTextField7.getText();
                
                // Check if the file path is not empty
                if (!filePath.isEmpty()) {
                    try {
                        // Open the file using the default associated application
                        Desktop.getDesktop().open(new File(filePath));
                    } catch (IOException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "File path is empty", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        // Add action listener to btnOpen
        jButton12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the file path from jTextField1
                String filePath = jTextField8.getText();
                
                // Check if the file path is not empty
                if (!filePath.isEmpty()) {
                    try {
                        // Open the file using the default associated application
                        Desktop.getDesktop().open(new File(filePath));
                    } catch (IOException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "File path is empty", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        // Add action listener to btnOpen
        jButton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the file path from jTextField1
                String filePath = jTextField9.getText();
                
                // Check if the file path is not empty
                if (!filePath.isEmpty()) {
                    try {
                        // Open the file using the default associated application
                        Desktop.getDesktop().open(new File(filePath));
                    } catch (IOException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "File path is empty", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        // Add action listener to btnOpen
        jButton20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the file path from jTextField1
                String filePath = jTextField10.getText();
                
                // Check if the file path is not empty
                if (!filePath.isEmpty()) {
                    try {
                        // Open the file using the default associated application
                        Desktop.getDesktop().open(new File(filePath));
                    } catch (IOException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "File path is empty", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
       
    // Custom cell renderer to color alternate rows
    private class AlternateRowColorRenderer extends DefaultTableCellRenderer {
        //private Color lightPink = new Color(255, 192, 203);        

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            // Set background color
            if (isSelected) {
                component.setBackground(table.getSelectionBackground());
                component.setForeground(Color.BLACK); // Set foreground color to black when selected
            } else if (row % 2 == 0) {
                component.setBackground(Color.WHITE);
                //component.setForeground(Color.BLACK);
                component.setForeground(thirdColor);
            } else {
                //component.setBackground(thirdColor);
                component.setBackground(Color.WHITE);
                component.setForeground(thirdColor);
            }
            // Set font style to bold
            Font font = component.getFont();
            component.setFont(font.deriveFont(Font.BOLD));

            return component;
        }
    }
    
    private void showTradeInTable() {
        String query = ("SELECT tradelinet.TradeLineID, tradelinet.TradeID, tradet.BuyDate, tradetypet.TradeType, tradelinet.BuyQty, tradelinet.BuyPrice, tradelinet.SellPrice, tradelinet.Brokerage," +
                "tradelinet.DepositWithdrawal, (SellPrice * BuyQty)-(BuyPrice * BuyQty) - Brokerage AS GrossProfit, SellPrice - BuyPrice AS Pips, tradelinet.SellDate, tradelinet.Note FROM tradelinet INNER JOIN tradet ON tradelinet.TradeID = tradet.TradeID JOIN brokert ON tradelinet.BrokerID = brokert.BrokerID " +
                "JOIN tradetypet ON tradelinet.TradeTypeID = tradetypet.TradeTypeID JOIN scripnamet ON tradelinet.ScripID = scripnamet.ScripID ORDER BY tradelinet.TradeID DESC");
        ResultSet rs = Select.getData(query);
        DefaultTableModel model = new DefaultTableModel();
        jTable1.setModel(model);
        //jTable1.setDefaultRenderer(Object.class,new AlternateRowColorRenderer());

        // Adding columns to the table model
        model.addColumn("Trade Line ID");
        model.addColumn("Trade ID");
        model.addColumn("Buy Date");
        model.addColumn("Buy Qty");
        model.addColumn("Buy Price");
        model.addColumn("Sell Price");        
        model.addColumn("Brokerage");
        model.addColumn("Deposit");
        model.addColumn("Gross Profit");
        model.addColumn("Pips");        
        model.addColumn("Note");
        
        NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN")); 

        try {
            // Adding data to the table model
            while (rs.next()) {
                Object[] row = {
                    rs.getString("TradeLineID"),
                    rs.getString("TradeID"),
                    rs.getString("BuyDate"),
                    rs.getString("BuyQty"),
                    indianCurrencyFormat.format(rs.getDouble("BuyPrice")),
                    indianCurrencyFormat.format(rs.getDouble("SellPrice")),
                    indianCurrencyFormat.format(rs.getDouble("Brokerage")),
                    indianCurrencyFormat.format(rs.getDouble("DepositWithdrawal")),
                    indianCurrencyFormat.format(rs.getDouble("GrossProfit")),
                    rs.getString("Pips"),                    
                    rs.getString("Note")
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        jTable1.getColumnModel().getColumn(4).setCellRenderer(new PositiveNegativeCellRenderer(4));
        jTable1.getColumnModel().getColumn(7).setCellRenderer(new PositiveNegativeCellRenderer(7));
        jTable1.getColumnModel().getColumn(8).setCellRenderer(new PositiveNegativeCellRenderer(8));
        jTable1.getColumnModel().getColumn(9).setCellRenderer(new PositiveNegativeCellRenderer(9));
        
        jTable1.getColumnModel().getColumn(5).setCellRenderer(new PositiveValueCellRenderer(5));
        setColumnWidthTrades();
    }  
    
    private void showDoubleEntryInTable() {
        String searchTerm = jTextField2.getText().trim();
        
        String query = "SELECT VoucherLineT.VoucherLineID, VoucherT.VoucherID, VoucherT.VoucherDate, VoucherTypeT.VoucherType, " +
        "AccountDetailT.AccountName, AccountTypeT.AccountType, VoucherLineT.DebitAmount, VoucherLineT.CreditAmount," +
        "VoucherLineT.Narration, VoucherLineT.Notes, VoucherLineT.IsExported FROM VoucherLineT INNER JOIN VoucherT ON VoucherLineT.fVoucherID = VoucherT.VoucherID JOIN " +
        "VoucherTypeT ON VoucherT.fVoucherType = VoucherTypeT.VoucherTypeID JOIN AccountDetailT ON VoucherLineT.fAccountDetail = AccountDetailT.AccountDetailID JOIN " +
        "AccountTypeT ON VoucherlineT.fAccountType = AccountTypeT.AccountTypeID " +
        " WHERE VoucherLineID LIKE CONCAT('%', '" + searchTerm + "', '%')" +
        " OR VoucherID LIKE CONCAT('%', '" + searchTerm + "', '%')" +                
        " OR VoucherType LIKE CONCAT ('%', '" + searchTerm + "', '%')" +
        " OR AccountName LIKE CONCAT ('%', '" + searchTerm + "', '%')" +
        " OR AccountType LIKE CONCAT ('%', '" + searchTerm + "', '%')" +
        " OR DebitAmount LIKE CONCAT ('%', '" + searchTerm + "', '%')" +
        " OR CreditAmount LIKE CONCAT ('%', '" + searchTerm + "', '%')" +
        " OR Narration LIKE CONCAT ('%', '" + searchTerm + "', '%')" +
        " OR Notes LIKE CONCAT ('%', '" + searchTerm + "', '%')" +
        " OR '" + searchTerm + "' = ''" +                
        " ORDER BY VoucherT.VoucherID DESC, VoucherT.VoucherDate";
        
        
        ResultSet rs = Select.getData(query);
        DefaultTableModel model = new DefaultTableModel();
        jTable2.setModel(model);
        //jTable2.setDefaultRenderer(Object.class,new AlternateRowColorRenderer());

        // Adding columns to the table model
        model.addColumn("VrLineID");
        model.addColumn("Vr ID");
        model.addColumn("Vr Date");
        model.addColumn("VrType");
        model.addColumn("Acct Name");
        model.addColumn("Acct Type");        
        model.addColumn("Debit Amt");
        model.addColumn("Credit Amt");
        model.addColumn("Narration");
        model.addColumn("Notes");
        model.addColumn("IsExported");
        
        NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN")); 

        try {
            // Adding data to the table model
            while (rs.next()) {
                Object[] row = {
                    rs.getString("VoucherLineID"),
                    rs.getString("VoucherID"),
                    rs.getString("VoucherDate"),
                    rs.getString("VoucherType"),
                    rs.getString("AccountName"),
                    rs.getString("AccountType"),
                    indianCurrencyFormat.format(rs.getDouble("DebitAmount")),
                    indianCurrencyFormat.format(rs.getDouble("CreditAmount")),
                    rs.getString("Narration"),
                    rs.getString("Notes"),
                    rs.getString("IsExported")
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        jTable2.getColumnModel().getColumn(6).setCellRenderer(new PositiveValueCellRenderer(6));
        jTable2.getColumnModel().getColumn(7).setCellRenderer(new PositiveNegativeCellRenderer(7));
        jTable2.getColumnModel().getColumn(3).setCellRenderer(new TextValueCellRenderer(3));
        setColumnWidthDoubleEntry();
    }  
    
    private void showCalendarInTable() {
        
        String searchTerm = jTextField3.getText().trim();
        
        String query = ("SELECT ApptID, ApptSubject, ApptLocation, ApptStart, ApptEnd, ApptNotes, Priority, TradeID, CheckID" +
                " FROM tblAppointments" +
                " WHERE ApptID LIKE CONCAT('%' , '"+searchTerm+"' , '%')" +
                " OR ApptSubject LIKE CONCAT('%' , '"+searchTerm+"' , '%')" +
                " OR ApptLocation LIKE CONCAT ('%' , '"+searchTerm+"' , '%')" +
                " OR ApptNotes LIKE CONCAT ('%' , '"+searchTerm+"' , '%')" +
                " OR Priority LIKE CONCAT ('%' , '"+searchTerm+"' , '%')" +
                " OR '"+searchTerm+"' = '' " +
                "ORDER BY ApptStart DESC");
        ResultSet rs = Select.getData(query);
        DefaultTableModel model = new DefaultTableModel();
        jTable3.setModel(model);
        //jTable3.setDefaultRenderer(Object.class,new AlternateRowColorRenderer());

        // Adding columns to the table model
        model.addColumn("ApptID");
        model.addColumn("ApptSubject");
        model.addColumn("ApptLocation");
        model.addColumn("ApptStart");
        model.addColumn("ApptEnd");
        model.addColumn("ApptNotes");        
        model.addColumn("Priority");
        model.addColumn("TradeID");
        model.addColumn("CheckID");
        
        try {
            // Adding data to the table model
            while (rs.next()) {
                Object[] row = {
                    rs.getString("ApptID"),
                    rs.getString("ApptSubject"),
                    rs.getString("ApptLocation"),
                    rs.getString("ApptStart"),
                    rs.getString("ApptEnd"),
                    rs.getString("ApptNotes"),
                    rs.getString("Priority"),
                    rs.getString("TradeID"),
                    rs.getString("CheckID")                    
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        jTable3.getColumnModel().getColumn(2).setCellRenderer(new TextValueCellRenderer(2));
        setColumnWidthCalendar();
    }  

    private void showPasswordInTable() {
        
        String searchTerm = jTextField4.getText().trim();
        
        String query = ("SELECT WebsiteID, WebsiteName, UserName, Password, LinkedEMail, LinkedMobile, Note1, Note2 FROM tblWebsiteMain " +
             " WHERE WebsiteID LIKE CONCAT('%' , '"+searchTerm+"' , '%')" +
             " OR WebsiteName LIKE CONCAT('%' , '"+searchTerm+"' , '%')" +
             " OR UserName LIKE CONCAT ('%' , '"+searchTerm+"' , '%')" +
             " OR Password LIKE CONCAT ('%' , '"+searchTerm+"' , '%')" +
             " OR LinkedEMail LIKE CONCAT ('%' , '"+searchTerm+"' , '%')" +
             " OR LinkedMobile LIKE CONCAT ('%' , '"+searchTerm+"' , '%')" +
             " OR Note1 LIKE CONCAT ('%' , '"+searchTerm+"' , '%')" +
             " OR Note2 LIKE CONCAT ('%' , '"+searchTerm+"' , '%')" +
             " OR @SearchTerm = '' " +
             "ORDER BY WebsiteID DESC");
        ResultSet rs = Select.getData(query);
        DefaultTableModel model = new DefaultTableModel();
        jTable4.setModel(model);
        //jTable4.setDefaultRenderer(Object.class,new AlternateRowColorRenderer());

        // Adding columns to the table model
        model.addColumn("WebsiteID");
        model.addColumn("WebsiteName");
        model.addColumn("UserName");
        model.addColumn("Password");
        model.addColumn("LinkedEMail");
        model.addColumn("LinkedMobile");        
        model.addColumn("Note1");
        model.addColumn("Note2");
                
        try {
            // Adding data to the table model
            while (rs.next()) {
                Object[] row = {
                    rs.getString("WebsiteID"),
                    rs.getString("WebsiteName"),
                    rs.getString("UserName"),
                    rs.getString("Password"),
                    rs.getString("LinkedEmail"),
                    rs.getString("LinkedMobile"),
                    rs.getString("Note1"),
                    rs.getString("Note2")                                      
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        setColumnWidthPassword();
    }  
    
    private void showDocumentInTable(){
        String searchTerm = jTextField5.getText().trim();
        
        String query = "SELECT DocID, docusert.DocUserName, DocName, DocPath, DocText FROM DocT JOIN DocUserT ON Doct.DocUserID = DocUserT.DocUserID " +
             " WHERE DocID LIKE CONCAT('%' , '" + searchTerm + "' , '%')" +
             " OR DocUserName LIKE CONCAT('%' , '" + searchTerm + "' , '%')" +
             " OR DocName LIKE CONCAT ('%' , '" + searchTerm + "' , '%')" +
             " OR DocPath LIKE CONCAT ('%' , '" + searchTerm + "' , '%')" +
             " OR DocText LIKE CONCAT ('%' , '" + searchTerm + "' , '%')" +
             " OR '" + searchTerm + "' = '' " +
             " ORDER BY DocID DESC";
        
        
        ResultSet rs = Select.getData(query);
        DefaultTableModel model = new DefaultTableModel();
        jTable5.setModel(model);
        //jTable5.setDefaultRenderer(Object.class,new AlternateRowColorRenderer());

        // Adding columns to the table model
        model.addColumn("DocID");
        model.addColumn("DocName");
        model.addColumn("DocUserName");
        model.addColumn("DocPath");
        model.addColumn("DocText");
        
        try {
            // Adding data to the table model
            while (rs.next()) {
                Object[] row = {
                    rs.getString("DocID"),
                    rs.getString("DocName"),
                    rs.getString("DocUserName"),
                    rs.getString("DocPath"),
                    rs.getString("DocText")                    
                };
                model.addRow(row);
                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        jTable5.getColumnModel().getColumn(2).setCellRenderer(new TextValueCellRenderer(2));
        setColumnWidthDocument();
    }
    
    private void showTaskInTable() {
        String searchTerm = jTextField6.getText().trim();
        
        String query = "SELECT taskt.TaskID, taskt.DateCreated, TaskTypeT.TaskType," +
                "taskt.Description, ImportanceT.Importance, taskt.DateDue, taskt.DateCompleted, " +
                "InchargeT.InchargeName, taskt.Note, taskt.IsActive FROM TaskT INNER JOIN TaskTypeT ON taskt.TaskTypeID = TaskTypeT.TaskTypeID JOIN " +
                "ImportanceT ON TaskT.ImportanceID = ImportanceT.ImportanceID JOIN InchargeT ON TaskT.InchargeID = InchargeT.InchargeID " +
                " WHERE taskt.IsActive = 0 AND taskt.IsActive = 1" +
                " AND TaskID LIKE CONCAT('%', '" + searchTerm + "', '%')" +        
                " OR TaskType LIKE CONCAT('%', '" + searchTerm + "', '%')" +                
                " OR Description LIKE CONCAT ('%', '" + searchTerm + "', '%')" +
                " OR Importance LIKE CONCAT ('%', '" + searchTerm + "', '%')" +
                " OR InchargeName LIKE CONCAT ('%', '" + searchTerm + "', '%')" +
                " OR Note LIKE CONCAT ('%', '" + searchTerm + "', '%')" +        
                " OR '" + searchTerm + "' = ''" +                
                " ORDER BY taskt.IsActive DESC";
        
        
        ResultSet rs = Select.getData(query);
        DefaultTableModel model = new DefaultTableModel();
        jTable6.setModel(model);
        //jTable6.setDefaultRenderer(Object.class,new AlternateRowColorRenderer());

        // Adding columns to the table model
        model.addColumn("TaskID");
        model.addColumn("DateCreated");
        model.addColumn("TaskType");
        model.addColumn("Description");
        model.addColumn("Importance");
        model.addColumn("DateDue");        
        model.addColumn("DateCompleted");
        model.addColumn("InchargeName");
        model.addColumn("Note");        
        model.addColumn("IsActive");

        try {
            // Adding data to the table model
            while (rs.next()) {
                Object[] row = {
                    rs.getString("TaskID"),
                    rs.getString("DateCreated"),
                    rs.getString("TaskType"),
                    rs.getString("Description"),
                    rs.getString("Importance"),
                    rs.getString("DateDue"),
                    rs.getString("DateCompleted"),
                    rs.getString("InchargeName"),
                    rs.getString("Note"),
                    rs.getString("IsActive")                    
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        jTable6.getColumnModel().getColumn(4).setCellRenderer(new TextValueCellRenderer(4));
        setColumnWidthTask();
    }  
    
    private void showActiveTask(){
        String query = "SELECT taskt.TaskID, taskt.DateCreated, TaskTypeT.TaskType," +
                "taskt.Description, ImportanceT.Importance, taskt.DateDue, taskt.DateCompleted, " +
                "InchargeT.InchargeName, taskt.Note, taskt.IsActive FROM TaskT INNER JOIN TaskTypeT ON taskt.TaskTypeID = TaskTypeT.TaskTypeID JOIN " +
                "ImportanceT ON TaskT.ImportanceID = ImportanceT.ImportanceID JOIN InchargeT ON TaskT.InchargeID = InchargeT.InchargeID " +
                " WHERE taskt.IsActive = 1 ORDER BY ImportanceT.ImportanceID ASC ";
        
        ResultSet rs = Select.getData(query);
        DefaultTableModel model = new DefaultTableModel();
        jTable6.setModel(model);

        // Adding columns to the table model
        model.addColumn("TaskID");
        model.addColumn("DateCreated");
        model.addColumn("TaskType");
        model.addColumn("Description");
        model.addColumn("Importance");
        model.addColumn("DateDue");        
        model.addColumn("DateCompleted");
        model.addColumn("InchargeName");
        model.addColumn("Note");        
        model.addColumn("IsActive");

        try {
            // Adding data to the table model
            while (rs.next()) {
                Object[] row = {
                    rs.getString("TaskID"),
                    rs.getString("DateCreated"),
                    rs.getString("TaskType"),
                    rs.getString("Description"),
                    rs.getString("Importance"),
                    rs.getString("DateDue"),
                    rs.getString("DateCompleted"),
                    rs.getString("InchargeName"),
                    rs.getString("Note"),
                    rs.getString("IsActive")                    
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        jTable6.getColumnModel().getColumn(4).setCellRenderer(new TextValueCellRenderer(4));
    }
    
    private void allTradeBindSource(){
                
        String query = ("SELECT TradeID, BuyDate, BuyQty, BuyPrice, SellPrice, Brokerage, GrossProfit, Pips, DepositWithdrawal,percent_profit, Note FROM daily_trades ORDER BY TradeID DESC ");
             
        ResultSet rs = Select.getData(query);
        DefaultTableModel model = new DefaultTableModel();
        jTable7.setModel(model);
        //jTable7.setDefaultRenderer(Object.class,new AlternateRowColorRenderer());

        // Adding columns to the table model
        model.addColumn("TradeID");
        model.addColumn("BuyDate");
        model.addColumn("BuyQty");
        model.addColumn("BuyPrice");
        model.addColumn("SellPrice");
        model.addColumn("Brokerage");        
        model.addColumn("GrossProfit");
        model.addColumn("Pips");
        model.addColumn("DepositWithdrawal");
        model.addColumn("percent_profit");
        model.addColumn("Note");  
        
        // Create NumberFormat for Indian currency format
        NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat percentFormat = NumberFormat.getPercentInstance(Locale.ENGLISH);
        percentFormat.setMinimumFractionDigits(1);
        percentFormat.setMaximumFractionDigits(1);
        
        try {
            // Adding data to the table model
            while (rs.next()) {
                Object[] row = {
                    rs.getString("TradeID"),
                    rs.getString("BuyDate"),
                    rs.getString("BuyQty"),
                    indianCurrencyFormat.format(rs.getDouble("BuyPrice")),                    
                    indianCurrencyFormat.format(rs.getDouble("SellPrice")),
                    indianCurrencyFormat.format(rs.getDouble("Brokerage")),
                    indianCurrencyFormat.format(rs.getDouble("GrossProfit")),
                    rs.getString("Pips"), 
                    indianCurrencyFormat.format(rs.getDouble("DepositWithdrawal")),
                    percentFormat.format(rs.getDouble("percent_profit")),
                    rs.getString("Note") 
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        jTable7.getColumnModel().getColumn(3).setCellRenderer(new PositiveNegativeCellRenderer(3));
        jTable7.getColumnModel().getColumn(6).setCellRenderer(new PositiveNegativeCellRenderer(6));
        jTable7.getColumnModel().getColumn(7).setCellRenderer(new PositiveNegativeCellRenderer(7));
        jTable7.getColumnModel().getColumn(8).setCellRenderer(new PositiveNegativeCellRenderer(8));
        jTable7.getColumnModel().getColumn(9).setCellRenderer(new PositiveNegativeCellRenderer(9));
        jTable7.getColumnModel().getColumn(4).setCellRenderer(new PositiveValueCellRenderer(4));
    }
    
    private void dailyTradesBindSource(){
                
        String query = ("SELECT BuyDate, sum_qty, sum_pips, sum_brokerage, sum_profit, sum_deposit, percent_profit, Remarks FROM daily_consolidated ");
             
        ResultSet rs = Select.getData(query);
        DefaultTableModel model = new DefaultTableModel();
        jTable7.setModel(model);
        //jTable7.setDefaultRenderer(Object.class,new AlternateRowColorRenderer());

        // Adding columns to the table model
        model.addColumn("BuyDate");
        model.addColumn("sum_qty");
        model.addColumn("sum_pips");
        model.addColumn("sum_brokerage");
        model.addColumn("sum_profit");
        model.addColumn("sum_deposit");
        model.addColumn("percent_profit");
        model.addColumn("Remarks");        
        
        // Create NumberFormat for Indian currency format
        NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat percentFormat = NumberFormat.getPercentInstance(Locale.ENGLISH);
        percentFormat.setMinimumFractionDigits(1);
        percentFormat.setMaximumFractionDigits(1);
        
        try {
            // Adding data to the table model
            while (rs.next()) {
                Object[] row = {                    
                    rs.getString("BuyDate"),
                    rs.getString("sum_qty"),
                    indianCurrencyFormat.format(rs.getDouble("sum_pips")),                    
                    indianCurrencyFormat.format(rs.getDouble("sum_brokerage")),
                    indianCurrencyFormat.format(rs.getDouble("sum_profit")),
                    indianCurrencyFormat.format(rs.getDouble("sum_deposit")),
                    percentFormat.format(rs.getDouble("percent_profit")),
                    rs.getString("Remarks")                     
                };
                model.addRow(row);                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        jTable7.getColumnModel().getColumn(2).setCellRenderer(new PositiveNegativeCellRenderer(2));
        jTable7.getColumnModel().getColumn(4).setCellRenderer(new PositiveNegativeCellRenderer(4));
        jTable7.getColumnModel().getColumn(5).setCellRenderer(new PositiveNegativeCellRenderer(5));
        jTable7.getColumnModel().getColumn(6).setCellRenderer(new PositiveNegativeCellRenderer(6));
    }
    
    
    
    private void monthTradesBindSource(){
                
        String query = ("SELECT Trade_Year, Trade_Month, Profit, sBrokerage, spips, sDepositWithdrawal, Remarks FROM mly_trades");
             
        ResultSet rs = Select.getData(query);
        DefaultTableModel model = new DefaultTableModel();
        jTable7.setModel(model);
        //jTable7.setDefaultRenderer(Object.class,new AlternateRowColorRenderer());

        // Adding columns to the table model
        model.addColumn("Trade_Year");
        model.addColumn("Trade_Month");
        model.addColumn("Profit");
        model.addColumn("sBrokerage");
        model.addColumn("spips");
        model.addColumn("sDepositWithdrawal");        
        model.addColumn("Remarks");        
        
        // Create NumberFormat for Indian currency format
        NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        
        try {
            // Adding data to the table model
            while (rs.next()) {
                Object[] row = {                    
                    rs.getString("Trade_Year"),
                    rs.getString("Trade_Month"),
                    indianCurrencyFormat.format(rs.getDouble("Profit")),                    
                    indianCurrencyFormat.format(rs.getDouble("sBrokerage")),
                    indianCurrencyFormat.format(rs.getDouble("spips")),
                    indianCurrencyFormat.format(rs.getDouble("sDepositWithdrawal")),
                    rs.getString("Remarks")                     
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        jTable7.getColumnModel().getColumn(2).setCellRenderer(new PositiveNegativeCellRenderer(2));
        jTable7.getColumnModel().getColumn(4).setCellRenderer(new PositiveNegativeCellRenderer(4));
        jTable7.getColumnModel().getColumn(5).setCellRenderer(new PositiveNegativeCellRenderer(5));
    }
    
    private void yearTradesBindSource(){
        String query = ("SELECT Trade_Year, profit, sBrokerage, spips, sDepositWithdrawal FROM yearly_trades");
             
        ResultSet rs = Select.getData(query);
        DefaultTableModel model = new DefaultTableModel();
        jTable7.setModel(model);
        //jTable7.setDefaultRenderer(Object.class,new AlternateRowColorRenderer());

        // Adding columns to the table model
        model.addColumn("Trade_Year");
        model.addColumn("profit");
        model.addColumn("sBrokerage");        
        model.addColumn("spips");
        model.addColumn("sDepositWithdrawal");       
                
        
        // Create NumberFormat for Indian currency format
        NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        
        try {
            // Adding data to the table model
            while (rs.next()) {
                Object[] row = {                    
                    rs.getString("Trade_Year"),                    
                    indianCurrencyFormat.format(rs.getDouble("Profit")),                    
                    indianCurrencyFormat.format(rs.getDouble("sBrokerage")),
                    indianCurrencyFormat.format(rs.getDouble("spips")),
                    indianCurrencyFormat.format(rs.getDouble("sDepositWithdrawal"))                                         
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        jTable7.getColumnModel().getColumn(1).setCellRenderer(new PositiveNegativeCellRenderer(1));
        jTable7.getColumnModel().getColumn(2).setCellRenderer(new PositiveNegativeCellRenderer(2));
        jTable7.getColumnModel().getColumn(3).setCellRenderer(new PositiveNegativeCellRenderer(3));
        jTable7.getColumnModel().getColumn(4).setCellRenderer(new PositiveNegativeCellRenderer(4));
    }
    
    private void dematBindSource(){
                
        String query = ("SELECT BuyDate, sum_qty, sum_pips, sum_profit, sum_deposit, sum_brokerage, run_demat, run_deposit, run_pips, run_brokerage FROM demat_holding");
             
        ResultSet rs = Select.getData(query);
        DefaultTableModel model = new DefaultTableModel();
        jTable7.setModel(model);
        //jTable7.setDefaultRenderer(Object.class,new AlternateRowColorRenderer());

        // Adding columns to the table model
        model.addColumn("BuyDate");
        model.addColumn("sum_qty");
        model.addColumn("sum_pips");
        model.addColumn("sum_profit");
        model.addColumn("sum_deposit");
        model.addColumn("sum_brokerage");        
        model.addColumn("run_demat");
        model.addColumn("run_deposit");
        model.addColumn("run_pips");
        model.addColumn("run_brokerage");
        
        // Create NumberFormat for Indian currency format
        NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        
        try {
            // Adding data to the table model
            while (rs.next()) {
                Object[] row = {                    
                    rs.getString("BuyDate"),
                    rs.getString("sum_qty"),
                    indianCurrencyFormat.format(rs.getDouble("sum_pips")),                    
                    indianCurrencyFormat.format(rs.getDouble("sum_profit")),
                    indianCurrencyFormat.format(rs.getDouble("sum_deposit")),
                    indianCurrencyFormat.format(rs.getDouble("sum_brokerage")),
                    indianCurrencyFormat.format(rs.getDouble("run_demat")),
                    indianCurrencyFormat.format(rs.getDouble("run_deposit")),
                    indianCurrencyFormat.format(rs.getDouble("run_pips")),
                    indianCurrencyFormat.format(rs.getDouble("run_brokerage"))
                                         
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        jTable7.getColumnModel().getColumn(2).setCellRenderer(new PositiveNegativeCellRenderer(2));
        jTable7.getColumnModel().getColumn(3).setCellRenderer(new PositiveNegativeCellRenderer(3));
        jTable7.getColumnModel().getColumn(4).setCellRenderer(new PositiveNegativeCellRenderer(4));
        jTable7.getColumnModel().getColumn(6).setCellRenderer(new PositiveNegativeCellRenderer(6));
        jTable7.getColumnModel().getColumn(7).setCellRenderer(new PositiveNegativeCellRenderer(7));
        jTable7.getColumnModel().getColumn(8).setCellRenderer(new PositiveNegativeCellRenderer(8));
        
    }
        
    
    private void expenseEntryBindSource(){
                
        String query = ("SELECT VoucherDate, AccountName, AccountType, DebitAmount, CreditAmount, run_asset, Narration FROM run_expenses_entry ORDER BY VoucherDate DESC");
             
        ResultSet rs = Select.getData(query);
        DefaultTableModel model = new DefaultTableModel();
        jTable7.setModel(model);
        //jTable7.setDefaultRenderer(Object.class,new AlternateRowColorRenderer());

        // Adding columns to the table model
        model.addColumn("VoucherDate");
        model.addColumn("AccountName");
        model.addColumn("AccountType");
        model.addColumn("DebitAmount");
        model.addColumn("CreditAmount");
        model.addColumn("run_asset");
        model.addColumn("Narration");       
        
        // Create NumberFormat for Indian currency format
        NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        
        try {
            // Adding data to the table model
            while (rs.next()) {
                Object[] row = {                    
                    rs.getString("VoucherDate"),
                    rs.getString("AccountName"),
                    rs.getString("AccountType"),
                    indianCurrencyFormat.format(rs.getDouble("DebitAmount")),                    
                    indianCurrencyFormat.format(rs.getDouble("CreditAmount")),
                    indianCurrencyFormat.format(rs.getDouble("run_asset")),
                    rs.getString("Narration")                                         
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        jTable7.getColumnModel().getColumn(3).setCellRenderer(new PositiveValueCellRenderer(3));
        jTable7.getColumnModel().getColumn(4).setCellRenderer(new PositiveNegativeCellRenderer(4));
        jTable7.getColumnModel().getColumn(5).setCellRenderer(new PositiveNegativeCellRenderer(5));
    }
    
    private void bankEntryBindSource(){
                
        String query = ("SELECT VoucherDate, AccountName, amt_recd, amt_spent, run_asset, Narration FROM run_bank_entry ORDER BY VoucherDate DESC");
             
        ResultSet rs = Select.getData(query);
        DefaultTableModel model = new DefaultTableModel();
        jTable7.setModel(model);
        //jTable7.setDefaultRenderer(Object.class,new AlternateRowColorRenderer());

        // Adding columns to the table model
        model.addColumn("VoucherDate");
        model.addColumn("AccountName");
        model.addColumn("amt_recd");
        model.addColumn("amt_spent");
        model.addColumn("run_asset");        
        model.addColumn("Narration");       
        
        // Create NumberFormat for Indian currency format
        NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        
        try {
            // Adding data to the table model
            while (rs.next()) {
                Object[] row = {                    
                    rs.getString("VoucherDate"),
                    rs.getString("AccountName"),                    
                    indianCurrencyFormat.format(rs.getDouble("amt_recd")),                    
                    indianCurrencyFormat.format(rs.getDouble("amt_spent")),
                    indianCurrencyFormat.format(rs.getDouble("run_asset")),
                    rs.getString("Narration")                                         
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        jTable7.getColumnModel().getColumn(2).setCellRenderer(new PositiveNegativeCellRenderer(2));
        jTable7.getColumnModel().getColumn(3).setCellRenderer(new PositiveValueCellRenderer(3));
        jTable7.getColumnModel().getColumn(4).setCellRenderer(new PositiveNegativeCellRenderer(4));
    }
    
    private void cashEntryBindSource(){
                
        String query = ("SELECT VoucherDate, AccountName, amt_recd, amt_spent, run_asset, Narration FROM run_cash_entry ORDER BY VoucherDate DESC");
             
        ResultSet rs = Select.getData(query);
        DefaultTableModel model = new DefaultTableModel();
        jTable7.setModel(model);
        //jTable7.setDefaultRenderer(Object.class,new AlternateRowColorRenderer());

        // Adding columns to the table model
        model.addColumn("VoucherDate");
        model.addColumn("AccountName");
        model.addColumn("amt_recd");
        model.addColumn("amt_spent");
        model.addColumn("run_asset");        
        model.addColumn("Narration");       
        
        // Create NumberFormat for Indian currency format
        NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        
        try {
            // Adding data to the table model
            while (rs.next()) {
                Object[] row = {                    
                    rs.getString("VoucherDate"),
                    rs.getString("AccountName"),                    
                    indianCurrencyFormat.format(rs.getDouble("amt_recd")),                    
                    indianCurrencyFormat.format(rs.getDouble("amt_spent")),
                    indianCurrencyFormat.format(rs.getDouble("run_asset")),
                    rs.getString("Narration")                                         
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        jTable7.getColumnModel().getColumn(2).setCellRenderer(new PositiveNegativeCellRenderer(2));
        jTable7.getColumnModel().getColumn(3).setCellRenderer(new PositiveValueCellRenderer(3));
        jTable7.getColumnModel().getColumn(4).setCellRenderer(new PositiveNegativeCellRenderer(4));
    }
    
    private void bankCashEntryBindSource(){
                
        String query = ("SELECT VoucherDate, AccountName, amt_recd, amt_spent, run_asset, Narration FROM run_category_entry ORDER BY VoucherDate DESC");
             
        ResultSet rs = Select.getData(query);
        DefaultTableModel model = new DefaultTableModel();
        jTable7.setModel(model);
        //jTable7.setDefaultRenderer(Object.class,new AlternateRowColorRenderer());

        // Adding columns to the table model
        model.addColumn("VoucherDate");
        model.addColumn("AccountName");
        model.addColumn("amt_recd");
        model.addColumn("amt_spent");
        model.addColumn("run_asset");        
        model.addColumn("Narration");       
        
        // Create NumberFormat for Indian currency format
        NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        
        try {
            // Adding data to the table model
            while (rs.next()) {
                Object[] row = {                    
                    rs.getString("VoucherDate"),
                    rs.getString("AccountName"),                    
                    indianCurrencyFormat.format(rs.getDouble("amt_recd")),                    
                    indianCurrencyFormat.format(rs.getDouble("amt_spent")),
                    indianCurrencyFormat.format(rs.getDouble("run_asset")),
                    rs.getString("Narration")                                         
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        jTable7.getColumnModel().getColumn(2).setCellRenderer(new PositiveNegativeCellRenderer(2));
        jTable7.getColumnModel().getColumn(3).setCellRenderer(new PositiveValueCellRenderer(3));
        jTable7.getColumnModel().getColumn(4).setCellRenderer(new PositiveNegativeCellRenderer(4));
    }
    
    private void liabilityBindSource(){
                
        String query = ("SELECT AccountName, AccountType, amt_recd, amt_spent, bal_payment FROM liability_entry");
             
        ResultSet rs = Select.getData(query);
        DefaultTableModel model = new DefaultTableModel();
        jTable7.setModel(model);
        //jTable7.setDefaultRenderer(Object.class,new AlternateRowColorRenderer());

        // Adding columns to the table model
        model.addColumn("AccountName");
        model.addColumn("AccountType");
        model.addColumn("amt_recd");
        model.addColumn("amt_spent");
        model.addColumn("bal_payment");       
               
        
        // Create NumberFormat for Indian currency format
        NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        
        try {
            // Adding data to the table model
            while (rs.next()) {
                Object[] row = {                    
                    rs.getString("AccountName"),
                    rs.getString("AccountType"),                    
                    indianCurrencyFormat.format(rs.getDouble("amt_recd")),                    
                    indianCurrencyFormat.format(rs.getDouble("amt_spent")),
                    indianCurrencyFormat.format(rs.getDouble("bal_payment"))                                                             
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        jTable7.getColumnModel().getColumn(2).setCellRenderer(new PositiveNegativeCellRenderer(2));
        jTable7.getColumnModel().getColumn(3).setCellRenderer(new PositiveValueCellRenderer(3));
        jTable7.getColumnModel().getColumn(4).setCellRenderer(new PositiveNegativeCellRenderer(4));
    }
    
    private void setColumnWidthTrades(){
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(40);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(40);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(60);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(60);
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(7).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(8).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(9).setPreferredWidth(40);        
        jTable1.getColumnModel().getColumn(10).setPreferredWidth(200);
    }
    
    
    private void setColumnWidthDoubleEntry(){
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(40);
        jTable2.getColumnModel().getColumn(2).setPreferredWidth(80);
        jTable2.getColumnModel().getColumn(3).setPreferredWidth(70);
        jTable2.getColumnModel().getColumn(4).setPreferredWidth(70);
        jTable2.getColumnModel().getColumn(5).setPreferredWidth(70);
        jTable2.getColumnModel().getColumn(6).setPreferredWidth(80);
        jTable2.getColumnModel().getColumn(7).setPreferredWidth(80);
        jTable2.getColumnModel().getColumn(8).setPreferredWidth(170);
        jTable2.getColumnModel().getColumn(9).setPreferredWidth(170);
        jTable2.getColumnModel().getColumn(10).setPreferredWidth(20);
    }
    
    private void setColumnWidthCalendar(){
        jTable3.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTable3.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTable3.getColumnModel().getColumn(2).setPreferredWidth(60);
        jTable3.getColumnModel().getColumn(3).setPreferredWidth(90);
        jTable3.getColumnModel().getColumn(4).setPreferredWidth(90);
        jTable3.getColumnModel().getColumn(5).setPreferredWidth(200);
        jTable3.getColumnModel().getColumn(6).setPreferredWidth(30);
        jTable3.getColumnModel().getColumn(7).setPreferredWidth(30);
        jTable3.getColumnModel().getColumn(8).setPreferredWidth(30);
    }
    
    private void setColumnWidthPassword(){
        jTable4.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTable4.getColumnModel().getColumn(1).setPreferredWidth(110);
        jTable4.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTable4.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTable4.getColumnModel().getColumn(4).setPreferredWidth(100);
        jTable4.getColumnModel().getColumn(5).setPreferredWidth(100);
        jTable4.getColumnModel().getColumn(6).setPreferredWidth(100);
        jTable4.getColumnModel().getColumn(7).setPreferredWidth(100);
    }
    
    private void setColumnWidthDocument(){
        jTable5.getColumnModel().getColumn(0).setPreferredWidth(20);
        jTable5.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTable5.getColumnModel().getColumn(2).setPreferredWidth(20);
        jTable5.getColumnModel().getColumn(3).setPreferredWidth(200);
        jTable5.getColumnModel().getColumn(4).setPreferredWidth(200);        
    }
    
    private void setColumnWidthTask(){
        jTable6.getColumnModel().getColumn(0).setPreferredWidth(20);
        jTable6.getColumnModel().getColumn(1).setPreferredWidth(60);
        jTable6.getColumnModel().getColumn(2).setPreferredWidth(50);
        jTable6.getColumnModel().getColumn(3).setPreferredWidth(110);
        jTable6.getColumnModel().getColumn(4).setPreferredWidth(50);
        jTable6.getColumnModel().getColumn(5).setPreferredWidth(60);
        jTable6.getColumnModel().getColumn(6).setPreferredWidth(65);
        jTable6.getColumnModel().getColumn(7).setPreferredWidth(50);
        jTable6.getColumnModel().getColumn(8).setPreferredWidth(110);
        jTable6.getColumnModel().getColumn(9).setPreferredWidth(15);        
    }
    
    private void setColumnWidthDailyTrades(){
        jTable7.getColumnModel().getColumn(0).setPreferredWidth(10);
        jTable7.getColumnModel().getColumn(1).setPreferredWidth(10);
        jTable7.getColumnModel().getColumn(2).setPreferredWidth(20);
        jTable7.getColumnModel().getColumn(3).setPreferredWidth(20);
        jTable7.getColumnModel().getColumn(4).setPreferredWidth(20);
        jTable7.getColumnModel().getColumn(5).setPreferredWidth(20);
        jTable7.getColumnModel().getColumn(6).setPreferredWidth(20);
        jTable7.getColumnModel().getColumn(7).setPreferredWidth(120);        
    }
    
    private void setColumnWidthAllTrades(){
        jTable7.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTable7.getColumnModel().getColumn(1).setPreferredWidth(70);
        jTable7.getColumnModel().getColumn(2).setPreferredWidth(40);
        jTable7.getColumnModel().getColumn(3).setPreferredWidth(60);
        jTable7.getColumnModel().getColumn(4).setPreferredWidth(60);
        jTable7.getColumnModel().getColumn(5).setPreferredWidth(60);
        jTable7.getColumnModel().getColumn(6).setPreferredWidth(80);
        jTable7.getColumnModel().getColumn(7).setPreferredWidth(40);
        jTable7.getColumnModel().getColumn(8).setPreferredWidth(80);
        jTable7.getColumnModel().getColumn(9).setPreferredWidth(60);        
        jTable7.getColumnModel().getColumn(10).setPreferredWidth(170);
    }
    private void setColumnWidthMonthTrades(){
        jTable7.getColumnModel().getColumn(0).setPreferredWidth(10);
        jTable7.getColumnModel().getColumn(1).setPreferredWidth(10);
        jTable7.getColumnModel().getColumn(2).setPreferredWidth(20);
        jTable7.getColumnModel().getColumn(3).setPreferredWidth(20);
        jTable7.getColumnModel().getColumn(4).setPreferredWidth(20);
        jTable7.getColumnModel().getColumn(5).setPreferredWidth(20);
        jTable7.getColumnModel().getColumn(6).setPreferredWidth(120);        
    }
    
    private void setColumnWidthYearTrades(){
        jTable7.getColumnModel().getColumn(0).setPreferredWidth(10);        
        jTable7.getColumnModel().getColumn(1).setPreferredWidth(20);
        jTable7.getColumnModel().getColumn(2).setPreferredWidth(20);
        jTable7.getColumnModel().getColumn(3).setPreferredWidth(20);
        jTable7.getColumnModel().getColumn(4).setPreferredWidth(20);        
    }
    private void setColumnWidthExpense(){
        jTable7.getColumnModel().getColumn(0).setPreferredWidth(10);
        jTable7.getColumnModel().getColumn(1).setPreferredWidth(10);
        jTable7.getColumnModel().getColumn(2).setPreferredWidth(20);
        jTable7.getColumnModel().getColumn(3).setPreferredWidth(20);
        jTable7.getColumnModel().getColumn(4).setPreferredWidth(20);
        jTable7.getColumnModel().getColumn(5).setPreferredWidth(20);
        jTable7.getColumnModel().getColumn(6).setPreferredWidth(120);        
    }
    
    private void setColumnWidthBank(){
        jTable7.getColumnModel().getColumn(0).setPreferredWidth(10);
        jTable7.getColumnModel().getColumn(1).setPreferredWidth(10);
        jTable7.getColumnModel().getColumn(2).setPreferredWidth(20);
        jTable7.getColumnModel().getColumn(3).setPreferredWidth(20);
        jTable7.getColumnModel().getColumn(4).setPreferredWidth(20);
        jTable7.getColumnModel().getColumn(5).setPreferredWidth(120);                
    }
    
    private void setColumnWidthCash(){
        jTable7.getColumnModel().getColumn(0).setPreferredWidth(10);
        jTable7.getColumnModel().getColumn(1).setPreferredWidth(10);
        jTable7.getColumnModel().getColumn(2).setPreferredWidth(20);
        jTable7.getColumnModel().getColumn(3).setPreferredWidth(20);
        jTable7.getColumnModel().getColumn(4).setPreferredWidth(20);
        jTable7.getColumnModel().getColumn(5).setPreferredWidth(120);                
    }
    
    private void setColumnWidthBankCash(){
        jTable7.getColumnModel().getColumn(0).setPreferredWidth(10);
        jTable7.getColumnModel().getColumn(1).setPreferredWidth(10);
        jTable7.getColumnModel().getColumn(2).setPreferredWidth(20);
        jTable7.getColumnModel().getColumn(3).setPreferredWidth(20);
        jTable7.getColumnModel().getColumn(4).setPreferredWidth(20);
        jTable7.getColumnModel().getColumn(5).setPreferredWidth(120);                
    }
    
    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        // TODO add your handling code here:        
        jPanel5.setBackground(secondaryColor);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        // TODO add your handling code here:        
        jPanel5.setBackground(thirdColor);
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        // TODO add your handling code here:        
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        // TODO add your handling code here:        
        jPanel7.setBackground(secondaryColor);
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        // TODO add your handling code here:        
        jPanel7.setBackground(thirdColor);
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        // TODO add your handling code here:        
        jPanel9.setBackground(secondaryColor);
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        // TODO add your handling code here:        
        jPanel9.setBackground(thirdColor);
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        // TODO add your handling code here:        
        jPanel11.setBackground(secondaryColor);
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        // TODO add your handling code here:        
        jPanel11.setBackground(thirdColor);
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseExited

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        // TODO add your handling code here:        
        jPanel13.setBackground(secondaryColor);
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        // TODO add your handling code here:        
        jPanel13.setBackground(thirdColor);
    }//GEN-LAST:event_jLabel16MouseExited

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseExited

    private void jLabel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseEntered
        // TODO add your handling code here:        
        jPanel15.setBackground(secondaryColor);
    }//GEN-LAST:event_jLabel18MouseEntered

    private void jLabel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseExited
        // TODO add your handling code here:        
        jPanel15.setBackground(thirdColor);
    }//GEN-LAST:event_jLabel18MouseExited

    private void jLabel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseEntered

    private void jLabel19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseExited

    private void jLabel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseEntered
        // TODO add your handling code here:        
        jPanel17.setBackground(secondaryColor);
    }//GEN-LAST:event_jLabel20MouseEntered

    private void jLabel20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseExited
        // TODO add your handling code here:        
        jPanel17.setBackground(thirdColor);
    }//GEN-LAST:event_jLabel20MouseExited

    private void jLabel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel21MouseEntered

    private void jLabel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel21MouseExited

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // Create an instance of Form1 as a JPanel
        jTabbedPane1.setSelectedIndex(0);
        disposeAllOtherFrames();
        showTradeInTable();
        setColumnWidthTrades();        
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel49MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseEntered
        // TODO add your handling code here:
        jPanel54.setBackground(secondaryColor);
    }//GEN-LAST:event_jLabel49MouseEntered

    private void jLabel49MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseExited
        // TODO add your handling code here:
        jPanel54.setBackground(thirdColor);
    }//GEN-LAST:event_jLabel49MouseExited

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:        
        jTabbedPane1.setSelectedIndex(1);  
        disposeAllOtherFrames();
        showDoubleEntryInTable();
        setColumnWidthDoubleEntry();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
        disposeAllOtherFrames();
        showCalendarInTable();
        setColumnWidthCalendar();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
        disposeAllOtherFrames();
        showPasswordInTable();
        setColumnWidthPassword();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
        disposeAllOtherFrames();
        showDocumentInTable();
        setColumnWidthDocument();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(5);
        disposeAllOtherFrames();
        showTaskInTable();
        setColumnWidthTask();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(7);
        disposeAllOtherFrames();        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
        showDoubleEntryInTable();
        setColumnWidthDoubleEntry();        
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        // TODO add your handling code here:
        showCalendarInTable();
        setColumnWidthCalendar();
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        // TODO add your handling code here:
        showPasswordInTable();
        setColumnWidthPassword();
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        // TODO add your handling code here:
        showDocumentInTable();
        setColumnWidthDocument();
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        // TODO add your handling code here:
        showTaskInTable();
        setColumnWidthTask();
    }//GEN-LAST:event_jTextField6KeyReleased
    public class MyObserver implements FormInterface {        
        
        // Implement the methods of the FormInterface interface
         @Override
         public void updateTrade() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clear existing rows
        showTradeInTable(); // Load updated data in table
        } 
        @Override
         public void updateDoubleEntry() {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0); // Clear existing rows
        showDoubleEntryInTable(); // Load updated data in table
        setColumnWidthDoubleEntry();
        }
        @Override
         public void updateCalendar() {
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        model.setRowCount(0); // Clear existing rows
        showCalendarInTable(); // Load updated data in table
        setColumnWidthCalendar();
        }
         
        @Override
         public void updatePassword() {
        DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
        model.setRowCount(0); // Clear existing rows
        showPasswordInTable(); // Load updated data in table
        setColumnWidthPassword();
        } 
        
        @Override
         public void updateDocument() {
        DefaultTableModel model = (DefaultTableModel) jTable5.getModel();
        model.setRowCount(0); // Clear existing rows
        showDocumentInTable(); // Load updated data in table
        setColumnWidthDocument();
        } 
         
        @Override
         public void updateTask() {
        DefaultTableModel model = (DefaultTableModel) jTable6.getModel();
        model.setRowCount(0); // Clear existing rows
        showTaskInTable(); // Load updated data in table
        setColumnWidthTask();
        } 
         
    }
    
       
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int tradelineid = 0;
        
        int rowIndex = jTable1.getSelectedRow();
        if (rowIndex != -1) { // If a row is selected
            String tradelineidStr = (String) jTable1.getValueAt(rowIndex,0).toString().trim();            
            
            tradelineid = Integer.parseInt(tradelineidStr);            
        }
        String query = ("SELECT tradelinet.TradeLineID, tradelinet.TradeID, tradet.BuyDate, brokert.BrokerName, scripnamet.ScripName, tradetypet.TradeType, tradelinet.BuyQty, tradelinet.BuyPrice, tradelinet.SellPrice, tradelinet.Brokerage," +
                "tradelinet.DepositWithdrawal, (SellPrice * BuyQty)-(BuyPrice * BuyQty) - Brokerage AS GrossProfit, SellPrice - BuyPrice AS Pips, tradelinet.SellDate, tradelinet.Note, tradet.IsExported FROM tradelinet INNER JOIN tradet ON tradelinet.TradeID = tradet.TradeID JOIN brokert ON tradelinet.BrokerID = brokert.BrokerID " +
                "JOIN tradetypet ON tradelinet.TradeTypeID = tradetypet.TradeTypeID JOIN scripnamet ON tradelinet.ScripID = scripnamet.ScripID WHERE tradelinet.TradeLineID = '"+tradelineid+"'");
        ResultSet rs = Select.getData(query);
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("TradeLineID");
        model.addColumn("TradeID");
        model.addColumn("BuyDate");
        model.addColumn("BrokerName");
        model.addColumn("ScripName");
        model.addColumn("TradeType");
        model.addColumn("BuyQty");
        model.addColumn("BuyPrice");
        model.addColumn("SellPrice");
        model.addColumn("Brokerage");
        model.addColumn("DepositWithdrawal");
        model.addColumn("GrossProfit");
        model.addColumn("Pips");
        model.addColumn("SellDate");
        model.addColumn("Note");
        model.addColumn("IsExported");
        
        String formattedProfit = "";
        String formattedPips = "";
        String formattedDeposit = "";
        String formattedBrokerage = "";
        
        try {
        if (rs.next()) {
            //int isExportedValue = rs.getInt("IsExported");
            //boolean isChecked = (isExportedValue == -1);
            //jCheckBox1.setSelected(isChecked);
            boolean isExported = rs.getBoolean("IsExported");

            // Retrieve values from the result set
            int tradeLineID = rs.getInt("TradeLineID");
            int tradeID = rs.getInt("TradeID");
            String buyDate = rs.getString("BuyDate");
            String brokerName = rs.getString("BrokerName");
            String scripName = rs.getString("ScripName");
            String tradeType = rs.getString("TradeType");
            int buyQty = rs.getInt("BuyQty");
            double buyPrice = rs.getDouble("BuyPrice");
            double sellPrice = rs.getDouble("SellPrice");
            double brokerage = rs.getDouble("Brokerage");
            double depositWithdrawal = rs.getDouble("DepositWithdrawal");
            double grossProfit = rs.getDouble("GrossProfit");
            double pips = rs.getDouble("Pips");
            String sellDate = rs.getString("SellDate");
            String note = rs.getString("Note");           
                    
            try {
                String queryProfit = ("SELECT SUM(GrossProfit) As TProfit FROM all_trades WHERE TradeID = '"+tradeID+"'");
                ResultSet rs1 = Select.getData(queryProfit);
                while (rs1.next()) {
                    String tProfit = rs1.getString("TProfit");
                    double numTProfit = Double.parseDouble(tProfit);
                    NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
                    formattedProfit = indianCurrencyFormat.format(numTProfit);                    
                }
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }           
            
        
           try {
                String queryPips = ("SELECT SUM(Pips) As TPips FROM all_trades WHERE TradeID = '"+tradeID+"'");
                ResultSet rs2 = Select.getData(queryPips);
                while (rs2.next()) {
                    String tPips = rs2.getString("TPips");
                    double numTPips = Double.parseDouble(tPips);
                    NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
                    formattedPips = indianCurrencyFormat.format(numTPips);
            
                }
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }          
           
        
            try {
                String queryDeposit = ("SELECT SUM(DepositWithdrawal) As TDeposit FROM all_trades WHERE TradeID = '"+tradeID+"'");
                ResultSet rs3 = Select.getData(queryDeposit);
                while (rs3.next()) {
                    String tDeposit = rs3.getString("TDeposit");
                    double numTDeposit = Double.parseDouble(tDeposit);
                    NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
                    formattedDeposit = indianCurrencyFormat.format(numTDeposit);
            
                }
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            
            try {
                String queryBrokerage = ("SELECT SUM(Brokerage) As TBrokerage FROM all_trades WHERE TradeID = '"+tradeID+ "'");
                ResultSet rs4 = Select.getData(queryBrokerage);
                while (rs4.next()) {
                    String tBrokerage = rs4.getString("TBrokerage");
                    double numTBrokerage = Double.parseDouble(tBrokerage);
                    NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
                    formattedBrokerage = indianCurrencyFormat.format(numTBrokerage);
            
                }
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
                                  
            FormInterface observerInstance = observer;         
                        
            TradeInsert updateTradeFrame = TradeInsert.getInstance(tradeLineID, tradeID, buyDate, brokerName, scripName, tradeType, buyQty, buyPrice, sellPrice, brokerage, depositWithdrawal, grossProfit, pips, sellDate, note, isExported, formattedProfit, formattedPips, formattedDeposit, formattedBrokerage);
            updateTradeFrame.setObserver(observerInstance); 
            updateTradeFrame.setVisible(true);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        // Your existing finally block
    }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseEntered
        // TODO add your handling code here:        
        jPanel33.setBackground(secondaryColor);
    }//GEN-LAST:event_jLabel32MouseEntered

    private void jLabel32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseExited
        // TODO add your handling code here:        
        jPanel33.setBackground(thirdColor);
    }//GEN-LAST:event_jLabel32MouseExited

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        // TODO add your handling code here:
        TradeCalculator tradeCalculator = new TradeCalculator(); // Pass reference of Passwords frame
        tradeCalculator.setVisible(true);
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int voucherLineId = 0;
        int rowIndex = jTable2.getSelectedRow();
                if (rowIndex != -1) { // If a row is selected
                     String voucherLineIdStr = (String) jTable2.getValueAt(rowIndex, 0).toString().trim();
                    // Convert the String value to an Integer if needed
                    voucherLineId = Integer.parseInt(voucherLineIdStr);                   
                }  
                
        String query = ("SELECT VoucherLineT.VoucherLineID, VoucherT.VoucherID, VoucherT.VoucherDate, VoucherTypeT.VoucherType," +
        "AccountDetailT.AccountName, AccountTypeT.AccountType, VoucherLineT.DebitAmount, VoucherLineT.CreditAmount," +
        "VoucherLineT.Narration, VoucherLineT.Notes, VoucherLineT.IsExported FROM VoucherLineT INNER JOIN VoucherT ON VoucherLineT.fVoucherID = VoucherT.VoucherID JOIN " +
        "VoucherTypeT ON VoucherT.fVoucherType = VoucherTypeT.VoucherTypeID JOIN AccountDetailT ON VoucherLineT.fAccountDetail = AccountDetailT.AccountDetailID JOIN " +
        "AccountTypeT ON VoucherlineT.fAccountType = AccountTypeT.AccountTypeID WHERE VoucherLIneT.VoucherLineID = '"+voucherLineId+"'");
        
        ResultSet rs = Select.getData(query);
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("VoucherLineID");
        model.addColumn("VoucherID");
        model.addColumn("VoucherDate");
        model.addColumn("VoucherType");
        model.addColumn("AccountName");
        model.addColumn("AccountType");
        model.addColumn("DebitAmount");
        model.addColumn("CreditAmount");
        model.addColumn("Narration");
        model.addColumn("Notes");
        model.addColumn("IsExported");
        
        int parentID = 0;
        try {
            if (rs.next()) {
            
                boolean isExported = rs.getBoolean("IsExported");

                // Retrieve values from the result set
                int lineID = rs.getInt("VoucherLineID");
                int voucherID = rs.getInt("VoucherID");
                String voucherDate = rs.getString("VoucherDate");
                String voucherType = rs.getString("VoucherType");
                String acctDetail = rs.getString("AccountName");
                String acctType = rs.getString("AccountType");
                int debit = rs.getInt("DebitAmount");
                int credit = rs.getInt("CreditAmount");
                String narration = rs.getString("Narration");
                String notes = rs.getString("Notes");             
        
            try {
                String queryParentID = ("SELECT VoucherID FROM VoucherT Order BY VoucherID DESC LIMIT 1");
                ResultSet rs1 = Select.getData(queryParentID);
                while (rs1.next()) {
                    String parentVoucher = rs1.getString("VoucherID");            
                    parentID = Integer.parseInt(parentVoucher);
                }
            }
            catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            }
            
            FormInterface observerInstance = observer;         
                        
            DoubleEntryInsert updateDoubleEntryFrame = DoubleEntryInsert.getInstance(voucherID, voucherDate, voucherType, lineID, parentID, acctDetail, acctType, debit, credit, narration, notes, isExported);
            updateDoubleEntryFrame.setObserver(observerInstance); 
            updateDoubleEntryFrame.setVisible(true);
            
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
        // Your existing finally block
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
        int apptID = 0;
        int rowIndex = jTable3.getSelectedRow();
                if (rowIndex != -1) { // If a row is selected
                     String apptIDStr = (String) jTable3.getValueAt(rowIndex, 0).toString().trim();
                    // Convert the String value to an Integer if needed
                    apptID = Integer.parseInt(apptIDStr);                   
                }  
                
        String query = ("SELECT ApptID, ApptSubject, ApptLocation, ApptStart, ApptEnd, ApptNotes, Priority, TradeID, CheckID " +
                    "FROM tblAppointments WHERE ApptID = '"+apptID+"'");
        
        ResultSet rs = Select.getData(query);
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("ApptID");
        model.addColumn("ApptSubject");
        model.addColumn("ApptLocation");
        model.addColumn("ApptStart");
        model.addColumn("ApptEnd");
        model.addColumn("ApptNotes");
        model.addColumn("Priority");
        model.addColumn("TradeID");
        model.addColumn("CheckID");
        
        try {
            if (rs.next()) {
            
                // Retrieve values from the result set
                apptID = rs.getInt("ApptID");                
                String apptSubject = rs.getString("ApptSubject");
                String apptLocation = rs.getString("ApptLocation");
                String apptStart = rs.getString("ApptStart");
                String apptEnd = rs.getString("ApptEnd");
                String apptNotes = rs.getString("ApptNotes");
                int priority = rs.getInt("Priority");
                int tradeID = rs.getInt("TradeID");
                int checkID = rs.getInt("CheckID");               
                   
            
            FormInterface observerInstance = observer;         
                        
            CalendarInsert updateCalendarFrame = CalendarInsert.getInstance(apptID, apptSubject, apptLocation, apptStart, apptEnd, apptNotes, priority, tradeID, checkID);
            updateCalendarFrame.setObserver(observerInstance); 
            updateCalendarFrame.setVisible(true);
            
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
        // Your existing finally block
        }
    }//GEN-LAST:event_jTable3MouseClicked

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        // TODO add your handling code here:
        int websiteID = 0;
        int rowIndex = jTable4.getSelectedRow();
                if (rowIndex != -1) { // If a row is selected
                     String websiteIDStr = (String) jTable4.getValueAt(rowIndex, 0).toString().trim();
                    // Convert the String value to an Integer if needed
                    websiteID = Integer.parseInt(websiteIDStr);                   
                }  
                
        String query = ("SELECT WebsiteID, WebsiteName, UserName, Password, LinkedEMail, LinkedMobile, Note1, Note2 " +
                        "FROM tblWebsiteMain WHERE WebsiteID = ? ");
        
        //ResultSet rs = Select.getData(query);
        ResultSet rs = paramSelect.getData(query, websiteID);
        
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("WebsiteID");
        model.addColumn("WebsiteName");
        model.addColumn("UserName");
        model.addColumn("Password");
        model.addColumn("LinkedEmail");
        model.addColumn("LinkedMobile");
        model.addColumn("Note1");
        model.addColumn("Note2");
        
        try {
            if (rs.next()) {
            
                // Retrieve values from the result set
                websiteID = rs.getInt("WebsiteID");                
                String websiteName = rs.getString("WebsiteName");
                String userName = rs.getString("UserName");
                String password = rs.getString("Password");
                String linkedEmail = rs.getString("LinkedEmail");
                String linkedMobile= rs.getString("LinkedMobile");
                String note1 = rs.getString("Note1");
                String note2 = rs.getString("Note2");                           
                   
            
            FormInterface observerInstance = observer;         
                        
            PasswordInsert updatePasswordFrame = PasswordInsert.getInstance(websiteID, websiteName, userName, password, linkedEmail, linkedMobile, note1, note2);
            updatePasswordFrame.setObserver(observerInstance); 
            updatePasswordFrame.setVisible(true);
            
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
        // Your existing finally block
        }
        
    }//GEN-LAST:event_jTable4MouseClicked

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        // TODO add your handling code here:
        int docID = 0;
        int rowIndex = jTable5.getSelectedRow();
                if (rowIndex != -1) { // If a row is selected
                     String docIDStr = (String) jTable5.getValueAt(rowIndex, 0).toString().trim();
                    // Convert the String value to an Integer if needed
                    docID = Integer.parseInt(docIDStr);                   
                }  
                
        String query = ("SELECT DocID, docusert.DocUserName, DocName, DocPath, DocText FROM DocT JOIN DocUserT ON Doct.DocUserID = DocUserT.DocUserID Where DocID = '"+docID+"' ");
        
        ResultSet rs = Select.getData(query);
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("DocID");
        model.addColumn("DocUserName");
        model.addColumn("DocName");
        model.addColumn("DocPath");
        model.addColumn("DocText");
        
        try {
            if (rs.next()) {
            
                // Retrieve values from the result set
                docID = rs.getInt("DocID");                
                String docUserName = rs.getString("DocUserName");
                String docName = rs.getString("DocName");
                String docPath = rs.getString("DocPath");
                String docText = rs.getString("DocText");                                         
                   
            
            FormInterface observerInstance = observer;         
                        
            DocumentInsert updateDocumentFrame = DocumentInsert.getInstance(docID, docUserName, docName, docPath, docText);
            updateDocumentFrame.setObserver(observerInstance); 
            updateDocumentFrame.setVisible(true);
            
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
        // Your existing finally block
        }
    }//GEN-LAST:event_jTable5MouseClicked

    private void jLabel56MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseEntered
        // TODO add your handling code here:
        jPanel61.setBackground(secondaryColor);
    }//GEN-LAST:event_jLabel56MouseEntered

    private void jLabel56MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseExited
        // TODO add your handling code here:
        jPanel61.setBackground(thirdColor);
    }//GEN-LAST:event_jLabel56MouseExited

    private void jLabel56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        try {
        ExcelExporter.exportToExcel(jTable2, "C:\\Users\\alk_6\\OneDrive\\Desktop\\DoubleEntry.xlsx");
        JOptionPane.showMessageDialog(this, "Export successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Export failed: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel56MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        dailyTradesBindSource();
        setColumnWidthDailyTrades();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        cashEntryBindSource();
        setColumnWidthCash();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        monthTradesBindSource();
        setColumnWidthMonthTrades();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        dematBindSource();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        expenseEntryBindSource();
        setColumnWidthExpense();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        bankEntryBindSource();
        setColumnWidthBank();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        bankCashEntryBindSource();
        setColumnWidthBankCash();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        liabilityBindSource();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel54MouseClicked
        // TODO add your handling code here:
        showTaskInTable();
        setColumnWidthTask();
    }//GEN-LAST:event_jPanel54MouseClicked

    private void jLabel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseClicked
        // TODO add your handling code here:
        showActiveTask();
        setColumnWidthTask();
    }//GEN-LAST:event_jLabel49MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12MouseClicked

    private void jTable6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable6MouseClicked
        // TODO add your handling code here:
        int taskID = 0;
        int rowIndex = jTable6.getSelectedRow();
                if (rowIndex != -1) { // If a row is selected
                     String taskIDStr = (String) jTable6.getValueAt(rowIndex, 0).toString().trim();
                    // Convert the String value to an Integer if needed
                    taskID = Integer.parseInt(taskIDStr);                   
                }  
                
        String query = ("SELECT taskt.TaskID, taskt.DateCreated, TaskTypeT.TaskType," +
                "taskt.Description, ImportanceT.Importance, taskt.DateDue, taskt.DateCompleted, " +
                "InchargeT.InchargeName, taskt.Note, taskt.IsActive FROM TaskT INNER JOIN TaskTypeT ON taskt.TaskTypeID = TaskTypeT.TaskTypeID JOIN " +
                "ImportanceT ON TaskT.ImportanceID = ImportanceT.ImportanceID JOIN InchargeT ON TaskT.InchargeID = InchargeT.InchargeID WHERE taskt.TaskID= '"+taskID+"'");
        
        ResultSet rs = Select.getData(query);
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("TaskID");
        model.addColumn("DateCreated");        
        model.addColumn("TaskType");
        model.addColumn("Description");
        model.addColumn("Importance");
        model.addColumn("DateDue");
        model.addColumn("DateCompleted");
        model.addColumn("InchargeName");
        model.addColumn("Note");
        model.addColumn("IsActive");
        
        try {
            if (rs.next()) {
            
                // Retrieve values from the result set
                boolean isActive = rs.getBoolean("IsActive");
                taskID = rs.getInt("TaskID");                
                String dateCreated = rs.getString("DateCreated");
                String taskType = rs.getString("TaskType");
                String description = rs.getString("Description");
                String importance = rs.getString("Importance");
                String dateDue = rs.getString("DateDue");
                String dateCompleted = rs.getString("DateCompleted");
                String inchargeName = rs.getString("InchargeName");
                String note = rs.getString("Note");
            
            FormInterface observerInstance = observer;         
                        
            TaskInsert updateTaskFrame = TaskInsert.getInstance(taskID, dateCreated, taskType, description, importance, dateDue, dateCompleted, inchargeName, note, isActive);
            updateTaskFrame.setObserver(observerInstance); 
            updateTaskFrame.setVisible(true);
            
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
        // Your existing finally block
        }
    }//GEN-LAST:event_jTable6MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(6);
        disposeAllOtherFrames();
        allTradeBindSource();
        setColumnWidthAllTrades();
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseEntered
        // TODO add your handling code here:
        jPanel22.setBackground(secondaryColor);        
    }//GEN-LAST:event_jLabel22MouseEntered

    private void jLabel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseExited
        // TODO add your handling code here:
        jPanel22.setBackground(thirdColor);
    }//GEN-LAST:event_jLabel22MouseExited

    private void jLabel23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel23MouseEntered

    private void jLabel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel23MouseExited

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        // TODO add your handling code here:
        this.setState(Home.ICONIFIED);
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        // TODO add your handling code here:
        new CalendarApp().setVisible(true);
    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        // TODO add your handling code here:
        jTextField2.setText("");
        showDoubleEntryInTable();
        setColumnWidthDoubleEntry();
    }//GEN-LAST:event_jButton14MouseClicked

    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
        // TODO add your handling code here:
        jTextField3.setText("");
        showCalendarInTable();
        setColumnWidthCalendar();
    }//GEN-LAST:event_jButton15MouseClicked

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked
        // TODO add your handling code here:
        jTextField4.setText("");
        showPasswordInTable();
        setColumnWidthPassword();
    }//GEN-LAST:event_jButton16MouseClicked

    private void jButton17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseClicked
        // TODO add your handling code here:
        jTextField5.setText("");
        showDocumentInTable();
        setColumnWidthDocument();
    }//GEN-LAST:event_jButton17MouseClicked

    private void jButton18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseClicked
        // TODO add your handling code here:
        jTextField6.setText("");
        showTaskInTable();
        setColumnWidthTask();
    }//GEN-LAST:event_jButton18MouseClicked

    private void jButton19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseClicked
        // TODO add your handling code here:
        new BrokerPanel().setVisible(true);
    }//GEN-LAST:event_jButton19MouseClicked

    private void jButton20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20MouseClicked

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jLabel25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseEntered
        // TODO add your handling code here:
        jLabel25.setForeground(thirdColor);
    }//GEN-LAST:event_jLabel25MouseEntered

    private void jLabel25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseExited
        // TODO add your handling code here:
        jLabel25.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel25MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        jLabel1.setForeground(thirdColor);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        jLabel1.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jButton21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton21MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21MouseClicked

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        yearTradesBindSource();
        setColumnWidthYearTrades();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton22MouseClicked
        // TODO add your handling code here:
        Adjustment adjustment = new Adjustment();
        adjustment.setVisible(true);
    }//GEN-LAST:event_jButton22MouseClicked
   
        
    
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
