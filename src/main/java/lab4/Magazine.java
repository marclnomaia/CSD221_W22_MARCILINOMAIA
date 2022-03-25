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
public class Magazine extends Publication{
    
    private int orderQty;
    private String  currIssue;
 
    
    

    

    public Magazine(int orderQty, String currIssue, String title, double price, int copies) {
        super(title, price, copies);
        this.orderQty = orderQty;
        this.currIssue = currIssue;
       
        
    }

   
    /**
     * @return the currIssue
     */
    public int getOrderQty() {
        return orderQty;
    }
    public String getCurrIssue() {
        return currIssue;
    }
   
   
    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }
     
    public void setCurrIssue(String currIssue) {
        this.currIssue = currIssue;
    }
    
    


    
    @Override
    public String toString() {
        return "Selling a Magazine: "+"OrderQty: "+getOrderQty()+", CurrIssue: "+getCurrIssue();
    }

    /*@Override
    public String toString() {
        return "Selling a Magazine: ";
    
                }*/
@Override
    public void sellCopy(){
        System.out.println("************************************");
        System.out.println("          Ticket Voucher            ");
        System.out.println(toString());
        System.out.println("************************************");
        System.out.println();
    }
  
}
    
  
    
    
    

   
