/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;


import java.util.List;
import javax.swing.table.AbstractTableModel;
import BLL.Employee;
/**
 *
 * @author Adnan
 */
public class EmployeeTableModel extends AbstractTableModel{
    List <Employee> list;
    String [] cols = {"EID: ","EmployeeName: ","Sales: "};
    
    public EmployeeTableModel(){}
    
    public EmployeeTableModel(List <Employee> list){
        this.list = list;
    }
    
    public void addList(List <Employee> list){
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
    
    public Employee getEmployee(int index){
        return list.get(index);
    }
    

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Employee e = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return e.getEid();
            case 1: 
                return e.getEmployeeName();
            case 2:
                return e.getSales();
            default:
                return null;
        }
    }
}
