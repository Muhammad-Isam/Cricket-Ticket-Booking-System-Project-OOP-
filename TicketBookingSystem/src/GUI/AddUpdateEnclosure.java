/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Admin.Admin;

/**
 *
 * @author Motile
 */
public class AddUpdateEnclosure extends javax.swing.JFrame {

    /**
     * Creates new form AddUpdateEnclosure
     */
    public AddUpdateEnclosure() {
        initComponents();
    }
     Admin a=new Admin();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtename = new javax.swing.JTextField();
        txttotaleseats = new javax.swing.JTextField();
        txtetype = new javax.swing.JTextField();
        txteprice = new javax.swing.JTextField();
        txterows = new javax.swing.JTextField();
        txtgname = new javax.swing.JTextField();
        txtvenue = new javax.swing.JTextField();
        txttotalgcapacity = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cbxtournament = new javax.swing.JComboBox();
        cbxground = new javax.swing.JComboBox();
        cbxmatchdetails = new javax.swing.JComboBox();
        cbxenclosure = new javax.swing.JComboBox();
        cbxresult = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PCB-Logo-Small.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 255, 153));

        jLabel2.setText("Enclosure name");

        jLabel3.setText("Total seats in enclosure");

        jLabel4.setText("Type of enclosure");

        jLabel5.setText("Price if this enclosure's ticket ");

        jLabel6.setText("Number of rows in enclosure");

        jLabel7.setText("Ground Name");

        jLabel8.setText("Venue");

        jLabel9.setText("Total capacity of ground");

        jButton2.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtetype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtetypeActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(102, 153, 0));

        cbxtournament.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        cbxtournament.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tournaments", "Add Tournament", "Delete Tournament", "Update Tournament", "Search Tournament" }));
        cbxtournament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxtournamentActionPerformed(evt);
            }
        });

        cbxground.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        cbxground.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Grounds", "Add Ground", "Delete Ground", "Update Ground", "Search Ground" }));
        cbxground.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxgroundActionPerformed(evt);
            }
        });

        cbxmatchdetails.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        cbxmatchdetails.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Match Details", "Add Match Details", "Delete Match Details", "Update Match Details", "Search Match Details" }));
        cbxmatchdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxmatchdetailsActionPerformed(evt);
            }
        });

        cbxenclosure.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        cbxenclosure.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enclosures", "Add Enclosure", "Delete Enclosure", "Update Enclosure", "Search Enclosure" }));
        cbxenclosure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxenclosureActionPerformed(evt);
            }
        });

        cbxresult.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        cbxresult.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Results", "Specify Result" }));
        cbxresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxresultActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back paint.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cbxtournament, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cbxground, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cbxmatchdetails, 0, 270, Short.MAX_VALUE)
            .addComponent(cbxenclosure, 0, 270, Short.MAX_VALUE)
            .addComponent(cbxresult, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(cbxtournament, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxground, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxmatchdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbxenclosure, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbxresult, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txteprice, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtgname, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttotaleseats, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtename, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttotalgcapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtetype, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtvenue, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txterows, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttotaleseats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtetype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txteprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txterows, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtgname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtvenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(txttotalgcapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        AdminDashboard ad=new AdminDashboard();
        ad.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String ename=txtename.getText();
        String totaleseats=txttotaleseats.getText();
        String etype=txtetype.getText();
        String eprice=txteprice.getText();
        String erows=txterows.getText();
        String gname=txtgname.getText();
        String gvenue=txtvenue.getText();
        String gtotalcapacity=txttotalgcapacity.getText();
        a.AddEnclosure(ename, totaleseats, etype, eprice, erows, gname, gvenue, gtotalcapacity);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String ename=txtename.getText();
        String totaleseats=txttotaleseats.getText();
        String etype=txtetype.getText();
        String eprice=txteprice.getText();
        String erows=txterows.getText();
        String gname=txtgname.getText();
        String gvenue=txtvenue.getText();
        String gtotalcapacity=txttotalgcapacity.getText();
        a.updateEnclosure(ename, totaleseats, etype, eprice, erows, gname, gvenue, gtotalcapacity);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtetypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtetypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtetypeActionPerformed

    private void cbxtournamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxtournamentActionPerformed
        AddDeleteSearchTournament adst=new AddDeleteSearchTournament();
        UpdateTournament ut=new UpdateTournament();
        if(cbxtournament.getSelectedItem()=="Add Tournament")
        {
            setVisible(false);
            adst.setVisible(true);
        }
        else if(cbxtournament.getSelectedItem()=="Delete Tournament")
        {
            setVisible(false);
            adst.setVisible(true);
        }
        else if(cbxtournament.getSelectedItem()=="Update Tournament")
        {
            setVisible(false);
            ut.setVisible(true);
        }
        else if(cbxtournament.getSelectedItem()=="Search Tournament")
        {
            setVisible(false);
            adst.setVisible(true);
        }
    }//GEN-LAST:event_cbxtournamentActionPerformed

    private void cbxgroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxgroundActionPerformed
        SearchDeleteGround sdg=new SearchDeleteGround();
        AddUpdateGround aug=new AddUpdateGround();
        if(cbxground.getSelectedItem()=="Add Ground")
        {
            setVisible(false);
            aug.setVisible(true);
        }
        else if(cbxground.getSelectedItem()=="Delete Ground")
        {
            setVisible(false);
            sdg.setVisible(true);
        }
        else if(cbxground.getSelectedItem()=="Update Ground")
        {
            setVisible(false);
            aug.setVisible(true);
        }
        else if(cbxground.getSelectedItem()=="Search Ground")
        {
            setVisible(false);
            sdg.setVisible(true);
        }
    }//GEN-LAST:event_cbxgroundActionPerformed

    private void cbxmatchdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxmatchdetailsActionPerformed
        AddUpdateMatchdetails aum=new AddUpdateMatchdetails();
        SearchDeleteMatchdetails sdm=new SearchDeleteMatchdetails();
        if(cbxmatchdetails.getSelectedItem()=="Add Match Details")
        {
            setVisible(false);
            aum.setVisible(true);
        }
        else if(cbxmatchdetails.getSelectedItem()=="Delete Match Details")
        {
            setVisible(false);
            sdm.setVisible(true);
        }
        else if(cbxmatchdetails.getSelectedItem()=="Update Match Details")
        {
            setVisible(false);
            aum.setVisible(true);
        }
        else if(cbxmatchdetails.getSelectedItem()=="Search Match Details")
        {
            setVisible(false);
            sdm.setVisible(true);
        }
    }//GEN-LAST:event_cbxmatchdetailsActionPerformed

    private void cbxenclosureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxenclosureActionPerformed
        AddUpdateEnclosure aue=new AddUpdateEnclosure();
        SearchDeleteEnclosure sde=new SearchDeleteEnclosure();
        if(cbxenclosure.getSelectedItem()=="Add Enclosure")
        {
            setVisible(false);
            aue.setVisible(true);
        }
        else if(cbxenclosure.getSelectedItem()=="Delete Enclosure")
        {
            setVisible(false);
            sde.setVisible(true);
        }
        else if(cbxenclosure.getSelectedItem()=="Update Enclosure")
        {
            setVisible(false);
            aue.setVisible(true);
        }
        else if(cbxenclosure.getSelectedItem()=="Search Enclosure")
        {
            setVisible(false);
            sde.setVisible(true);
        }
    }//GEN-LAST:event_cbxenclosureActionPerformed

    private void cbxresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxresultActionPerformed
        if(cbxresult.getSelectedItem()=="Specify Result")
        {
            SpecifyResult sr=new SpecifyResult();
            sr.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_cbxresultActionPerformed

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
            java.util.logging.Logger.getLogger(AddUpdateEnclosure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUpdateEnclosure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUpdateEnclosure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUpdateEnclosure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUpdateEnclosure().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbxenclosure;
    private javax.swing.JComboBox cbxground;
    private javax.swing.JComboBox cbxmatchdetails;
    private javax.swing.JComboBox cbxresult;
    private javax.swing.JComboBox cbxtournament;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtename;
    private javax.swing.JTextField txteprice;
    private javax.swing.JTextField txterows;
    private javax.swing.JTextField txtetype;
    private javax.swing.JTextField txtgname;
    private javax.swing.JTextField txttotaleseats;
    private javax.swing.JTextField txttotalgcapacity;
    private javax.swing.JTextField txtvenue;
    // End of variables declaration//GEN-END:variables
}