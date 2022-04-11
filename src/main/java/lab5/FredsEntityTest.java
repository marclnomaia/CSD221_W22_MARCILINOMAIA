/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.List;
import lab5.controllers.*;
import lab5.entities.Book;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import lab5.entities.*;

/**
 *
 * @author fcarella
 */
public class FredsEntityTest {

    public static void main(String[] args) {
        EntityManagerFactory emf = null;
        EntityManager em = null;

        try {
            emf = Persistence.createEntityManagerFactory("lab5");
            
            BookJpaController bc = new BookJpaController(emf);
            MagazineJpaController mc = new MagazineJpaController(emf);
            DiscMagJpaController dc=new DiscMagJpaController(emf);
            PencilJpaController pc=new PencilJpaController(emf);
            TicketJpaController tc=new TicketJpaController(emf);
            
            
            
            Book book=new Book();
            book.setAuthor("Marcilino");
            book.setCopies(10);
            book.setPrice(29.99);
            book.setTitle("Marcilinos Java Book");
            
            Book book2=new Book("Fred C", "Freds book title", 39.99, 13);
            
            bc.create(book);
            bc.create(book2);

            Magazine mag=new Magazine(10, "April 20, 2022", "Marcilinos Magazine", 13.99, 20);
            DiscMag dmag=new DiscMag(true, 10, "May 2022", "UFO Magazines", 20.99, 20);
            Pencil p=new Pencil("p brand", 10, 3.99);
            Ticket t=new Ticket("A new ticket", 5.99, "Marcilino");
            
            dc.create(dmag);
            mc.create(mag);
            pc.create(p);
            tc.create(t);
            
            List<Book> books = bc.findBookEntities();
            for(Book b:books)
                System.out.println("Title="+b.getTitle());
            
            

        } catch (Exception e) {
            Logger.getLogger(FredsEntityTest.class.getName()).log(Level.SEVERE, null, e);
        }

    }
}
