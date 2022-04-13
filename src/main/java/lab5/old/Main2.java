/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.old;

import lab5.old.FredsEntityTest;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import lab5.controllers.BookJpaController;
import lab5.controllers.DiscMagJpaController;
import lab5.controllers.MagazineJpaController;
import lab5.controllers.PencilJpaController;
import lab5.controllers.TicketJpaController;

/**
 *
 * @author maron
 */
public class Main2 {
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
}
         catch (Exception e) {
            Logger.getLogger(FredsEntityTest.class.getName()).log(Level.SEVERE, null, e);
        }

    }
}
