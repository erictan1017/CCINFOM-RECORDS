/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package resturantres;

import RR_Assets.MyConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Ericson Tan
 */
public class ViewStaffDay extends javax.swing.JFrame {

    /**
     * Creates new form ViewStaffDay
     */
    public ViewStaffDay() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        staffInfo = new javax.swing.JTable();
        mondayBtn = new javax.swing.JButton();
        tuesdayBtn = new javax.swing.JButton();
        wednesdayBtn = new javax.swing.JButton();
        thursdayBtn = new javax.swing.JButton();
        fridayBtn = new javax.swing.JButton();
        saturdayBtn = new javax.swing.JButton();
        sundayBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        staffInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Staff ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(staffInfo);

        mondayBtn.setText("Monday");
        mondayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mondayBtnActionPerformed(evt);
            }
        });

        tuesdayBtn.setText("Tuesday");
        tuesdayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuesdayBtnActionPerformed(evt);
            }
        });

        wednesdayBtn.setText("Wednesday");
        wednesdayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wednesdayBtnActionPerformed(evt);
            }
        });

        thursdayBtn.setText("Thursday");
        thursdayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thursdayBtnActionPerformed(evt);
            }
        });

        fridayBtn.setText("Friday");
        fridayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fridayBtnActionPerformed(evt);
            }
        });

        saturdayBtn.setText("Saturday");
        saturdayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saturdayBtnActionPerformed(evt);
            }
        });

        sundayBtn.setText("Sunday");
        sundayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sundayBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tuesdayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mondayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wednesdayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thursdayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fridayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saturdayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sundayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 919, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mondayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tuesdayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(wednesdayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(thursdayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fridayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(saturdayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sundayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mondayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mondayBtnActionPerformed
        // TODO add your handling code here:
        try {
           
            Connection con = MyConnection.getCon();
                      
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT staff_ID, name FROM staffs "
                         + "WHERE workingDay = 'Monday'");
            
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) staffInfo.getModel();
            model.setRowCount(0);
            
            while (rs.next()) {
             
                model.addRow(new Object[]{
                    rs.getInt("staff_ID"),
                    rs.getString("name"),
                });
            }
            
            rs.close();
            st.close();
            con.close();
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }      
    }//GEN-LAST:event_mondayBtnActionPerformed

    private void tuesdayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuesdayBtnActionPerformed
        // TODO add your handling code here:
        try {
           
            Connection con = MyConnection.getCon();
                      
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT staff_ID, name FROM staffs "
                         + "WHERE workingDay = 'Tuesday'");
            
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) staffInfo.getModel();
            model.setRowCount(0);
            
            while (rs.next()) {
             
                model.addRow(new Object[]{
                    rs.getInt("staff_ID"),
                    rs.getString("name"),
                });
            }
            
            rs.close();
            st.close();
            con.close();
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_tuesdayBtnActionPerformed

    private void wednesdayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wednesdayBtnActionPerformed
        // TODO add your handling code here:
        try {
           
            Connection con = MyConnection.getCon();
                      
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT staff_ID, name FROM staffs "
                         + "WHERE workingDay = 'Wednesday'");
            
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) staffInfo.getModel();
            model.setRowCount(0);
            
            while (rs.next()) {
             
                model.addRow(new Object[]{
                    rs.getInt("staff_ID"),
                    rs.getString("name"),
                });
            }
            
            rs.close();
            st.close();
            con.close();
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_wednesdayBtnActionPerformed

    private void thursdayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thursdayBtnActionPerformed
        // TODO add your handling code here:
        try {
           
            Connection con = MyConnection.getCon();
                      
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT staff_ID, name FROM staffs "
                         + "WHERE workingDay = 'Thursday'");
            
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) staffInfo.getModel();
            model.setRowCount(0);
            
            while (rs.next()) {
             
                model.addRow(new Object[]{
                    rs.getInt("staff_ID"),
                    rs.getString("name"),
                });
            }
            
            rs.close();
            st.close();
            con.close();
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_thursdayBtnActionPerformed

    private void fridayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fridayBtnActionPerformed
        // TODO add your handling code here:
        try {
           
            Connection con = MyConnection.getCon();
                      
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT staff_ID, name FROM staffs "
                         + "WHERE workingDay = 'Friday'");
            
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) staffInfo.getModel();
            model.setRowCount(0);
            
            while (rs.next()) {
             
                model.addRow(new Object[]{
                    rs.getInt("staff_ID"),
                    rs.getString("name"),
                });
            }
            
            rs.close();
            st.close();
            con.close();
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
        
    }//GEN-LAST:event_fridayBtnActionPerformed

    private void saturdayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saturdayBtnActionPerformed
        // TODO add your handling code here:
        try {
           
            Connection con = MyConnection.getCon();
                      
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT staff_ID, name FROM staffs "
                         + "WHERE workingDay = 'Saturday'");
            
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) staffInfo.getModel();
            model.setRowCount(0);
            
            while (rs.next()) {
             
                model.addRow(new Object[]{
                    rs.getInt("staff_ID"),
                    rs.getString("name"),
                });
            }
            
            rs.close();
            st.close();
            con.close();
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_saturdayBtnActionPerformed

    private void sundayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sundayBtnActionPerformed
        // TODO add your handling code here:
        try {
           
            Connection con = MyConnection.getCon();
                      
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT staff_ID, name FROM staffs "
                         + "WHERE workingDay = 'Sunday'");
            
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) staffInfo.getModel();
            model.setRowCount(0);
            
            while (rs.next()) {
             
                model.addRow(new Object[]{
                    rs.getInt("staff_ID"),
                    rs.getString("name"),
                });
            }
            
            rs.close();
            st.close();
            con.close();
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_sundayBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ViewStaffDay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewStaffDay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewStaffDay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewStaffDay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStaffDay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton fridayBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mondayBtn;
    private javax.swing.JButton saturdayBtn;
    private javax.swing.JTable staffInfo;
    private javax.swing.JButton sundayBtn;
    private javax.swing.JButton thursdayBtn;
    private javax.swing.JButton tuesdayBtn;
    private javax.swing.JButton wednesdayBtn;
    // End of variables declaration//GEN-END:variables
}
