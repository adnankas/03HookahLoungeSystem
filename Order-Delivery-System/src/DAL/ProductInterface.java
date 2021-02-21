/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.util.List;
import BLL.Product;

/**
 *
 * @author Adnan
 */
public interface ProductInterface {
    void create(Product p) throws MainException;
    void edit(Product p) throws MainException;
    void delete(Product p) throws MainException;
    List<Product> findAll() throws MainException;
    Product findByID(Integer ID) throws MainException;
}
