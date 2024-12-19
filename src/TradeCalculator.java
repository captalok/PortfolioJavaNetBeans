
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import project.ColorGenerator;
import project.Draggable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author alk_6
 */
public class TradeCalculator extends javax.swing.JFrame {

    private Color primaryColor = ColorGenerator.generateRandomPrimaryColor();
    private Color secondaryColor = ColorGenerator.generateSecondaryColor(primaryColor);
    private Color thirdColor = ColorGenerator.generateThirdColor(secondaryColor);
    /**
     * Creates new form TradeCalculator
     */
    public TradeCalculator() {
        initComponents();
        // Apply the Draggable property to this JFrame
        new Draggable(this);
        getRootPane().setDefaultButton(jButton1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTextBoxes();
        jTextField1.addFocusListener(new TextFieldFocusListener());
        jTextField2.addFocusListener(new TextFieldFocusListener());
        jTextField3.addFocusListener(new TextFieldFocusListener());
        jTextField4.addFocusListener(new TextFieldFocusListener());
        jTextField5.addFocusListener(new TextFieldFocusListener());
        jTextField6.addFocusListener(new TextFieldFocusListener());
        jTextField7.addFocusListener(new TextFieldFocusListener());
        jTextField8.addFocusListener(new TextFieldFocusListener());
        jTextField9.addFocusListener(new TextFieldFocusListener());
        jTextField10.addFocusListener(new TextFieldFocusListener());
        jTextField11.addFocusListener(new TextFieldFocusListener());
        jTextField12.addFocusListener(new TextFieldFocusListener());
        jTextField13.addFocusListener(new TextFieldFocusListener());
        jTextField14.addFocusListener(new TextFieldFocusListener());
        jTextField15.addFocusListener(new TextFieldFocusListener());
        jTextField16.addFocusListener(new TextFieldFocusListener());
        jTextField17.addFocusListener(new TextFieldFocusListener());
        jTextField18.addFocusListener(new TextFieldFocusListener());
        jTextField19.addFocusListener(new TextFieldFocusListener());
        jTextField20.addFocusListener(new TextFieldFocusListener());
        jTextField21.addFocusListener(new TextFieldFocusListener());
        jTextField22.addFocusListener(new TextFieldFocusListener());
        jTextField23.addFocusListener(new TextFieldFocusListener());
        jTextField24.addFocusListener(new TextFieldFocusListener());
        jTextField25.addFocusListener(new TextFieldFocusListener());
        jTextField26.addFocusListener(new TextFieldFocusListener());
        jTextField27.addFocusListener(new TextFieldFocusListener());
        jTextField28.addFocusListener(new TextFieldFocusListener());
        jTextField29.addFocusListener(new TextFieldFocusListener());
        jTextField30.addFocusListener(new TextFieldFocusListener());
        jTextField31.addFocusListener(new TextFieldFocusListener());
        jTextField32.addFocusListener(new TextFieldFocusListener());
        
        jTextField1.setNextFocusableComponent(jTextField9);
        jTextField9.setNextFocusableComponent(jTextField17);
        jTextField17.setNextFocusableComponent(jTextField25);
        jTextField25.setNextFocusableComponent(jTextField2);
        jTextField2.setNextFocusableComponent(jTextField10);
        jTextField10.setNextFocusableComponent(jTextField18);
        jTextField18.setNextFocusableComponent(jTextField26);
        jTextField26.setNextFocusableComponent(jTextField3);
        jTextField3.setNextFocusableComponent(jTextField11);
        jTextField11.setNextFocusableComponent(jTextField19);
        jTextField19.setNextFocusableComponent(jTextField27);
        jTextField27.setNextFocusableComponent(jTextField4);
        jTextField4.setNextFocusableComponent(jTextField12);
        jTextField12.setNextFocusableComponent(jTextField20);
        jTextField20.setNextFocusableComponent(jTextField28);
        jTextField28.setNextFocusableComponent(jTextField5);
        jTextField5.setNextFocusableComponent(jTextField13);
        jTextField13.setNextFocusableComponent(jTextField21);
        jTextField21.setNextFocusableComponent(jTextField29);
        jTextField29.setNextFocusableComponent(jTextField6);
        jTextField6.setNextFocusableComponent(jTextField14);
        jTextField14.setNextFocusableComponent(jTextField22);
        jTextField22.setNextFocusableComponent(jTextField30);
        jTextField30.setNextFocusableComponent(jTextField7);
        jTextField7.setNextFocusableComponent(jTextField15);
        jTextField15.setNextFocusableComponent(jTextField23);
        jTextField23.setNextFocusableComponent(jTextField31);
        jTextField31.setNextFocusableComponent(jTextField8);
        jTextField8.setNextFocusableComponent(jTextField16);
        jTextField16.setNextFocusableComponent(jTextField24);
        jTextField24.setNextFocusableComponent(jTextField32);
        jTextField32.setNextFocusableComponent(jTextField1); 
        
        jPanel1.setBackground(primaryColor);
        jPanel2.setBackground(secondaryColor);
        jPanel3.setBackground(thirdColor);
        jTextField1.setBackground(secondaryColor);
        jTextField2.setBackground(secondaryColor);
        jTextField3.setBackground(secondaryColor);
        jTextField4.setBackground(secondaryColor);
        jTextField5.setBackground(secondaryColor);
        jTextField6.setBackground(secondaryColor);
        jTextField7.setBackground(secondaryColor);
        jTextField8.setBackground(secondaryColor);
        jTextField9.setBackground(secondaryColor);
        jTextField10.setBackground(secondaryColor);
        jTextField11.setBackground(secondaryColor);
        jTextField12.setBackground(secondaryColor);
        jTextField13.setBackground(secondaryColor);
        jTextField14.setBackground(secondaryColor);
        jTextField15.setBackground(secondaryColor);
        jTextField16.setBackground(secondaryColor);
        jTextField17.setBackground(secondaryColor);
        jTextField18.setBackground(secondaryColor);
        jTextField19.setBackground(secondaryColor);
        jTextField20.setBackground(secondaryColor);
        jTextField21.setBackground(secondaryColor);
        jTextField22.setBackground(secondaryColor);
        jTextField23.setBackground(secondaryColor);
        jTextField24.setBackground(secondaryColor);
        jTextField25.setBackground(secondaryColor);
        jTextField26.setBackground(secondaryColor);
        jTextField27.setBackground(secondaryColor);
        jTextField28.setBackground(secondaryColor);
        jTextField29.setBackground(secondaryColor);
        jTextField30.setBackground(secondaryColor);
        jTextField31.setBackground(secondaryColor);
        jTextField32.setBackground(secondaryColor);
        jTextField33.setBackground(secondaryColor);
        jTextField34.setBackground(secondaryColor);
        jTextField35.setBackground(secondaryColor);
        jTextField36.setBackground(secondaryColor);
        jTextField37.setBackground(secondaryColor);
        jTextField38.setBackground(secondaryColor);
        jTextField39.setBackground(secondaryColor);
        jTextField40.setBackground(secondaryColor);
        jTextField41.setBackground(secondaryColor);
        jTextField42.setBackground(secondaryColor);
        jTextField43.setBackground(secondaryColor);
        jTextField44.setBackground(secondaryColor);
        jTextField45.setBackground(secondaryColor);
        jTextField46.setBackground(secondaryColor);
        jTextField47.setBackground(secondaryColor);
        jTextField48.setBackground(secondaryColor);
        jTextField49.setBackground(thirdColor);
        jTextField50.setBackground(thirdColor);
        jTextField51.setBackground(thirdColor);
        jTextField52.setBackground(thirdColor);
        jTextField53.setBackground(thirdColor);
        jTextField54.setBackground(thirdColor);
        jTextField55.setBackground(thirdColor);
        jButton1.setBackground(secondaryColor);
        jButton2.setBackground(secondaryColor);
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
        jLabel25 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField55 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jTextField53 = new javax.swing.JTextField();
        jTextField52 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(15, 10));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 51, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Viner Hand ITC", 1, 40)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("C");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 50, 50));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("alculator");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 110, -1));

        jLabel26.setFont(new java.awt.Font("Viner Hand ITC", 1, 40)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("T");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("rade");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 70, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("X");
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
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 0, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buy Qty");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buy Value");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sell Qty");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sell Value");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Buy Amt");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sell Amt");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("jTextField1");

        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setText("jTextField9");

        jTextField17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField17.setForeground(new java.awt.Color(255, 255, 255));
        jTextField17.setText("jTextField17");

        jTextField25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField25.setForeground(new java.awt.Color(255, 255, 255));
        jTextField25.setText("jTextField25");

        jTextField33.setEditable(false);
        jTextField33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField33.setForeground(new java.awt.Color(255, 255, 255));
        jTextField33.setText("jTextField33");

        jTextField41.setEditable(false);
        jTextField41.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField41.setForeground(new java.awt.Color(255, 255, 255));
        jTextField41.setText("jTextField41");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("jTextField2");

        jTextField10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.setText("jTextField10");

        jTextField18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField18.setForeground(new java.awt.Color(255, 255, 255));
        jTextField18.setText("jTextField18");

        jTextField26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField26.setForeground(new java.awt.Color(255, 255, 255));
        jTextField26.setText("jTextField26");

        jTextField34.setEditable(false);
        jTextField34.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField34.setForeground(new java.awt.Color(255, 255, 255));
        jTextField34.setText("jTextField34");

        jTextField42.setEditable(false);
        jTextField42.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField42.setForeground(new java.awt.Color(255, 255, 255));
        jTextField42.setText("jTextField42");

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setText("jTextField3");

        jTextField11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jTextField11.setText("jTextField11");

        jTextField19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField19.setForeground(new java.awt.Color(255, 255, 255));
        jTextField19.setText("jTextField19");

        jTextField27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField27.setForeground(new java.awt.Color(255, 255, 255));
        jTextField27.setText("jTextField27");

        jTextField35.setEditable(false);
        jTextField35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField35.setForeground(new java.awt.Color(255, 255, 255));
        jTextField35.setText("jTextField35");

        jTextField43.setEditable(false);
        jTextField43.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField43.setForeground(new java.awt.Color(255, 255, 255));
        jTextField43.setText("jTextField43");

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setText("jTextField4");

        jTextField12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(255, 255, 255));
        jTextField12.setText("jTextField12");

        jTextField20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField20.setForeground(new java.awt.Color(255, 255, 255));
        jTextField20.setText("jTextField20");

        jTextField28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField28.setForeground(new java.awt.Color(255, 255, 255));
        jTextField28.setText("jTextField28");

        jTextField36.setEditable(false);
        jTextField36.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField36.setForeground(new java.awt.Color(255, 255, 255));
        jTextField36.setText("jTextField36");

        jTextField44.setEditable(false);
        jTextField44.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField44.setForeground(new java.awt.Color(255, 255, 255));
        jTextField44.setText("jTextField44");

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setText("jTextField5");

        jTextField13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(255, 255, 255));
        jTextField13.setText("jTextField13");

        jTextField21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField21.setForeground(new java.awt.Color(255, 255, 255));
        jTextField21.setText("jTextField21");

        jTextField29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField29.setForeground(new java.awt.Color(255, 255, 255));
        jTextField29.setText("jTextField29");

        jTextField37.setEditable(false);
        jTextField37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField37.setForeground(new java.awt.Color(255, 255, 255));
        jTextField37.setText("jTextField37");

        jTextField45.setEditable(false);
        jTextField45.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField45.setForeground(new java.awt.Color(255, 255, 255));
        jTextField45.setText("jTextField45");

        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setText("jTextField6");

        jTextField14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(255, 255, 255));
        jTextField14.setText("jTextField14");

        jTextField22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField22.setForeground(new java.awt.Color(255, 255, 255));
        jTextField22.setText("jTextField22");

        jTextField30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField30.setForeground(new java.awt.Color(255, 255, 255));
        jTextField30.setText("jTextField30");

        jTextField38.setEditable(false);
        jTextField38.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField38.setForeground(new java.awt.Color(255, 255, 255));
        jTextField38.setText("jTextField38");

        jTextField46.setEditable(false);
        jTextField46.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField46.setForeground(new java.awt.Color(255, 255, 255));
        jTextField46.setText("jTextField46");

        jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setText("jTextField7");

        jTextField15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField15.setForeground(new java.awt.Color(255, 255, 255));
        jTextField15.setText("jTextField15");

        jTextField23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField23.setForeground(new java.awt.Color(255, 255, 255));
        jTextField23.setText("jTextField23");

        jTextField31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField31.setForeground(new java.awt.Color(255, 255, 255));
        jTextField31.setText("jTextField31");

        jTextField39.setEditable(false);
        jTextField39.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField39.setForeground(new java.awt.Color(255, 255, 255));
        jTextField39.setText("jTextField39");

        jTextField47.setEditable(false);
        jTextField47.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField47.setForeground(new java.awt.Color(255, 255, 255));
        jTextField47.setText("jTextField47");

        jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setText("jTextField8");

        jTextField16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(255, 255, 255));
        jTextField16.setText("jTextField16");

        jTextField24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField24.setForeground(new java.awt.Color(255, 255, 255));
        jTextField24.setText("jTextField24");

        jTextField32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField32.setForeground(new java.awt.Color(255, 255, 255));
        jTextField32.setText("jTextField32");

        jTextField40.setEditable(false);
        jTextField40.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField40.setForeground(new java.awt.Color(255, 255, 255));
        jTextField40.setText("jTextField40");

        jTextField48.setEditable(false);
        jTextField48.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField48.setForeground(new java.awt.Color(255, 255, 255));
        jTextField48.setText("jTextField48");

        jPanel3.setBackground(new java.awt.Color(255, 51, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 6, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("T Buy Qty");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 38, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("T Sell Qty");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 66, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("T Buy Amt");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 94, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("T Sell Amt");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 122, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Avg Buy");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 150, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Avg Sell");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 178, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Profit");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jTextField55.setEditable(false);
        jTextField55.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField55.setForeground(new java.awt.Color(255, 255, 255));
        jTextField55.setText("jTextField55");
        jPanel3.add(jTextField55, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 71, -1));

        jTextField54.setEditable(false);
        jTextField54.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField54.setForeground(new java.awt.Color(255, 255, 255));
        jTextField54.setText("jTextField54");
        jPanel3.add(jTextField54, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 175, 71, -1));

        jTextField53.setEditable(false);
        jTextField53.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField53.setForeground(new java.awt.Color(255, 255, 255));
        jTextField53.setText("jTextField53");
        jPanel3.add(jTextField53, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 147, 71, -1));

        jTextField52.setEditable(false);
        jTextField52.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField52.setForeground(new java.awt.Color(255, 255, 255));
        jTextField52.setText("jTextField52");
        jPanel3.add(jTextField52, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 119, 71, -1));

        jTextField51.setEditable(false);
        jTextField51.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField51.setForeground(new java.awt.Color(255, 255, 255));
        jTextField51.setText("jTextField51");
        jPanel3.add(jTextField51, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 91, 71, -1));

        jTextField50.setEditable(false);
        jTextField50.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField50.setForeground(new java.awt.Color(255, 255, 255));
        jTextField50.setText("jTextField50");
        jPanel3.add(jTextField50, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 63, 71, -1));

        jTextField49.setEditable(false);
        jTextField49.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField49.setForeground(new java.awt.Color(255, 255, 255));
        jTextField49.setText("jTextField49");
        jPanel3.add(jTextField49, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 35, 71, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3))
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4))
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5))
                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel6))
                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(13, 13, 13)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(13, 13, 13)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(13, 13, 13)
                                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(13, 13, 13)
                                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(13, 13, 13)
                                .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(13, 13, 13)
                                .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double buyQty1 = Double.parseDouble(jTextField1.getText());
        double buyQty2 = Double.parseDouble(jTextField2.getText());
        double buyQty3 = Double.parseDouble(jTextField3.getText());
        double buyQty4 = Double.parseDouble(jTextField4.getText());
        double buyQty5 = Double.parseDouble(jTextField5.getText());
        double buyQty6 = Double.parseDouble(jTextField6.getText());
        double buyQty7 = Double.parseDouble(jTextField7.getText());
        double buyQty8 = Double.parseDouble(jTextField8.getText());

        double buyValue1 = Double.parseDouble(jTextField9.getText());
        double buyValue2 = Double.parseDouble(jTextField10.getText());
        double buyValue3 = Double.parseDouble(jTextField11.getText());
        double buyValue4 = Double.parseDouble(jTextField12.getText());
        double buyValue5 = Double.parseDouble(jTextField13.getText());
        double buyValue6 = Double.parseDouble(jTextField14.getText());
        double buyValue7 = Double.parseDouble(jTextField15.getText());
        double buyValue8 = Double.parseDouble(jTextField16.getText());

        double sellQty1 = Double.parseDouble(jTextField17.getText());
        double sellQty2 = Double.parseDouble(jTextField18.getText());
        double sellQty3 = Double.parseDouble(jTextField19.getText());
        double sellQty4 = Double.parseDouble(jTextField20.getText());
        double sellQty5 = Double.parseDouble(jTextField21.getText());
        double sellQty6 = Double.parseDouble(jTextField22.getText());
        double sellQty7 = Double.parseDouble(jTextField23.getText());
        double sellQty8 = Double.parseDouble(jTextField24.getText());

        double sellValue1 = Double.parseDouble(jTextField25.getText());
        double sellValue2 = Double.parseDouble(jTextField26.getText());
        double sellValue3 = Double.parseDouble(jTextField27.getText());
        double sellValue4 = Double.parseDouble(jTextField28.getText());
        double sellValue5 = Double.parseDouble(jTextField29.getText());
        double sellValue6 = Double.parseDouble(jTextField30.getText());
        double sellValue7 = Double.parseDouble(jTextField31.getText());
        double sellValue8 = Double.parseDouble(jTextField32.getText());

        double buyAmt1 = Double.parseDouble(jTextField33.getText());
        double buyAmt2 = Double.parseDouble(jTextField34.getText());
        double buyAmt3 = Double.parseDouble(jTextField35.getText());
        double buyAmt4 = Double.parseDouble(jTextField36.getText());
        double buyAmt5 = Double.parseDouble(jTextField37.getText());
        double buyAmt6 = Double.parseDouble(jTextField38.getText());
        double buyAmt7 = Double.parseDouble(jTextField39.getText());
        double buyAmt8 = Double.parseDouble(jTextField40.getText());

        double sellAmt1 = Double.parseDouble(jTextField41.getText());
        double sellAmt2 = Double.parseDouble(jTextField42.getText());
        double sellAmt3 = Double.parseDouble(jTextField43.getText());
        double sellAmt4 = Double.parseDouble(jTextField44.getText());
        double sellAmt5 = Double.parseDouble(jTextField45.getText());
        double sellAmt6 = Double.parseDouble(jTextField46.getText());
        double sellAmt7 = Double.parseDouble(jTextField47.getText());
        double sellAmt8 = Double.parseDouble(jTextField48.getText());

        double tBuyQty = Double.parseDouble(jTextField49.getText());
        double tSellQty = Double.parseDouble(jTextField50.getText());
        double tBuyAmt = Double.parseDouble(jTextField51.getText());
        double tSellAmt = Double.parseDouble(jTextField52.getText());
        double aBuyAmt = Double.parseDouble(jTextField53.getText());
        double aSellAmt = Double.parseDouble(jTextField54.getText());
        double tProfit = Double.parseDouble(jTextField55.getText());

        buyAmt1 = buyQty1*buyValue1;
        buyAmt2 = buyQty2*buyValue2;
        buyAmt3 = buyQty3*buyValue3;
        buyAmt4 = buyQty4*buyValue4;
        buyAmt5 = buyQty5*buyValue5;
        buyAmt6 = buyQty6*buyValue6;
        buyAmt7 = buyQty7*buyValue7;
        buyAmt8 = buyQty8*buyValue8;

        sellAmt1 = sellQty1*sellValue1;
        sellAmt2 = sellQty2*sellValue2;
        sellAmt3 = sellQty3*sellValue3;
        sellAmt4 = sellQty4*sellValue4;
        sellAmt5 = sellQty5*sellValue5;
        sellAmt6 = sellQty6*sellValue6;
        sellAmt7 = sellQty7*sellValue7;
        sellAmt8 = sellQty8*sellValue8;

        tBuyQty = buyQty1+buyQty2+buyQty3+buyQty4+buyQty5+buyQty6+buyQty7+buyQty8;
        tSellQty = sellQty1+sellQty2+sellQty3+sellQty4+sellQty5+sellQty6+sellQty7+sellQty8;
        tBuyAmt = buyAmt1+buyAmt2+buyAmt3+buyAmt4+buyAmt5+buyAmt6+buyAmt7+buyAmt8;
        tSellAmt = sellAmt1+sellAmt2+sellAmt3+sellAmt4+sellAmt5+sellAmt6+sellAmt7+sellAmt8;
        aBuyAmt = tBuyAmt / tBuyQty;
        aSellAmt = tSellAmt / tSellQty;
        tProfit = tSellAmt - tBuyAmt;

        String buyAmt1String = String.format("%.2f", buyAmt1);
        jTextField33.setText(buyAmt1String);

        String buyAmt2String = String.format("%.2f", buyAmt2);
        jTextField34.setText(buyAmt2String);

        String buyAmt3String = String.format("%.2f", buyAmt3);
        jTextField35.setText(buyAmt3String);

        String buyAmt4String = String.format("%.2f", buyAmt4);
        jTextField36.setText(buyAmt4String);

        String buyAmt5String = String.format("%.2f", buyAmt5);
        jTextField37.setText(buyAmt5String);

        String buyAmt6String = String.format("%.2f", buyAmt6);
        jTextField38.setText(buyAmt6String);

        String buyAmt7String = String.format("%.2f", buyAmt7);
        jTextField39.setText(buyAmt7String);

        String buyAmt8String = String.format("%.2f", buyAmt8);
        jTextField40.setText(buyAmt8String);

        String sellAmt1String = String.format("%.2f", sellAmt1);
        jTextField41.setText(sellAmt1String);

        String sellAmt2String = String.format("%.2f", sellAmt2);
        jTextField42.setText(sellAmt2String);

        String sellAmt3String = String.format("%.2f", sellAmt3);
        jTextField43.setText(sellAmt3String);

        String sellAmt4String = String.format("%.2f", sellAmt4);
        jTextField44.setText(sellAmt4String);

        String sellAmt5String = String.format("%.2f", sellAmt5);
        jTextField45.setText(sellAmt5String);

        String sellAmt6String = String.format("%.2f", sellAmt6);
        jTextField46.setText(sellAmt6String);

        String sellAmt7String = String.format("%.2f", sellAmt7);
        jTextField47.setText(sellAmt7String);

        String sellAmt8String = String.format("%.2f", sellAmt8);
        jTextField48.setText(sellAmt8String);

        String tBuyQtyString = String.format("%.2f", tBuyQty);
        jTextField49.setText(tBuyQtyString);

        String tSellQtyString = String.format("%.2f", tSellQty);
        jTextField50.setText(tSellQtyString);

        String tBuyAmtString = String.format("%.2f", tBuyAmt);
        double numBuyAmt = Double.parseDouble(tBuyQtyString);
        NumberFormat curBuyAmt = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String formatBuyAmt = curBuyAmt.format(numBuyAmt);
        jTextField51.setText(formatBuyAmt);

        String tSellAmtString = String.format("%.2f", tSellAmt);
        double numSellAmt = Double.parseDouble(tBuyQtyString);
        NumberFormat curSellAmt = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String formatSellAmt = curSellAmt.format(numSellAmt);
        jTextField52.setText(formatSellAmt);

        String aBuyAmtString = String.format("%.2f", aBuyAmt);
        double numABuyAmt = Double.parseDouble(aBuyAmtString);
        NumberFormat curABuyAmt = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String formatABuyAmt = curABuyAmt.format(numABuyAmt);
        jTextField53.setText(formatABuyAmt);

        String aSellAmtString = String.format("%.2f", aSellAmt);
        double numASellAmt = Double.parseDouble(aSellAmtString);
        NumberFormat curASellAmt = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String formatASellAmt = curASellAmt.format(numASellAmt);
        jTextField54.setText(formatASellAmt);

        String tProfitString = String.format("%.2f", tProfit);
        double numProfit = Double.parseDouble(tProfitString);
        NumberFormat curProfit = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String formatProfit = curProfit.format(numProfit);
        jTextField55.setText(formatProfit);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setTextBoxes();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        // TODO add your handling code here:
        jLabel16.setForeground(thirdColor);
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        // TODO add your handling code here:
        jLabel16.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel16MouseExited

    private void setTextBoxes(){
        jTextField1.setText("0");
        jTextField2.setText("0");
        jTextField3.setText("0");
        jTextField4.setText("0");
        jTextField5.setText("0");
        jTextField6.setText("0");
        jTextField7.setText("0");
        jTextField8.setText("0");
        jTextField9.setText("0");
        jTextField10.setText("0");
        jTextField11.setText("0");
        jTextField12.setText("0");
        jTextField13.setText("0");
        jTextField14.setText("0");
        jTextField15.setText("0");
        jTextField16.setText("0");
        jTextField17.setText("0");
        jTextField18.setText("0");
        jTextField19.setText("0");
        jTextField20.setText("0");
        jTextField21.setText("0");
        jTextField22.setText("0");
        jTextField23.setText("0");
        jTextField24.setText("0");
        jTextField25.setText("0");
        jTextField26.setText("0");
        jTextField27.setText("0");
        jTextField28.setText("0");
        jTextField29.setText("0");
        jTextField30.setText("0");
        jTextField31.setText("0");
        jTextField32.setText("0");
        jTextField33.setText("0");
        jTextField34.setText("0");
        jTextField35.setText("0");
        jTextField36.setText("0");
        jTextField37.setText("0");
        jTextField38.setText("0");
        jTextField39.setText("0");
        jTextField40.setText("0");
        jTextField41.setText("0");
        jTextField42.setText("0");
        jTextField43.setText("0");
        jTextField44.setText("0");
        jTextField45.setText("0");
        jTextField46.setText("0");
        jTextField47.setText("0");
        jTextField48.setText("0");
        jTextField49.setText("0");
        jTextField50.setText("0");
        jTextField51.setText("0");
        jTextField52.setText("0");
        jTextField53.setText("0");
        jTextField54.setText("0");
        jTextField55.setText("0");
        
        jTextField1.requestFocusInWindow();
    }
    
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
            java.util.logging.Logger.getLogger(TradeCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TradeCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TradeCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TradeCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TradeCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
