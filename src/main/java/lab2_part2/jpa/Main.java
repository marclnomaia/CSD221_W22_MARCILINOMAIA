/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_part2.jpa;

/**
 *
 * @author maron
 */


import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import lab2_part2.entities.Customer;
import lab2_part2.entities.Employee;
import lab2_part2.entities.Person;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf=null;
        EntityManager em=null;
        
        try{
           emf=Persistence.createEntityManagerFactory("L2P2_DEFAULT_PU");
            em=emf.createEntityManager();
            Logger.getLogger(Main.class.getName()).log(Level.INFO, "Entity Manager created ("+emf+")");
            em.getTransaction().begin();
            
            Person john=new Person();
            john.setFirstname("John");
            john.setLastname("Smith");
            john.setSIN(1252614256);
            em.persist(john);
            
            
            Customer mar=new Customer();
            mar.setFirstname("Marcilino");
            mar.setLastname("da Maia");
            mar.setSIN(01242614256);
            mar.setCredit_card_number(235468954);
            mar.setCust_id(4500);
            em.persist(mar);
            
            Employee albert=new Employee();
            albert.setFirstname("Albert");
            albert.setLastname("Stein");
            albert.setSIN(563268256);
            albert.setTitle("Scientist");
            albert.setSalary(4540.00);
            em.persist(albert);
            
            em.getTransaction().commit();
            
        
            List<Person> ListOfPersons = em.createQuery("SELECT john FROM Person john").getResultList();
            System.out.println("--------------------------------------------------");
            System.out.println("List of Person ");
            ListOfPersons.forEach(person -> {
                System.out.println(person.getFirstname());
                System.out.println(person.getLastname());
                System.out.println(person.getSIN());
            });
            List<Customer> ListOfCustomers = em.createQuery("SELECT john FROM Customer john").getResultList();
            System.out.println("--------------------------------------------------");
            System.out.println("List of Customer ");
            ListOfCustomers.forEach(customer -> {
                System.out.println(customer.getFirstname());
                System.out.println(customer.getLastname());
                System.out.println(customer.getSIN());
            });
            System.out.println("--------------------------------------------------");
            System.out.println("List of Employees ");
            List<Employee> ListOfEmployees = em.createQuery("SELECT john FROM Employee john").getResultList();
            System.out.println("List of Employee ");
            ListOfEmployees.forEach(employee -> {
                System.out.println(employee.getFirstname());
                System.out.println(employee.getLastname());
                System.out.println(employee.getSIN());
            });

            
            
                    
         }catch(Exception e){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            if(emf!=null)
                emf.close();
//            if(em!=null)
//                em.close();
        }
    }
}

