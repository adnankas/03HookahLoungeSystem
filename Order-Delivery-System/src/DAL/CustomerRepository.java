/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.util.List;
import BLL.Customer;
import javax.persistence.Query;

/**
 *
 * @author Adnan
 */
public class CustomerRepository extends EntityManagementClass implements CustomerInterface{

    @Override
    public void create(Customer c) throws MainException {
        try{
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new MainException("Msg \n"+e.getMessage());
        }
    }

    @Override
    public void edit(Customer c) throws MainException {
        try{
            em.getTransaction().begin();
            em.merge(c);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new MainException("Msg \n"+ e.getMessage());
        }
    }

    @Override
    public void delete(Customer c) throws MainException {
        try{em.getTransaction().begin();
        em.remove(c);
        em.getTransaction().commit();
        }catch(Exception e){
            throw new MainException("Msg \n"+e.getMessage());
        }
    }

    @Override
    public List<Customer> findAll() throws MainException {
        try{
           return em.createNamedQuery("Customer.findAll").getResultList();
        }catch(Exception e){
            throw new MainException("Msg \n"+ e.getMessage());
        }
    }

    @Override
    public Customer findByID(Integer ID) throws MainException {
        try {
            Query query = em.createQuery("SELECT c FROM Customer c WHERE c.ID = :abc");
            query.setParameter("abc", ID);
            return (Customer) query.getSingleResult();
        } catch (Exception e) {
            throw new MainException("Msg! \n" + e.getMessage());
        }
    }
    
}
