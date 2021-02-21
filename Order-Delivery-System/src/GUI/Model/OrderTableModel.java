/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import BLL.Orders;

/**
 *
 * @author Adnan
 */
public class OrderTableModel extends AbstractTableModel{
    List <Orders> list;
    String [] cols = {"OID: ","CustomerName: ","Description: ","OrderTotal: ","EmployeeName: "};
    
    public OrderTableModel(){}
    
    public OrderTableModel(List <Orders> list){
        this.list = list;
    }
    
    public void addList(List <Orders> list){
        this.list = list;
    }
    
    @Override
    public String getColumnName(int col){
        return cols[col];
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }
    
    public void remove (int row){
        list.remove(row);
    }
    
    public Orders getOrder(int index){
        return list.get(index);
    }
    

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Orders o = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return o.getOid();
            case 1:
                return o.getCustomerName();
            case 2:
                return o.getDescription();
            case 3:
                return o.getOrderTotal();
            case 4:
                return o.getEmployeeName();
            default:
                return null;
        }
    }
}
