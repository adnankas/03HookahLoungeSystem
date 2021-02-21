/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;


import BLL.Perdoruesi;
import java.util.List;
import BLL.ProductCategory;
import javax.persistence.Query;
/**
 *
 * @author Adnan
 */
public class ProductCategoryRepository extends EntityManagementClass implements ProductCategoryInterface{
    @Override
    public void create(ProductCategory pc) throws MainException {
        try{
            em.getTransaction().begin();
            em.persist(pc);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new MainException("Msg \n"+e.getMessage());
        }
    }

    @Override
    public void edit(ProductCategory pc) throws MainException {
        try{
            em.getTransaction().begin();
            em.merge(pc);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new MainException("Msg \n"+ e.getMessage());
        }
    }

    @Override
    public void delete(ProductCategory pc) throws MainException {
        try{em.getTransaction().begin();
        em.remove(pc);
        em.getTransaction().commit();
        }catch(Exception e){
            throw new MainException("Msg \n"+e.getMessage());
        }
    }

    @Override
    public List<ProductCategory> findAll() throws MainException {
        try{
           return em.createNamedQuery("ProductCategory.findAll").getResultList();
        }catch(Exception e){
            throw new MainException("Msg \n"+ e.getMessage());
        }
    }

    @Override
    public ProductCategory findByID(Integer ID) throws MainException {
        try {
            Query query = em.createQuery("SELECT pc FROM ProductCategory pc WHERE pc.ID = :abc");
            query.setParameter("abc", ID);
            return (ProductCategory) query.getSingleResult();
        } catch (Exception e) {
            throw new MainException("Msg! \n" + e.getMessage());
        }
    }
}
