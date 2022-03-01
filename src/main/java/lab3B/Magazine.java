/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3B;

/**
 *
 * @author maron
 */
public class Magazine extends Publication {
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
    public String getCurrIssue() {
        return currIssue;
    }

    /**
     * @param currIssue the currIssue to set
     */
    public void setCurrIssue(String currIssue) {
        this.currIssue = currIssue;
    }

    /**
     * @return the orderQty
     */
    public int getOrderQty() {
        return orderQty;
    }

    /**
     * @param orderQty the orderQty to set
     */
    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }
    @Override
    public String toString() {
        return "OrderQty: "+getOrderQty()+", CurrIssue: "+getCurrIssue();
    }
}

