/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.util.List;
import BLL.Employee;
import BLL.Perdoruesi;
import javax.persistence.Query;
/**
 *
 * @author Adnan
 */
public class EmployeeRepository extends EntityManagementClass implements EmployeeInterface{
    
    @Override
    public void create(Employee e) throws MainException {
        try{
            em.getTransaction().begin();
            em.persist(e);
            em.getTransaction().commit();
        }catch(Exception ex){
            throw new MainException("Msg \n"+ex.getMessage());
        }
    }

    @Override
    public void edit(Employee e) throws MainException {
        try{
            em.getTransaction().begin();
            em.merge(e);
            em.getTransaction().commit();
        }catch(Exception ex){
            throw new MainException("Msg \n"+ ex.getMessage());
        }
    }

    @Override
    public void delete(Employee e) throws MainException {
        try{em.getTransaction().begin();
        em.remove(e);
        em.getTransaction().commit();
        }catch(Exception ex){
            throw new MainException("Msg \n"+ex.getMessage());
        }
    }

    @Override
    public List<Employee> findAll() throws MainException {
        try{
           return em.createNamedQuery("Employee.findAll").getResultList();
        }catch(Exception e){
            throw new MainException("Msg \n"+ e.getMessage());
        }
    }

    @Override
    public Employee findByID(Integer ID) throws MainException {
        try {
            Query query = em.createQuery("SELECT e FROM Employee e WHERE e.ID = :abc");
            query.setParameter("abc", ID);
            return (Employee) query.getSingleResult();
        } catch (Exception e) {
            throw new MainException("Msg! \n" + e.getMessage());
        }
    }
}
