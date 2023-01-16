/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui.menu;
import controller.OrderController;

public class NewOrderGui extends javax.swing.JFrame {
    private OrderController _orderC=new OrderController();

    public NewOrderGui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jenisOrder = new javax.swing.JComboBox<>();
        merekOrder = new javax.swing.JComboBox<>();
        noTelp = new javax.swing.JTextField();
        nominal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textInfo = new javax.swing.JTextArea();
        backDashboard = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jenisOrder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Top Up", "Isi Pulsa" }));
        jenisOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisOrderActionPerformed(evt);
            }
        });

        merekOrder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        noTelp.setText("Nomor");
        noTelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noTelpActionPerformed(evt);
            }
        });

        nominal.setText("nominal");
        nominal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nominalActionPerformed(evt);
            }
        });

        jLabel1.setText("Order Apa");

        jLabel2.setText("Merek Apa");

        jLabel3.setText("No. Telp");

        jLabel4.setText("Nominal");

        jButton1.setText("Proses");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        jLabel5.setText("Isi Form");

        textInfo.setEditable(false);
        textInfo.setColumns(20);
        textInfo.setRows(5);
        jScrollPane1.setViewportView(textInfo);

        backDashboard.setText("Kembali");
        backDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backDashboardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jenisOrder, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(merekOrder, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(noTelp)
                                .addComponent(nominal, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(backDashboard))
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jenisOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(merekOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(noTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nominal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(backDashboard))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jenisOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisOrderActionPerformed
        if(jenisOrder.getSelectedItem().equals("Top Up"))
        {
            merekOrder.removeAllItems();
            merekOrder.addItem("Dana");
            merekOrder.addItem("Shopeepay");
            merekOrder.addItem("OVO");
            merekOrder.addItem("Gopay");
            merekOrder.addItem("LinkAja");
            merekOrder.setSelectedItem(null);
        }
        else
        {
            merekOrder.removeAllItems();
            merekOrder.addItem("Telkomsel");
            merekOrder.addItem("3");
            merekOrder.addItem("XL/Axis");
            merekOrder.addItem("Indosat");
            merekOrder.addItem("Smartfren");
            merekOrder.setSelectedItem(null);
        }
    }//GEN-LAST:event_jenisOrderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String jenisorder=(String) jenisOrder.getSelectedItem();
        String merekorder=(String) merekOrder.getSelectedItem();
        String notelp=noTelp.getText();
        int nominal=Integer.parseInt(this.nominal.getText());
        if(jenisorder=="Top Up"){
            boolean status=_orderC.tambahorderM(merekorder, notelp, nominal);
            if (status){
                textInfo.append("Top Up "+merekorder+" No. Telp: "+notelp+" \nNominal: "+nominal+" Berhasil!\n");
            }
            else{
                textInfo.append("GAGAL!");
            }

        }
        else if(jenisorder=="Isi Pulsa"){
            boolean status=_orderC.tambahOrderP(merekorder, notelp, nominal);
            if (status){
               textInfo.append("Isi Pulsa "+merekorder+" No. Telp: "+notelp+" \nNominal: "+nominal+" Berhasil!\n");
            }
            else{
               textInfo.append("GAGAL!");
            }
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void noTelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noTelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noTelpActionPerformed

    private void nominalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nominalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nominalActionPerformed

    private void backDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backDashboardActionPerformed
        new DashboardGui().setVisible(true);
        dispose();
    }//GEN-LAST:event_backDashboardActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backDashboard;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jenisOrder;
    private javax.swing.JComboBox<String> merekOrder;
    private javax.swing.JTextField noTelp;
    private javax.swing.JTextField nominal;
    private javax.swing.JTextArea textInfo;
    // End of variables declaration//GEN-END:variables
}
