package DAL;

import DAL.MainException;
import BLL.Perdoruesi;
import java.util.List;

/**
 *
 * @author taulanti
 */
public interface PerdoruesiInterface {
    void create(Perdoruesi p) throws MainException;
    void edit(Perdoruesi p) throws MainException;
    void delete(Perdoruesi p) throws MainException;
    List<Perdoruesi> findAll() throws MainException;
    Perdoruesi findByID(Integer ID) throws MainException;
    Perdoruesi loginByUsernameAndPassword(String p) throws MainException;
}
