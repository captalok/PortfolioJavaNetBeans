 
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
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
public class TradeInsert extends javax.swing.JFrame {

    private static int tradeLineID;
    private static int tradeID;
    private static String buyDate;
    private static String brokerName;
    private static String scripName;
    private static String tradeType;
    private static int buyQty;
    private static double buyPrice;
    private static double sellPrice;
    private static double brokerage;
    private static double depositWithdrawal;
    private static double grossProfit;
    private static double pips;
    private static String sellDate;
    private static String note;
    private static boolean isExported;
    private static String formattedProfit;
    private static String formattedPips;
    private static String formattedDeposit;
    private static String formattedBrokerage;
    
    private FormInterface observer;    
    private static TradeInsert instance;
    
    private Color primaryColor = ColorGenerator.generateRandomPrimaryColor();
    private Color secondaryColor = ColorGenerator.generateSecondaryColor(primaryColor);
    private Color thirdColor = ColorGenerator.generateThirdColor(secondaryColor);
    
    
    public TradeInsert(int tradeLineID, int tradeID, String buyDate, String brokerName, String scripName, String tradeType, int buyQty, double buyPrice, double sellPrice, double brokerage, double depositWithdrawal, double grossProfit, double pips, String sellDate, String note, boolean isExported, String formattedProfit, String formattedPips, String formattedDeposit, String formattedBrokerage){
        initComponents();
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jButton4.setVisible(false);
        setAlwaysOnTop(true);
        populateBrokerComboBox();
        populateScripComboBox();
        populateTradeTypeComboBox();
        getDemat();
        getInvested();
        getProfit();
        getBrokerage();         
        
        // Assign values to the fields
        this.tradeLineID = tradeLineID;
        this.tradeID = tradeID;
        this.buyDate = buyDate;
        this.brokerName = brokerName;
        this.scripName = scripName;
        this.tradeType = tradeType;
        this.buyQty = buyQty;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.brokerage = brokerage;
        this.depositWithdrawal = depositWithdrawal;
        this.grossProfit = grossProfit;
        this.pips = pips;
        this.sellDate = sellDate;
        this.note = note;
        this.isExported = isExported;
        this.formattedProfit = formattedProfit;
        this.formattedPips = formattedPips;
        this.formattedDeposit = formattedDeposit;
        this.formattedBrokerage = formattedBrokerage;
        
        // Set the values to the text boxes and combo boxes
        jTextField8.setText(String.valueOf(tradeLineID));
        jTextField6.setText(String.valueOf(tradeID));
        jTextField11.setText(String.valueOf(buyQty));
        jTextField12.setText(String.valueOf(buyPrice));
        jTextField13.setText(String.valueOf(sellPrice));
        jTextField14.setText(String.valueOf(brokerage));
        jTextField15.setText(String.valueOf(depositWithdrawal));
        NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String sGrossProfit = indianCurrencyFormat.format(grossProfit);
        jTextField20.setText(String.valueOf(sGrossProfit));
        // Set other text fields similarly
        
        jComboBox1.setSelectedItem(brokerName);
        jComboBox2.setSelectedItem(scripName);
        jComboBox3.setSelectedItem(tradeType);
        // Set other combo boxes similarly
        
        jTextField7.setText(buyDate);
        jTextField10.setText(sellDate);
        jTextField16.setText(note);
        // Set other text fields similarly
        
        jCheckBox1.setSelected(isExported);
        jTextField5.setText(String.valueOf(formattedProfit));
        jTextField17.setText(String.valueOf(formattedPips));
        jTextField18.setText(String.valueOf(formattedDeposit));
        jTextField19.setText(String.valueOf(formattedBrokerage));
        
        jButton2.requestFocusInWindow();
        
        jTextField11.addFocusListener(new TextFieldFocusListener());
        jTextField12.addFocusListener(new TextFieldFocusListener());
        jTextField13.addFocusListener(new TextFieldFocusListener());
        jTextField14.addFocusListener(new TextFieldFocusListener());
        jTextField15.addFocusListener(new TextFieldFocusListener());
        jTextField16.addFocusListener(new TextFieldFocusListener());
        jTextField20.addFocusListener(new TextFieldFocusListener());
        
        //getRootPane().setDefaultButton(jButton4);
        ButtonActivator.makeButtonDefaultOnEnter(jButton1);
        ButtonActivator.makeButtonDefaultOnEnter(jButton2);
        ButtonActivator.makeButtonDefaultOnEnter(jButton3);
        ButtonActivator.makeButtonDefaultOnEnter(jButton4);
        
        jButton2.setNextFocusableComponent(jButton1);
        jTextField11.setNextFocusableComponent(jTextField12);
        jTextField12.setNextFocusableComponent(jTextField13);
        jTextField13.setNextFocusableComponent(jTextField14);
        jTextField14.setNextFocusableComponent(jTextField15);
        jTextField15.setNextFocusableComponent(jComboBox1);
        jComboBox1.setNextFocusableComponent(jComboBox2);
        jComboBox2.setNextFocusableComponent(jComboBox3);
        jComboBox3.setNextFocusableComponent(jTextField16);
        jTextField16.setNextFocusableComponent(jButton3);
        jButton3.setNextFocusableComponent(jButton4);
        jButton4.setNextFocusableComponent(jTextField11);       
        
               
        SimpleDateFormat myFormat= new SimpleDateFormat("yyyy-MM-dd");      
        Calendar cal=Calendar.getInstance();
        jTextField7.setText(myFormat.format(cal.getTime()));
        //jTextField9.setText(myFormat.format(cal.getTime()));
        sellDate = jTextField7.getText();
        jTextField10.setText(sellDate); 
        
        jPanel1.setBackground(primaryColor);
        jPanel2.setBackground(secondaryColor);
        jPanel3.setBackground(thirdColor);
        jPanel4.setBackground(thirdColor);
        jButton1.setBackground(secondaryColor);
        jButton5.setBackground(secondaryColor);
        jButton2.setBackground(secondaryColor);
        jButton3.setBackground(secondaryColor);
        jButton4.setBackground(secondaryColor);
        jTextField5.setBackground(primaryColor);
        jTextField17.setBackground(primaryColor);
        jTextField18.setBackground(primaryColor);
        jTextField19.setBackground(primaryColor);
        jTextField1.setBackground(secondaryColor);
        jTextField2.setBackground(secondaryColor);
        jTextField3.setBackground(secondaryColor);
        jTextField4.setBackground(secondaryColor);
        jTextField6.setBackground(thirdColor);
        jTextField7.setBackground(thirdColor);
        jTextField10.setBackground(thirdColor);
        jTextField8.setBackground(thirdColor);
        jTextField9.setBackground(thirdColor);
        jTextField11.setBackground(thirdColor);
        jTextField12.setBackground(thirdColor);
        jTextField13.setBackground(thirdColor);
        jTextField14.setBackground(thirdColor);
        jTextField15.setBackground(thirdColor);
        jTextField16.setBackground(thirdColor);
        jTextField20.setBackground(thirdColor);        
        jComboBox1.setBackground(thirdColor);
        jComboBox2.setBackground(thirdColor);
        jComboBox3.setBackground(thirdColor);
        jCheckBox1.setBackground(thirdColor);      
    }
    
    // Setter method for observer
    public void setObserver(FormInterface observer) {
        this.observer = observer;
    }
    
    private void notifyObserver() {
        if (observer != null) {
            observer.updateTrade();
        }
    }
    
    /**
     * Creates new form TradeInsert
     */
    

    
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
        jTextField5 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
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
        jLabel14 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton5 = new javax.swing.JButton();
        jTextField20 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(286, 325));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(242, 16, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Viner Hand ITC", 1, 40)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("T");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("rade");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 50, -1));

        jLabel8.setFont(new java.awt.Font("Viner Hand ITC", 1, 40)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("/");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 30, 50));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("nsert");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 70, -1));

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
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 70, -1));

        jLabel25.setFont(new java.awt.Font("Viner Hand ITC", 1, 40)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("U");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 50, 50));

        jLabel26.setFont(new java.awt.Font("Viner Hand ITC", 1, 40)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("I");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 50, 50));

        jTextField5.setBackground(new java.awt.Color(255, 51, 51));
        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(153, 255, 102));
        jTextField5.setFocusable(false);
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 150, -1));

        jTextField17.setBackground(new java.awt.Color(255, 51, 51));
        jTextField17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField17.setForeground(new java.awt.Color(153, 255, 102));
        jTextField17.setFocusable(false);
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 60, -1));

        jTextField18.setBackground(new java.awt.Color(255, 51, 51));
        jTextField18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField18.setForeground(new java.awt.Color(153, 255, 102));
        jTextField18.setFocusable(false);
        jPanel1.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 110, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Profit");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Pips");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 30, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Deposit");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Brok");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, -1));

        jTextField19.setBackground(new java.awt.Color(255, 51, 51));
        jTextField19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField19.setForeground(new java.awt.Color(153, 255, 102));
        jTextField19.setFocusable(false);
        jPanel1.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 90, -1));

        jPanel2.setBackground(new java.awt.Color(235, 64, 52));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Demat");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 9, -1, -1));

        jTextField1.setBackground(new java.awt.Color(255, 51, 51));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 102));
        jTextField1.setFocusable(false);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 170, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Profit");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 40, -1));

        jTextField2.setBackground(new java.awt.Color(255, 51, 51));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 102));
        jTextField2.setFocusable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 210, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Invested");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        jTextField3.setBackground(new java.awt.Color(255, 51, 51));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 102));
        jTextField3.setFocusable(false);
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 180, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Brok");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        jTextField4.setBackground(new java.awt.Color(255, 51, 51));
        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 102));
        jTextField4.setFocusable(false);
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 150, -1));

        jPanel3.setBackground(new java.awt.Color(235, 64, 52));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Trade ID");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 9, -1, -1));

        jTextField6.setBackground(new java.awt.Color(204, 51, 0));
        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 6, 104, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Buy Dt");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 9, -1, -1));

        jTextField7.setBackground(new java.awt.Color(204, 51, 0));
        jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 6, 104, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Line ID");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 10, -1, -1));

        jTextField8.setBackground(new java.awt.Color(204, 51, 0));
        jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setFocusable(false);
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 7, 82, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Brok");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 10, -1, -1));

        jTextField9.setBackground(new java.awt.Color(204, 51, 0));
        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setFocusable(false);
        jPanel3.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(807, 7, 100, -1));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Create ID");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 6, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Sell Dt");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 9, -1, -1));

        jTextField10.setBackground(new java.awt.Color(204, 51, 0));
        jTextField10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 6, 105, -1));

        jPanel4.setBackground(new java.awt.Color(204, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Buy Sell Qty");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 21, -1, -1));

        jTextField11.setBackground(new java.awt.Color(204, 51, 0));
        jTextField11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 21, 70, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Buy Price");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jTextField12.setBackground(new java.awt.Color(204, 51, 0));
        jTextField12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 90, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Sell Price");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jTextField13.setBackground(new java.awt.Color(204, 51, 0));
        jTextField13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 100, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Realz P&L");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, 20));

        jTextField14.setBackground(new java.awt.Color(204, 51, 0));
        jTextField14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(255, 255, 255));
        jTextField14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField14FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField14FocusLost(evt);
            }
        });
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 90, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Deposit");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 64, -1, -1));

        jTextField15.setBackground(new java.awt.Color(204, 51, 0));
        jTextField15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField15.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 61, 145, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Broker");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 64, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(204, 51, 0));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 61, 145, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Scrip");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 64, -1, -1));

        jComboBox2.setBackground(new java.awt.Color(204, 51, 0));
        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 61, 145, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Type");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(732, 64, -1, -1));

        jComboBox3.setBackground(new java.awt.Color(204, 51, 0));
        jComboBox3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 61, 104, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Notes");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 101, -1, -1));

        jTextField16.setBackground(new java.awt.Color(204, 51, 0));
        jTextField16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 101, 380, -1));

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

        jCheckBox1.setBackground(new java.awt.Color(204, 51, 0));
        jPanel4.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 104, 32, -1));

        jButton5.setBackground(new java.awt.Color(204, 0, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Update Cal");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 101, -1, -1));

        jTextField20.setBackground(new java.awt.Color(204, 51, 0));
        jTextField20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField20.setForeground(new java.awt.Color(255, 255, 102));
        jTextField20.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField20FocusGained(evt);
            }
        });
        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 190, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Brok");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
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
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    
    
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:       
        dispose();
        jButton3.setVisible(true);
        jButton4.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        resetEntry();
        jButton1.setVisible(true);
        jButton3.setVisible(false);
        jButton4.setVisible(true);
        //jTextField11.requestFocusInWindow();
        SimpleDateFormat myFormat= new SimpleDateFormat("yyyy-MM-dd");      
        Calendar cal=Calendar.getInstance();
        jTextField7.setText(myFormat.format(cal.getTime()));
        //jTextField9.setText(myFormat.format(cal.getTime()));
        sellDate = jTextField7.getText();
        jTextField10.setText(sellDate); 
    }//GEN-LAST:event_jButton2ActionPerformed
      
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int tradeID = Integer.parseInt(jTextField6.getText());        
        String buyDate = jTextField7.getText();        
        int buyQty = Integer.parseInt(jTextField11.getText());
        double buyPrice = Double.parseDouble(jTextField12.getText());
        double sellPrice = Double.parseDouble(jTextField13.getText());
        double brokerage = Double.parseDouble(jTextField14.getText());
        double depositWithdrawal = Double.parseDouble(jTextField15.getText());
        String sellDate = jTextField10.getText();
        String note = jTextField16.getText();
        int tradeLineID = Integer.parseInt(jTextField8.getText());
        
        String selectedBrokerName = (String) jComboBox1.getSelectedItem();        
        int selectedBrokerId = nameToIdMap.get(selectedBrokerName);
        
        String selectedScripName = (String) jComboBox2.getSelectedItem();        
        int selectedScripId = nameToIdMap.get(selectedScripName);
        
        String selectedTypeName = (String) jComboBox3.getSelectedItem();        
        int selectedTypeId = nameToIdMap.get(selectedTypeName);
        
        try
        { 
            String query="UPDATE TradeLineT, tradet SET TradeLineT.TradeID = '"+tradeID+"', BrokerID = '"+selectedBrokerId+"'," +
                        " Tradet.BuyDate = '"+buyDate+"', ScripID = '"+selectedScripId+"', TradeTypeID = '"+selectedTypeId+"', BuyQty = '"+buyQty+"'," +
                        " BuyPrice = '"+buyPrice+"', SellPrice = '"+sellPrice+"', Brokerage = '"+brokerage+"', DepositWithdrawal = '"+depositWithdrawal+"'," +
                        " SellDate = '"+sellDate+"', Note = '"+note+"' WHERE TradeLineT.TradeID = TradeT.TradeID AND TradeLineID = '"+tradeLineID+"'";
            
                InsertUpdateDelete.setData(query, "Data Updated Successfully");   
                
        
        observer.updateTrade();
        getDemat();
        getInvested();
        getProfit();
        getBrokerage();
                    
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField14FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField14FocusGained
        // TODO add your handling code here:
        double qty = Double.parseDouble(jTextField11.getText());
        double buyPrice = Double.parseDouble(jTextField12.getText());
        double sellPrice = Double.parseDouble(jTextField13.getText());
        double buyamt = qty * buyPrice;
        double sellamt = qty * sellPrice;        
        double cBrokerage = ((buyamt + sellamt) * 0.0999999 / 100) + 20;
        DecimalFormat df = new DecimalFormat("#.##");
        String sBrokerage = df.format(cBrokerage);
        //String sBrokerage = Double.toString(cBrokerage);
        jTextField9.setText(sBrokerage);  
    }//GEN-LAST:event_jTextField14FocusGained

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String dtSellDate = jTextField10.getText();
        String profit = jTextField5.getText();
        String pips = jTextField17.getText();
        String deposit = jTextField18.getText();
        String apptSubject = profit + "," + " " + pips + "," + " " + deposit + " " + "Trades";
        String apptNotes = "Profit: " + profit + "," + "  " + pips + "," + "  " + deposit;
        
        int tradeID = Integer.parseInt(jTextField6.getText());
        String query = ("SELECT COUNT(*) AS Count FROM tblAppointments WHERE TradeID = '"+tradeID+"'");
        ResultSet rs = Select.getData(query);
        
        try {
            while (rs.next()) {
            String count = rs.getString("Count");
            int intCount = Integer.parseInt(count);
            
                if (intCount >0) {
                    String uQuery = ("UPDATE tblAppointments SET ApptSubject = '"+apptSubject+"', ApptLocation = 'Trades', ApptStart = '" + dtSellDate + "', "+
                            "ApptEnd = '" + dtSellDate + "', " +
                            "ApptNotes = '"+apptNotes+"', Priority = '5', CheckID = '0' WHERE TradeID = '"+tradeID+"'");
                    
                    InsertUpdateDelete.setData(uQuery, "Calendar updated successfully");
                } else {
                    
                    String iQuery = "INSERT INTO tblAppointments (ApptSubject, ApptLocation, ApptStart, ApptEnd, ApptNotes, Priority, TradeID, CheckID)" +
                            "VALUES('"+apptSubject+"', 'Trades', '" + dtSellDate + "', '"+dtSellDate+"', '"+apptNotes+"',5, '"+tradeID+"',0)";
                    
                    InsertUpdateDelete.setData(iQuery, "Data inserted successfully in Calendar");
                            
                }
            
            }
            jCheckBox1.setSelected(true);
            updateCheckBox();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here: 
        int field1Value = Integer.parseInt(jTextField11.getText().trim());
        if (field1Value == 0 || jTextField6.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Trade ID should be there or Buy Sell Qty should be > 0", "Invalid Input", JOptionPane.WARNING_MESSAGE);
        } else {
        
        int tradeID = Integer.parseInt(jTextField6.getText());
        int qty = Integer.parseInt(jTextField11.getText());
        double buyPrice = Double.parseDouble(jTextField12.getText());
        double sellPrice = Double.parseDouble(jTextField13.getText());
        double brokerage = Double.parseDouble(jTextField14.getText());
        double deposit = Double.parseDouble(jTextField15.getText());        
        
        String sellDate = jTextField10.getText();        
        
        String selectedBrokerName = (String) jComboBox1.getSelectedItem();        
        int selectedBrokerId = nameToIdMap.get(selectedBrokerName);
        
        String selectedScripName = (String) jComboBox2.getSelectedItem();        
        int selectedScripId = nameToIdMap.get(selectedScripName);
        
        String selectedTypeName = (String) jComboBox3.getSelectedItem();        
        int selectedTypeId = nameToIdMap.get(selectedTypeName);                    
                     
        String notes = jTextField16.getText();       
        
        // Construct the INSERT query
        String query = "INSERT INTO tradelinet (BuyQty, BrokerID, ScripID, TradeTypeID,Brokerage, BuyPrice, SellPrice," +
                        " DepositWithdrawal, Note, SellDate, TradeID) VALUES ('"+qty+"','"+selectedBrokerId+"' ,'"+selectedScripId+"', '"+selectedTypeId+"','"+brokerage+"'," +
                        " '"+buyPrice+"', '"+sellPrice+"', '"+deposit+"', '"+notes+"','"+sellDate+"', '"+tradeID+"')";

        // Call setData method from InsertUpdateDelete class to execute the query
        InsertUpdateDelete.setData(query, "Data inserted successfully");
        observer.updateTrade();
        getDemat();
        getInvested();
        getProfit();
        getBrokerage();
        prepareNextEntry();        
        
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat myFormat= new SimpleDateFormat("yyyy-MM-dd");      
        Calendar cal=Calendar.getInstance();
        jTextField7.setText(myFormat.format(cal.getTime()));
        String buyDate = jTextField7.getText(); 
        
        String query = "INSERT INTO tradet (BuyDate) VALUES('"+buyDate+"')";        
        InsertUpdateDelete.setData(query, "ID Created successfully");
        
        String selectQuery = "SELECT TradeID From tradet ORDER BY TradeID DESC LIMIT 1"; // MySQL specific query to get last inserted ID
        try (ResultSet rs = Select.getData(selectQuery)) {
            if (rs.next()) {
                int lastInsertedId = rs.getInt("TradeID");
                jTextField6.setText(Integer.toString(lastInsertedId)); // Set the retrieved ID to jTextField2
                jTextField11.requestFocusInWindow();
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

    private void jTextField20FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField20FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20FocusGained

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void jTextField14FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField14FocusLost
        // TODO add your handling code here:
        double qty = Double.parseDouble(jTextField11.getText());
        double buyPrice = Double.parseDouble(jTextField12.getText());
        double sellPrice = Double.parseDouble(jTextField13.getText());
        double brokerage = Double.parseDouble(jTextField14.getText());
        double buyamt = qty * buyPrice;
        double sellamt = qty * sellPrice;        
        //double cBrokerage = ((buyamt + sellamt) * 0.0999999 / 100) + 20;
        double cPnl = (sellamt - buyamt)- brokerage;
        NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String sPnl = indianCurrencyFormat.format(cPnl);
        //String sBrokerage = Double.toString(cBrokerage);
        jTextField20.setText(sPnl);
        
    }//GEN-LAST:event_jTextField14FocusLost

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        jLabel1.setForeground(thirdColor);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        jLabel1.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
        getDemat();
        getInvested();
        getProfit();
        getBrokerage(); 
    }//GEN-LAST:event_jTextField1MouseClicked

    private void updateCheckBox(){
        int checkBoxValue;
        String tradeLineId = jTextField8.getText();
        
        if (jCheckBox1.isSelected()) {
    
            checkBoxValue = -1;
        } else {
    
            checkBoxValue = 0;
        }
        
        try {
            String query = "UPDATE tradelinet,tradet SET IsExported = '"+checkBoxValue+"' WHERE TradeLineT.TradeID = TradeT.TradeID AND TradeLineID = '"+tradeLineId+"'";
            InsertUpdateDelete.setData(query, "");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    // Declare nameToIdMap as a class member
    private Map<String, Integer> nameToIdMap = new HashMap<>();
    
    private void populateBrokerComboBox() {
        String query = "SELECT brokerid, brokername FROM brokert";
        ResultSet rs = Select.getData(query);

        try {
            while (rs.next()) {
                String brokerName = rs.getString("brokername");
                jComboBox1.addItem(brokerName); // Add broker name to JComboBox
                // Assuming brokerId is retrieved from the ResultSet
                int brokerId = rs.getInt("brokerid");
                // Add mapping between name and ID to the map
                nameToIdMap.put(brokerName, brokerId);
                
                if (brokerId == 3) {
                jComboBox1.setSelectedItem(brokerName); // Set the default value in the JComboBox
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
    
    private void populateScripComboBox() {
        String query = "SELECT Scripid, ScripName FROM Scripnamet";
        ResultSet rs = Select.getData(query);

        try {
            while (rs.next()) {
                String scripName = rs.getString("ScripName");
                jComboBox2.addItem(scripName); // Add broker name to JComboBox
                // Assuming brokerId is retrieved from the ResultSet
                int scripId = rs.getInt("Scripid");
                // Add mapping between name and ID to the map
                nameToIdMap.put(scripName, scripId);
                
                if (scripId == 50) {
                jComboBox2.setSelectedItem(scripName); // Set the default value in the JComboBox
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
    
    private void populateTradeTypeComboBox() {
        String query = "SELECT * FROM TradeTypet";
        ResultSet rs = Select.getData(query);

        try {
            while (rs.next()) {
                String tradeType = rs.getString("TradeType");
                jComboBox3.addItem(tradeType); // Add broker name to JComboBox
                // Assuming brokerId is retrieved from the ResultSet
                int tradeTypeId = rs.getInt("TradeTypeid");
                // Add mapping between name and ID to the map
                nameToIdMap.put(tradeType, tradeTypeId);
                
                if (tradeTypeId == 1) {
                jComboBox3.setSelectedItem(tradeType); // Set the default value in the JComboBox
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
    
    private void getDemat(){
        String query = ("SELECT demat_value FROM demat_account");
        ResultSet rs = Select.getData(query);
        
        try {
            while (rs.next()) {
            String demat = rs.getString("demat_value");
            double numDemat = Double.parseDouble(demat);
            NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
            String formattedCurrency = indianCurrencyFormat.format(numDemat);
            jTextField1.setText(formattedCurrency);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void getInvested(){
        String query = ("SELECT sDepositWithdrawal FROM demat_account");
        ResultSet rs = Select.getData(query);
        
        try {
            while (rs.next()) {
            String invested = rs.getString("sDepositWithdrawal");
            double numInvested = Double.parseDouble(invested);
            NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
            String formattedCurrency = indianCurrencyFormat.format(numInvested);
            jTextField3.setText(formattedCurrency);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void getProfit(){
        String query = ("SELECT sProfit_loss FROM demat_account");
        ResultSet rs = Select.getData(query);
        
        try {
            while (rs.next()) {
            String profit = rs.getString("sProfit_loss");
            double numProfit = Double.parseDouble(profit);
            NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
            String formattedCurrency = indianCurrencyFormat.format(numProfit);
            jTextField2.setText(formattedCurrency);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void getBrokerage(){
        String query = ("SELECT sBrokerage FROM demat_account");
        ResultSet rs = Select.getData(query);
        
        try {
            while (rs.next()) {
            String brokerage = rs.getString("sBrokerage");
            double numBrokerage = Double.parseDouble(brokerage);
            NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
            String formattedCurrency = indianCurrencyFormat.format(numBrokerage);
            jTextField4.setText(formattedCurrency);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void resetEntry(){
        jTextField11.setText("0");
        jTextField12.setText("0");
        jTextField13.setText("0");
        jTextField14.setText("0");
        jTextField15.setText("0");
        jTextField16.setText("");
        jTextField20.setText("0");
        jTextField9.setText("0");
        jTextField8.setText("");
        jTextField6.setText("");
        jButton1.requestFocusInWindow();
    }
     
       
    private void prepareNextEntry(){     
               
        jTextField11.setText("0");
        jTextField12.setText("0");
        jTextField13.setText("0");
        jTextField14.setText("0");
        jTextField15.setText("0");
        jTextField16.setText("");
        jTextField9.setText("0");
        jTextField8.setText("");
        jTextField20.setText("0");
        jTextField11.requestFocusInWindow();
    }
    
    public void updateFields(int tradeLineID, int tradeID, String buyDate, String brokerName, String scripName, String tradeType, int buyQty, double buyPrice, double sellPrice, double brokerage, double depositWithdrawal, double grossProfit, double pips, String sellDate, String note, boolean isExported, String formattedProfit, String formattedPips, String formattedDeposit, String formattedBrokerage) {
        // Update the fields with the new values
        prepareNextEntry();
        jTextField8.setText(String.valueOf(tradeLineID));
        jTextField6.setText(String.valueOf(tradeID));
        jTextField11.setText(String.valueOf(buyQty));
        jTextField12.setText(String.valueOf(buyPrice));
        jTextField13.setText(String.valueOf(sellPrice));
        jTextField14.setText(String.valueOf(brokerage));
        jTextField15.setText(String.valueOf(depositWithdrawal));
        NumberFormat indianCurrencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String sGrossProfit = indianCurrencyFormat.format(grossProfit);
        jTextField20.setText(String.valueOf(sGrossProfit));
        
        // Update other fields similarly
        
        // Set the selected values in the combo boxes
        jComboBox1.setSelectedItem(brokerName);
        jComboBox2.setSelectedItem(scripName);
        jComboBox3.setSelectedItem(tradeType);
        // Update other combo boxes similarly
        
        jTextField7.setText(buyDate);
        jTextField10.setText(sellDate);
        jTextField16.setText(note);
        // Update other text fields similarly
        
        jCheckBox1.setSelected(isExported);
        jTextField5.setText(String.valueOf(formattedProfit));
        jTextField17.setText(String.valueOf(formattedPips));
        jTextField18.setText(String.valueOf(formattedDeposit));
        jTextField19.setText(String.valueOf(formattedBrokerage));
        
    }
    
    public static TradeInsert getInstance(int tradeLineID, int tradeID, String buyDate, String brokerName, String scripName, String tradeType, int buyQty, double buyPrice, double sellPrice, double brokerage, double depositWithdrawal, double grossProfit, double pips, String sellDate, String note, boolean isExported, String formattedProfit, String formattedPips, String formattedDeposit, String formattedBrokerage) {
        if (instance == null) {
            instance = new TradeInsert(tradeLineID, tradeID, buyDate, brokerName, scripName, tradeType, buyQty, buyPrice, sellPrice, brokerage, depositWithdrawal, grossProfit, pips, sellDate, note, isExported, formattedProfit, formattedPips, formattedDeposit, formattedBrokerage);
        } else {            
            // If an instance already exists, update its fields with new data
            instance.updateFields(tradeLineID, tradeID, buyDate, brokerName, scripName, tradeType, buyQty, buyPrice, sellPrice, brokerage, depositWithdrawal, grossProfit, pips, sellDate, note, isExported, formattedProfit, formattedPips, formattedDeposit, formattedBrokerage);
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
            java.util.logging.Logger.getLogger(TradeInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TradeInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TradeInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TradeInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (TradeInsert.instance != null) {
                TradeInsert.instance.dispose();
                }
                TradeInsert.instance = TradeInsert.getInstance(tradeLineID, tradeID, buyDate, brokerName, scripName, tradeType, buyQty, buyPrice, sellPrice, brokerage, depositWithdrawal, grossProfit, pips, sellDate, note, isExported, formattedProfit, formattedPips, formattedDeposit, formattedBrokerage);
                TradeInsert.instance.setVisible(true);
                
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
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
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
