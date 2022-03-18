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
public class Publication implements SaleableItem{
   
  
    double price;
   
     

    public double getPrice() {
        return price;
    }
    
    

    public void setPrice(double price){
        this.price=price;
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

   
    
  