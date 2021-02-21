/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.View;

import BLL.Customer;
import BLL.Perdoruesi;
import DAL.CustomerRepository;
import DAL.MainException;
import GUI.Model.CustomerTableModel;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.PatternSyntaxException;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Adnan
 */
public class CustomerTable extends javax.swing.JInternalFrame {

    CustomerRepository cr = new CustomerRepository();
    CustomerTableModel ctm = new CustomerTableModel();
    Perdoruesi p = new Perdoruesi();
    LOGiN l = new LOGiN();
    
    public CustomerTable() {
        initComponents();
        loadTable();
        tabelaSelectedIndexChange();
        closeTable();
        sortTable();
    }
    
    public CustomerTable(int id){
        initComponents();
    }
    
    public JButton getjButton2() {
        return jButton2;
    }
    
    public void sortTable(){
        customerTable.setAutoCreateRowSorter(true);
    }
    
    public void closeTable(){
        setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
    }
    
    public void loadTable(){
        try{
            List<Customer> lista = cr.findAll();
            ctm.addList(lista);
            customerTable.setModel(ctm);
            ctm.fireTableDataChanged();
        }catch(MainException ex){
            Logger.getLogger(CustomerTable.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    private void tabelaSelectedIndexChange(){
        final ListSelectionModel rowSM = customerTable.getSelectionModel();
         rowSM.addListSelectionListener(new ListSelectionListener(){

            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(e.getValueIsAdjusting()){
                    return;
                }
                
                ListSelectionModel rowSM = (ListSelectionModel) e.getSource();
                int selectedIndex = rowSM.getAnchorSelectionIndex();
                if(selectedIndex > -1){
                    Customer c = ctm.getCustomer(selectedIndex);
                    cidField.setText(c.getCid().toString());
                    fnField.setText(c.getFirstName());
                    lnField.setText(c.getLastName());
                    baField.setText(c.getBillingAddress());
                }
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customerPane = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cidField = new javax.swing.JTextField();
        fnField = new javax.swing.JTextField();
        lnField = new javax.swing.JTextField();
        baField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        filterField = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        customerPane.setBackground(new java.awt.Color(0, 102, 102));

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(customerTable);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CID:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FirstName:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LastName:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bill.Addrs:");

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("X");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Filter");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout customerPaneLayout = new javax.swing.GroupLayout(customerPane);
        customerPane.setLayout(customerPaneLayout);
        customerPaneLayout.setHorizontalGroup(
            customerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(customerPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customerPaneLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cidField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fnField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lnField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(baField, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(customerPaneLayout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filterField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(26, 26, 26)
                        .addComponent(jButton3)
                        .addGap(42, 42, 42))))
        );
        customerPaneLayout.setVerticalGroup(
            customerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerPaneLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(customerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(cidField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(baField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(customerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(filterField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(25, 25, 25))
        );
        customerPane.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        customerPane.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        customerPane.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        customerPane.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        customerPane.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        customerPane.setLayer(cidField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        customerPane.setLayer(fnField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        customerPane.setLayer(lnField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        customerPane.setLayer(baField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        customerPane.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        customerPane.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        customerPane.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        customerPane.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        customerPane.setLayer(filterField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        customerPane.setLayer(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void clear(){
        customerTable.clearSelection();
        
        cidField.setText("");
        fnField.setText("");
        lnField.setText("");
        baField.setText("");
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            int row = customerTable.getSelectedRow();
            if(row == -1){
              Customer c = new Customer();
              c.setCid(Integer.parseInt(cidField.getText()));
              c.setFirstName(fnField.getText());
              c.setLastName(lnField.getText());
              c.setBillingAddress(baField.getText());
              cr.create(c);
            }else{
                Customer c = ctm.getCustomer(row);
                //Id nuk e lejojm me ndryshu vetem emertimin ose fielda tjere qe mundeni me pas
                c.setFirstName(fnField.getText());
                c.setLastName(lnField.getText());
                c.setBillingAddress(baField.getText());
                cr.edit(c);
            }
            //E krijojm ni metode per me i clear fieldat mbasi ti shtojme
            clear();
            loadTable();
        }catch(MainException ex){
            JOptionPane.showMessageDialog(this, "Kjo e dhene ekziston!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            clear();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       int row = customerTable.getSelectedRow();
       if(row != -1){
           Object [] ob = {"Yes","No"};
           int i = JOptionPane.showOptionDialog(this, "Confirm Delete ?", "Fshirja", JOptionPane.OK_OPTION,JOptionPane.QUESTION_MESSAGE,null,ob,ob[1]);
           if(i == 0){
               Customer c = ctm.getCustomer(row);
               try{
                   cr.delete(c);
               }catch(MainException me){
                   JOptionPane.showMessageDialog(this, me.getMessage());
               }
               clear();
               loadTable();
           }else{
               clear();
           }
       }else{
           JOptionPane.showMessageDialog(this, "No row selected !");
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            TableRowSorter<CustomerTableModel> sorter = new TableRowSorter<CustomerTableModel>(ctm);
            customerTable.setRowSorter(sorter);
        
        String text = filterField.getText();
            if(text.length() == 0) {
               sorter.setRowFilter(null);
            } else {
               try {
                  sorter.setRowFilter(RowFilter.regexFilter(text));
               } catch(PatternSyntaxException pse) {
                     JOptionPane.showMessageDialog(this, pse.getMessage());
               }
    }//GEN-LAST:event_jButton5ActionPerformed

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField baField;
    private javax.swing.JTextField cidField;
    private javax.swing.JDesktopPane customerPane;
    private javax.swing.JTable customerTable;
    private javax.swing.JTextField filterField;
    private javax.swing.JTextField fnField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lnField;
    // End of variables declaration//GEN-END:variables
}
