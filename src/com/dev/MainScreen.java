/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Viraj
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        //===============
       
        Color backgroundcolor =new Color(255,255,102);
        this.getContentPane().setBackground(backgroundcolor);
        setVisible(true);
        err.setVisible(false);
        address.setEditable(false);
        cno.setEditable(false);
        additionaldetails.setVisible(false);
        proceed.setVisible(false);
        rooms.removeAllItems();
        hotel.removeAllItems();
        hotel.addItem("-------------");
        display.setVisible(false);
        city.removeAllItems();
        sort.removeAllItems();
        sort.addItem("-------------");
        sort.addItem("Price(Low to High)");
        sort.addItem("Rating(High to Low)");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_booking","root","dev12345");
            PreparedStatement stmt=con.prepareStatement("SELECT city FROM city_name");
            ResultSet rs=stmt.executeQuery();
            while(rs.next()){
                city.addItem(rs.getString(1));
            }
            
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null,e.getMessage(),"Error",1);
        }
        //==============
    }
    public MainScreen(String username){
        this();
        this.username=username;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        city = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        show = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        display = new javax.swing.JTable();
        err = new javax.swing.JLabel();
        goback = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sort = new javax.swing.JComboBox<>();
        proceed = new javax.swing.JButton();
        additionaldetails = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        cno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rooms = new javax.swing.JComboBox<>();
        selecthotel = new javax.swing.JLabel();
        hotel = new javax.swing.JComboBox<>();
        err2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        city.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });

        jLabel1.setText("Select City");

        show.setText("Show");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        display.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(display);

        err.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        err.setForeground(new java.awt.Color(255, 0, 0));
        err.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        err.setText("*Please Select a City");

        goback.setText("Go Back");
        goback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gobackActionPerformed(evt);
            }
        });

        jLabel2.setText("Sort by");

        sort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortActionPerformed(evt);
            }
        });

        proceed.setText("Proceed");
        proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Additional details: ");

        jLabel4.setText("Address: ");

        jLabel5.setText("Contact no");

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });

        jLabel6.setText("Select rooms");

        rooms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        rooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomsActionPerformed(evt);
            }
        });

        selecthotel.setText("Select Hotel");

        hotel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        hotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotelActionPerformed(evt);
            }
        });

        err2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        err2.setForeground(new java.awt.Color(204, 0, 0));
        err2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        err2.setText("*Select a Hotel");

        javax.swing.GroupLayout additionaldetailsLayout = new javax.swing.GroupLayout(additionaldetails);
        additionaldetails.setLayout(additionaldetailsLayout);
        additionaldetailsLayout.setHorizontalGroup(
            additionaldetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(additionaldetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(additionaldetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(additionaldetailsLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(address))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addGroup(additionaldetailsLayout.createSequentialGroup()
                .addGroup(additionaldetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(additionaldetailsLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(additionaldetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selecthotel)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(rooms, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(additionaldetailsLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cno, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(additionaldetailsLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(additionaldetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hotel, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(err2))))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        additionaldetailsLayout.setVerticalGroup(
            additionaldetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(additionaldetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(additionaldetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selecthotel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(err2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(additionaldetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(additionaldetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(23, 23, 23)
                .addGroup(additionaldetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(city, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(show, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(err, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(sort, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(additionaldetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(359, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(proceed, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(343, 343, 343))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(goback)
                        .addGap(344, 344, 344))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(err)
                        .addGap(34, 34, 34)
                        .addComponent(show))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(goback)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(sort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(additionaldetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(proceed)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityActionPerformed

    private void proceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedActionPerformed
        // TODO add your handling code here:
        hotelname=hotel.getSelectedItem().toString();
        cityname=city.getSelectedItem().toString();
        norooms=Integer.parseInt(rooms.getSelectedItem().toString());
        new Booking(username,hotelname,cityname,norooms,this);
        setVisible(false);
    }//GEN-LAST:event_proceedActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        // TODO add your handling code here:
        String selected=city.getSelectedItem().toString();
        String sselected=sort.getSelectedItem().toString();
        if(selected.equals("-------------")){
            err.setVisible(true);
        }else{
            display.setVisible(true);
            err.setVisible(false);
            hotel.setVisible(true);
            selecthotel.setVisible(true);
            additionaldetails.setVisible(true);
            proceed.setVisible(true);
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_booking","root","dev12345");
            PreparedStatement stmt=null;
            if(sselected.equals("-------------")){
               stmt=con.prepareStatement("SELECT `Hotel Name`,`Rooms Available`,`Rating`,`Price` FROM hotel_details WHERE City='"+selected+"'");
            }else if(sselected.equals("Price(Low to High)")){
                stmt=con.prepareStatement("SELECT `Hotel Name`,`Rooms Available`,`Rating`,`Price` FROM hotel_details WHERE City='"+selected+"' ORDER BY Price ASC");
            }else{
               stmt=con.prepareStatement("SELECT `Hotel Name`,`Rooms Available`,`Rating`,`Price` FROM hotel_details WHERE City='"+selected+"' ORDER BY Rating DESC");
            }
            ResultSet rs=stmt.executeQuery(); 
            display.setModel(DbUtils.resultSetToTableModel(rs));
            display.setEnabled(false);
            stmt=con.prepareStatement("SELECT `Hotel Name` FROM hotel_details WHERE City='"+selected+"' AND NOT `Rooms Available`= 0");
            rs=stmt.executeQuery();
            hotel.removeAllItems();
            while(rs.next()){
               hotel.addItem(rs.getString(1)); 
            }
            }catch(Exception e){
                
        }
        }
    }//GEN-LAST:event_showActionPerformed

    private void gobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gobackActionPerformed
        // TODO add your handling code here:
        dispose();
        new UserOptions(username);
    }//GEN-LAST:event_gobackActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void hotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hotelActionPerformed
        // TODO add your handling code here:
        String s="-------------";
        if(hotel.getSelectedIndex()!=-1 ){
             s=hotel.getSelectedItem().toString();
        }
        if( s.equals("-------------") && proceed.isVisible() ){
            err2.setVisible(true);
        }else{
            try{
                err2.setVisible(false);
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_booking","root","dev12345");
                PreparedStatement stmt=con.prepareStatement("SELECT Address FROM hotel_details WHERE `Hotel Name`='"+s+"'");
                ResultSet rs1=stmt.executeQuery();
                rs1.next();
                address.setText(rs1.getString(1));
                stmt=con.prepareStatement("SELECT `Contact No` FROM hotel_details WHERE `Hotel Name`='"+s+"'");
                ResultSet rs2=stmt.executeQuery();
                rs2.next();
                cno.setText(rs2.getString(1));
                stmt=con.prepareStatement("SELECT `Rooms Available` FROM hotel_details WHERE `Hotel Name`='"+s+"'");
                rs2=stmt.executeQuery();
                rs2.next();
                int avl=Integer.parseInt(rs2.getString(1));
                rooms.removeAllItems();
                for(int i=1;i<=5 && i<=avl;i++){
                   rooms.addItem(((Integer)i).toString());
         }
            }catch(Exception e){
                //javax.swing.JOptionPane.showMessageDialog(null,e.getMessage(),"Error",1);
            }
        }
    }//GEN-LAST:event_hotelActionPerformed

    private void roomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomsActionPerformed

    private void sortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_sortActionPerformed
    
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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }
    private String username;
    private String hotelname;
    private int norooms;
    private String cityname;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel additionaldetails;
    private javax.swing.JTextField address;
    private javax.swing.JComboBox<String> city;
    private javax.swing.JTextField cno;
    private javax.swing.JTable display;
    private javax.swing.JLabel err;
    private javax.swing.JLabel err2;
    private javax.swing.JButton goback;
    private javax.swing.JComboBox<String> hotel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton proceed;
    private javax.swing.JComboBox<String> rooms;
    private javax.swing.JLabel selecthotel;
    private javax.swing.JButton show;
    private javax.swing.JComboBox<String> sort;
    // End of variables declaration//GEN-END:variables
}