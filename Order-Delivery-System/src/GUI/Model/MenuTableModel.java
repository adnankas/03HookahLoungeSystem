/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import BLL.Menu;
/**
 *
 * @author Adnan
 */
public class MenuTableModel extends AbstractTableModel{
    List <Menu> list;
    String [] cols = {"MID: ","ProductName: ","ProductType: ","ProductCategory: "};
    
    public MenuTableModel(){}
    
    public MenuTableModel(List <Menu> list){
        this.list = list;
    }
    
    public void addList(List <Menu> list){
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
    
    public Menu getMenu(int index){
        return list.get(index);
    }
    

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Menu m = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return m.getMenuID();
            case 1: 
                return m.getProductName();
            case 2:
                return m.getProductType();
            case 3:
                return m.getProductCategory();
            default:
                return null;
        }
    }
}
