/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.util.List;
import BLL.ProductCategory;

/**
 *
 * @author Adnan
 */
public interface ProductCategoryInterface {
    void create(ProductCategory pc) throws MainException;
    void edit(ProductCategory pc) throws MainException;
    void delete(ProductCategory pc) throws MainException;
    List<ProductCategory> findAll() throws MainException;
    ProductCategory findByID(Integer ID) throws MainException;
}
