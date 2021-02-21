/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.util.List;
import BLL.Orders;

/**
 *
 * @author Adnan
 */
public interface OrdersInterface {
    void create(Orders o) throws MainException;
    void edit(Orders o) throws MainException;
    void delete(Orders o) throws MainException;
    List<Orders> findAll() throws MainException;
    Orders findByID(Integer ID) throws MainException;
}
