/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.util.List;
import BLL.Customer;

/**
 *
 * @author Adnan
 */
public interface CustomerInterface {
    void create(Customer c) throws MainException;
    void edit(Customer c) throws MainException;
    void delete(Customer c) throws MainException;
    List <Customer> findAll() throws MainException;
    Customer findByID(Integer ID) throws MainException;
}
