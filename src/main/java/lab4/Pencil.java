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
public class Pencil implements SaleableItem {

    /**
     * @return the penPrice
     */
    public double getPenPrice() {
        return penPrice;
    }

    /**
     * @param penPrice the penPrice to set
     */
    public void setPenPrice(double penPrice) {
        this.penPrice = penPrice;
    }

    /**
     * @return the penQty
     */
    public int getPenQty() {
        return penQty;
    }

    /**
     * @param penQty the penQty to set
     */
    public void setPenQty(int penQty) {
        this.penQty = penQty;
    }
    private double penPrice;
    private int penQty;
    
    
     @Override
    public String toString() {
        
        return "Selling a Pencil";
    }
     @Override
    public void sellCopy(){
        System.out.println("************************************");
        System.out.println("          Ticket Voucher            ");
        System.out.println(toString());
        System.out.println("************************************");
        System.out.println();
    

   
    
}

    @Override
    public double getPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
