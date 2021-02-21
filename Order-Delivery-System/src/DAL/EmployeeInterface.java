/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.util.List;
import BLL.Employee;

/**
 *
 * @author Adnan
 */
public interface EmployeeInterface {
    void create(Employee e) throws MainException;
    void edit(Employee e) throws MainException;
    void delete(Employee e) throws MainException;
    List <Employee> findAll() throws MainException;
    Employee findByID(Integer ID) throws MainException;
}
