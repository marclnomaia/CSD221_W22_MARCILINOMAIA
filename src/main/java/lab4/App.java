/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;
import java.util.List;




/**
 *
 * @author maron
 */
public class App {

   //private final List<SaleableItem> items;
    //private final CashTill ct;
    
    public App() {
       // this.items = new ArrayList<>();
       //this.ct=new CashTill();
    }
    public void run(){
        Book book=new Book();
        Publication mag =new Magazine();
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
    }

} 
    
   /* 
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

    private Scanner input;

    public void run() throws Exception {
        
        
    
        input=new Scanner(System.in);
        bookList = new Book[100];
        boolean exit = false;
        String mainMenu = ""
                + "1. Add Book\n"
                + "2. List Book\n"
                + "3. Edit Book\n"
                + "4. Delete book\n"
                + "5. Add Magazine\n"
                + "6. List Magazine\n"
                + "7. Add Disc Magazine\n"
                + "8. List Disc Magazine\n"
                + "9. Exit";
        while (!exit) {
//            input = new Scanner(System.in);
            System.out.println(mainMenu);
            int choice=0;// = input.nextInt();
            choice=getInput(choice);
            switch (choice) {
                case 1:
                    addBook();
                break;

                case 2:
                    System.out.println("Choose a Book to delete");
                    listBook();
                    int choice1 = input.nextInt();
                    deleteBook(choice1);
                    
                    break;

                case 3:
                    editBook();
                   
                    break;

                case 4:
                     try {
                    addMagazine();
                } catch (Exception ex) {
                    Logger.getLogger(lab3B.App.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;

                case 5:
                    listMagazine();
                    break;

                case 6:
                     try {
                    addDiscMag();
                } catch (Exception ex) {
                    Logger.getLogger(lab3B.App.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
                case 7:
                    listDiscMag();
                    break;

                case 9:
                    listBook();
                    break;

                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid entry try again");
            }
        }
        System.exit(0);
    }

    private void addBook() {
        Book newBook=new Book();
        
        try {
//            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Author");
            newBook.setAuthor(getInput(newBook.getAuthor()));
//            String author = input.next();
            System.out.println("Add Title ");
//            String title = input.next();
            newBook.setTitle(getInput(newBook.getTitle()));
            System.out.println("Enter Price");
//            double price = scan.nextDouble();
            newBook.setPrice(getInput(newBook.getPrice()));

            System.out.println("Enter Copies");
//            int copies = scan.nextInt();
            newBook.setCopies(getInput(newBook.getCopies()));

//String choice = scan.nextLine();
//            Book book = new Book(author, title, price, copies);
            //int currentBook = 0;
            bookList[currentBook] = newBook;
            currentBook++;
            // throw new Exception();
        } catch (Exception e) {
            //throw new Exception("Error Adding a Book");
        }

    }

    private void addMagazine() throws Exception {
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
            // throw new Exception();
        } catch (Exception e) {

        }

    }

    private void addDiscMag() throws Exception {
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

    private void listBook() {

        System.out.println("\nList all Books");
        System.out.println("-------------");

        for (int i = 0; i < bookList.length; i++) {

            if (bookList[i] == null) {
                break;
            }
            System.out.println((i + 1) + " " + bookList[i]);
//      }
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
//      }
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
//      }
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

    }*/



