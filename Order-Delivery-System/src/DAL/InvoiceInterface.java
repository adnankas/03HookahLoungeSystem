/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.util.List;
import BLL.Invoice;

/**
 *
 * @author Adnan
 */
public interface InvoiceInterface {
    void create(Invoice i) throws MainException;
    void edit(Invoice i) throws MainException;
    void delete(Invoice i) throws MainException;
    List<Invoice> findAll() throws MainException;
    Invoice findByID(Integer ID) throws MainException;
}
