/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.View;


import BLL.Invoice;
import DAL.InvoiceRepository;
import DAL.MainException;
import GUI.Model.InvoiceTableModel;
import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.PatternSyntaxException;
import javax.swing.JButton;
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
public class InvoiceTable extends javax.swing.JInternalFrame {

    InvoiceRepository ir = new InvoiceRepository();
    InvoiceTableModel itm = new InvoiceTableModel();
    
    public InvoiceTable() {
        initComponents();
        loadTable();
        tabelaSelectedIndexChange();
        sortTable();
    }

    public void sortTable(){
        invoiceTable.setAutoCreateRowSorter(true);
    }
    
    public JButton getjButton2() {
        return jButton2;
    }
    
    public void clear(){
        invoiceTable.clearSelection();
        
        ividField.setText("");
        cnField.setText("");
        //ivdField.setText("");
        ivtField.setText("");
        baField.setText("");
        enField.setText("");
    }
    
    public void loadTable(){
        try{
            List<Invoice> lista = ir.findAll();
            itm.addList(lista);
            invoiceTable.setModel(itm);
            itm.fireTableDataChanged();
        }catch(MainException ex){
            Logger.getLogger(InvoiceTable.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    private void tabelaSelectedIndexChange(){
        final ListSelectionModel rowSM = invoiceTable.getSelectionModel();
         rowSM.addListSelectionListener(new ListSelectionListener(){

            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(e.getValueIsAdjusting()){
                    return;
                }
                
                ListSelectionModel rowSM = (ListSelectionModel) e.getSource();
                int selectedIndex = rowSM.getAnchorSelectionIndex();
                if(selectedIndex > -1){
                    Invoice i = itm.getInvoice(selectedIndex);
                    ividField.setText(i.getIvid().toString());
                    cnField.setText(i.getCustomerName());
                    ivdField.setDate(i.getInvoiceDate()); 
                    ivtField.setText(""+i.getInvoiceTotal());
                    baField.setText(i.getBillingAddress());
                    enField.setText(i.getEmployeeName());
                }
            }
        });      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        invoicePane = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        invoiceTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ividField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cnField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ivtField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        baField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        enField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        filterField = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ivdField = new com.toedter.calendar.JDateChooser();

        invoicePane.setBackground(new java.awt.Color(0, 102, 102));
        invoicePane.setPreferredSize(new java.awt.Dimension(638, 378));

        invoiceTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(invoiceTable);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("IVID:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CusName:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("IVDate:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("IVTotal:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BillAdrss:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("EmpName:");

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        jButton3.setText("X");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Filter");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout invoicePaneLayout = new javax.swing.GroupLayout(invoicePane);
        invoicePane.setLayout(invoicePaneLayout);
        invoicePaneLayout.setHorizontalGroup(
            invoicePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invoicePaneLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ividField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cnField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ivdField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ivtField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(baField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, invoicePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filterField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cancel)
                .addGap(53, 53, 53))
            .addGroup(invoicePaneLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        invoicePaneLayout.setVerticalGroup(
            invoicePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invoicePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(invoicePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(invoicePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(ividField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(cnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(ivtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(baField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(enField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ivdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(invoicePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Cancel)
                    .addComponent(jButton3)
                    .addComponent(filterField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jButton2))
                .addGap(20, 20, 20))
        );
        invoicePane.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        invoicePane.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        invoicePane.setLayer(ividField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        invoicePane.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        invoicePane.setLayer(cnField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        invoicePane.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        invoicePane.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        invoicePane.setLayer(ivtField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        invoicePane.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        invoicePane.setLayer(baField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        invoicePane.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        invoicePane.setLayer(enField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        invoicePane.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        invoicePane.setLayer(Cancel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        invoicePane.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        invoicePane.setLayer(filterField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        invoicePane.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        invoicePane.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        invoicePane.setLayer(ivdField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(invoicePane, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(invoicePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        clear();
    }//GEN-LAST:event_CancelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            int row = invoiceTable.getSelectedRow();
            if(row == -1){
                Invoice i = new Invoice();
                i.setIvid(Integer.parseInt(ividField.getText()));
                i.setCustomerName(cnField.getText());
                i.setInvoiceDate(ivdField.getDate());
                BigDecimal bigDecimalCurrency=new BigDecimal(ivtField.getText());
                i.setInvoiceTotal(bigDecimalCurrency);
                i.setBillingAddress(baField.getText());
                i.setEmployeeName(enField.getText());
                ir.create(i);
            }else{
                Invoice i = itm.getInvoice(row);
                //Id nuk e lejojm me ndryshu vetem emertimin ose fielda tjere qe mundeni me pas
                i.setCustomerName(cnField.getText());
                i.setInvoiceDate(ivdField.getDate());
                BigDecimal bigDecimalCurrency=new BigDecimal(ivtField.getText());
                i.setInvoiceTotal(bigDecimalCurrency);
                i.setBillingAddress(baField.getText());
                i.setEmployeeName(enField.getText());
                ir.edit(i);
            }
            //E krijojm ni metode per me i clear fieldat mbasi ti shtojme
            clear();
            loadTable();
        }catch(MainException ex){
            JOptionPane.showMessageDialog(this, "Kjo e dhene ekziston!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        TableRowSorter<InvoiceTableModel> sorter = new TableRowSorter<InvoiceTableModel>(itm);
            invoiceTable.setRowSorter(sorter);
        
        String text = filterField.getText();
            if(text.length() == 0) {
               sorter.setRowFilter(null);
            } else {
               try {
                  sorter.setRowFilter(RowFilter.regexFilter(text));
               } catch(PatternSyntaxException pse) {
                     JOptionPane.showMessageDialog(this, pse.getMessage());
               }
    }//GEN-LAST:event_jButton4ActionPerformed
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int row = invoiceTable.getSelectedRow();
       if(row != -1){
           Object [] ob = {"Yes","No"};
           int i = JOptionPane.showOptionDialog(this, "Confirm Delete ?", "Fshirja", JOptionPane.OK_OPTION,JOptionPane.QUESTION_MESSAGE,null,ob,ob[1]);
           if(i == 0){
               Invoice in = itm.getInvoice(row);
               try{
                   ir.delete(in);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JTextField baField;
    private javax.swing.JTextField cnField;
    private javax.swing.JTextField enField;
    private javax.swing.JTextField filterField;
    private javax.swing.JDesktopPane invoicePane;
    private javax.swing.JTable invoiceTable;
    private com.toedter.calendar.JDateChooser ivdField;
    private javax.swing.JTextField ividField;
    private javax.swing.JTextField ivtField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
