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
public class Ticket implements SaleableItem{

    
    private double price;
    private String description;
    private String client;

    
   
    Ticket(double price, String description,String client ) {
       
    }

    
    
    @Override
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the client
     */
    public String getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(String client) {
        this.client = client;
    }
    
  @Override
    public String toString() {
        return "Selling a Ticket: "+ " Price: "+getPrice()+ ", Description :"+getDescription()+", Client:"+getClient();
    }
    
   
    /*@Override
    public String toString() {
        return "Selling a Ticket: ";
    
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
