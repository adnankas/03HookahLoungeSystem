/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.util.List;
import BLL.Menu;
import BLL.Perdoruesi;
import javax.persistence.Query;

/**
 *
 * @author Adnan
 */
public class MenuRepository extends EntityManagementClass implements MenuInterface{
    @Override
    public void create(Menu m) throws MainException {
        try{
            em.getTransaction().begin();
            em.persist(m);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new MainException("Msg \n"+e.getMessage());
        }
    }

    @Override
    public void edit(Menu m) throws MainException {
        try{
            em.getTransaction().begin();
            em.merge(m);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new MainException("Msg \n"+ e.getMessage());
        }
    }

    @Override
    public void delete(Menu m) throws MainException {
        try{em.getTransaction().begin();
        em.remove(m);
        em.getTransaction().commit();
        }catch(Exception e){
            throw new MainException("Msg \n"+e.getMessage());
        }
    }

    @Override
    public List<Menu> findAll() throws MainException {
        try{
           return em.createNamedQuery("Menu.findAll").getResultList();
        }catch(Exception e){
            throw new MainException("Msg \n"+ e.getMessage());
        }
    }

    @Override
    public Menu findByID(Integer ID) throws MainException {
        try {
            Query query = em.createQuery("SELECT m FROM Menu m WHERE m.ID = :abc");
            query.setParameter("abc", ID);
            return (Menu) query.getSingleResult();
        } catch (Exception e) {
            throw new MainException("Msg! \n" + e.getMessage());
        }
    }
}
