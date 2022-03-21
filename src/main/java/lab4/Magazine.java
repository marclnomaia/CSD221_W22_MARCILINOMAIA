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
    public int adjustQty;
    public  String recNewIssue;
   
    

    

    public Magazine(int orderQty, String currIssue, String title, double price, int copies) {
        super(title, price, copies);
        this.orderQty = orderQty;
        this.currIssue = currIssue;
        this.orderQty =orderQty ;
        this.recNewIssue= recNewIssue;
        
        
    }

    Magazine(int orderQty, String currIssue, String title, double price, int copies, int adjustQty, String recNewIssue) {
        
    }
    /**
     * @return the currIssue
     */
    public String getCurrIssue() {
        return currIssue;
    }
    public int getAdjustQty(){
        return adjustQty;
    }
     public String getRecNewIssue(){
        return recNewIssue;
    }
    /**
     * @param currIssue the currIssue to set
     */
    public void setCurrIssue(String currIssue) {
        this.currIssue = currIssue;
    }
    
    public void setAdjustQty(int adjustQty){
         this.adjustQty=adjustQty;
     }
      public void setRecNewIssue(String recNewIssue){
        this.recNewIssue=recNewIssue;
    }
     
    /**
     * @return the orderQty
     */
    public int getOrderQty() {
        return orderQty;
    }
     public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    /**
     * @param orderQty the orderQty to set
     */
    
    
    
    
     
    
    
    
   
    
    
    @Override
    public String toString() {
        return "OrderQty: "+getOrderQty()+", CurrIssue: "+getCurrIssue();
    }

    
    
    /* @Override
    public String toString() {
        return "Selling a Magazine";
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
    
  
    
    
    

   
