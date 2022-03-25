/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author maron
 */
public class App {

   
    
    
   /* public void run(){
        Book book=new Book();
        Magazine mag =new Magazine();
        DiscMag discM=new DiscMag();
        CashTill till=new CashTill();
        Pencil pencil=new Pencil();
        Ticket ticket=new Ticket();
        
        book.setPrice(3.5);
        mag.setPrice(5.0);
        discM.setPrice(4.5);
        pencil.setPrice(1.0);
        ticket.setPrice(6.5);
        
        till.sellItem(book);
        till.sellItem(mag);
        till.sellItem(discM);
        till.sellItem(pencil);
        till.sellItem(ticket);
        
        till.showTotal();
    }*/


    
   
    private final int numBook = 100;
    private Book[] bookList = new Book[numBook];
    private Book[] delete = new Book[numBook];
    private int currentBook = 0;
    private int delCurrentIndex = 0;

    private final int numMagazine = 100;
    private Magazine[] magazineList = new Magazine[numMagazine];
    private Magazine[] deleteMag = new Magazine[numMagazine];
    private int currentMagazine = 0;
    private int delCurrentIndexMag = 0;

    private final int numDiscMag = 100;
    private DiscMag[] discMagList = new DiscMag[numDiscMag];
    private DiscMag[] deleteDiscMag = new DiscMag[numDiscMag];
    private int currentDiscMag = 0;
    private int delCurrentIndexDiscMag = 0;

   

    private final int numTicket= 100;
    private Ticket[] ticketList = new Ticket[numTicket];
    private Ticket[] deleteTicket = new Ticket[numTicket];
    private int currentTicket = 0;
    private int delCurrentIndexTicket = 0;

    private Scanner input;

    public void run() throws Exception {
        
        
    
        input=new Scanner(System.in);
        bookList = new Book[100];
        boolean exit = false;
        String mainMenu = ""
                + "1. SellingBook\n"
                + "2. List Book\n"
                + "3. Edit Book\n"
                + "4. Delete book\n"
                + "5. Selling Magazine\n"
                + "6. List Magazine\n"
                + "7.Selling Disc Magazine\n"
                + "8. List Disc Magazine\n"
                + "9. Selling Ticket\n"
                + "10. List Ticket\n"
                + "11. Edit Ticket\n"
                + "12. Delete Ticket\n"
                + "0. Exit";
        while (!exit) {
//            input = new Scanner(System.in);
            System.out.println(mainMenu);
            int choice=0;// = input.nextInt();
            choice=getInput(choice);
            switch (choice) {
                case 1:
                    sellingBook();
                break;
                
                case 2:
                    listBook();
                    break;
                    
                 case 3:
                    editBook();
                   
                    break;

                case 4:
                    System.out.println("Choose a Book to delete");
                    listBook();
                    int choice1 = input.nextInt();
                    deleteBook(choice1);
                    
                    break;

                case 5:
                     try {
                    sellingMagazine();
                } catch (Exception ex) {
                    Logger.getLogger(lab4.App.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;

                case 6:
                    listMagazine();
                    break;

                case 7:
                     try {
                    sellingDiscMag();
                } catch (Exception ex) {
                    Logger.getLogger(lab4.App.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
                case 8:
                    listDiscMag();
                    break;

                case 9:
                    sellingTicket();
                break;
                
                case 10:
                    listTicket();
                    break;

                
                 case 11:
                    editTicket();
                   
                    break;

                case 12:
                    System.out.println("Choose a Ticket to delete");
                    listTicket();
                    int choice2 = input.nextInt();
                    deleteTicket(choice2);
                    
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

    private void sellingBook() {
        Book newBook=new Book();
        
        try {
;
            System.out.println("Enter Author");
            newBook.setAuthor(getInput(newBook.getAuthor()));

            System.out.println("Add Title ");
            newBook.setTitle(getInput(newBook.getTitle()));
            System.out.println("Enter Price");
            newBook.setPrice(getInput(newBook.getPrice()));

            System.out.println("Enter Copies");
            newBook.setCopies(getInput(newBook.getCopies()));
            
            
            
            bookList[currentBook] = newBook;
            currentBook++;
             throw new Exception();
        } catch (Exception e) {
            //throw new Exception("Error Adding a Book");
            System.out.println("error: "+e.getMessage());
        }

    }

    private void sellingMagazine() throws Exception {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Order Quantity");
            int orderQty = scan.nextInt();
            System.out.println("Add Current Issue ");
            String currIssue = input.next();
            System.out.println("Add Title ");
            String title = input.next();
            System.out.println("Enter Price");
            double price = scan.nextDouble();
            System.out.println("Enter Copies");
            int copies = scan.nextInt();
          
            Magazine magazine = new Magazine(orderQty, currIssue, title, price, copies);

            magazineList[currentMagazine] = magazine;
            currentMagazine++;
             throw new Exception();
        } catch (Exception e) {
            System.out.println("error: "+e.getMessage());
        }

    }

    private void sellingDiscMag() throws Exception {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Order Quantity");
            int orderQty = scan.nextInt();
            System.out.println("Add Current Issue ");
            String currIssue = input.next();
            System.out.println("Add Title ");
            String title = input.next();
            System.out.println("Enter Price");
            double price = scan.nextDouble();
            System.out.println("Enter Copies");
            int copies = scan.nextInt();
             

            DiscMag discMag = new DiscMag(orderQty, currIssue, title, price, copies);

            discMagList[currentDiscMag] = discMag;
            currentDiscMag++;
            // throw new Exception();
        } catch (Exception e) {

        }

    }
    private void sellingTicket() {
        //Ticket newTicket=new Ticket();
        
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Price");
            double price = scan.nextDouble();
            System.out.println("Enter Description"); 
           String description= input.next();
            System.out.println("Enter Client"); 
            String client = input.next();

            Ticket newTicket = new Ticket(price, description, client);
            ticketList[currentTicket] = newTicket;
            currentTicket++;
            // throw new Exception();
        } catch (Exception e) {
           System.out.println("error: "+e.getMessage());
        }

    }


    private void editBook() {
        listBook();
        System.out.println("Which Book would you like to edit ?:");
        int choice=0;
        choice=getInput(choice);
//        input = new Scanner(System.in); // reset the scanner
        if ((choice <= currentBook + 1) && choice > 0) {
            Book b = bookList[choice - 1];
            System.out.println("Author: " + b.getAuthor());
            b.setAuthor(getInput(b.getAuthor()));
            System.out.println("Title: " + b.getTitle());
            b.setTitle(getInput(b.getTitle()));
            System.out.println("Price: " + b.getPrice());
            b.setPrice(getInput(b.getPrice()));
            System.out.println("Copies: " + b.getCopies());
            b.setCopies(getInput(b.getCopies()));
        } else {
            System.out.println("Choice out of bounds");
        }
        System.out.println("");
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

    private void editTicket() {
        listTicket();
        System.out.println("Which Ticket would you like to edit ?:");
        int choice=0;
        choice=getInput(choice);

         if ((choice <= currentTicket + 1) && choice > 0) {
            Ticket t = ticketList[choice - 1];
           
            System.out.println("Price: " + t.getPrice());
            t.setPrice(getInput(t.getPrice()));
            System.out.println("Description: " + t.getDescription());
            t.setDescription(getInput(t.getDescription()));
            System.out.println("Client: " + t.getClient());
            t.setClient(getInput(t.getClient()));
        } else {
            System.out.println("Choice out of bounds");
        }
        System.out.println("");
    }


   

 
     private void listBook() {

        System.out.println("\nList all Books");
        System.out.println("-------------");

        for (int i = 0; i < bookList.length; i++) {

            if (bookList[i] == null) {
                break;
            }
            System.out.println((i + 1) + " " + bookList[i]);

        }
    }

   private void listMagazine() {

        System.out.println("\nList all Magazines");
        System.out.println("-------------");

        for (int i = 0; i < magazineList.length; i++) {

            if (magazineList[i] == null) {
                break;
            }
            System.out.println(i + " " + magazineList[i]);

        }
    }

    private void listDiscMag() {

        System.out.println("\nList all Disc Magazine");
        System.out.println("-------------");

        for (int i = 0; i < discMagList.length; i++) {

            if (discMagList[i] == null) {
                break;
            }
            System.out.println(i + " " + discMagList[i]);

        }
    }


private void listTicket() {

        System.out.println("\nList all Tickets");
        System.out.println("-------------");

        for (int i = 0; i < ticketList.length; i++) {

            if (ticketList[i] == null) {
                break;
            }
            System.out.println((i + 1) + " " + ticketList[i]);

        }
    }


    private void deleteBook(int bookdelete) throws Exception {

        try {

            System.out.println("Delete Book");

            for (int i = bookdelete; i < bookList.length; i++) {
                bookList[i - 1] = bookList[i];

                currentBook = currentBook--;
            }

        } catch (Exception e) {
            throw new Exception("Error Adding a Book");
        }

    }
    
private void deleteTicket(int ticketdelete) throws Exception {

        try {

            System.out.println("Delete BTicket");

            for (int i = ticketdelete; i < ticketList.length; i++) {
               ticketList[i - 1] = ticketList[i];

                currentTicket = currentTicket--;
            }

        } catch (Exception e) {
            throw new Exception("Error Adding a Ticket");
        }

    }
}

   


