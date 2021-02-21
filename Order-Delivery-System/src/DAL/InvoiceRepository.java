/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.util.List;
import BLL.Invoice;
import BLL.Perdoruesi;
import javax.persistence.Query;

/**
 *
 * @author Adnan
 */
public class InvoiceRepository extends EntityManagementClass implements InvoiceInterface{
    @Override
    public void create(Invoice i) throws MainException {
        try{
            em.getTransaction().begin();
            em.persist(i);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new MainException("Msg \n"+e.getMessage());
        }
    }

    @Override
    public void edit(Invoice i) throws MainException {
        try{
            em.getTransaction().begin();
            em.merge(i);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new MainException("Msg \n"+ e.getMessage());
        }
    }

    @Override
    public void delete(Invoice i) throws MainException {
        try{em.getTransaction().begin();
        em.remove(i);
        em.getTransaction().commit();
        }catch(Exception e){
            throw new MainException("Msg \n"+e.getMessage());
        }
    }

    @Override
    public List<Invoice> findAll() throws MainException {
        try{
           return em.createNamedQuery("Invoice.findAll").getResultList();
        }catch(Exception e){
            throw new MainException("Msg \n"+ e.getMessage());
        }
    }

    @Override
    public Invoice findByID(Integer ID) throws MainException {
        try {
            Query query = em.createQuery("SELECT i FROM Invoice i WHERE i.ID = :abc");
            query.setParameter("abc", ID);
            return (Invoice) query.getSingleResult();
        } catch (Exception e) {
            throw new MainException("Msg! \n" + e.getMessage());
        }
    }
}
