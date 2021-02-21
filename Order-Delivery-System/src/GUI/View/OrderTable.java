/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.View;


import BLL.Orders;
import DAL.MainException;
import DAL.OrdersRepository;
import GUI.Model.OrderTableModel;
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
public class OrderTable extends javax.swing.JInternalFrame {

   OrdersRepository or = new OrdersRepository();
   OrderTableModel otm = new OrderTableModel();
    
    public OrderTable() {
        initComponents();
        loadTable();
        tabelaSelectedIndexChange();
        sortTable();
    }

    public void sortTable(){
        orderTable.setAutoCreateRowSorter(true);
    }
    
    public JButton getjButton2() {
        return jButton2;
    }
    
    public void clear(){
        orderTable.clearSelection();
        
        oidField.setText("");
        cnField.setText("");
        dField.setText("");
        otField.setText("");
        enField.setText("");
    }
    
    public void loadTable(){
        try{
            List<Orders> lista = or.findAll();
            otm.addList(lista);
            orderTable.setModel(otm);
            otm.fireTableDataChanged();
        }catch(MainException ex){
            Logger.getLogger(OrderTable.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    private void tabelaSelectedIndexChange(){
        final ListSelectionModel rowSM = orderTable.getSelectionModel();
         rowSM.addListSelectionListener(new ListSelectionListener(){

            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(e.getValueIsAdjusting()){
                    return;
                }
                
                ListSelectionModel rowSM = (ListSelectionModel) e.getSource();
                int selectedIndex = rowSM.getAnchorSelectionIndex();
                if(selectedIndex > -1){
                    Orders o = otm.getOrder(selectedIndex);
                    oidField.setText(o.getOid().toString());
                    cnField.setText(o.getCustomerName());
                    dField.setText(o.getDescription());
                    otField.setText(""+o.getOrderTotal());
                    enField.setText(o.getEmployeeName());
                }
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orderPane = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        oidField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cnField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        otField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        enField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        filterField = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        orderPane.setBackground(new java.awt.Color(0, 102, 102));

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(orderTable);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("OID:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CustomerName:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Description: ");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("OrderTotal:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("EmpName:");

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

        javax.swing.GroupLayout orderPaneLayout = new javax.swing.GroupLayout(orderPane);
        orderPane.setLayout(orderPaneLayout);
        orderPaneLayout.setHorizontalGroup(
            orderPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orderPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderPaneLayout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oidField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cnField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(otField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderPaneLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filterField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cancel)
                        .addGap(61, 61, 61))))
        );
        orderPaneLayout.setVerticalGroup(
            orderPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderPaneLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(orderPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(oidField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(dField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(otField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(enField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(orderPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Cancel)
                    .addComponent(jButton3)
                    .addComponent(filterField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jButton2))
                .addGap(24, 24, 24))
        );
        orderPane.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        orderPane.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        orderPane.setLayer(oidField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        orderPane.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        orderPane.setLayer(cnField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        orderPane.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        orderPane.setLayer(dField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        orderPane.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        orderPane.setLayer(otField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        orderPane.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        orderPane.setLayer(enField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        orderPane.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        orderPane.setLayer(Cancel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        orderPane.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        orderPane.setLayer(filterField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        orderPane.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        orderPane.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orderPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orderPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        clear();
    }//GEN-LAST:event_CancelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try{
            int row = orderTable.getSelectedRow();
            if(row == -1){
              Orders o = new Orders();
              o.setOid(Integer.parseInt(oidField.getText()));
              o.setCustomerName(cnField.getText());
              o.setDescription(dField.getText());
              BigDecimal bd = new BigDecimal(otField.getText());
              o.setOrderTotal(bd);
              o.setEmployeeName(enField.getText());
              or.create(o);
            }else{
                Orders o = otm.getOrder(row);
                //Id nuk e lejojm me ndryshu vetem emertimin ose fielda tjere qe mundeni me pas
                o.setOid(Integer.parseInt(oidField.getText()));
                 o.setCustomerName(cnField.getText());
                o.setDescription(dField.getText());
                 BigDecimal bd = new BigDecimal(otField.getText());
                 o.setOrderTotal(bd);
                o.setEmployeeName(enField.getText());
                or.edit(o);
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
        TableRowSorter<OrderTableModel> sorter = new TableRowSorter<OrderTableModel>(otm);
            orderTable.setRowSorter(sorter);
        
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
    int row = orderTable.getSelectedRow();
       if(row != -1){
           Object [] ob = {"Yes","No"};
           int i = JOptionPane.showOptionDialog(this, "Confirm Delete ?", "Fshirja", JOptionPane.OK_OPTION,JOptionPane.QUESTION_MESSAGE,null,ob,ob[1]);
           if(i == 0){
               Orders o = otm.getOrder(row);
               try{
                   or.delete(o);
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
    private javax.swing.JTextField cnField;
    private javax.swing.JTextField dField;
    private javax.swing.JTextField enField;
    private javax.swing.JTextField filterField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField oidField;
    private javax.swing.JDesktopPane orderPane;
    private javax.swing.JTable orderTable;
    private javax.swing.JTextField otField;
    // End of variables declaration//GEN-END:variables
}
