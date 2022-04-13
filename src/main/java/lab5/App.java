/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import lab5.controllers.BookJpaController;
import lab5.controllers.DiscMagJpaController;
import lab5.controllers.MagazineJpaController;
import lab5.controllers.PencilJpaController;
import lab5.controllers.PublicationJpaController;
import lab5.controllers.TicketJpaController;
import lab5.controllers.exceptions.NonexistentEntityException;
import lab5.entities.Book;
import lab5.entities.Magazine;
import lab5.entities.Pencil;
import lab5.entities.Ticket;

/**
 *
 * @author fcarella
 */
public class App {

    private Scanner input;
    private EntityManagerFactory emf;
    private BookJpaController bc;
    private MagazineJpaController mc;
    private DiscMagJpaController dc;
    private PencilJpaController pc;
    private TicketJpaController tc;
    private PublicationJpaController pb;

    void run() {
        emf = Persistence.createEntityManagerFactory("lab5");
        bc = new BookJpaController(emf);
        mc = new MagazineJpaController(emf);
        dc = new DiscMagJpaController(emf);
        pc = new PencilJpaController(emf);
        tc = new TicketJpaController(emf);
        pb= new PublicationJpaController(emf);

        input = new Scanner(System.in);
        boolean exit = false;
        String mainMenu = ""
                + "1. Add book\n"
                + "2. List Book\n"
                + "3. Edit Book\n"
                + "4. Delete book\n"
                + "5. add Magazine\n"
                + "6. List Magazine\n"
                + "7. Edit Magazine\n"
                + "8. Delete Magazine\n"
                + "9.  Add Pencil\n"
                + "10. List Pencil\n"
                + "11. Edit Pencil\n"
                + "12. Delete Pencil\n"
                + "13. Add Ticket\n"
                + "14. List Ticket\n"
                + "15. Edit Ticket\n"
                + "16. Delete Ticket\n"
                + "0. Exit";
        while (!exit) {
//            input = new Scanner(System.in);
            System.out.println(mainMenu);
            int choice = 0;// = input.nextInt();
            choice = getInput(choice);
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    listBook();
                    break;

                case 3:
                    editBook();
                    break;

                case 4:
                    deleteBook();
                    break;
                    
                case 5:
                    addMagazine();
                    break;
                case 6:
                    listMagazine();
                    break;

                case 7:
                    editMagazine();
                    break;

                case 8:
                    deleteMagazine();
                    break;
                case 9:
                    addPencil();
                    break;
                case 10:
                    listPencil();
                    break;

                case 11:
                    editPencil();
                    break;

                case 12:
                    deletePencil();
                    break;
                    
                case 13:
                    addTicket();
                    break;
                case 14:
                    listTicket();
                    break;

                case 15:
                    editTicket();
                    break;

                case 16:
                    deleteTicket();
                    break;

                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid entry try again");
            }
        }
        System.exit(0);
    }

    private String getInput(String s) {
        String ss = input.nextLine();
        if (ss.trim().isEmpty()) {
            return s;
        }
        Scanner in2 = new Scanner(ss);
        return in2.nextLine();
    }

    private int getInput(int i) {
        String s = input.nextLine();
        if (s.trim().isEmpty()) {
            return i;
        }
        Scanner in2 = new Scanner(s);
        return in2.nextInt();
    }

    private double getInput(double i) {
        String s = input.nextLine();
        if (s.trim().isEmpty()) {
            return i;
        }
        Scanner in2 = new Scanner(s);
        return in2.nextDouble();
    }
     private long getInput(long i) {
        String s = input.nextLine();
        if (s.trim().isEmpty()) {
            return i;
        }
        Scanner in2 = new Scanner(s);
        return in2.nextLong();
    }

    private void addBook() {
        Book b = new Book();
        System.out.println("Enter Author:");
        b.setAuthor(getInput(b.getAuthor()));

        System.out.println("Enter Title");
        b.setTitle(getInput(b.getTitle()));

        System.out.println("Enter Price");
        b.setPrice(getInput(b.getPrice()));

        System.out.println("Enter Copies");
        b.setCopies(getInput(b.getCopies()));
        
        bc.create(b);

    }

    private void listBook() {
        List<Book> books = bc.findBookEntities();
        int index=0;
        for(Book b: books){
            System.out.println( (++index) + ". "+b);
        }
    }

    private void editBook() {
        listBook();
        System.out.println("Which book would you like to edit?");
        int choice=getInput(0);
        if(choice==0) return;
        Book b=bc.findBookEntities().get(choice-1);
        System.out.println("Author ("+b.getAuthor()+"):");
        b.setAuthor(getInput(b.getAuthor()));
        System.out.println("Title ("+b.getTitle()+"):");
        b.setTitle(getInput(b.getTitle()));
        System.out.println("Price ("+b.getPrice()+"):");
        b.setPrice(getInput(b.getPrice()));
        System.out.println("Copies ("+b.getCopies()+"):");
        b.setCopies(getInput(b.getCopies()));
        
        try {
            bc.edit(b);
        } catch (Exception ex) {
            System.out.println("Problem editing book...");
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void deleteBook() {
        listBook();
        System.out.println("Which book would you like to delete?");
        int choice=getInput(0);
        if(choice==0) return;
        Book b=bc.findBookEntities().get(choice-1);
        try {
            bc.destroy(b.getId());
        } catch (NonexistentEntityException ex) {
            System.out.println("Problem deleting book...");
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
     private void addMagazine() {
        Magazine m = new Magazine();
        System.out.println("Enter Order Quantity:");
        m.setOrderQty(getInput(m.getOrderQty()));

        System.out.println("Enter Current Issue");
        m.setCurrIssue(getInput(m.getCurrIssue()));
        
         System.out.println("Enter Title");
        m.setTitle(getInput(m.getTitle()));

        System.out.println("Enter Price");
        m.setPrice(getInput(m.getPrice()));

        System.out.println("Enter Copies");
        m.setCopies(getInput(m.getCopies()));

        mc.create(m);

    }

    private void listMagazine() {
        List<Magazine> magazine = mc.findMagazineEntities();
        int index=0;
        for(Magazine m: magazine){
            System.out.println( (++index) + ". "+m);
        }
    }

    private void editMagazine() {
        listMagazine();
        System.out.println("Which Magazine would you like to edit?");
        int choice=getInput(0);
        if(choice==0) return;
        Magazine m=mc.findMagazineEntities().get(choice-1);
        System.out.println("OrderQty ("+m.getOrderQty()+"):");
        m.setOrderQty(getInput(m.getOrderQty()));
        System.out.println("CurrIssue("+m.getCurrIssue()+"):");
        m.setCurrIssue(getInput(m.getCurrIssue()));
         System.out.println("Title ("+m.getTitle()+"):");
        m.setTitle(getInput(m.getTitle()));
        System.out.println("Price ("+m.getPrice()+"):");
        m.setPrice(getInput(m.getPrice()));
        System.out.println("Copies ("+m.getCopies()+"):");
        m.setCopies(getInput(m.getCopies()));
 
        
        try {
            mc.edit(m);
        } catch (Exception ex) {
            System.out.println("Problem editing Magazine...");
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void deleteMagazine() {
        listMagazine();
        System.out.println("Which Magazine would you like to delete?");
        int choice=getInput(0);
        if(choice==0) return;
        Magazine m=mc.findMagazineEntities().get(choice-1);
        try {
            mc.destroy(m.getId());
        } catch (NonexistentEntityException ex) {
            System.out.println("Problem deleting Magazine...");
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 private void addPencil() {
        Pencil p= new Pencil();
        

        System.out.println("Enter Brand");
        p.setBrand(getInput(p.getBrand()));
        
        System.out.println("Enter Quantity:");
        p.setQuantity(getInput(p.getQuantity()));
        
        System.out.println("Enter Price:");
        p.setPrice(getInput(p.getPrice()));

        pc.create(p);

    }

    private void listPencil() {
        List<Pencil> pencil = pc.findPencilEntities();
        int index=0;
        for(Pencil p: pencil){
            System.out.println( (++index) + ". "+p);
        }
    }

    private void editPencil() {
        listPencil();
        System.out.println("Which Pencil would you like to edit?");
        int choice=getInput(0);
        if(choice==0) return;
        Pencil p=pc.findPencilEntities().get(choice-1);
     
        System.out.println("Brand("+p.getBrand()+"):");
        p.setBrand(getInput(p.getBrand()));
        
        System.out.println("Quantity("+p.getQuantity()+"):");
        p.setQuantity(getInput(p.getQuantity()));
        
        System.out.println("Price("+p.getPrice()+"):");
        p.setPrice(getInput(p.getPrice()));
 
        
        try {
            pc.edit(p);
        } catch (Exception ex) {
            System.out.println("Problem editing Pencil..");
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void deletePencil() {
        listPencil();
        System.out.println("Which Pencil would you like to delete?");
        int choice=getInput(0);
        if(choice==0) return;
        Pencil p=pc.findPencilEntities().get(choice-1);
        try {
            pc.destroy(p.getId());
        } catch (NonexistentEntityException ex) {
            System.out.println("Problem deleting Magazine...");
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
     private void addTicket() {
       Ticket t = new Ticket();
       
       
        System.out.println("Enter Description:");
        t.setDescription(getInput(t.getDescription()));

        System.out.println("Enter Price");
        t.setPrice(getInput(t.getPrice()));

        System.out.println("Enter name Client:");
        t.setClient(getInput(t.getClient()));
        tc.create(t);

    }

    private void listTicket() {
        List<Ticket> tickets = tc.findTicketEntities();
        int index=0;
        for(Ticket t: tickets){
            System.out.println( (++index) + ". "+t);
        }
    }

    private void editTicket() {
        listTicket();
        System.out.println("Which Ticket would you like to edit?");
        int choice=getInput(0);
        if(choice==0) return;
        Ticket t=tc.findTicketEntities().get(choice-1);
        System.out.println("Description ("+t.getDescription()+"):");
        t.setDescription(getInput(t.getDescription()));
        System.out.println("Price("+t.getPrice()+"):");
        t.setPrice(getInput(t.getPrice()));
        System.out.println("Client("+t.getClient()+"):");
        t.setClient(getInput(t.getClient()));
 
        
        try {
            tc.edit(t);
        } catch (Exception ex) {
            System.out.println("Problem editing Ticket...");
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void deleteTicket() {
        listTicket();
        System.out.println("Which Ticket would you like to delete?");
        int choice=getInput(0);
        if(choice==0) return;
        Ticket t=tc.findTicketEntities().get(choice-1);
        try {
            tc.destroy(t.getId());
        } catch (NonexistentEntityException ex) {
            System.out.println("Problem deleting Magazine...");
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
