/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import BLL.Invoice;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Adnan
 */
public class InvoiceTableModel extends AbstractTableModel{
    List <Invoice> list;
    String [] cols = {"IVID: ","CustomerName: ","InvoiceDate: ","InvoiceTotal: ","BillingAddress:","EmployeeName: "};
    
    public InvoiceTableModel(){}
    
    public InvoiceTableModel(List <Invoice> list){
        this.list = list;
    }
    
    public void addList(List <Invoice> list){
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
    
    public Invoice getInvoice(int index){
        return list.get(index);
    }
    

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Invoice i = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return i.getIvid();
            case 1:
                return i.getCustomerName();
            case 2:
                 return getDateToString(i.getInvoiceDate());
            case 3:
                return i.getInvoiceTotal();
            case 4:
                return i.getBillingAddress();
            case 5:
                return i.getEmployeeName();
            default:
                return null;
        }
    }
    public String getDateToString(Date d){
        DateFormat da = new SimpleDateFormat("dd-MM-yyyy");
        return da.format(d);
    }

}
