
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import project.ButtonActivator;
import project.ColorGenerator;
import project.FormInterface;
import project.InsertUpdateDelete;
import project.Select;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author alk_6
 */
public class DoubleEntryInsert extends javax.swing.JFrame {

    private static int voucherID;
    private static String voucherDate;
    private static String voucherType;
    private static int lineID;
    private static int parentID;
    private static String acctDetail;
    private static String acctType;
    private static int debit;
    private static int credit;
    private static String narration;
    private static String notes;
    private static boolean isExported;
    
    private FormInterface observer;    
    private static DoubleEntryInsert instance;
    
    private Color primaryColor = ColorGenerator.generateRandomPrimaryColor();
    private Color secondaryColor = ColorGenerator.generateSecondaryColor(primaryColor);
    private Color thirdColor = ColorGenerator.generateThirdColor(secondaryColor);
    
    /**
     * Creates new form DoubleEntryInsert
     */
    public DoubleEntryInsert(int voucherID, String voucherDate, String voucherType, int lineID, int parentID, String acctDetail, String acctType, int debit, int credit, String narration, String notes, boolean isExported) {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        jButton4.setVisible(false);
        //getRootPane().setDefaultButton(jButton4);        
        populateVoucherTypeComboBox();
        populateAccountDetailComboBox();
        populateAccountTypeComboBox();
        populateComboModeComboBox();
        jButton2.requestFocusInWindow();
        
        SimpleDateFormat myFormat= new SimpleDateFormat("yyyy-MM-dd");      
        Calendar cal=Calendar.getInstance();
        jTextField7.setText(myFormat.format(cal.getTime()));
        
        jTextField13.addFocusListener(new TextFieldFocusListener());
        jTextField14.addFocusListener(new TextFieldFocusListener());
        jTextField16.addFocusListener(new TextFieldFocusListener());
        jTextField17.addFocusListener(new TextFieldFocusListener());
        
        getBank();
        getCash();
        getCreditCard();
        getWallet();
        
        
        this.voucherID = voucherID;
        this.voucherDate = voucherDate;
        this.voucherType = voucherType;
        this.lineID = lineID;
        this.parentID = parentID;
        this.acctDetail = acctDetail;
        this.acctType = acctType;
        this.debit = debit;
        this.credit = credit;
        this.narration = narration;
        this.notes = notes;
        this.isExported = isExported;
        
        // Set the values to the text boxes and combo boxes
        jTextField6.setText(String.valueOf(voucherID));
        jTextField7.setText(voucherDate);
        jComboBox4.setSelectedItem(voucherType);
        jTextField8.setText(String.valueOf(lineID));
        jTextField9.setText(String.valueOf(parentID));
        jComboBox1.setSelectedItem(acctDetail);       
        jComboBox2.setSelectedItem(acctType);
        jTextField13.setText(String.valueOf(debit));
        jTextField14.setText(String.valueOf(credit));
        jTextField16.setText(narration);
        jTextField17.setText(notes);
        jCheckBox1.setSelected(isExported);
        
        ButtonActivator.makeButtonDefaultOnEnter(jButton1);
        ButtonActivator.makeButtonDefaultOnEnter(jButton2);
        ButtonActivator.makeButtonDefaultOnEnter(jButton3);
        ButtonActivator.makeButtonDefaultOnEnter(jButton4);
        
        jButton2.setNextFocusableComponent(jComboBox4);
        jComboBox4.setNextFocusableComponent(jButton1);
        jComboBox1.setNextFocusableComponent(jComboBox2);
        jComboBox2.setNextFocusableComponent(jTextField13);
        jTextField13.setNextFocusableComponent(jTextField14);
        jTextField14.setNextFocusableComponent(jTextField16);
        jTextField16.setNextFocusableComponent(jTextField17);
        jTextField17.setNextFocusableComponent(jButton3);
        jButton3.setNextFocusableComponent(jButton4);
        jButton4.setNextFocusableComponent(jComboBox1);
        
        jPanel1.setBackground(primaryColor);
        jPanel2.setBackground(secondaryColor);
        jPanel3.setBackground(thirdColor);
        jPanel4.setBackground(thirdColor);
        
        jButton1.setBackground(secondaryColor);
        jButton5.setBackground(secondaryColor);
        jButton2.setBackground(secondaryColor);
        jButton3.setBackground(secondaryColor);
        jButton4.setBackground(secondaryColor);        
        
        jTextField1.setBackground(secondaryColor);
        jTextField2.setBackground(secondaryColor);
        jTextField3.setBackground(secondaryColor);
        jTextField4.setBackground(secondaryColor);
        jTextField6.setBackground(thirdColor);
        jTextField7.setBackground(thirdColor);        
        jTextField8.setBackground(thirdColor);
        jTextField9.setBackground(thirdColor);
        
        jTextField13.setBackground(thirdColor);
        jTextField14.setBackground(thirdColor);
        jTextField17.setBackground(thirdColor);
        jTextField16.setBackground(thirdColor);
        
        jComboBox1.setBackground(thirdColor);
        jComboBox2.setBackground(thirdColor);
        jComboBox3.setBackground(thirdColor);
        jCheckBox1.setBackground(thirdColor); 
        jComboBox4.setBackground(thirdColor);
        
    }

    // Setter method for observer
    public void setObserver(FormInterface observer) {
        this.observer = observer;
    }
    
    private void notifyObserver() {
        if (observer != null) {
            observer.updateDoubleEntry();
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
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton5 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(286, 328));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(242, 16, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Viner Hand ITC", 1, 40)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("E");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 50, 50));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ntry");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 70, -1));

        jLabel8.setFont(new java.awt.Font("Viner Hand ITC", 1, 40)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("/");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 30, 50));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("nsert");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 70, -1));

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
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 70, -1));

        jLabel25.setFont(new java.awt.Font("Viner Hand ITC", 1, 40)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("U");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 50, 50));

        jLabel26.setFont(new java.awt.Font("Viner Hand ITC", 1, 40)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("I");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 50, 50));

        jLabel27.setFont(new java.awt.Font("Viner Hand ITC", 1, 40)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("D");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        jLabel28.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("ouble");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 70, -1));

        jPanel2.setBackground(new java.awt.Color(235, 64, 52));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bank");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 9, -1, -1));

        jTextField1.setBackground(new java.awt.Color(255, 51, 51));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 102));
        jTextField1.setFocusable(false);
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 160, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cash");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 70, -1));

        jTextField2.setBackground(new java.awt.Color(255, 51, 51));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 102));
        jTextField2.setFocusable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 140, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CreditCard");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        jTextField3.setBackground(new java.awt.Color(255, 51, 51));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 102));
        jTextField3.setFocusable(false);
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 170, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Wallet");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        jTextField4.setBackground(new java.awt.Color(255, 51, 51));
        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 102));
        jTextField4.setFocusable(false);
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 160, -1));

        jPanel3.setBackground(new java.awt.Color(235, 64, 52));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Vr ID");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, -1));

        jTextField6.setBackground(new java.awt.Color(204, 51, 0));
        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 104, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Vr Date");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jTextField7.setBackground(new java.awt.Color(204, 51, 0));
        jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 104, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Line ID");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        jTextField8.setBackground(new java.awt.Color(204, 51, 0));
        jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setFocusable(false);
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 82, -1));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Create ID");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

        jComboBox4.setBackground(new java.awt.Color(204, 51, 0));
        jComboBox4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 120, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Vr Type");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("#Parent");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, -1, -1));

        jTextField9.setBackground(new java.awt.Color(204, 51, 0));
        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setFocusable(false);
        jPanel3.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 82, -1));

        jPanel4.setBackground(new java.awt.Color(204, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Debit");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        jTextField13.setBackground(new java.awt.Color(204, 51, 0));
        jTextField13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 145, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Credit");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, -1, -1));

        jTextField14.setBackground(new java.awt.Color(204, 51, 0));
        jTextField14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(255, 255, 255));
        jTextField14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField14FocusGained(evt);
            }
        });
        jPanel4.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 170, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("AcctDetl");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(204, 51, 0));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 145, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("AcctType");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jComboBox2.setBackground(new java.awt.Color(204, 51, 0));
        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 145, -1));

        jComboBox3.setBackground(new java.awt.Color(204, 51, 0));
        jComboBox3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 84, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Narration");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 67, -1, -1));

        jTextField16.setBackground(new java.awt.Color(204, 51, 0));
        jTextField16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(255, 255, 255));
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 385, -1));

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, -1, -1));

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, -1, -1));

        jButton4.setBackground(new java.awt.Color(204, 0, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Insert");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, -1, -1));

        jCheckBox1.setBackground(new java.awt.Color(204, 51, 0));
        jPanel4.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 32, -1));

        jButton5.setBackground(new java.awt.Color(204, 0, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Update Cal");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Notes");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, -1));

        jTextField17.setBackground(new java.awt.Color(204, 51, 0));
        jTextField17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField17.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 390, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        dispose();
        jButton3.setVisible(true);
        jButton4.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private class TextFieldFocusListener implements FocusListener {
        @Override
        public void focusGained(FocusEvent e) {
            JTextField textField = (JTextField) e.getComponent();
            textField.selectAll();
        }

        @Override
        public void focusLost(FocusEvent e) {
            // No action needed on focus lost
        }
    }
    
    private void getBank(){
        String query = ("SELECT SUM(amt_recd - amt_spent) As BankAsset FROM run_bank_entry");
        ResultSet rs = Select.getData(query);
        
        try {
            while (rs.next()) {
            String bank = rs.getString("BankAsset");
            double numBank = Double.parseDouble(bank);
            NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
            String formattedCurrency = indianCurrencyFormat.format(numBank);
            jTextField1.setText(formattedCurrency);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void getCash(){
        String query = ("SELECT SUM(amt_recd - amt_spent) As CashAsset FROM run_cash_entry");
        ResultSet rs = Select.getData(query);
        
        try {
            while (rs.next()) {
            String cash = rs.getString("CashAsset");
            double numCash = Double.parseDouble(cash);
            NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
            String formattedCurrency = indianCurrencyFormat.format(numCash);
            jTextField2.setText(formattedCurrency);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void getWallet(){
        String query = ("SELECT Amount_Bal As WalletAsset FROM sum_account_name WHERE AccountName = \"Wallet\"");
        ResultSet rs = Select.getData(query);
        
        try {
            while (rs.next()) {
            String wallet = rs.getString("WalletAsset");
            double numWallet = Double.parseDouble(wallet);
            NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
            String formattedCurrency = indianCurrencyFormat.format(numWallet);
            jTextField4.setText(formattedCurrency);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void getCreditCard(){
        String query = ("SELECT bal_payment from liability_entry where AccountName = 'Credit Card'");
        ResultSet rs = Select.getData(query);
        
        try {
            while (rs.next()) {
            String creditCard = rs.getString("bal_payment");
            double numCreditCard = Double.parseDouble(creditCard);
            NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
            String formattedCurrency = indianCurrencyFormat.format(numCreditCard);
            jTextField3.setText(formattedCurrency);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String voucherDate = jTextField7.getText();
        
        String selectedStrVoucherType = (String) jComboBox4.getSelectedItem();        
        int selectedIntVoucherType = nameToIdMap.get(selectedStrVoucherType);
        
        String query = "INSERT INTO vouchert (VoucherDate, fVoucherType)" +
                        "VALUES('" + voucherDate + "', '" + selectedIntVoucherType + "')";
        
        InsertUpdateDelete.setData(query, "ID Created successfully");
        
        String selectQuery = "SELECT VoucherID From vouchert ORDER BY VoucherID DESC LIMIT 1"; // MySQL specific query to get last inserted ID
        try (ResultSet rs = Select.getData(selectQuery)) {
            if (rs.next()) {
                int lastInsertedId = rs.getInt("VoucherID");
                jTextField6.setText(Integer.toString(lastInsertedId)); // Set the retrieved ID to jTextField2
                jComboBox1.requestFocusInWindow();
                jButton1.setVisible(false);
            } else {
                // Handle case where ResultSet is empty
              System.out.println("No rows found in ResultSet");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Handle any SQL exceptions here
        }        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField14FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField14FocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField14FocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        prepareNextEntry();
        jButton1.setVisible(true);
        jButton3.setVisible(false);
        jButton4.setVisible(true);
        //jComboBox1.requestFocusInWindow();
        SimpleDateFormat myFormat= new SimpleDateFormat("yyyy-MM-dd");      
        Calendar cal=Calendar.getInstance();
        jTextField7.setText(myFormat.format(cal.getTime()));
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int voucherID = Integer.parseInt(jTextField6.getText());
        int voucherLineID = Integer.parseInt(jTextField8.getText());
        
        String accountDetail = (String) jComboBox1.getSelectedItem();        
        int accountDetailID = nameToIdMap.get(accountDetail);
        
        String voucherDate = jTextField7.getText();
        
        String accountType = (String) jComboBox2.getSelectedItem();        
        int accountTypeID = nameToIdMap2.get(accountType);
        
        String voucherType = (String) jComboBox4.getSelectedItem();        
        int voucherTypeID = nameToIdMap.get(voucherType);
        
        int debitAmount = Integer.parseInt(jTextField13.getText());
        int creditAmount = Integer.parseInt(jTextField14.getText());
        
        String narration = jTextField16.getText();
        String notes = jTextField17.getText();
        
        
        try
        { 
            String query="UPDATE VoucherLineT, vouchert SET VoucherLineT.fVoucherID = '"+voucherID+"', fAccountDetail = '"+accountDetailID+"'," +
                        " vouchert.VoucherDate = '"+voucherDate+"', fAccountType = '"+accountTypeID+"', vouchert.fVoucherType = '"+voucherTypeID+"', DebitAmount = '"+debitAmount+"'," +
                        " CreditAmount = '"+creditAmount+"', Narration = '"+narration+"', Notes = '"+notes+"' WHERE VoucherLineT.fVoucherID = vouchert.VoucherID AND VoucherLineID = '"+voucherLineID+"' ";
            
                InsertUpdateDelete.setData(query, "Data Updated Successfully");   
                
        //DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        //model.setRowCount(0); // Clear existing rows
        //showDataInTable(); // Load updated data in table
        //setColumnWidth();
        //jTextField4.requestFocusInWindow();  
        
        observer.updateDoubleEntry();
        getBank();
        getCash();
        getCreditCard();
        getWallet();
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (jTextField6.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vr ID must contain data before inserting.", "Input Required", JOptionPane.WARNING_MESSAGE);
        } else {
        
        int voucherID = Integer.parseInt(jTextField6.getText());
        int count = 0;
        
        String accountDetail = (String) jComboBox1.getSelectedItem();        
        int accountDetailID = nameToIdMap.get(accountDetail);
        
        String accountType = (String) jComboBox2.getSelectedItem();        
        int accountTypeID = nameToIdMap2.get(accountType);
        
        int debitAmount = Integer.parseInt(jTextField13.getText());
        int creditAmount = Integer.parseInt(jTextField14.getText());
        String narration = jTextField16.getText();
        String notes = jTextField17.getText();       
        
        
        String selQuery = "SELECT COUNT(fvoucherID)AS VrCount FROM VoucherLineT WHERE fvoucherID = '" + voucherID + "'";
        ResultSet rs = Select.getData(selQuery);
        
        try {
            while (rs.next()) {
            String strCount = rs.getString("VrCount"); 
            count = Integer.parseInt(strCount);            
            }
            
            if (count <=1) {
                
                String query = "INSERT INTO voucherlinet (fAccountDetail, fAccountType, DebitAmount, CreditAmount, Narration, Notes," +
                        " fVoucherID, IsExported) VALUES ('"+accountDetailID+"', '"+accountTypeID+"', '"+debitAmount+"', '"+creditAmount+"'," +
                        " '"+narration+"', '"+notes+"', '"+voucherID+"', '0')";
                
                InsertUpdateDelete.setData(query, "Records Inserted Successfully");
                
                observer.updateDoubleEntry();
                getBank();
                getCash();
                getCreditCard();
                getWallet();
                prepareDoubleEntry();                
                jComboBox1.requestFocusInWindow();
            }else{
                JOptionPane.showMessageDialog(null, "Cannot Insert more than Two entries", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int voucherID = Integer.parseInt(jTextField6.getText());
        
        int debitAmount = Integer.parseInt(jTextField13.getText());
        NumberFormat debitAmountFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String fDebitAmount = debitAmountFormat.format(debitAmount);
        
        
        int creditAmount = Integer.parseInt(jTextField14.getText());
        NumberFormat creditAmountFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String fCreditAmount = creditAmountFormat.format(creditAmount);
        
        String narration = jTextField16.getText();
        String voucherDate = jTextField7.getText();
        
        String accountDetail = (String) jComboBox1.getSelectedItem();
        int intAccountDetail = nameToIdMap.get(accountDetail);
        
        String voucherType = (String) jComboBox4.getSelectedItem();
        int intVoucherType = nameToIdMap.get(voucherType);
        
        String apptSubject = fDebitAmount + "," + " " + fCreditAmount + "," + " " + accountDetail + "," + " " + "Finance" ;
        String apptNotes = accountDetail + "," + " " + narration;
        
        
        String query = ("SELECT COUNT(*)AS Count FROM tblAppointments WHERE VoucherID = '"+voucherID+"'");
        ResultSet rs = Select.getData(query);
        
        try {
            while (rs.next()) {
            String count = rs.getString("Count");
            int intCount = Integer.parseInt(count);
            
                if (intCount >0) {
                    String uQuery = ("UPDATE tblAppointments SET ApptSubject = '"+apptSubject+"', ApptLocation = 'Finance', ApptStart = " +
                        "'"+voucherDate+"', ApptEnd = '"+voucherDate+"', ApptNotes = '"+apptNotes+"', Priority = '5', VoucherID = '"+voucherID+"', Exported = '0', TradeID = '0', CheckID = '0' WHERE VoucherID = '"+voucherID+"'");
                    
                    InsertUpdateDelete.setData(uQuery, "Calendar updated successfully");
                } else {
                    
                    String iQuery = "INSERT INTO tblAppointments (ApptSubject, ApptLocation, ApptStart, ApptEnd, ApptNotes, Priority, VoucherID, Exported, TradeID, CheckID)" +
                        "VALUES ('"+apptSubject+"', 'Finance', '"+voucherDate+"', '"+voucherDate+"','"+apptNotes+"', '5', '"+voucherID+"', '0', '0', '0')";
                    
                    InsertUpdateDelete.setData(iQuery, "Data inserted successfully in Calendar");
                            
                }
            
            }
            
            int voucherLineID = Integer.parseInt(jTextField8.getText());
            
            String mode = (String) jComboBox3.getSelectedItem(); 
            int intMode = nameToIdMap1.get(mode);
            
            
            String registerQuery = "SELECT COUNT(*) As RegCount FROM tblCheckRegister WHERE VoucherLineID = '"+voucherLineID+"' ";
            ResultSet rs1 = Select.getData(registerQuery);          
                        
            try{
               while (rs1.next()) {
                String count1 = rs1.getString("RegCount");
                int intCount1 = Integer.parseInt(count1);
            
                    if (intCount1 >0) {
                        String uRegQuery = ("UPDATE tblCheckRegister SET Credit = '"+creditAmount+"', Debit = '"+debitAmount+"', CheckDate = '"+voucherDate+"'," +
                        " Category = '"+intAccountDetail+"', IncomeExpense = '"+intVoucherType+"', Description = '"+narration+"', Mode = '"+intMode+"' WHERE VoucherLineID = '"+voucherLineID+"'");
                    
                        InsertUpdateDelete.setData(uRegQuery, "Chk Register updated successfully");
                    } else {
                    
                        String iRegQuery = "INSERT INTO tblCheckRegister (Credit, Debit, CheckDate, Category, IncomeExpense, Description, Mode, VoucherLineID)" +
                        "VALUES('"+creditAmount+"', '"+debitAmount+"', '"+voucherDate+"', '"+intAccountDetail+"', '"+intVoucherType+"', '"+narration+"', '"+intMode+"', '"+voucherLineID+"')";
                    
                        InsertUpdateDelete.setData(iRegQuery, "Data inserted successfully in Chk Register");
                            
                    }
            
                } 
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
                    
            jCheckBox1.setSelected(true);
            updateCheckRegister();
            updateCheckCalendar();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }       
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void updateCheckRegister(){
        int checkBoxValue;
        String voucherLineID = jTextField8.getText();
        
        if (jCheckBox1.isSelected()) {
    
            checkBoxValue = -1;
        } else {
    
            checkBoxValue = 0;
        }
        
        try {
            String query = "UPDATE tblCheckRegister SET IsCleared = '"+checkBoxValue+"' WHERE VoucherLineID = '"+voucherLineID+"' ";
            InsertUpdateDelete.setData(query, "");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void updateCheckCalendar(){
        int checkBoxValue;
        String voucherLineID = jTextField8.getText();
        
        if (jCheckBox1.isSelected()) {
    
            checkBoxValue = -1;
        } else {
    
            checkBoxValue = 0;
        }
        
        try {
            String query = "UPDATE voucherlinet SET IsExported = '"+checkBoxValue+"' WHERE VoucherLineID = '"+voucherLineID+"' ";
            InsertUpdateDelete.setData(query, "");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        jLabel1.setForeground(thirdColor);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        jLabel1.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel1MouseExited

    // Declare nameToIdMap as a class member
    private Map<String, Integer> nameToIdMap = new HashMap<>();
    
    private void populateVoucherTypeComboBox() {
        String query = "SELECT VoucherTypeID, VoucherType FROM VoucherTypeT";
        ResultSet rs = Select.getData(query);

        try {
            while (rs.next()) {
                String voucherType = rs.getString("VoucherType");
                jComboBox4.addItem(voucherType); // Add broker name to JComboBox
                // Assuming brokerId is retrieved from the ResultSet
                int voucherTypeID = rs.getInt("VoucherTypeID");
                // Add mapping between name and ID to the map
                nameToIdMap.put(voucherType, voucherTypeID);
                
                if (voucherTypeID == 1) {
                jComboBox4.setSelectedItem(voucherType); // Set the default value in the JComboBox
                }
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
    }
    
    private void populateAccountDetailComboBox() {
        String query = "SELECT AccountDetailID, AccountName FROM accountdetailt";
        ResultSet rs = Select.getData(query);

        try {
            while (rs.next()) {
                String accountName = rs.getString("AccountName");
                jComboBox1.addItem(accountName); // Add broker name to JComboBox
                // Assuming brokerId is retrieved from the ResultSet
                int accountDetailID = rs.getInt("AccountDetailID");
                // Add mapping between name and ID to the map
                nameToIdMap.put(accountName, accountDetailID);
                
                //if (accountDetailID == 2) {
                //jComboBox2.setSelectedItem(accountName); // Set the default value in the JComboBox
                //}
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
    }
    
    private Map<String, Integer> nameToIdMap2 = new HashMap<>();
    private void populateAccountTypeComboBox() {
        String query = "SELECT AccountTypeID, AccountType FROM accounttypet";
        ResultSet rs = Select.getData(query);

        try {
            while (rs.next()) {
                String accountType = rs.getString("AccountType");
                jComboBox2.addItem(accountType); // Add broker name to JComboBox
                // Assuming brokerId is retrieved from the ResultSet
                int accountTypeID = rs.getInt("AccountTypeID");
                // Add mapping between name and ID to the map
                nameToIdMap2.put(accountType, accountTypeID);
                
                if (accountTypeID == 1) {
                jComboBox2.setSelectedItem(accountType); // Set the default value in the JComboBox
                }
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
    }
    
    private Map<String, Integer> nameToIdMap1 = new HashMap<>();
    private void populateComboModeComboBox() {
        String query = "SELECT ModeID, ChkMode FROM tblchkmode";
        ResultSet rs = Select.getData(query);

        try {
            while (rs.next()) {
                String chkMode = rs.getString("ChkMode");
                jComboBox3.addItem(chkMode); // Add broker name to JComboBox
                // Assuming brokerId is retrieved from the ResultSet
                int modeID = rs.getInt("ModeID");
                // Add mapping between name and ID to the map
                nameToIdMap1.put(chkMode, modeID);
                
                if (modeID == 4) {
                jComboBox3.setSelectedItem(chkMode); // Set the default value in the JComboBox
                }
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
    }
    
    private void prepareDoubleEntry() {
               
        jTextField13.setText("0");
        jTextField14.setText("0");
        jComboBox1.requestFocusInWindow();
         
    }
    
    private void prepareNextEntry(){
        jTextField6.setText("");
        jTextField8.setText("");
        jTextField13.setText("0");
        jTextField14.setText("0");
        jTextField16.setText("");
        jTextField17.setText("");
        jComboBox4.requestFocusInWindow();
    }
    
    public void updateFields(int voucherID, String voucherDate, String voucherType, int lineID, int parentID, String acctDetail, String acctType, int debit, int credit, String narration, String notes, boolean isExported){
        prepareNextEntry();
        // Set the values to the text boxes and combo boxes
        jTextField6.setText(String.valueOf(voucherID));
        jTextField7.setText(voucherDate);
        jComboBox4.setSelectedItem(voucherType);
        jTextField8.setText(String.valueOf(lineID));
        jTextField9.setText(String.valueOf(parentID));
        jComboBox1.setSelectedItem(acctDetail);       
        jComboBox2.setSelectedItem(acctType);
        jTextField13.setText(String.valueOf(debit));
        jTextField14.setText(String.valueOf(credit));
        jTextField16.setText(narration);
        jTextField17.setText(notes);
        jCheckBox1.setSelected(isExported);
    }
    
    public static DoubleEntryInsert getInstance(int voucherID, String voucherDate, String voucherType, int lineID, int parentID, String acctDetail, String acctType, int debit, int credit, String narration, String notes, boolean isExported) {
        if (instance == null) {
            instance = new DoubleEntryInsert(voucherID, voucherDate, voucherType, lineID, parentID, acctDetail, acctType, debit, credit, narration, notes, isExported);
        } else {            
            // If an instance already exists, update its fields with new data
            instance.updateFields(voucherID, voucherDate, voucherType, lineID, parentID, acctDetail, acctType, debit, credit, narration, notes, isExported);
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
            java.util.logging.Logger.getLogger(DoubleEntryInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoubleEntryInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoubleEntryInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoubleEntryInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (DoubleEntryInsert.instance != null) {
                DoubleEntryInsert.instance.dispose();
                }
                DoubleEntryInsert.instance = DoubleEntryInsert.getInstance(voucherID, voucherDate, voucherType, lineID, parentID, acctDetail, acctType, debit, credit, narration, notes, isExported);
                DoubleEntryInsert.instance.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
