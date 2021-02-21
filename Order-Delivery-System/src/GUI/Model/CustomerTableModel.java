/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;


import java.util.List;
import BLL.Customer;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Adnan
 */
public class CustomerTableModel extends AbstractTableModel{

    
    List <Customer> list;
    String [] cols = {"CID: ","FirstName: ","LastName: ","BillingAddress: "};
    
    public CustomerTableModel(){}
    
    public CustomerTableModel(List <Customer> list){
        this.list = list;
    }
    
    public void addList(List <Customer> list){
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
    
    public Customer getCustomer(int index){
        return list.get(index);
    }
    

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Customer c = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return c.getCid();
            case 1: 
                return c.getFirstName();
            case 2:
                return c.getLastName();
            case 3:
                return c.getBillingAddress();
            default:
                return null;
        }
    }
    
}
