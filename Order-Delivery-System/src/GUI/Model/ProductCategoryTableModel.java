/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import BLL.ProductCategory;

/**
 *
 * @author Adnan
 */
public class ProductCategoryTableModel extends AbstractTableModel{
    List <ProductCategory> list;
    String [] cols = {"PCID: ","ProductCategoryName: "};
    
    public ProductCategoryTableModel(){}
    
    public ProductCategoryTableModel(List <ProductCategory> list){
        this.list = list;
    }
    
    public void addList(List <ProductCategory> list){
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
    
    public ProductCategory getProductCategory(int index){
        return list.get(index);
    }
    

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ProductCategory pc = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return pc.getPcid();
            case 1: 
                return pc.getProductCategoryName();
            default:
                return null;
        }
    }
}
