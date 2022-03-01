/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3B;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import lab3B.*;

/**
 *
 * @author maron
 */
public class App {
    private final int numBook= 100;
    private Book[] bookList = new Book[numBook];
    private Book[] delete= new Book[numBook];
    private int currentBook = 0;
    private int delCurrentIndex = 0;
    
    private final int numMagazine= 100;
    private Magazine[] magazineList = new Magazine[numMagazine];
    private Magazine[] deleteMag= new Magazine[numMagazine];
    private int currentMagazine = 0;
    private int delCurrentIndexMag = 0;

    private final int numDiscMag= 100;
    private DiscMag[] discMagList = new DiscMag[numDiscMag];
    private DiscMag[] deleteDiscMag= new DiscMag[numDiscMag];
    private int currentDiscMag = 0;
    private int delCurrentIndexDiscMag = 0;

    
    private Scanner input;
    
    void run() throws Exception {
        bookList = new Book[100];
        boolean exit = false;
        String mainMenu = ""
                + "1. Add Book\n"
                + "2. Edit Book\n" 
                + "3. Delete Book\n" 
                + "4. Add Magazine\n" 
                + "5. List Magazine\n" 
                + "6. Add Disc Magazine\n" 
                + "7. List Disc Magazine\n"
                + "8. Exit";
        while (!exit) {
            input = new Scanner(System.in);
            System.out.println(mainMenu);
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    try {
                    addBook();
                } catch (Exception ex) {
                    Logger.getLogger(lab3B.App.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;

                case 2:
                        editBook();
                    break;
                
                case 3:
                    
                    System.out.println("Choose a Book to delete");
                    listBook();
                    int choice1 = input.nextInt();
                    deleteBook(choice1);
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
                
                
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid entry try again");
            }
        }
        System.exit(0);
    }

    
private void addBook() throws Exception {
        try {
            Scanner scan = new Scanner(System.in);
             System.out.println("Enter Author");
            String author = input.next();
            System.out.println("Add Title ");
            String title=input.next();
            System.out.println("Enter Price");
            double price = scan.nextDouble();
            System.out.println("Enter Copies");
            int copies= scan.nextInt();
           
            
            
//String choice = scan.nextLine();
            Book book = new Book(author,title, price, copies );
            //int currentBook = 0;
            bookList[currentBook] = book;
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
            String currIssue=input.next();
            System.out.println("Add Title ");
            String title=input.next();
            System.out.println("Enter Price");
            double price = scan.nextDouble();
            System.out.println("Enter Copies");
            int copies= scan.nextInt();
            
            Magazine magazine = new Magazine(orderQty,currIssue,title, price, copies );
            
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
            String currIssue=input.next();
            System.out.println("Add Title ");
            String title=input.next();
            System.out.println("Enter Price");
            double price = scan.nextDouble();
            System.out.println("Enter Copies");
            int copies= scan.nextInt();
            
            DiscMag discMag = new DiscMag(orderQty,currIssue,title, price, copies );
            
            discMagList[currentDiscMag] = discMag;
            currentDiscMag++;
           // throw new Exception();
        } catch (Exception e) {
             
        }

    }
private void  editBook()
  {
  } /*int index=l.indexOf(bookList);
     bookList.remove(index)   
      bookList.add(updated);
  }
*/

private void listBook() {

        System.out.println("\nList all Books");
        System.out.println("-------------");

        for (int i = 0; i < bookList.length; i++) {

            if (bookList[i] == null) {
                break;
            }
            System.out.println(i+" "+ bookList[i]);
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
            System.out.println(i+" "+ magazineList[i]);
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
            System.out.println(i+" "+ discMagList[i]);
//      }
        }
    }
private void deleteBook(int bookdelete) throws Exception {

        try {

            System.out.println("Delete Book");

            for (int i = bookdelete; i < bookList.length; i++) {
                bookList[i - 1] = bookList[i];

                currentBook= currentBook--;
            }

        } catch (Exception e) {
            throw new Exception("Error Adding a Book");
        }

}
}

    


