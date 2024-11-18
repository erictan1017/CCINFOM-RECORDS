/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package resturantres;

import RR_Assets.MyConnection;
import RR_Assets.RMTransactionforReport;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author joaqu
 */
public class ManageDishes extends javax.swing.JFrame {

    private ArrayList<String> existingDishPKs;
    private ArrayList<RMTransactionforReport> existingRMReports;
    
    /**
     * Creates new form ManageDishes
     */
    public ManageDishes() {
        existingDishPKs = new ArrayList<>();
        existingRMReports = new ArrayList<>();
        initComponents();
        setLocationRelativeTo(null);
    }
    private ArrayList<String> getExistingDishIDs(){
        try{
            Connection con = MyConnection.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select dish_ID from dishes");
            int i;
            while(rs.next()){
                String checker = rs.getString("dish_ID");
                for(i=0; i<this.existingDishPKs.size(); i++){
                    if(checker.equals(this.existingDishPKs.get(i))){
                        break;
                    }
                }
                if(i == this.existingDishPKs.size())
                    this.existingDishPKs.add(checker);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return this.existingDishPKs;
    }
    private int fieldChecker(String actionType) {
        if (actionType.equals("Update") && (DishNameTxt.getText().equals("") || DishPriceTxt.getText().equals("") || DishQuantityTxt.getText().equals(""))) {
            return 1;
        } else if (actionType.equals("Save") && (DishIDTxt.getText().equals("") || DishNameTxt.getText().equals("") || DishPriceTxt.getText().equals("") || DishQuantityTxt.getText().equals(""))) {
            return 2;
        } else {
            getExistingDishIDs();
            for(int i=0; i<this.existingDishPKs.size(); i++){
                if(DishIDTxt.getText().equals(this.existingDishPKs.get(i)))
                    return 3;
            }
            return 4;
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

        ManageDisheslbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dishTable = new javax.swing.JTable();
        dishNamelbl = new javax.swing.JLabel();
        dishPricelbl = new javax.swing.JLabel();
        dishQuanlbl = new javax.swing.JLabel();
        DishNameTxt = new javax.swing.JTextField();
        DishPriceTxt = new javax.swing.JTextField();
        DishQuantityTxt = new javax.swing.JTextField();
        dishSavebtn = new javax.swing.JButton();
        dishUpdatebtn = new javax.swing.JButton();
        dishDeletebtn = new javax.swing.JButton();
        dishClosebtn = new javax.swing.JButton();
        dishIDlbl = new javax.swing.JLabel();
        DishIDTxt = new javax.swing.JTextField();
        dishTransactionbtn = new javax.swing.JButton();
        dishReportbtn = new javax.swing.JButton();
        dishViewDisheslbl = new javax.swing.JLabel();
        DishExecuteTxt = new javax.swing.JTextField();
        dishExecutebtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        executeResultsTextArea = new javax.swing.JTextArea();
        dishTransactionlbl = new javax.swing.JLabel();
        dateofTransactionTxt = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        RMReportTextArea = new javax.swing.JTextArea();
        rmReports = new javax.swing.JLabel();
        reportMonthlbl = new javax.swing.JLabel();
        reportMonthTxt = new javax.swing.JTextField();
        reportYearlbl = new javax.swing.JLabel();
        reportYearTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1535, 1000));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1135, 1211));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageDisheslbl.setFont(new java.awt.Font("Franklin Gothic Book", 1, 24)); // NOI18N
        ManageDisheslbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManageDisheslbl.setText("Manage Dishes");
        ManageDisheslbl.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(ManageDisheslbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 0, -1, -1));

        dishTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "name", "price", "quantity"
            }
        ));
        dishTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dishTableMouseClicked(evt);
            }
        });
        dishTable.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                dishTableComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(dishTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 46, 710, 450));

        dishNamelbl.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        dishNamelbl.setText("Name");
        getContentPane().add(dishNamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, -1, -1));

        dishPricelbl.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        dishPricelbl.setText("Price");
        getContentPane().add(dishPricelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, -1, -1));

        dishQuanlbl.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        dishQuanlbl.setText("Quantity");
        getContentPane().add(dishQuanlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, -1, -1));

        DishNameTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DishNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DishNameTxtActionPerformed(evt);
            }
        });
        getContentPane().add(DishNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 310, -1));

        DishPriceTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(DishPriceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 310, -1));

        DishQuantityTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(DishQuantityTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, 310, -1));

        dishSavebtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dishSavebtn.setText("Save");
        dishSavebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dishSavebtnActionPerformed(evt);
            }
        });
        getContentPane().add(dishSavebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 460, -1, -1));

        dishUpdatebtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dishUpdatebtn.setText("Update");
        dishUpdatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dishUpdatebtnActionPerformed(evt);
            }
        });
        getContentPane().add(dishUpdatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 460, -1, -1));

        dishDeletebtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dishDeletebtn.setText("Delete");
        dishDeletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dishDeletebtnActionPerformed(evt);
            }
        });
        getContentPane().add(dishDeletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 460, -1, -1));

        dishClosebtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dishClosebtn.setText("Close");
        dishClosebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dishClosebtnActionPerformed(evt);
            }
        });
        getContentPane().add(dishClosebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 460, -1, -1));

        dishIDlbl.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        dishIDlbl.setText("ID");
        getContentPane().add(dishIDlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 37, -1));

        DishIDTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(DishIDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 310, -1));

        dishTransactionbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dishTransactionbtn.setText("Begin Transaction");
        dishTransactionbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dishTransactionbtnActionPerformed(evt);
            }
        });
        getContentPane().add(dishTransactionbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(728, 781, -1, -1));

        dishReportbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dishReportbtn.setText("Generate Report");
        dishReportbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dishReportbtnActionPerformed(evt);
            }
        });
        getContentPane().add(dishReportbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 720, -1, -1));

        dishViewDisheslbl.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        dishViewDisheslbl.setText("View Dishes");
        getContentPane().add(dishViewDisheslbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 540, -1, -1));

        DishExecuteTxt.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        getContentPane().add(DishExecuteTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 580, 370, -1));

        dishExecutebtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dishExecutebtn.setText("Execute ");
        dishExecutebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dishExecutebtnActionPerformed(evt);
            }
        });
        getContentPane().add(dishExecutebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(728, 612, -1, -1));

        executeResultsTextArea.setColumns(20);
        executeResultsTextArea.setRows(5);
        jScrollPane2.setViewportView(executeResultsTextArea);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 700, 440));

        dishTransactionlbl.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        dishTransactionlbl.setText("Date of Transaction");
        getContentPane().add(dishTransactionlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 694, -1, -1));

        dateofTransactionTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(dateofTransactionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(728, 737, 170, -1));

        RMReportTextArea.setColumns(20);
        RMReportTextArea.setRows(5);
        jScrollPane3.setViewportView(RMReportTextArea);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1098, 80, 423, 443));

        rmReports.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        rmReports.setText("Reports(Per Day)");
        getContentPane().add(rmReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(1242, 3, -1, -1));

        reportMonthlbl.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        reportMonthlbl.setText("Month");
        getContentPane().add(reportMonthlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1283, 541, -1, -1));

        reportMonthTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(reportMonthTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1283, 578, 150, -1));

        reportYearlbl.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        reportYearlbl.setText("Year");
        getContentPane().add(reportYearlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1283, 622, -1, -1));

        reportYearTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(reportYearTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1283, 665, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1920x1080-bright-lavender-solid-color-background.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DishNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DishNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DishNameTxtActionPerformed

    private void dishClosebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dishClosebtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_dishClosebtnActionPerformed

    private void dishSavebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dishSavebtnActionPerformed
        // TODO add your handling code here:
        String ID = DishIDTxt.getText();
        String name = DishNameTxt.getText();
        String price = DishPriceTxt.getText();
        String quantity = DishQuantityTxt.getText();
        if (fieldChecker("Save") == 2){
            JOptionPane.showMessageDialog(null, "All fields must be inputted.");
        } 
        else if(fieldChecker("Save") == 3){
            JOptionPane.showMessageDialog(null, "Repeating dish_IDs are not allowed.");
        } 
        else {
            try {
                Connection con = MyConnection.getCon();
                PreparedStatement ps = con.prepareStatement("insert into dishes (dish_ID, dish_name, dish_price, dish_quantity) values(?,?,?,?)");
                ps.setString(1, ID);
                ps.setString(2, name);
                ps.setString(3, price);
                ps.setString(4, quantity);
                ps.executeUpdate();
                this.getExistingDishIDs();
                JOptionPane.showMessageDialog(null, "Dish has been successfully added.");
                setVisible(false);
                new ManageDishes().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_dishSavebtnActionPerformed

    private void dishTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dishTableMouseClicked
        // TODO add your handling code here:
        getExistingDishIDs();
        int index = dishTable.getSelectedRow();
        TableModel model = dishTable.getModel();

        String id = model.getValueAt(index, 0).toString();
        DishIDTxt.setText(id);

        String name = model.getValueAt(index, 1).toString();
        DishNameTxt.setText(name);

        String price = model.getValueAt(index, 2).toString();
        DishPriceTxt.setText(price);

        String quantity = model.getValueAt(index, 3).toString();
        DishQuantityTxt.setText(quantity);
        
        DishIDTxt.setEditable(false);
        dishSavebtn.setEnabled(false);
        dishUpdatebtn.setEnabled(true);
    }//GEN-LAST:event_dishTableMouseClicked

    private void dishUpdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dishUpdatebtnActionPerformed
        // TODO add your handling code here:
        String ID = DishIDTxt.getText();
        String name = DishNameTxt.getText();
        String price = DishPriceTxt.getText();
        String quantity = DishQuantityTxt.getText();
        if (fieldChecker("Update") == 1) {
            JOptionPane.showMessageDialog(null, "All necessary fields must be inputted.");
        } 
        else if(fieldChecker("Update") == 3){
            JOptionPane.showMessageDialog(null, "Repeating Dish_IDs are not allowed.");
        }
        else{
            try {
                Connection con = MyConnection.getCon();
                PreparedStatement ps = con.prepareStatement("update dishes set dish_name=?,dish_price=?,dish_quantity=? where dish_ID=?");
                ps.setString(1, name);
                ps.setString(2, price);
                ps.setString(3, quantity);
                ps.setString(4, ID);
                ps.executeUpdate();
                this.getExistingDishIDs();
                JOptionPane.showMessageDialog(null, "Dish has been successfully updated.");
                setVisible(false);
                new ManageDishes().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_dishUpdatebtnActionPerformed

    private void dishDeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dishDeletebtnActionPerformed
        // TODO add your handling code here:
        String id = DishIDTxt.getText();
        if(id.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the dish_ID you wish to remove.");
        }
        
        int idChecker = 0;
        for(int i=0; i<this.existingDishPKs.size(); i++){
            if(id.equals(this.existingDishPKs.get(i))){
                int j = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this item?", "Warning", JOptionPane.YES_NO_OPTION);
                if( j == JOptionPane.YES_OPTION){
                    try{
                        Connection con = MyConnection.getCon();
                        PreparedStatement ps = con.prepareStatement("delete from dishes where dish_ID=?");
                        ps.setString(1, id);
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Dish has been successfully deleted.");
                        setVisible(false);
                        this.existingDishPKs.remove(i);
                        new ManageDishes().setVisible(true);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                      }       
                    idChecker = 1;
                }
                break;
            }
        }
        if(idChecker == 0){
            JOptionPane.showMessageDialog(null, "There are no dishes with this ID. Please enter an existing one.");
        }
    }//GEN-LAST:event_dishDeletebtnActionPerformed

    private void dishTableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_dishTableComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_dishTableComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) dishTable.getModel();
        try {
            Connection con = MyConnection.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from dishes");
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("dish_ID"), rs.getString("dish_name"), rs.getString("dish_price"), rs.getString("dish_quantity")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void dishTransactionbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dishTransactionbtnActionPerformed
        // TODO add your handling code here:
        /*insert all transaction steps*/
        if(dateofTransactionTxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a date for the transaction.");
        }
        else{
          int granter = 0;
          String transDate = dateofTransactionTxt.getText(); 
          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
          LocalDate date = LocalDate.parse(transDate, formatter);
          try {
            ArrayList<String> rmIDsInReplenishing = new ArrayList();
            ArrayList<String> rmQuantityInReplenishing = new ArrayList<>();
            ArrayList<String> records = new ArrayList<>();
            Integer newQuan = 0;
            String result = "";
            Connection con = MyConnection.getCon();
            PreparedStatement dateTest = con.prepareStatement("select * from purchaseorder");
            ResultSet testRS = dateTest.executeQuery();
            while(testRS.next()){
                if(date.toString().equals(testRS.getString("purchaseDate")))
                    granter = 1;
            }
            if(granter == 0){
                JOptionPane.showMessageDialog(null, "There are no orders with the date inputted.");
            }
            else{
                PreparedStatement ps = con.prepareStatement("select * from purchaseorder where purchaseDate=?");//step a
                ps.setString(1, date.toString());
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    PreparedStatement ps2 = con.prepareStatement("select * from podetails where PO_ID=?");//step b
                    ps2.setString(1, rs.getString("PO_ID"));
                    ResultSet rs2 = ps2.executeQuery();
                    while(rs2.next()){
                        result = rs2.getString("rm_ID") + " " + rs2.getString("quantity") + " " + rs.getString("supplier_ID") + " " + rs.getString("purchaseDate") + " " + rs.getString("grandTotal") + "\n" ;//step c and d
                        records.add(result);
                        rmIDsInReplenishing.add(rs2.getString("rm_ID"));
                        rmQuantityInReplenishing.add(rs2.getString("quantity"));
                    }
                }
                //step e
                for(int i=0; i<rmIDsInReplenishing.size(); i++){
                    PreparedStatement ps3 = con.prepareStatement("select rm_quantity from rawmaterial where rm_ID=?");
                    ps3.setString(1, rmIDsInReplenishing.get(i));
                    ResultSet rs3 = ps3.executeQuery();
                    while(rs3.next()){
                        newQuan = Integer.parseInt(rs3.getString("rm_quantity")) + Integer.parseInt(rmQuantityInReplenishing.get(i));
                        PreparedStatement ps4 = con.prepareStatement("update rawmaterial set rm_quantity=? where rm_ID=?");
                        ps4.setString(1, newQuan.toString());
                        ps4.setString(2, rmIDsInReplenishing.get(i));
                        ps4.executeUpdate();
                    }
                }
                RMTransactionforReport rtr = new RMTransactionforReport(date);
                rtr.setReports(records);
                this.existingRMReports.add(rtr);
                JOptionPane.showMessageDialog(null, "Transaction complete.");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        }
    }//GEN-LAST:event_dishTransactionbtnActionPerformed

    private void dishReportbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dishReportbtnActionPerformed
        // TODO add your handling code here:
        String month = reportMonthTxt.getText();
        String year = reportYearTxt.getText();
        String separator = "-----------------------------------------------------------------\n";
        String result = "rm_ID\tquantityOfRMReplenished\tsupplier_ID\tpurchaseDate\tgrandTotal\n";
        int monthIntRep = 0;
        int DateMatch = 0;
        switch(month){
            case "January": monthIntRep = 1; break;
            case "February": monthIntRep = 2; break;
            case "March": monthIntRep = 3; break;
            case "April": monthIntRep = 4; break;
            case "May": monthIntRep = 5; break;
            case "June": monthIntRep = 6; break;
            case "July": monthIntRep = 7; break;
            case "August": monthIntRep = 8; break;
            case "September": monthIntRep = 9; break;
            case "October": monthIntRep = 10; break;
            case "November": monthIntRep = 11; break;
            case "December": monthIntRep = 12; break;
        }
        if(monthIntRep ==  0){
            JOptionPane.showMessageDialog(null, "Please type the month correctly.");
        }        
        else{
            for(int i=0; i<this.existingRMReports.size(); i++){
                if(this.existingRMReports.get(i).getDateOfReport().getYear() == Integer.parseInt(year) && this.existingRMReports.get(i).getDateOfReport().getMonthValue() == monthIntRep){
                    for(int j=0; j<existingRMReports.get(i).getReports().size(); j++){
                        result += existingRMReports.get(i).getReports().get(j);
                    }
                    DateMatch = 1;
                    result += separator;
                }
            }
            if(DateMatch == 0){
                JOptionPane.showMessageDialog(null, "There are no reports with the parameters inputted.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Initializing report...");
                RMReportTextArea.setText(result);
            }
        }
    }//GEN-LAST:event_dishReportbtnActionPerformed

    private void dishExecutebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dishExecutebtnActionPerformed
        // TODO add your handling code here:
        if(DishExecuteTxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a query first.");
        }
        else{
            String query = DishExecuteTxt.getText();
            try{
                Connection con = MyConnection.getCon();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query);
                JOptionPane.showMessageDialog(null, "Query has been executed.");
                String result = "dish_ID" + " " + "dish_name" + " " + "dish_price" + " " + "dish_quantity" + "\nvalues\n";
                while(rs.next()){
                    result += rs.getString("dish_ID") + " " + rs.getString("dish_name") + " " + rs.getString("dish_price") + " " + rs.getString("dish_quantity") + "\n";
                }
                executeResultsTextArea.setText(result);
                DishExecuteTxt.setText("");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_dishExecutebtnActionPerformed

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
            java.util.logging.Logger.getLogger(ManageDishes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageDishes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageDishes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageDishes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run() {
                new ManageDishes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DishExecuteTxt;
    private javax.swing.JTextField DishIDTxt;
    private javax.swing.JTextField DishNameTxt;
    private javax.swing.JTextField DishPriceTxt;
    private javax.swing.JTextField DishQuantityTxt;
    private javax.swing.JLabel ManageDisheslbl;
    private javax.swing.JTextArea RMReportTextArea;
    private javax.swing.JTextField dateofTransactionTxt;
    private javax.swing.JButton dishClosebtn;
    private javax.swing.JButton dishDeletebtn;
    private javax.swing.JButton dishExecutebtn;
    private javax.swing.JLabel dishIDlbl;
    private javax.swing.JLabel dishNamelbl;
    private javax.swing.JLabel dishPricelbl;
    private javax.swing.JLabel dishQuanlbl;
    private javax.swing.JButton dishReportbtn;
    private javax.swing.JButton dishSavebtn;
    private javax.swing.JTable dishTable;
    private javax.swing.JButton dishTransactionbtn;
    private javax.swing.JLabel dishTransactionlbl;
    private javax.swing.JButton dishUpdatebtn;
    private javax.swing.JLabel dishViewDisheslbl;
    private javax.swing.JTextArea executeResultsTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField reportMonthTxt;
    private javax.swing.JLabel reportMonthlbl;
    private javax.swing.JTextField reportYearTxt;
    private javax.swing.JLabel reportYearlbl;
    private javax.swing.JLabel rmReports;
    // End of variables declaration//GEN-END:variables
}