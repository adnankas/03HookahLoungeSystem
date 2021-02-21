/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.util.List;
import BLL.Menu;

/**
 *
 * @author Adnan
 */
public interface MenuInterface {
    void create(Menu m) throws MainException;
    void edit(Menu m) throws MainException;
    void delete(Menu m) throws MainException;
    List<Menu> findAll() throws MainException;
    Menu findByID(Integer ID) throws MainException;
}
