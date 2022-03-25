/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;



/**
 *
 * @author maron
 */
public class Book extends lab4.Publication {
    private String author;

    public Book() {
        super("", 0, 0);
    }
    public Book(String author, String title, double price, int copies) {
        super(title, price, copies);
        this.author = author;
    }

    @Override
    public String toString() {
        String s=super.toString(); //To change body of generated methods, choose Tools | Templates.
        return "Author:"+author+", "+s;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public void sellCopy(){
        System.out.println("************************************");
        System.out.println("          Ticket Voucher            ");
        System.out.println(toString());
        System.out.println("************************************");
        System.out.println();
    }
    
       
}  
    


  

    

   
    
     
    


