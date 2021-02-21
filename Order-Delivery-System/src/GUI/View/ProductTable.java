/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.View;

import BLL.Product;
import DAL.MainException;
import DAL.ProductRepository;
import GUI.Model.ProductTableModel;
import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.PatternSyntaxException;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Adnan
 */
public class ProductTable extends javax.swing.JInternalFrame {

     ProductRepository pr = new ProductRepository();
    ProductTableModel ptm = new ProductTableModel();
    
    public ProductTable() {
        initComponents();
        loadTable();
        tabelaSelectedIndexChange();
        sortTable();
    }

    public JButton getCancel() {
        return Cancel;
    }

    public JButton getSavebtn() {
        return Savebtn;
    }

    public JTextField getpField() {
        return pField;
    }

    public JTextField getPidField() {
        return pidField;
    }

    public void setPidField(JTextField pidField) {
        this.pidField = pidField;
    }

    
    public void sortTable(){
        productTable.setAutoCreateRowSorter(true);
    }
    
    public JButton getjButton2() {
        return jButton2;
    }
    
     public void clear(){
        productTable.clearSelection();
        
        pidField.setText("");
        pnField.setText("");
        ptField.setText("");
        pcField.setText("");
        pField.setText("");
    }
     
     public void loadTable(){
        try{
            List<Product> lista = pr.findAll();
            ptm.addList(lista);
            productTable.setModel(ptm);
            ptm.fireTableDataChanged();
        }catch(MainException ex){
            Logger.getLogger(ProductTable.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
     
     private void tabelaSelectedIndexChange(){
        final ListSelectionModel rowSM = productTable.getSelectionModel();
         rowSM.addListSelectionListener(new ListSelectionListener(){

            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(e.getValueIsAdjusting()){
                    return;
                }
                
                ListSelectionModel rowSM = (ListSelectionModel) e.getSource();
                int selectedIndex = rowSM.getAnchorSelectionIndex();
                if(selectedIndex > -1){
                    Product p = ptm.getProduct(selectedIndex);
                    pidField.setText(p.getPid().toString());
                    pnField.setText(p.getProductName());
                    ptField.setText(p.getProductType());
                    pcField.setText(p.getProductCategory());
                    pField.setText(""+p.getPrice());
                }
            }
        });
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productPane = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        pidField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pnField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ptField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pcField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pField = new javax.swing.JTextField();
        Savebtn = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        filterField = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        productPane.setBackground(new java.awt.Color(0, 102, 102));

        productTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(productTable);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PID:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Prod.Name:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Prod.Type:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Prod.Category:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Price:");

        Savebtn.setText("Save");
        Savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavebtnActionPerformed(evt);
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

        javax.swing.GroupLayout productPaneLayout = new javax.swing.GroupLayout(productPane);
        productPane.setLayout(productPaneLayout);
        productPaneLayout.setHorizontalGroup(
            productPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(productPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(productPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productPaneLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pidField, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnField, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ptField, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pcField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pField, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productPaneLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filterField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Savebtn)
                        .addGap(18, 18, 18)
                        .addComponent(Cancel)
                        .addGap(46, 46, 46))))
        );
        productPaneLayout.setVerticalGroup(
            productPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productPaneLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(productPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pidField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(pnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(ptField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(pcField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(pField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(productPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Savebtn)
                    .addComponent(Cancel)
                    .addComponent(jButton3)
                    .addComponent(filterField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jButton2))
                .addGap(30, 30, 30))
        );
        productPane.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productPane.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productPane.setLayer(pidField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productPane.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productPane.setLayer(pnField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productPane.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productPane.setLayer(ptField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productPane.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productPane.setLayer(pcField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productPane.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productPane.setLayer(pField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productPane.setLayer(Savebtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productPane.setLayer(Cancel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productPane.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productPane.setLayer(filterField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productPane.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productPane.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productPane))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SavebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavebtnActionPerformed
        try{
            int row = productTable.getSelectedRow();
            if(row == -1){
              Product p = new Product();
              p.setPid(Integer.parseInt(pidField.getText()));
              p.setProductName(pnField.getText());
              p.setProductType(ptField.getText());
              p.setProductCategory(pcField.getText());
              BigDecimal bd = new BigDecimal(pField.getText());
              p.setPrice(bd);
              pr.create(p);
            }else{
                Product p = ptm.getProduct(row);
                //Id nuk e lejojm me ndryshu vetem emertimin ose fielda tjere qe mundeni me pas
                p.setPid(Integer.parseInt(pidField.getText()));
              p.setProductName(pnField.getText());
              p.setProductType(ptField.getText());
              p.setProductCategory(pcField.getText());
              BigDecimal bd = new BigDecimal(pField.getText());
              p.setPrice(bd);
                pr.edit(p);
            }
            //E krijojm ni metode per me i clear fieldat mbasi ti shtojme
            clear();
            loadTable();
        }catch(MainException ex){
            JOptionPane.showMessageDialog(this, "Kjo e dhene ekziston!");
        }
    }//GEN-LAST:event_SavebtnActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        clear();
    }//GEN-LAST:event_CancelActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        TableRowSorter<ProductTableModel> sorter = new TableRowSorter<ProductTableModel>(ptm);
            productTable.setRowSorter(sorter);
        
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
        int row = productTable.getSelectedRow();
       if(row != -1){
           Object [] ob = {"Yes","No"};
           int i = JOptionPane.showOptionDialog(this, "Confirm Delete ?", "Fshirja", JOptionPane.OK_OPTION,JOptionPane.QUESTION_MESSAGE,null,ob,ob[1]);
           if(i == 0){
               Product p = ptm.getProduct(row);
               try{
                   pr.delete(p);
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
    private javax.swing.JButton Savebtn;
    private javax.swing.JTextField filterField;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pField;
    private javax.swing.JTextField pcField;
    private javax.swing.JTextField pidField;
    private javax.swing.JTextField pnField;
    private javax.swing.JDesktopPane productPane;
    private javax.swing.JTable productTable;
    private javax.swing.JTextField ptField;
    // End of variables declaration//GEN-END:variables
}
