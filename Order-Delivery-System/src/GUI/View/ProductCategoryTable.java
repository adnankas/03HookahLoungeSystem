/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.View;

import BLL.Customer;
import BLL.ProductCategory;
import DAL.MainException;
import DAL.ProductCategoryRepository;
import GUI.Model.ProductCategoryTableModel;
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
public class ProductCategoryTable extends javax.swing.JInternalFrame {

    ProductCategoryRepository pcr = new ProductCategoryRepository();
    ProductCategoryTableModel pctm = new ProductCategoryTableModel();
    
    public ProductCategoryTable() {
        initComponents();
        loadTable();
        tabelaSelectedIndexChange();
        sortTable();
    }

    public JButton getSavebtn() {
        return Savebtn;
    }

    public JButton getCancel() {
        return Cancel;
    }

    
    
    public JButton getjButton2() {
        return jButton2;
    }
    
    public void sortTable(){
        productcategoryTable.setAutoCreateRowSorter(true);
    }
    
    public void clear(){
        productcategoryTable.clearSelection();
        
        pcidField.setText("");
        pcnField.setText("");
    }
    
    public void loadTable(){
        try{
            List<ProductCategory> lista = pcr.findAll();
            pctm.addList(lista);
            productcategoryTable.setModel(pctm);
            pctm.fireTableDataChanged();
        }catch(MainException ex){
            Logger.getLogger(ProductCategoryTable.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    private void tabelaSelectedIndexChange(){
        final ListSelectionModel rowSM = productcategoryTable.getSelectionModel();
         rowSM.addListSelectionListener(new ListSelectionListener(){

            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(e.getValueIsAdjusting()){
                    return;
                }
                
                ListSelectionModel rowSM = (ListSelectionModel) e.getSource();
                int selectedIndex = rowSM.getAnchorSelectionIndex();
                if(selectedIndex > -1){
                    ProductCategory pc = pctm.getProductCategory(selectedIndex);
                    pcidField.setText(pc.getPcid().toString());
                    pcnField.setText(pc.getProductCategoryName());
                }
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productcategoryPane = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        productcategoryTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        pcidField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pcnField = new javax.swing.JTextField();
        Savebtn = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        filterField = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        productcategoryPane.setBackground(new java.awt.Color(0, 102, 102));

        productcategoryTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(productcategoryTable);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PCID:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ProductCategoryName:");

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

        javax.swing.GroupLayout productcategoryPaneLayout = new javax.swing.GroupLayout(productcategoryPane);
        productcategoryPane.setLayout(productcategoryPaneLayout);
        productcategoryPaneLayout.setHorizontalGroup(
            productcategoryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(productcategoryPaneLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pcidField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pcnField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productcategoryPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filterField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Savebtn)
                .addGap(18, 18, 18)
                .addComponent(Cancel)
                .addGap(71, 71, 71))
        );
        productcategoryPaneLayout.setVerticalGroup(
            productcategoryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productcategoryPaneLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(productcategoryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pcidField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(pcnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(productcategoryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Savebtn)
                    .addComponent(Cancel)
                    .addComponent(jButton3)
                    .addComponent(filterField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jButton2))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        productcategoryPane.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productcategoryPane.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productcategoryPane.setLayer(pcidField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productcategoryPane.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productcategoryPane.setLayer(pcnField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productcategoryPane.setLayer(Savebtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productcategoryPane.setLayer(Cancel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productcategoryPane.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productcategoryPane.setLayer(filterField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productcategoryPane.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        productcategoryPane.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productcategoryPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productcategoryPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        clear();
    }//GEN-LAST:event_CancelActionPerformed

    private void SavebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavebtnActionPerformed
        try{
            int row = productcategoryTable.getSelectedRow();
            if(row == -1){
              ProductCategory pc = new ProductCategory();
              pc.setPcid(Integer.parseInt(pcidField.getText()));
              pc.setProductCategoryName(pcnField.getText());
              pcr.create(pc);
            }else{
                ProductCategory pc = pctm.getProductCategory(row);
                //Id nuk e lejojm me ndryshu vetem emertimin ose fielda tjere qe mundeni me pas
                pc.setProductCategoryName(pcnField.getText());
                pcr.edit(pc);
            }
            //E krijojm ni metode per me i clear fieldat mbasi ti shtojme
            clear();
            loadTable();
        }catch(MainException ex){
            JOptionPane.showMessageDialog(this, "Kjo e dhene ekziston!");
        }
    }//GEN-LAST:event_SavebtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            TableRowSorter<ProductCategoryTableModel> sorter = new TableRowSorter<ProductCategoryTableModel>(pctm);
            productcategoryTable.setRowSorter(sorter);
        
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
        int row = productcategoryTable.getSelectedRow();
       if(row != -1){
           Object [] ob = {"Yes","No"};
           int i = JOptionPane.showOptionDialog(this, "Confirm Delete ?", "Fshirja", JOptionPane.OK_OPTION,JOptionPane.QUESTION_MESSAGE,null,ob,ob[1]);
           if(i == 0){
               ProductCategory pc = pctm.getProductCategory(row);
               try{
                   pcr.delete(pc);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pcidField;
    private javax.swing.JTextField pcnField;
    private javax.swing.JDesktopPane productcategoryPane;
    private javax.swing.JTable productcategoryTable;
    // End of variables declaration//GEN-END:variables
}
