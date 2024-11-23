/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package restaurantres;

import RR_Assets.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AP-COOP
 */
public class OrderTransaction extends javax.swing.JFrame {
    
    private final ArrayList<String> existingOID;
    private final ArrayList<String> existingRID;
    private final ArrayList<String> existingDID;
    
    /**
     * Creates new form OrderTransaction
     */
    public OrderTransaction() {
        initComponents();
        existingOID = new ArrayList<>();
        existingRID = new ArrayList<>();
        existingDID = new ArrayList<>();
        
        getExistingOID();
        getExistingRID();
        getExistingDID();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        placingOrder = new javax.swing.JLabel();
        oIDText = new javax.swing.JTextField();
        orderID = new javax.swing.JLabel();
        placeOrderButton = new javax.swing.JButton();
        dishes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dishesTable = new javax.swing.JTable();
        resID = new javax.swing.JLabel();
        rIDText = new javax.swing.JTextField();
        dishID = new javax.swing.JLabel();
        dIDText = new javax.swing.JTextField();
        quantity = new javax.swing.JLabel();
        qtyText = new javax.swing.JTextField();
        orders = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        odTable = new javax.swing.JTable();
        removeButton = new javax.swing.JButton();
        payment = new javax.swing.JLabel();
        payText = new javax.swing.JTextField();
        payButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 900));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        placingOrder.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        placingOrder.setText("Placing Order");
        getContentPane().add(placingOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));
        getContentPane().add(oIDText, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 260, -1));

        orderID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        orderID.setText("order_ID");
        getContentPane().add(orderID, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));

        placeOrderButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        placeOrderButton.setText("Place Order");
        placeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderButtonActionPerformed(evt);
            }
        });
        getContentPane().add(placeOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, -1, -1));

        dishes.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        dishes.setText("Dishes");
        getContentPane().add(dishes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        dishesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "dish_ID", "dish_name", "dish_price", "dish_quantity"
            }
        ));
        jScrollPane1.setViewportView(dishesTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 330));

        resID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        resID.setText("reservation_ID");
        getContentPane().add(resID, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, -1, -1));
        getContentPane().add(rIDText, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 260, -1));

        dishID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dishID.setText("dish_ID");
        getContentPane().add(dishID, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, -1, -1));
        getContentPane().add(dIDText, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 260, -1));

        quantity.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        quantity.setText("quantity");
        getContentPane().add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, -1, -1));
        getContentPane().add(qtyText, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 260, -1));

        orders.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        orders.setText("Orders");
        getContentPane().add(orders, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "order_ID", "reservation_ID", "grandTotal", "payment"
            }
        ));
        jScrollPane2.setViewportView(orderTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 450, 240));

        odTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "order_ID", "dish_ID", "quantity", "subtotalPrice"
            }
        ));
        jScrollPane3.setViewportView(odTable);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, -1, 240));

        removeButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(removeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, -1, -1));

        payment.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        payment.setText("payment");
        getContentPane().add(payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 750, -1, -1));
        getContentPane().add(payText, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 780, 260, -1));

        payButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        payButton.setText("Pay");
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });
        getContentPane().add(payButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 820, -1, -1));

        closeButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 820, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1920x1080-bright-lavender-solid-color-background.jpg"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private ArrayList<String> getExistingOID(){
        try{
            Connection con = MyConnection.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select order_ID from orders");
            int i;
            while(rs.next()){
                String checker = rs.getString("order_ID");
                for(i=0; i<this.existingOID.size(); i++){
                    if(checker.equals(this.existingOID.get(i))){
                        break;
                    }
                }
                if(i == this.existingOID.size())
                    this.existingOID.add(checker);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return this.existingOID;
    }
    
    private ArrayList<String> getExistingRID(){
        try{
            Connection con = MyConnection.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select reservation_ID from reservations");
            int i;
            while(rs.next()){
                String checker = rs.getString("reservation_ID");
                for(i=0; i<this.existingRID.size(); i++){
                    if(checker.equals(this.existingRID.get(i))){
                        break;
                    }
                }
                if(i == this.existingRID.size())
                    this.existingRID.add(checker);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return this.existingRID;
    }
    
    private ArrayList<String> getExistingDID(){
        try{
            Connection con = MyConnection.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select dish_ID from dishes");
            int i;
            while(rs.next()){
                String checker = rs.getString("dish_ID");
                for(i=0; i<this.existingDID.size(); i++){
                    if(checker.equals(this.existingDID.get(i))){
                        break;
                    }
                }
                if(i == this.existingDID.size())
                    this.existingDID.add(checker);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return this.existingDID;
    }
    
    private void computeSubTotal(String orderID, String dishID, JTextField qtyText) {
        try {

            int quantity = Integer.parseInt(qtyText.getText().trim());

            if (quantity <= 0) {
                JOptionPane.showMessageDialog(null, "Quantity must be greater than 0.");
                return;
        }

            Connection con = MyConnection.getCon();

            PreparedStatement dishPs = con.prepareStatement("SELECT dish_price FROM dishes WHERE dish_id = ?");
            dishPs.setString(1, dishID);
            ResultSet dishRs = dishPs.executeQuery();

            double dishPrice = 0.0;

            if (dishRs.next()) {
                dishPrice = dishRs.getDouble("dish_price");
            } else {
                JOptionPane.showMessageDialog(null, "Dish not found for ID: " + dishID);
                dishRs.close();
                dishPs.close();
                con.close();
                return;
            }

            double subTotal = dishPrice * quantity;

            PreparedStatement updatePs = con.prepareStatement("UPDATE orderdetails SET subtotalPrice = ? WHERE order_id = ?");
            updatePs.setDouble(1, subTotal);
            updatePs.setString(2, orderID);  
            updatePs.executeUpdate();
                    
            dishRs.close();
            dishPs.close();
            updatePs.close();
            con.close();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid quantity. Please enter a valid number.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void computeGrandTotal(String OID) {
        try {
            Connection con = MyConnection.getCon();
            PreparedStatement ps = con.prepareStatement(
                "SELECT COALESCE(SUM(subtotalPrice), 0) AS grandTotal FROM orderdetails WHERE order_ID = ?"
            );
            ps.setString(1, OID);
            ResultSet rs = ps.executeQuery();
        
            if (rs.next()) {
                double grandTotal = rs.getDouble("grandTotal");
              
                PreparedStatement updatePs = con.prepareStatement(
                    "UPDATE orders SET grandTotal = ? WHERE order_ID = ?"
                );
                updatePs.setDouble(1, grandTotal);
                updatePs.setString(2, OID);
                updatePs.executeUpdate();
      
            }
        
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public boolean dishQtyChecker(String dishID) {
        boolean isAvailable = false;
        try {
            Connection con = MyConnection.getCon();

            PreparedStatement ps = con.prepareStatement(
                "SELECT dish_quantity FROM dishes WHERE dish_id = ?"
            );
            ps.setString(1, dishID);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int dishQuantity = rs.getInt("dish_quantity");
                isAvailable = dishQuantity > 0;
            } else {  
                JOptionPane.showMessageDialog(null, "Dish not found for ID: " + dishID);
            }

            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return isAvailable;
    }

    private int placeOrderChecker(String actionType) {
        
        int existingO_ID = 0;
        int existingR_ID = 0;
        int existingD_ID = 0; 
        String dID = dIDText.getText();
        
        if (actionType.equals("Place Order") && (oIDText.getText().equals("") || rIDText.getText().equals("") || dIDText.getText().equals("") || qtyText.getText().equals(""))) {
            return 2;
        } else {   
            for(int i=0; i<this.existingOID.size(); i++){
                if(oIDText.getText().equals(this.existingOID.get(i))){
                    existingO_ID = 1;
                }            
            }
            
            for(int i=0; i<this.existingRID.size(); i++){
                if(rIDText.getText().equals(this.existingRID.get(i))){
                    existingR_ID = 1;
                }            
            }
            
            for(int i=0; i<this.existingDID.size(); i++){
                if(dIDText.getText().equals(this.existingDID.get(i))){
                    existingD_ID = 1;
                }            
            }    
            
            if (existingO_ID == 1){
                return 3;
            } else if (existingR_ID == 0) {
                return 4;
            } else if (existingD_ID == 0 && existingR_ID == 1) {
                return 5;
            } else if (dishQtyChecker(dID) == false) {
                return 6;
            } else {
                return 7;
            }    
        } 
        
    }
    
    private int paymentChecker(String actionType) {
        
        int existingO_ID = 0;  
       
        if (actionType.equals("Place Order") && (oIDText.getText().equals("") || payText.getText().equals(""))) {
            return 2;
        } else {   
            for(int i=0; i<this.existingOID.size(); i++){
                if(oIDText.getText().equals(this.existingOID.get(i))){
                    existingO_ID = 1;
                }            
            }

            if (existingO_ID == 0){
                return 3;
            } else {
                return 4;
            }    
        }       
    }
    
    private void placeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderButtonActionPerformed
        // TODO add your handling code here:
        String OID = oIDText.getText();
        String RID = rIDText.getText();
        
        String DID = dIDText.getText();
        String qty = qtyText.getText();
        
        if (placeOrderChecker("Place Order") == 2){
            JOptionPane.showMessageDialog(null, "All fields must be inputted.");
        } else if (placeOrderChecker("Place Order") == 3){
            JOptionPane.showMessageDialog(null, "No duplicate order IDs.");
        } else if (placeOrderChecker("Place Order") == 4){
            JOptionPane.showMessageDialog(null, "The reservation ID does not exist.");
        } else if (placeOrderChecker("Place Order") == 5){
            JOptionPane.showMessageDialog(null, "The dish ID does not exist.");  
        } else if (placeOrderChecker("Place Order") == 6){
            JOptionPane.showMessageDialog(null, "The dish is currently out of stock.");  
        } else if (qty.equals("0")){
            JOptionPane.showMessageDialog(null, "The quantity must be greater than 0.");  
        } else {        
            try {
                Connection con = MyConnection.getCon();
                
                PreparedStatement ps1 = con.prepareStatement("insert into orders (order_ID, reservation_ID, grandTotal, payment) values(?,?,0,0)");
                ps1.setString(1, OID);
                ps1.setString(2, RID);
                ps1.executeUpdate();
                
                PreparedStatement ps2 = con.prepareStatement("insert into orderdetails (order_ID, dish_ID, quantity, subtotalPrice) values(?,?,?,0)");
                ps2.setString(1, OID);
                ps2.setString(2, DID);
                ps2.setString(3, qty);
                ps2.executeUpdate();
                
                this.getExistingOID();
                
                computeSubTotal(OID, DID, qtyText);
                computeGrandTotal(OID);
                
                JOptionPane.showMessageDialog(null, "Order has been successfully placed.");
                setVisible(false);
                new OrderTransaction().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_placeOrderButtonActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        DefaultTableModel dishes = (DefaultTableModel)dishesTable.getModel();
        DefaultTableModel orders = (DefaultTableModel)orderTable.getModel();
        DefaultTableModel details = (DefaultTableModel)odTable.getModel();
        
        dishes.setRowCount(0);
        orders.setRowCount(0);
        details.setRowCount(0);
        
        try {
            Connection con = MyConnection.getCon();
            Statement st1 = con.createStatement();
            Statement st2 = con.createStatement();
            Statement st3 = con.createStatement();
            
            ResultSet rs1 = st1.executeQuery("select * from dishes");
            while (rs1.next()) {
                dishes.addRow(new Object[]{rs1.getString("dish_ID"), rs1.getString("dish_name"), rs1.getString("dish_price"), rs1.getString("dish_quantity")});
                
            }
            rs1.close();
            
            ResultSet rs2 = st2.executeQuery("select * from orders");
            while (rs2.next()) {
                orders.addRow(new Object[]{rs2.getString("order_ID"), rs2.getString("reservation_ID"), rs2.getString("grandTotal"), rs2.getString("payment")});
                
            }
            rs2.close();
            
            ResultSet rs3 = st3.executeQuery("select * from orderdetails");
            while (rs3.next()) {
                details.addRow(new Object[]{rs3.getString("order_ID"), rs3.getString("dish_ID"), rs3.getString("quantity"), rs3.getString("subtotalPrice")});
                
            }
            rs3.close();
          
            st3.close();
            st2.close();
            st1.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
        String id = oIDText.getText();
        
        int idChecker = 0;
        for(int i=0; i<this.existingOID.size(); i++){
            if(id.equals(this.existingOID.get(i))){
                int j = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this item?", "Warning", JOptionPane.YES_NO_OPTION);
                if( j == JOptionPane.YES_OPTION){
                    try{
                        Connection con = MyConnection.getCon();
                        
                        PreparedStatement ps1 = con.prepareStatement("delete from orderdetails where order_ID=?");
                        ps1.setString(1, id);
                        ps1.executeUpdate();
                        
                        PreparedStatement ps2 = con.prepareStatement("delete from orders where order_ID=?");
                        ps2.setString(1, id);
                        ps2.executeUpdate();
                        
                        JOptionPane.showMessageDialog(null, "Order has been successfully removed.");
                        setVisible(false);
                        this.existingOID.remove(i);
                        new OrderTransaction().setVisible(true);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                      }       
                    idChecker = 1;
                } else {
                    JOptionPane.showMessageDialog(null, "Order removal has been cancelled.");
                    idChecker = 1;
                }
                break;
            }
        }
        if(idChecker == 0){
            JOptionPane.showMessageDialog(null, "There are no orders with this ID. Please enter an existing one.");
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
        // TODO add your handling code here:
        String id = oIDText.getText();
        String payment = payText.getText();
        
        if (paymentChecker("Place Order") == 2){
            JOptionPane.showMessageDialog(null, "Order ID and payment must be inputted.");
        } else if (paymentChecker("Place Order") == 3){
            JOptionPane.showMessageDialog(null, "The order ID does not exist.");
        } else {        
            try {
                Connection con = MyConnection.getCon();
                
                PreparedStatement ps1 = con.prepareStatement("UPDATE orders SET payment = ? WHERE order_ID = ?");
                ps1.setString(1, payment);
                ps1.setString(2, id);
                ps1.executeUpdate();
                
                this.getExistingOID();
                
                JOptionPane.showMessageDialog(null, "The order has been successfully payed.");
                setVisible(false);
                new OrderTransaction().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_payButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(OrderTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderTransaction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton closeButton;
    private javax.swing.JTextField dIDText;
    private javax.swing.JLabel dishID;
    private javax.swing.JLabel dishes;
    private javax.swing.JTable dishesTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField oIDText;
    private javax.swing.JTable odTable;
    private javax.swing.JLabel orderID;
    private javax.swing.JTable orderTable;
    private javax.swing.JLabel orders;
    private javax.swing.JButton payButton;
    private javax.swing.JTextField payText;
    private javax.swing.JLabel payment;
    private javax.swing.JButton placeOrderButton;
    private javax.swing.JLabel placingOrder;
    private javax.swing.JTextField qtyText;
    private javax.swing.JLabel quantity;
    private javax.swing.JTextField rIDText;
    private javax.swing.JButton removeButton;
    private javax.swing.JLabel resID;
    // End of variables declaration//GEN-END:variables
}
