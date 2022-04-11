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
import lab5.controllers.TicketJpaController;
import lab5.controllers.exceptions.NonexistentEntityException;
import lab5.entities.Book;

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

    void run() {
        emf = Persistence.createEntityManagerFactory("lab5");
        bc = new BookJpaController(emf);
        mc = new MagazineJpaController(emf);
        dc = new DiscMagJpaController(emf);
        pc = new PencilJpaController(emf);
        tc = new TicketJpaController(emf);

        input = new Scanner(System.in);
        boolean exit = false;
        String mainMenu = ""
                + "1. Add book\n"
                + "2. List Book\n"
                + "3. Edit Book\n"
                + "4. Delete book\n"
                //                + "5. Selling Magazine\n"
                //                + "6. List Magazine\n"
                //                + "7.Selling Disc Magazine\n"
                //                + "8. List Disc Magazine\n"
                //                + "9. Selling Ticket\n"
                //                + "10. List Ticket\n"
                //                + "11. Edit Ticket\n"
                //                + "12. Delete Ticket\n"
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

}
