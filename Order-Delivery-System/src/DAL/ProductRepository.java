/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Perdoruesi;
import java.util.List;
import BLL.Product;
import javax.persistence.Query;

/**
 *
 * @author Adnan
 */
public class ProductRepository extends EntityManagementClass implements ProductInterface{
    @Override
    public void create(Product p) throws MainException {
        try{
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new MainException("Msg \n"+e.getMessage());
        }
    }

    @Override
    public void edit(Product p) throws MainException {
        try{
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new MainException("Msg \n"+ e.getMessage());
        }
    }

    @Override
    public void delete(Product p) throws MainException {
        try{em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
        }catch(Exception e){
            throw new MainException("Msg \n"+e.getMessage());
        }
    }

    @Override
    public List<Product> findAll() throws MainException {
        try{
           return em.createNamedQuery("Product.findAll").getResultList();
        }catch(Exception e){
            throw new MainException("Msg \n"+ e.getMessage());
        }
    }

    @Override
    public Product findByID(Integer ID) throws MainException {
        try {
            Query query = em.createQuery("SELECT p FROM Product p WHERE p.ID = :abc");
            query.setParameter("abc", ID);
            return (Product) query.getSingleResult();
        } catch (Exception e) {
            throw new MainException("Msg! \n" + e.getMessage());
        }
    }
}
