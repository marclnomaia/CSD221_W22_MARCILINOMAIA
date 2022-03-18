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
public class Book extends Publication {
   

    @Override
    public String toString() {
        //String s=super.toString(); //To change body of generated methods, choose Tools | Templates.
        return "Selling a Book";
    }
     public void sellCopy(){
        System.out.println("************************************");
        System.out.println("          Ticket Voucher            ");
        System.out.println(toString());
        System.out.println("************************************");
        System.out.println();

}
}
  

    

   
    
     
    


