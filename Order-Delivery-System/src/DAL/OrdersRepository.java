/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;


import java.util.List;
import BLL.Orders;
import BLL.Perdoruesi;
import javax.persistence.Query;

/**
 *
 * @author Adnan
 */
public class OrdersRepository extends EntityManagementClass implements OrdersInterface{
    @Override
    public void create(Orders o) throws MainException {
        try{
            em.getTransaction().begin();
            em.persist(o);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new MainException("Msg \n"+e.getMessage());
        }
    }

    @Override
    public void edit(Orders o) throws MainException {
        try{
            em.getTransaction().begin();
            em.merge(o);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new MainException("Msg \n"+ e.getMessage());
        }
    }

    @Override
    public void delete(Orders o) throws MainException {
        try{em.getTransaction().begin();
        em.remove(o);
        em.getTransaction().commit();
        }catch(Exception e){
            throw new MainException("Msg \n"+e.getMessage());
        }
    }

    @Override
    public List<Orders> findAll() throws MainException {
        try{
           return em.createNamedQuery("Orders.findAll").getResultList();
        }catch(Exception e){
            throw new MainException("Msg \n"+ e.getMessage());
        }
    }

    @Override
    public Orders findByID(Integer ID) throws MainException {
        try {
            Query query = em.createQuery("SELECT o FROM Orders o WHERE o.ID = :abc");
            query.setParameter("abc", ID);
            return (Orders) query.getSingleResult();
        } catch (Exception e) {
            throw new MainException("Msg! \n" + e.getMessage());
        }
    }
}
